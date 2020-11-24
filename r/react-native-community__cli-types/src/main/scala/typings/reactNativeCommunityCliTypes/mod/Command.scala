package typings.reactNativeCommunityCliTypes.mod

import typings.reactNativeCommunityCliTypes.anon.Cmd
import typings.reactNativeCommunityCliTypes.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Command[IsDetached /* <: Boolean */] extends js.Object {
  
  var description: js.UndefOr[String] = js.native
  
  var detached: js.UndefOr[IsDetached] = js.native
  
  var examples: js.UndefOr[js.Array[Cmd]] = js.native
  
  var func: CommandFunction[js.Object] | DetachedCommandFunction[js.Object] = js.native
  
  var name: String = js.native
  
  var options: js.UndefOr[
    js.Array[
      CommandOption[(js.Function1[/* ctx */ Config, OptionValue]) | js.Function0[OptionValue]]
    ]
  ] = js.native
  
  var pkg: js.UndefOr[Name] = js.native
}
object Command {
  
  @scala.inline
  def apply[IsDetached /* <: Boolean */](func: CommandFunction[js.Object] | DetachedCommandFunction[js.Object], name: String): Command[IsDetached] = {
    val __obj = js.Dynamic.literal(func = func.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command[IsDetached]]
  }
  
  @scala.inline
  implicit class CommandOps[Self <: Command[_], IsDetached /* <: Boolean */] (val x: Self with Command[IsDetached]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFuncFunction2(value: (/* argv */ js.Array[String], js.Object) => js.Promise[Unit] | Unit): Self = this.set("func", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFuncFunction3(value: (/* argv */ js.Array[String], /* ctx */ Config, js.Object) => js.Promise[Unit] | Unit): Self = this.set("func", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFunc(value: CommandFunction[js.Object] | DetachedCommandFunction[js.Object]): Self = this.set("func", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDetached(value: IsDetached): Self = this.set("detached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetached: Self = this.set("detached", js.undefined)
    
    @scala.inline
    def setExamplesVarargs(value: Cmd*): Self = this.set("examples", js.Array(value :_*))
    
    @scala.inline
    def setExamples(value: js.Array[Cmd]): Self = this.set("examples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExamples: Self = this.set("examples", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: (CommandOption[(js.Function1[/* ctx */ Config, OptionValue]) | js.Function0[OptionValue]])*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(
      value: js.Array[
          CommandOption[(js.Function1[/* ctx */ Config, OptionValue]) | js.Function0[OptionValue]]
        ]
    ): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPkg(value: Name): Self = this.set("pkg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePkg: Self = this.set("pkg", js.undefined)
  }
}

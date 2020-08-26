package typings.reactNativeCommunityCli.mod

import typings.reactNativeCommunityCli.anon.Cmd
import typings.reactNativeCommunityCli.anon.Default
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Command extends js.Object {
  var description: js.UndefOr[String] = js.native
  var examples: js.UndefOr[js.Array[Cmd]] = js.native
  var name: String = js.native
  var options: js.UndefOr[js.Array[Default]] = js.native
  def func(argv: js.Array[String], ctx: Config_, args: Record[String, String]): js.Promise[Unit] = js.native
}

object Command {
  @scala.inline
  def apply(func: (js.Array[String], Config_, Record[String, String]) => js.Promise[Unit], name: String): Command = {
    val __obj = js.Dynamic.literal(func = js.Any.fromFunction3(func), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  @scala.inline
  implicit class CommandOps[Self <: Command] (val x: Self) extends AnyVal {
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
    def setFunc(value: (js.Array[String], Config_, Record[String, String]) => js.Promise[Unit]): Self = this.set("func", js.Any.fromFunction3(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setExamplesVarargs(value: Cmd*): Self = this.set("examples", js.Array(value :_*))
    @scala.inline
    def setExamples(value: js.Array[Cmd]): Self = this.set("examples", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExamples: Self = this.set("examples", js.undefined)
    @scala.inline
    def setOptionsVarargs(value: Default*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[Default]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}


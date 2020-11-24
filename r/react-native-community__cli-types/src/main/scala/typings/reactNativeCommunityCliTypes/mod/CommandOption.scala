package typings.reactNativeCommunityCliTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandOption[T] extends js.Object {
  
  var default: js.UndefOr[OptionValue | T] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var parse: js.UndefOr[js.Function1[/* val */ String, _]] = js.native
}
object CommandOption {
  
  @scala.inline
  def apply[T](name: String): CommandOption[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandOption[T]]
  }
  
  @scala.inline
  implicit class CommandOptionOps[Self <: CommandOption[_], T] (val x: Self with CommandOption[T]) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: OptionValue | T): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setParse(value: /* val */ String => _): Self = this.set("parse", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteParse: Self = this.set("parse", js.undefined)
  }
}

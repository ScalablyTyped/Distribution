package typings.pulumiAws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofIoT1ClickProjects extends js.Object {
  
  val Types: this.type = js.native
}
object TypeofIoT1ClickProjects {
  
  @scala.inline
  def apply(Types: TypeofIoT1ClickProjects): TypeofIoT1ClickProjects = {
    val __obj = js.Dynamic.literal(Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofIoT1ClickProjects]
  }
  
  @scala.inline
  implicit class TypeofIoT1ClickProjectsOps[Self <: TypeofIoT1ClickProjects] (val x: Self) extends AnyVal {
    
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
    def setTypes(value: TypeofIoT1ClickProjects): Self = this.set("Types", value.asInstanceOf[js.Any])
  }
}

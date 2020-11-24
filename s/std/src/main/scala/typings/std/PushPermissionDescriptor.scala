package typings.std

import typings.std.stdStrings.push
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushPermissionDescriptor extends PermissionDescriptor {
  
  @JSName("name")
  var name_PushPermissionDescriptor: push = js.native
  
  var userVisibleOnly: js.UndefOr[scala.Boolean] = js.native
}
object PushPermissionDescriptor {
  
  @scala.inline
  def apply(name: push): PushPermissionDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushPermissionDescriptor]
  }
  
  @scala.inline
  implicit class PushPermissionDescriptorOps[Self <: PushPermissionDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: push): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserVisibleOnly(value: scala.Boolean): Self = this.set("userVisibleOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserVisibleOnly: Self = this.set("userVisibleOnly", js.undefined)
  }
}

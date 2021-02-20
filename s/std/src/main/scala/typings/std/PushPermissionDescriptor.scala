package typings.std

import typings.std.stdStrings.push
import org.scalablytyped.runtime.StObject
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
  implicit class PushPermissionDescriptorMutableBuilder[Self <: PushPermissionDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: push): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserVisibleOnly(value: scala.Boolean): Self = StObject.set(x, "userVisibleOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserVisibleOnlyUndefined: Self = StObject.set(x, "userVisibleOnly", js.undefined)
  }
}

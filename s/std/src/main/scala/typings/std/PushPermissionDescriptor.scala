package typings.std

import typings.std.stdStrings.push
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushPermissionDescriptor
  extends StObject
     with PermissionDescriptor {
  
  @JSName("name")
  var name_PushPermissionDescriptor: push
  
  var userVisibleOnly: js.UndefOr[scala.Boolean] = js.undefined
}
object PushPermissionDescriptor {
  
  @scala.inline
  def apply(): PushPermissionDescriptor = {
    val __obj = js.Dynamic.literal(name = "push")
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

package typings.pulumiAws.containerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Device extends StObject {
  
  var containerPath: js.UndefOr[String] = js.undefined
  
  var hostPath: String
  
  var permissions: js.UndefOr[js.Array[String]] = js.undefined
}
object Device {
  
  @scala.inline
  def apply(hostPath: String): Device = {
    val __obj = js.Dynamic.literal(hostPath = hostPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  
  @scala.inline
  implicit class DeviceMutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerPath(value: String): Self = StObject.set(x, "containerPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerPathUndefined: Self = StObject.set(x, "containerPath", js.undefined)
    
    @scala.inline
    def setHostPath(value: String): Self = StObject.set(x, "hostPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
  }
}

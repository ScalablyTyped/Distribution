package typings.pulumiAws.containerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MountPoint extends StObject {
  
  var containerPath: js.UndefOr[String] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var sourceVolume: js.UndefOr[String] = js.undefined
}
object MountPoint {
  
  inline def apply(): MountPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MountPoint]
  }
  
  extension [Self <: MountPoint](x: Self) {
    
    inline def setContainerPath(value: String): Self = StObject.set(x, "containerPath", value.asInstanceOf[js.Any])
    
    inline def setContainerPathUndefined: Self = StObject.set(x, "containerPath", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setSourceVolume(value: String): Self = StObject.set(x, "sourceVolume", value.asInstanceOf[js.Any])
    
    inline def setSourceVolumeUndefined: Self = StObject.set(x, "sourceVolume", js.undefined)
  }
}

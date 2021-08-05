package typings.pulumiAws.containerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumeFrom extends StObject {
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var sourceContainer: js.UndefOr[String] = js.undefined
}
object VolumeFrom {
  
  inline def apply(): VolumeFrom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeFrom]
  }
  
  extension [Self <: VolumeFrom](x: Self) {
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setSourceContainer(value: String): Self = StObject.set(x, "sourceContainer", value.asInstanceOf[js.Any])
    
    inline def setSourceContainerUndefined: Self = StObject.set(x, "sourceContainer", js.undefined)
  }
}

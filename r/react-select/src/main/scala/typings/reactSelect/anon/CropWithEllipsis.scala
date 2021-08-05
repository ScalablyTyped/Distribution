package typings.reactSelect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CropWithEllipsis extends StObject {
  
  var cropWithEllipsis: Boolean
}
object CropWithEllipsis {
  
  inline def apply(cropWithEllipsis: Boolean): CropWithEllipsis = {
    val __obj = js.Dynamic.literal(cropWithEllipsis = cropWithEllipsis.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropWithEllipsis]
  }
  
  extension [Self <: CropWithEllipsis](x: Self) {
    
    inline def setCropWithEllipsis(value: Boolean): Self = StObject.set(x, "cropWithEllipsis", value.asInstanceOf[js.Any])
  }
}

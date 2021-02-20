package typings.reactSelect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CropWithEllipsis extends StObject {
  
  var cropWithEllipsis: Boolean = js.native
}
object CropWithEllipsis {
  
  @scala.inline
  def apply(cropWithEllipsis: Boolean): CropWithEllipsis = {
    val __obj = js.Dynamic.literal(cropWithEllipsis = cropWithEllipsis.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropWithEllipsis]
  }
  
  @scala.inline
  implicit class CropWithEllipsisMutableBuilder[Self <: CropWithEllipsis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCropWithEllipsis(value: Boolean): Self = StObject.set(x, "cropWithEllipsis", value.asInstanceOf[js.Any])
  }
}

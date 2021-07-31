package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlobPropertyBag extends StObject {
  
  var endings: js.UndefOr[EndingType] = js.undefined
  
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}
object BlobPropertyBag {
  
  @scala.inline
  def apply(): BlobPropertyBag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlobPropertyBag]
  }
  
  @scala.inline
  implicit class BlobPropertyBagMutableBuilder[Self <: BlobPropertyBag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndings(value: EndingType): Self = StObject.set(x, "endings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndingsUndefined: Self = StObject.set(x, "endings", js.undefined)
    
    @scala.inline
    def setType(value: java.lang.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

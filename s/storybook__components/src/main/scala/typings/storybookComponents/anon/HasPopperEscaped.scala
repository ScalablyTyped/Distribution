package typings.storybookComponents.anon

import typings.storybookComponents.popperjsCoreLibTypesMod.SideObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasPopperEscaped extends StObject {
  
  var hasPopperEscaped: Boolean
  
  var isReferenceHidden: Boolean
  
  var popperEscapeOffsets: SideObject
  
  var referenceClippingOffsets: SideObject
}
object HasPopperEscaped {
  
  inline def apply(
    hasPopperEscaped: Boolean,
    isReferenceHidden: Boolean,
    popperEscapeOffsets: SideObject,
    referenceClippingOffsets: SideObject
  ): HasPopperEscaped = {
    val __obj = js.Dynamic.literal(hasPopperEscaped = hasPopperEscaped.asInstanceOf[js.Any], isReferenceHidden = isReferenceHidden.asInstanceOf[js.Any], popperEscapeOffsets = popperEscapeOffsets.asInstanceOf[js.Any], referenceClippingOffsets = referenceClippingOffsets.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasPopperEscaped]
  }
  
  extension [Self <: HasPopperEscaped](x: Self) {
    
    inline def setHasPopperEscaped(value: Boolean): Self = StObject.set(x, "hasPopperEscaped", value.asInstanceOf[js.Any])
    
    inline def setIsReferenceHidden(value: Boolean): Self = StObject.set(x, "isReferenceHidden", value.asInstanceOf[js.Any])
    
    inline def setPopperEscapeOffsets(value: SideObject): Self = StObject.set(x, "popperEscapeOffsets", value.asInstanceOf[js.Any])
    
    inline def setReferenceClippingOffsets(value: SideObject): Self = StObject.set(x, "referenceClippingOffsets", value.asInstanceOf[js.Any])
  }
}

package typings.reactAriaInteractions.mod

import typings.reactTypesShared.srcDomMod.DOMAttributes
import typings.reactTypesShared.srcDomMod.FocusableElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LongPressResult extends StObject {
  
  /** Props to spread on the target element. */
  var longPressProps: DOMAttributes[FocusableElement]
}
object LongPressResult {
  
  inline def apply(longPressProps: DOMAttributes[FocusableElement]): LongPressResult = {
    val __obj = js.Dynamic.literal(longPressProps = longPressProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongPressResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LongPressResult] (val x: Self) extends AnyVal {
    
    inline def setLongPressProps(value: DOMAttributes[FocusableElement]): Self = StObject.set(x, "longPressProps", value.asInstanceOf[js.Any])
  }
}

package typings.rangy

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangyClassApplierOptions extends StObject {
  
  var applyToEditableOnly: js.UndefOr[Boolean] = js.undefined
  
  var elementAttributes: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var elementProperties: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var elementTagName: js.UndefOr[String] = js.undefined
  
  var ignoreWhiteSpace: js.UndefOr[Boolean] = js.undefined
  
  var normalize: js.UndefOr[Boolean] = js.undefined
  
  var onElementCreate: js.UndefOr[js.Function2[/* element */ Element, /* classApplier */ RangyClassApplier, Unit]] = js.undefined
  
  var tagNames: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var useExistingElements: js.UndefOr[Boolean] = js.undefined
}
object RangyClassApplierOptions {
  
  inline def apply(): RangyClassApplierOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangyClassApplierOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RangyClassApplierOptions] (val x: Self) extends AnyVal {
    
    inline def setApplyToEditableOnly(value: Boolean): Self = StObject.set(x, "applyToEditableOnly", value.asInstanceOf[js.Any])
    
    inline def setApplyToEditableOnlyUndefined: Self = StObject.set(x, "applyToEditableOnly", js.undefined)
    
    inline def setElementAttributes(value: StringDictionary[String]): Self = StObject.set(x, "elementAttributes", value.asInstanceOf[js.Any])
    
    inline def setElementAttributesUndefined: Self = StObject.set(x, "elementAttributes", js.undefined)
    
    inline def setElementProperties(value: StringDictionary[String]): Self = StObject.set(x, "elementProperties", value.asInstanceOf[js.Any])
    
    inline def setElementPropertiesUndefined: Self = StObject.set(x, "elementProperties", js.undefined)
    
    inline def setElementTagName(value: String): Self = StObject.set(x, "elementTagName", value.asInstanceOf[js.Any])
    
    inline def setElementTagNameUndefined: Self = StObject.set(x, "elementTagName", js.undefined)
    
    inline def setIgnoreWhiteSpace(value: Boolean): Self = StObject.set(x, "ignoreWhiteSpace", value.asInstanceOf[js.Any])
    
    inline def setIgnoreWhiteSpaceUndefined: Self = StObject.set(x, "ignoreWhiteSpace", js.undefined)
    
    inline def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
    
    inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    
    inline def setOnElementCreate(value: (/* element */ Element, /* classApplier */ RangyClassApplier) => Unit): Self = StObject.set(x, "onElementCreate", js.Any.fromFunction2(value))
    
    inline def setOnElementCreateUndefined: Self = StObject.set(x, "onElementCreate", js.undefined)
    
    inline def setTagNames(value: String | js.Array[String]): Self = StObject.set(x, "tagNames", value.asInstanceOf[js.Any])
    
    inline def setTagNamesUndefined: Self = StObject.set(x, "tagNames", js.undefined)
    
    inline def setTagNamesVarargs(value: String*): Self = StObject.set(x, "tagNames", js.Array(value*))
    
    inline def setUseExistingElements(value: Boolean): Self = StObject.set(x, "useExistingElements", value.asInstanceOf[js.Any])
    
    inline def setUseExistingElementsUndefined: Self = StObject.set(x, "useExistingElements", js.undefined)
  }
}

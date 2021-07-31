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
  
  @scala.inline
  def apply(): RangyClassApplierOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangyClassApplierOptions]
  }
  
  @scala.inline
  implicit class RangyClassApplierOptionsMutableBuilder[Self <: RangyClassApplierOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyToEditableOnly(value: Boolean): Self = StObject.set(x, "applyToEditableOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyToEditableOnlyUndefined: Self = StObject.set(x, "applyToEditableOnly", js.undefined)
    
    @scala.inline
    def setElementAttributes(value: StringDictionary[String]): Self = StObject.set(x, "elementAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementAttributesUndefined: Self = StObject.set(x, "elementAttributes", js.undefined)
    
    @scala.inline
    def setElementProperties(value: StringDictionary[String]): Self = StObject.set(x, "elementProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementPropertiesUndefined: Self = StObject.set(x, "elementProperties", js.undefined)
    
    @scala.inline
    def setElementTagName(value: String): Self = StObject.set(x, "elementTagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementTagNameUndefined: Self = StObject.set(x, "elementTagName", js.undefined)
    
    @scala.inline
    def setIgnoreWhiteSpace(value: Boolean): Self = StObject.set(x, "ignoreWhiteSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreWhiteSpaceUndefined: Self = StObject.set(x, "ignoreWhiteSpace", js.undefined)
    
    @scala.inline
    def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    
    @scala.inline
    def setOnElementCreate(value: (/* element */ Element, /* classApplier */ RangyClassApplier) => Unit): Self = StObject.set(x, "onElementCreate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnElementCreateUndefined: Self = StObject.set(x, "onElementCreate", js.undefined)
    
    @scala.inline
    def setTagNames(value: String | js.Array[String]): Self = StObject.set(x, "tagNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagNamesUndefined: Self = StObject.set(x, "tagNames", js.undefined)
    
    @scala.inline
    def setTagNamesVarargs(value: String*): Self = StObject.set(x, "tagNames", js.Array(value :_*))
    
    @scala.inline
    def setUseExistingElements(value: Boolean): Self = StObject.set(x, "useExistingElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseExistingElementsUndefined: Self = StObject.set(x, "useExistingElements", js.undefined)
  }
}

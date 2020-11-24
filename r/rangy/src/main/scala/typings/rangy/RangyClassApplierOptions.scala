package typings.rangy

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangyClassApplierOptions extends js.Object {
  
  var applyToEditableOnly: js.UndefOr[Boolean] = js.native
  
  var elementAttributes: js.UndefOr[StringDictionary[String]] = js.native
  
  var elementProperties: js.UndefOr[StringDictionary[String]] = js.native
  
  var elementTagName: js.UndefOr[String] = js.native
  
  var ignoreWhiteSpace: js.UndefOr[Boolean] = js.native
  
  var normalize: js.UndefOr[Boolean] = js.native
  
  var onElementCreate: js.UndefOr[js.Function2[/* element */ Element, /* classApplier */ RangyClassApplier, Unit]] = js.native
  
  var tagNames: js.UndefOr[String | js.Array[String]] = js.native
  
  var useExistingElements: js.UndefOr[Boolean] = js.native
}
object RangyClassApplierOptions {
  
  @scala.inline
  def apply(): RangyClassApplierOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangyClassApplierOptions]
  }
  
  @scala.inline
  implicit class RangyClassApplierOptionsOps[Self <: RangyClassApplierOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplyToEditableOnly(value: Boolean): Self = this.set("applyToEditableOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyToEditableOnly: Self = this.set("applyToEditableOnly", js.undefined)
    
    @scala.inline
    def setElementAttributes(value: StringDictionary[String]): Self = this.set("elementAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementAttributes: Self = this.set("elementAttributes", js.undefined)
    
    @scala.inline
    def setElementProperties(value: StringDictionary[String]): Self = this.set("elementProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementProperties: Self = this.set("elementProperties", js.undefined)
    
    @scala.inline
    def setElementTagName(value: String): Self = this.set("elementTagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementTagName: Self = this.set("elementTagName", js.undefined)
    
    @scala.inline
    def setIgnoreWhiteSpace(value: Boolean): Self = this.set("ignoreWhiteSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreWhiteSpace: Self = this.set("ignoreWhiteSpace", js.undefined)
    
    @scala.inline
    def setNormalize(value: Boolean): Self = this.set("normalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalize: Self = this.set("normalize", js.undefined)
    
    @scala.inline
    def setOnElementCreate(value: (/* element */ Element, /* classApplier */ RangyClassApplier) => Unit): Self = this.set("onElementCreate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnElementCreate: Self = this.set("onElementCreate", js.undefined)
    
    @scala.inline
    def setTagNamesVarargs(value: String*): Self = this.set("tagNames", js.Array(value :_*))
    
    @scala.inline
    def setTagNames(value: String | js.Array[String]): Self = this.set("tagNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagNames: Self = this.set("tagNames", js.undefined)
    
    @scala.inline
    def setUseExistingElements(value: Boolean): Self = this.set("useExistingElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseExistingElements: Self = this.set("useExistingElements", js.undefined)
  }
}

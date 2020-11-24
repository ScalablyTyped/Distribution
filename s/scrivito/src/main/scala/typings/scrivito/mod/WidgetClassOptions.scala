package typings.scrivito.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WidgetClassOptions extends js.Object {
  
  var attributes: Record[String, Attribute | AttributeWithOptions] = js.native
  
  var extend: js.UndefOr[WidgetClass] = js.native
  
  var extractTextAttributes: js.UndefOr[js.Array[String]] = js.native
  
  var onlyInside: js.UndefOr[String | js.Array[String]] = js.native
}
object WidgetClassOptions {
  
  @scala.inline
  def apply(attributes: Record[String, Attribute | AttributeWithOptions]): WidgetClassOptions = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetClassOptions]
  }
  
  @scala.inline
  implicit class WidgetClassOptionsOps[Self <: WidgetClassOptions] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: Record[String, Attribute | AttributeWithOptions]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtend(value: WidgetClass): Self = this.set("extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtend: Self = this.set("extend", js.undefined)
    
    @scala.inline
    def setExtractTextAttributesVarargs(value: String*): Self = this.set("extractTextAttributes", js.Array(value :_*))
    
    @scala.inline
    def setExtractTextAttributes(value: js.Array[String]): Self = this.set("extractTextAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtractTextAttributes: Self = this.set("extractTextAttributes", js.undefined)
    
    @scala.inline
    def setOnlyInsideVarargs(value: String*): Self = this.set("onlyInside", js.Array(value :_*))
    
    @scala.inline
    def setOnlyInside(value: String | js.Array[String]): Self = this.set("onlyInside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyInside: Self = this.set("onlyInside", js.undefined)
  }
}

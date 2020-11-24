package typings.reactPdf.pageMod

import typings.reactPdf.reactPdfNumbers.`0`
import typings.reactPdf.reactPdfNumbers.`180`
import typings.reactPdf.reactPdfNumbers.`270`
import typings.reactPdf.reactPdfNumbers.`90`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextLayerItemInternal extends js.Object {
  
  var fontName: String = js.native
  
  var itemIndex: Double = js.native
  
  var page: PDFPageItem = js.native
  
  var rotate: js.UndefOr[`0` | `90` | `180` | `270`] = js.native
  
  var scale: js.UndefOr[Double] = js.native
  
  var str: String = js.native
  
  var transform: js.Array[Double] = js.native
  
  var width: Double = js.native
}
object TextLayerItemInternal {
  
  @scala.inline
  def apply(
    fontName: String,
    itemIndex: Double,
    page: PDFPageItem,
    str: String,
    transform: js.Array[Double],
    width: Double
  ): TextLayerItemInternal = {
    val __obj = js.Dynamic.literal(fontName = fontName.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextLayerItemInternal]
  }
  
  @scala.inline
  implicit class TextLayerItemInternalOps[Self <: TextLayerItemInternal] (val x: Self) extends AnyVal {
    
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
    def setFontName(value: String): Self = this.set("fontName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIndex(value: Double): Self = this.set("itemIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: PDFPageItem): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStr(value: String): Self = this.set("str", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformVarargs(value: Double*): Self = this.set("transform", js.Array(value :_*))
    
    @scala.inline
    def setTransform(value: js.Array[Double]): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotate(value: `0` | `90` | `180` | `270`): Self = this.set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
  }
}

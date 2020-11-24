package typings.reactPdf.pageMod

import typings.pdfjsDist.mod.PDFAnnotations
import typings.pdfjsDist.mod.PDFPageViewport
import typings.pdfjsDist.mod.PDFPromise
import typings.pdfjsDist.mod.PDFRef
import typings.pdfjsDist.mod.PDFRenderParams
import typings.pdfjsDist.mod.PDFRenderTask
import typings.pdfjsDist.mod.TextContent
import typings.pdfjsDist.mod.ViewportParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFPageProxy
  extends typings.pdfjsDist.mod.PDFPageProxy {
  
  var height: Double = js.native
  
  var originalHeight: Double = js.native
  
  var originalWidth: Double = js.native
  
  var width: Double = js.native
}
object PDFPageProxy {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    getAnnotations: () => PDFPromise[PDFAnnotations],
    getTextContent: () => PDFPromise[TextContent],
    getViewport: ViewportParameters => PDFPageViewport,
    height: Double,
    originalHeight: Double,
    originalWidth: Double,
    pageIndex: Double,
    pageNumber: Double,
    ref: PDFRef,
    render: PDFRenderParams => PDFRenderTask,
    rotate: Double,
    view: js.Array[Double],
    width: Double
  ): PDFPageProxy = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getAnnotations = js.Any.fromFunction0(getAnnotations), getTextContent = js.Any.fromFunction0(getTextContent), getViewport = js.Any.fromFunction1(getViewport), height = height.asInstanceOf[js.Any], originalHeight = originalHeight.asInstanceOf[js.Any], originalWidth = originalWidth.asInstanceOf[js.Any], pageIndex = pageIndex.asInstanceOf[js.Any], pageNumber = pageNumber.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], render = js.Any.fromFunction1(render), rotate = rotate.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFPageProxy]
  }
  
  @scala.inline
  implicit class PDFPageProxyOps[Self <: PDFPageProxy] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalHeight(value: Double): Self = this.set("originalHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalWidth(value: Double): Self = this.set("originalWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}

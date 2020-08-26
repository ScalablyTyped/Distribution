package typings.reactPdf.pageMod

import typings.pdfjsDist.mod.PDFPageProxy
import typings.react.mod.LegacyRef
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.reactPdf.reactPdfStrings.canvas
import typings.reactPdf.reactPdfStrings.none
import typings.reactPdf.reactPdfStrings.svg
import typings.std.Error
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  /**
    * Defines custom class name(s), that will be added to rendered element.
    * @default 'react-pdf__Page'
    */
  var className: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * A function that customizes how a text layer is rendered.
    * Passes itext item and index for item.
    */
  var customTextRenderer: js.UndefOr[js.Function1[/* layer */ TextLayerItemInternal, Element]] = js.native
  /**
    * Defines what the component should display in case of an error.
    * @default 'Failed to load PDF file.'
    */
  var error: js.UndefOr[String | ReactElement | RenderFunction] = js.native
  /**
    * Defines the height of the page.
    * If neither `height` nor `width` are defined, page will be rendered at the size defined in PDF.
    * If you define `width` and `height` at the same time, `height` will be ignored.
    * If you define `height` and `scale` at the same time, the height will be multiplied by a given factor.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * A function that behaves like ref,
    * but it's passed to main `<div>` rendered by `<Page>` component.
    */
  var inputRef: js.UndefOr[LegacyRef[HTMLDivElement]] = js.native
  /**
    * Defines what the component should display while loading.
    * @default 'Loading page…'
    */
  var loading: js.UndefOr[String | ReactElement | RenderFunction] = js.native
  /**
    * Defines what the component should display in case of no data.
    * @default 'No page specified.'
    */
  var noData: js.UndefOr[String | ReactElement | RenderFunction] = js.native
  /**
    * Function called in case of an error while loading annotations.
    */
  var onGetAnnotationsError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
  /**
    * Function called when annotations are successfully loaded.
    */
  var onGetAnnotationsSuccess: js.UndefOr[js.Function1[/* annotations */ js.Any, Unit]] = js.native
  /**
    * Function called in case of an error while loading text layer items.
    */
  var onGetTextError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
  /**
    * Function called when text layer items are successfully loaded.
    */
  var onGetTextSuccess: js.UndefOr[js.Function1[/* items */ js.Array[TextItem], Unit]] = js.native
  /**
    * Function called in case of an error while loading the page.
    */
  var onLoadError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
  /**
    * Function called, potentially multiple times, as the loading progresses.
    */
  var onLoadProgress: js.UndefOr[js.Function1[/* data */ LoadingProcessData, Unit]] = js.native
  /**
    * Function called when the page is successfully loaded.
    */
  var onLoadSuccess: js.UndefOr[js.Function1[/* page */ PDFPageProxy, Unit]] = js.native
  /**
    * Function called in case of an error while rendering the page.
    */
  var onRenderError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
  /**
    * Function called when the page is successfully rendered on the screen.
    */
  var onRenderSuccess: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Defines which page from PDF file should be displayed.
    * @default 0
    */
  var pageIndex: js.UndefOr[Double] = js.native
  /**
    * Defines which page from PDF file should be displayed.
    * If provided, pageIndex prop will be ignored.
    * @default 1
    */
  var pageNumber: js.UndefOr[Double] = js.native
  /**
    * Defines whether annotations (e.g. links) should be rendered.
    * @default true
    */
  var renderAnnotationLayer: js.UndefOr[Boolean] = js.native
  /**
    * Defines whether interactive forms should be rendered.
    * `renderAnnotationLayer` prop must be set to true.
    * @default false
    */
  var renderInteractiveForms: js.UndefOr[Boolean] = js.native
  /**
    * Defines the rendering mode of the page.
    * @default 'canvas'
    */
  var renderMode: js.UndefOr[canvas | svg | none] = js.native
  /**
    * Defines whether a text layer should be rendered.
    * @default true
    */
  var renderTextLayer: js.UndefOr[Boolean] = js.native
  /**
    * Defines the rotation of the page in degrees.
    * 90 = rotated to the right, 180 = upside down, 270 = rotated to the left.
    * Defaults to page's default setting, usually 0.
    */
  var rotate: js.UndefOr[Double] = js.native
  /**
    * Defines the scale in which PDF file should be rendered.
    * @default 1.0
    */
  var scale: js.UndefOr[Double] = js.native
  /**
    * Defines the width of the page.
    * If neither `height` nor `width` are defined, page will be rendered at the size defined in PDF.
    * If you define `width` and `height` at the same time, `height` will be ignored.
    * If you define `width` and `scale` at the same time, the width will be multiplied by a given factor.
    */
  var width: js.UndefOr[Double] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setClassNameVarargs(value: String*): Self = this.set("className", js.Array(value :_*))
    @scala.inline
    def setClassName(value: String | js.Array[String]): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCustomTextRenderer(value: /* layer */ TextLayerItemInternal => Element): Self = this.set("customTextRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomTextRenderer: Self = this.set("customTextRenderer", js.undefined)
    @scala.inline
    def setErrorFunction0(value: () => Element): Self = this.set("error", js.Any.fromFunction0(value))
    @scala.inline
    def setError(value: String | ReactElement | RenderFunction): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setInputRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = this.set("inputRef", js.Any.fromFunction1(value))
    @scala.inline
    def setInputRef(value: LegacyRef[HTMLDivElement]): Self = this.set("inputRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputRef: Self = this.set("inputRef", js.undefined)
    @scala.inline
    def setInputRefNull: Self = this.set("inputRef", null)
    @scala.inline
    def setLoadingFunction0(value: () => Element): Self = this.set("loading", js.Any.fromFunction0(value))
    @scala.inline
    def setLoading(value: String | ReactElement | RenderFunction): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setNoDataFunction0(value: () => Element): Self = this.set("noData", js.Any.fromFunction0(value))
    @scala.inline
    def setNoData(value: String | ReactElement | RenderFunction): Self = this.set("noData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoData: Self = this.set("noData", js.undefined)
    @scala.inline
    def setOnGetAnnotationsError(value: /* error */ Error => Unit): Self = this.set("onGetAnnotationsError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnGetAnnotationsError: Self = this.set("onGetAnnotationsError", js.undefined)
    @scala.inline
    def setOnGetAnnotationsSuccess(value: /* annotations */ js.Any => Unit): Self = this.set("onGetAnnotationsSuccess", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnGetAnnotationsSuccess: Self = this.set("onGetAnnotationsSuccess", js.undefined)
    @scala.inline
    def setOnGetTextError(value: /* error */ Error => Unit): Self = this.set("onGetTextError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnGetTextError: Self = this.set("onGetTextError", js.undefined)
    @scala.inline
    def setOnGetTextSuccess(value: /* items */ js.Array[TextItem] => Unit): Self = this.set("onGetTextSuccess", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnGetTextSuccess: Self = this.set("onGetTextSuccess", js.undefined)
    @scala.inline
    def setOnLoadError(value: /* error */ Error => Unit): Self = this.set("onLoadError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadError: Self = this.set("onLoadError", js.undefined)
    @scala.inline
    def setOnLoadProgress(value: /* data */ LoadingProcessData => Unit): Self = this.set("onLoadProgress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadProgress: Self = this.set("onLoadProgress", js.undefined)
    @scala.inline
    def setOnLoadSuccess(value: /* page */ PDFPageProxy => Unit): Self = this.set("onLoadSuccess", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadSuccess: Self = this.set("onLoadSuccess", js.undefined)
    @scala.inline
    def setOnRenderError(value: /* error */ Error => Unit): Self = this.set("onRenderError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRenderError: Self = this.set("onRenderError", js.undefined)
    @scala.inline
    def setOnRenderSuccess(value: () => Unit): Self = this.set("onRenderSuccess", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnRenderSuccess: Self = this.set("onRenderSuccess", js.undefined)
    @scala.inline
    def setPageIndex(value: Double): Self = this.set("pageIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageIndex: Self = this.set("pageIndex", js.undefined)
    @scala.inline
    def setPageNumber(value: Double): Self = this.set("pageNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageNumber: Self = this.set("pageNumber", js.undefined)
    @scala.inline
    def setRenderAnnotationLayer(value: Boolean): Self = this.set("renderAnnotationLayer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderAnnotationLayer: Self = this.set("renderAnnotationLayer", js.undefined)
    @scala.inline
    def setRenderInteractiveForms(value: Boolean): Self = this.set("renderInteractiveForms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderInteractiveForms: Self = this.set("renderInteractiveForms", js.undefined)
    @scala.inline
    def setRenderMode(value: canvas | svg | none): Self = this.set("renderMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderMode: Self = this.set("renderMode", js.undefined)
    @scala.inline
    def setRenderTextLayer(value: Boolean): Self = this.set("renderTextLayer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderTextLayer: Self = this.set("renderTextLayer", js.undefined)
    @scala.inline
    def setRotate(value: Double): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}


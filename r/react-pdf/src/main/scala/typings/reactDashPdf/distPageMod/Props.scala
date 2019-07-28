package typings.reactDashPdf.distPageMod

import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.ReactElement
import typings.reactDashPdf.reactDashPdfStrings.canvas
import typings.reactDashPdf.reactDashPdfStrings.none
import typings.reactDashPdf.reactDashPdfStrings.svg
import typings.std.Error
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * Defines custom class name(s), that will be added to rendered element.
    * @default 'react-pdf__Page'
    */
  var className: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * A function that customizes how a text layer is rendered.
    * Passes itext item and index for item.
    */
  var customTextRenderer: js.UndefOr[js.Function1[/* layer */ TextLayerItemInternal, Element]] = js.undefined
  /**
    * Defines what the component should display in case of an error.
    * @default 'Failed to load PDF file.'
    */
  var error: js.UndefOr[String | ReactElement | RenderFunction] = js.undefined
  /**
    * Defines the height of the page.
    * If neither `height` nor `width` are defined, page will be rendered at the size defined in PDF.
    * If you define `width` and `height` at the same time, `height` will be ignored.
    * If you define `height` and `scale` at the same time, the height will be multiplied by a given factor.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * A function that behaves like ref,
    * but it's passed to main `<div>` rendered by `<Page>` component.
    */
  var inputRef: js.UndefOr[LegacyRef[HTMLDivElement]] = js.undefined
  /**
    * Defines what the component should display while loading.
    * @default 'Loading page…'
    */
  var loading: js.UndefOr[String | ReactElement | RenderFunction] = js.undefined
  /**
    * Defines what the component should display in case of no data.
    * @default 'No page specified.'
    */
  var noData: js.UndefOr[String | ReactElement | RenderFunction] = js.undefined
  /**
    * Function called in case of an error while loading annotations.
    */
  var onGetAnnotationsError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
  /**
    * Function called when annotations are successfully loaded.
    */
  var onGetAnnotationsSuccess: js.UndefOr[js.Function1[/* annotations */ js.Any, Unit]] = js.undefined
  /**
    * Function called in case of an error while loading text layer items.
    */
  var onGetTextError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
  /**
    * Function called when text layer items are successfully loaded.
    */
  var onGetTextSuccess: js.UndefOr[js.Function1[/* items */ js.Array[TextItem], Unit]] = js.undefined
  /**
    * Function called in case of an error while loading the page.
    */
  var onLoadError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
  /**
    * Function called, potentially multiple times, as the loading progresses.
    */
  var onLoadProgress: js.UndefOr[js.Function1[/* data */ LoadingProcessData, Unit]] = js.undefined
  /**
    * Function called when the page is successfully loaded.
    */
  var onLoadSuccess: js.UndefOr[js.Function1[/* pdf */ js.Any, Unit]] = js.undefined
  /**
    * Function called in case of an error while rendering the page.
    */
  var onRenderError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
  /**
    * Function called when the page is successfully rendered on the screen.
    */
  var onRenderSuccess: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Defines which page from PDF file should be displayed.
    * @default 0
    */
  var pageIndex: js.UndefOr[Double] = js.undefined
  /**
    * Defines which page from PDF file should be displayed.
    * If provided, pageIndex prop will be ignored.
    * @default 1
    */
  var pageNumber: js.UndefOr[Double] = js.undefined
  /**
    * Defines whether annotations (e.g. links) should be rendered.
    * @default true
    */
  var renderAnnotationLayer: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines whether interactive forms should be rendered.
    * `renderAnnotationLayer` prop must be set to true.
    * @default false
    */
  var renderInteractiveForms: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines the rendering mode of the page.
    * @default 'canvas'
    */
  var renderMode: js.UndefOr[canvas | svg | none] = js.undefined
  /**
    * Defines whether a text layer should be rendered.
    * @default true
    */
  var renderTextLayer: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines the rotation of the page in degrees.
    * 90 = rotated to the right, 180 = upside down, 270 = rotated to the left.
    * Defaults to page's default setting, usually 0.
    */
  var rotate: js.UndefOr[Double] = js.undefined
  /**
    * Defines the scale in which PDF file should be rendered.
    * @default 1.0
    */
  var scale: js.UndefOr[Double] = js.undefined
  /**
    * Defines the width of the page.
    * If neither `height` nor `width` are defined, page will be rendered at the size defined in PDF.
    * If you define `width` and `height` at the same time, `height` will be ignored.
    * If you define `width` and `scale` at the same time, the width will be multiplied by a given factor.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    className: String | js.Array[String] = null,
    customTextRenderer: /* layer */ TextLayerItemInternal => Element = null,
    error: String | ReactElement | RenderFunction = null,
    height: Int | Double = null,
    inputRef: LegacyRef[HTMLDivElement] = null,
    loading: String | ReactElement | RenderFunction = null,
    noData: String | ReactElement | RenderFunction = null,
    onGetAnnotationsError: /* error */ Error => Unit = null,
    onGetAnnotationsSuccess: /* annotations */ js.Any => Unit = null,
    onGetTextError: /* error */ Error => Unit = null,
    onGetTextSuccess: /* items */ js.Array[TextItem] => Unit = null,
    onLoadError: /* error */ Error => Unit = null,
    onLoadProgress: /* data */ LoadingProcessData => Unit = null,
    onLoadSuccess: /* pdf */ js.Any => Unit = null,
    onRenderError: /* error */ Error => Unit = null,
    onRenderSuccess: () => Unit = null,
    pageIndex: Int | Double = null,
    pageNumber: Int | Double = null,
    renderAnnotationLayer: js.UndefOr[Boolean] = js.undefined,
    renderInteractiveForms: js.UndefOr[Boolean] = js.undefined,
    renderMode: canvas | svg | none = null,
    renderTextLayer: js.UndefOr[Boolean] = js.undefined,
    rotate: Int | Double = null,
    scale: Int | Double = null,
    width: Int | Double = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (customTextRenderer != null) __obj.updateDynamic("customTextRenderer")(js.Any.fromFunction1(customTextRenderer))
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (noData != null) __obj.updateDynamic("noData")(noData.asInstanceOf[js.Any])
    if (onGetAnnotationsError != null) __obj.updateDynamic("onGetAnnotationsError")(js.Any.fromFunction1(onGetAnnotationsError))
    if (onGetAnnotationsSuccess != null) __obj.updateDynamic("onGetAnnotationsSuccess")(js.Any.fromFunction1(onGetAnnotationsSuccess))
    if (onGetTextError != null) __obj.updateDynamic("onGetTextError")(js.Any.fromFunction1(onGetTextError))
    if (onGetTextSuccess != null) __obj.updateDynamic("onGetTextSuccess")(js.Any.fromFunction1(onGetTextSuccess))
    if (onLoadError != null) __obj.updateDynamic("onLoadError")(js.Any.fromFunction1(onLoadError))
    if (onLoadProgress != null) __obj.updateDynamic("onLoadProgress")(js.Any.fromFunction1(onLoadProgress))
    if (onLoadSuccess != null) __obj.updateDynamic("onLoadSuccess")(js.Any.fromFunction1(onLoadSuccess))
    if (onRenderError != null) __obj.updateDynamic("onRenderError")(js.Any.fromFunction1(onRenderError))
    if (onRenderSuccess != null) __obj.updateDynamic("onRenderSuccess")(js.Any.fromFunction0(onRenderSuccess))
    if (pageIndex != null) __obj.updateDynamic("pageIndex")(pageIndex.asInstanceOf[js.Any])
    if (pageNumber != null) __obj.updateDynamic("pageNumber")(pageNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAnnotationLayer)) __obj.updateDynamic("renderAnnotationLayer")(renderAnnotationLayer)
    if (!js.isUndefined(renderInteractiveForms)) __obj.updateDynamic("renderInteractiveForms")(renderInteractiveForms)
    if (renderMode != null) __obj.updateDynamic("renderMode")(renderMode.asInstanceOf[js.Any])
    if (!js.isUndefined(renderTextLayer)) __obj.updateDynamic("renderTextLayer")(renderTextLayer)
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}


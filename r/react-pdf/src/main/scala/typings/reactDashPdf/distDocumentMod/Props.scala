package typings.reactDashPdf.distDocumentMod

import typings.pdfjsDashDist.pdfjsDashDistMod.PDFDocumentProxy
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.reactDashPdf.Anon_PageNumber
import typings.reactDashPdf.reactDashPdfStrings._blank
import typings.reactDashPdf.reactDashPdfStrings._parent
import typings.reactDashPdf.reactDashPdfStrings._self
import typings.reactDashPdf.reactDashPdfStrings._top
import typings.reactDashPdf.reactDashPdfStrings.canvas
import typings.reactDashPdf.reactDashPdfStrings.none
import typings.reactDashPdf.reactDashPdfStrings.svg
import typings.std.Error
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  /**
    * Defines custom class name(s), that will be added to rendered element.
    * @default 'react-pdf__Document'
    */
  var className: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Defines what the component should display in case of an error.
    * @default 'Failed to load PDF file.'
    */
  var error: js.UndefOr[String | ReactElement | RenderFunction] = js.undefined
  /**
    * Defines link target for external links rendered in annotations.
    * Defaults to unset, which means that default behavior will be used.
    */
  var externalLinkTarget: js.UndefOr[_self | _blank | _parent | _top] = js.undefined
  /**
    * Defines what PDF should be displayed.
    * Its value can be an URL,
    * a file (imported using import ... from ... or from file input form element),
    * or an object with parameters
    *  (
    *   url - URL;
    *   data - data, preferably Uint8Array;
    *   range - PDFDataRangeTransport;
    *   httpHeaders - custom request headers, e.g. for authorization
    *   withCredentials - a boolean to indicate whether or not to include cookies in the request (defaults to false)
    *  )
    */
  var file: js.Any
  /**
    * A function that behaves like ref,
    * but it's passed to main `<div>` rendered by `<Document>` component.
    */
  var inputRef: js.UndefOr[LegacyRef[HTMLDivElement]] = js.undefined
  /**
    * Defines what the component should display while loading.
    * @default 'Loading PDF…'
    */
  var loading: js.UndefOr[String | ReactElement | RenderFunction] = js.undefined
  /**
    * Defines what the component should display in case of no data.
    * @default 'No PDF file specified.'
    */
  var noData: js.UndefOr[String | ReactElement | RenderFunction] = js.undefined
  /**
    * Function called when an outline item has been clicked.
    * Usually, you would like to use this callback to move the user wherever they requested to.
    */
  var onItemClick: js.UndefOr[js.Function1[/* hasPageNumber */ Anon_PageNumber, Unit]] = js.undefined
  /**
    * Function called in case of an error while loading a document.
    */
  var onLoadError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
  /**
    * Function called when the document is successfully loaded.
    */
  var onLoadSuccess: js.UndefOr[js.Function1[/* pdf */ PDFDocumentProxy, Unit]] = js.undefined
  /**
    * Function called when a password-protected PDF is loaded.
    * Defaults to a function that prompts the user for password.
    */
  var onPassword: js.UndefOr[js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, _], Unit]] = js.undefined
  /**
    * Function called in case of an error while retrieving document source from `file` prop.
    */
  var onSourceError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
  /**
    * Function called when document source is successfully retrieved from `file` prop.
    */
  var onSourceSuccess: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * An object in which additional parameters to be passed to PDF.js can be defined.
    * For a full list of possible parameters, check PDF.js documentation on DocumentInitParameters.
    */
  var options: js.UndefOr[js.Any] = js.undefined
  /**
    * Defines the rendering mode of the document.
    * @default 'canvas'
    */
  var renderMode: js.UndefOr[canvas | svg | none] = js.undefined
  /**
    * Defines the rotation of the document in degrees.
    * If provided, will change rotation globally,
    * even for the pages which were given rotate prop of their own.
    * 90 = rotated to the right, 180 = upside down, 270 = rotated to the left.
    */
  var rotate: js.UndefOr[Double] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    file: js.Any,
    children: ReactNode = null,
    className: String | js.Array[String] = null,
    error: String | ReactElement | RenderFunction = null,
    externalLinkTarget: _self | _blank | _parent | _top = null,
    inputRef: LegacyRef[HTMLDivElement] = null,
    loading: String | ReactElement | RenderFunction = null,
    noData: String | ReactElement | RenderFunction = null,
    onItemClick: /* hasPageNumber */ Anon_PageNumber => Unit = null,
    onLoadError: /* error */ Error => Unit = null,
    onLoadSuccess: /* pdf */ PDFDocumentProxy => Unit = null,
    onPassword: /* callback */ js.Function1[/* repeated */ js.Any, _] => Unit = null,
    onSourceError: /* error */ Error => Unit = null,
    onSourceSuccess: () => Unit = null,
    options: js.Any = null,
    renderMode: canvas | svg | none = null,
    rotate: Int | Double = null
  ): Props = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (externalLinkTarget != null) __obj.updateDynamic("externalLinkTarget")(externalLinkTarget.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (noData != null) __obj.updateDynamic("noData")(noData.asInstanceOf[js.Any])
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction1(onItemClick))
    if (onLoadError != null) __obj.updateDynamic("onLoadError")(js.Any.fromFunction1(onLoadError))
    if (onLoadSuccess != null) __obj.updateDynamic("onLoadSuccess")(js.Any.fromFunction1(onLoadSuccess))
    if (onPassword != null) __obj.updateDynamic("onPassword")(js.Any.fromFunction1(onPassword))
    if (onSourceError != null) __obj.updateDynamic("onSourceError")(js.Any.fromFunction1(onSourceError))
    if (onSourceSuccess != null) __obj.updateDynamic("onSourceSuccess")(js.Any.fromFunction0(onSourceSuccess))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (renderMode != null) __obj.updateDynamic("renderMode")(renderMode.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}


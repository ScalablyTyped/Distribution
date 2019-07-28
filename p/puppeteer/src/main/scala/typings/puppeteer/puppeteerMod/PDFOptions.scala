package typings.puppeteer.puppeteerMod

import typings.puppeteer.Anon_Bottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFOptions extends js.Object {
  /**
    * Display header and footer.
    * @default false
    */
  var displayHeaderFooter: js.UndefOr[Boolean] = js.undefined
  /**
    * HTML template for the print footer. Should be valid HTML markup with following classes used to inject printing values into them:
    * - `date` formatted print date
    * - `title` document title
    * - `url` document location
    * - `pageNumber` current page number
    * - `totalPages` total pages in the document
    */
  var footerTemplate: js.UndefOr[String] = js.undefined
  /**
    * Paper format. If set, takes priority over width or height options.
    * @default 'Letter'
    */
  var format: js.UndefOr[PDFFormat] = js.undefined
  /**
    * HTML template for the print header. Should be valid HTML markup with following classes used to inject printing values into them:
    * - `date` formatted print date
    * - `title` document title
    * - `url` document location
    * - `pageNumber` current page number
    * - `totalPages` total pages in the document
    */
  var headerTemplate: js.UndefOr[String] = js.undefined
  /** Paper height. */
  var height: js.UndefOr[LayoutDimension] = js.undefined
  /**
    * Paper orientation.
    * @default false
    */
  var landscape: js.UndefOr[Boolean] = js.undefined
  /** Paper margins, defaults to none. */
  var margin: js.UndefOr[Anon_Bottom] = js.undefined
  /**
    * Paper ranges to print, e.g., '1-5, 8, 11-13'.
    * @default '' which means print all pages.
    */
  var pageRanges: js.UndefOr[String] = js.undefined
  /**
    * The file path to save the PDF to.
    * If `path` is a relative path, then it is resolved relative to current working directory.
    * If no path is provided, the PDF won't be saved to the disk.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * Give any CSS @page size declared in the page priority over what is declared in width and
    * height or format options.
    * @default false which will scale the content to fit the paper size.
    */
  var preferCSSPageSize: js.UndefOr[Boolean] = js.undefined
  /**
    * Print background graphics.
    * @default false
    */
  var printBackground: js.UndefOr[Boolean] = js.undefined
  /**
    * Scale of the webpage rendering.
    * @default 1
    */
  var scale: js.UndefOr[Double] = js.undefined
  /** Paper width. */
  var width: js.UndefOr[LayoutDimension] = js.undefined
}

object PDFOptions {
  @scala.inline
  def apply(
    displayHeaderFooter: js.UndefOr[Boolean] = js.undefined,
    footerTemplate: String = null,
    format: PDFFormat = null,
    headerTemplate: String = null,
    height: LayoutDimension = null,
    landscape: js.UndefOr[Boolean] = js.undefined,
    margin: Anon_Bottom = null,
    pageRanges: String = null,
    path: String = null,
    preferCSSPageSize: js.UndefOr[Boolean] = js.undefined,
    printBackground: js.UndefOr[Boolean] = js.undefined,
    scale: Int | Double = null,
    width: LayoutDimension = null
  ): PDFOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(displayHeaderFooter)) __obj.updateDynamic("displayHeaderFooter")(displayHeaderFooter)
    if (footerTemplate != null) __obj.updateDynamic("footerTemplate")(footerTemplate)
    if (format != null) __obj.updateDynamic("format")(format)
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(headerTemplate)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(landscape)) __obj.updateDynamic("landscape")(landscape)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (pageRanges != null) __obj.updateDynamic("pageRanges")(pageRanges)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(preferCSSPageSize)) __obj.updateDynamic("preferCSSPageSize")(preferCSSPageSize)
    if (!js.isUndefined(printBackground)) __obj.updateDynamic("printBackground")(printBackground)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFOptions]
  }
}


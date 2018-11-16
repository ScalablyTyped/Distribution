package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PDFOptions extends js.Object {
  /**
     * Display header and footer.
     * @default false
     */
  var displayHeaderFooter: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * HTML template for the print footer. Should be valid HTML markup with following classes used to inject printing values into them:
     * - `date` formatted print date
     * - `title` document title
     * - `url` document location
     * - `pageNumber` current page number
     * - `totalPages` total pages in the document
     */
  var footerTemplate: js.UndefOr[java.lang.String] = js.undefined
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
  var headerTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Paper height, accepts values labeled with units. */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /**
     * Paper orientation.
     * @default false
     */
  var landscape: js.UndefOr[scala.Boolean] = js.undefined
  /** Paper margins, defaults to none.  */
  var margin: js.UndefOr[puppeteerLib.Anon_Bottom] = js.undefined
  /**
     * Paper ranges to print, e.g., '1-5, 8, 11-13'.
     * @default '' which means print all pages.
     */
  var pageRanges: js.UndefOr[java.lang.String] = js.undefined
  /**
     * The file path to save the PDF to.
     * If `path` is a relative path, then it is resolved relative to current working directory.
     * If no path is provided, the PDF won't be saved to the disk.
     */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
     * Give any CSS @page size declared in the page priority over what is declared in width and
     * height or format options.
     * @default false which will scale the content to fit the paper size.
     */
  var preferCSSPageSize: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Print background graphics.
     * @default false
     */
  var printBackground: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Scale of the webpage rendering.
     * @default 1
     */
  var scale: js.UndefOr[scala.Double] = js.undefined
  /** Paper width, accepts values labeled with units. */
  var width: js.UndefOr[java.lang.String] = js.undefined
}


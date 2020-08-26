package typings.puppeteer.mod

import typings.puppeteer.anon.Bottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFOptions extends js.Object {
  /**
    * Display header and footer.
    * @default false
    */
  var displayHeaderFooter: js.UndefOr[Boolean] = js.native
  /**
    * HTML template for the print footer. Should be valid HTML markup with following classes used to inject printing values into them:
    * - `date` formatted print date
    * - `title` document title
    * - `url` document location
    * - `pageNumber` current page number
    * - `totalPages` total pages in the document
    */
  var footerTemplate: js.UndefOr[String] = js.native
  /**
    * Paper format. If set, takes priority over width or height options.
    * @default 'Letter'
    */
  var format: js.UndefOr[PDFFormat] = js.native
  /**
    * HTML template for the print header. Should be valid HTML markup with following classes used to inject printing values into them:
    * - `date` formatted print date
    * - `title` document title
    * - `url` document location
    * - `pageNumber` current page number
    * - `totalPages` total pages in the document
    */
  var headerTemplate: js.UndefOr[String] = js.native
  /** Paper height. */
  var height: js.UndefOr[LayoutDimension] = js.native
  /**
    * Paper orientation.
    * @default false
    */
  var landscape: js.UndefOr[Boolean] = js.native
  /** Paper margins, defaults to none. */
  var margin: js.UndefOr[Bottom] = js.native
  /**
    * Paper ranges to print, e.g., '1-5, 8, 11-13'.
    * @default '' which means print all pages.
    */
  var pageRanges: js.UndefOr[String] = js.native
  /**
    * The file path to save the PDF to.
    * If `path` is a relative path, then it is resolved relative to current working directory.
    * If no path is provided, the PDF won't be saved to the disk.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Give any CSS @page size declared in the page priority over what is declared in width and
    * height or format options.
    * @default false which will scale the content to fit the paper size.
    */
  var preferCSSPageSize: js.UndefOr[Boolean] = js.native
  /**
    * Print background graphics.
    * @default false
    */
  var printBackground: js.UndefOr[Boolean] = js.native
  /**
    * Scale of the webpage rendering.
    * @default 1
    */
  var scale: js.UndefOr[Double] = js.native
  /** Paper width. */
  var width: js.UndefOr[LayoutDimension] = js.native
}

object PDFOptions {
  @scala.inline
  def apply(): PDFOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFOptions]
  }
  @scala.inline
  implicit class PDFOptionsOps[Self <: PDFOptions] (val x: Self) extends AnyVal {
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
    def setDisplayHeaderFooter(value: Boolean): Self = this.set("displayHeaderFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayHeaderFooter: Self = this.set("displayHeaderFooter", js.undefined)
    @scala.inline
    def setFooterTemplate(value: String): Self = this.set("footerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterTemplate: Self = this.set("footerTemplate", js.undefined)
    @scala.inline
    def setFormat(value: PDFFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHeaderTemplate(value: String): Self = this.set("headerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTemplate: Self = this.set("headerTemplate", js.undefined)
    @scala.inline
    def setHeight(value: LayoutDimension): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLandscape(value: Boolean): Self = this.set("landscape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLandscape: Self = this.set("landscape", js.undefined)
    @scala.inline
    def setMargin(value: Bottom): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setPageRanges(value: String): Self = this.set("pageRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageRanges: Self = this.set("pageRanges", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPreferCSSPageSize(value: Boolean): Self = this.set("preferCSSPageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferCSSPageSize: Self = this.set("preferCSSPageSize", js.undefined)
    @scala.inline
    def setPrintBackground(value: Boolean): Self = this.set("printBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintBackground: Self = this.set("printBackground", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setWidth(value: LayoutDimension): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}


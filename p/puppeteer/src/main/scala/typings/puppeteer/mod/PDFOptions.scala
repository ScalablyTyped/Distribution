package typings.puppeteer.mod

import typings.puppeteer.anon.Bottom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFOptions extends StObject {
  
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
  var margin: js.UndefOr[Bottom] = js.undefined
  
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
  
  inline def apply(): PDFOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFOptions]
  }
  
  extension [Self <: PDFOptions](x: Self) {
    
    inline def setDisplayHeaderFooter(value: Boolean): Self = StObject.set(x, "displayHeaderFooter", value.asInstanceOf[js.Any])
    
    inline def setDisplayHeaderFooterUndefined: Self = StObject.set(x, "displayHeaderFooter", js.undefined)
    
    inline def setFooterTemplate(value: String): Self = StObject.set(x, "footerTemplate", value.asInstanceOf[js.Any])
    
    inline def setFooterTemplateUndefined: Self = StObject.set(x, "footerTemplate", js.undefined)
    
    inline def setFormat(value: PDFFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHeaderTemplate(value: String): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
    
    inline def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
    
    inline def setHeight(value: LayoutDimension): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLandscape(value: Boolean): Self = StObject.set(x, "landscape", value.asInstanceOf[js.Any])
    
    inline def setLandscapeUndefined: Self = StObject.set(x, "landscape", js.undefined)
    
    inline def setMargin(value: Bottom): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setPageRanges(value: String): Self = StObject.set(x, "pageRanges", value.asInstanceOf[js.Any])
    
    inline def setPageRangesUndefined: Self = StObject.set(x, "pageRanges", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPreferCSSPageSize(value: Boolean): Self = StObject.set(x, "preferCSSPageSize", value.asInstanceOf[js.Any])
    
    inline def setPreferCSSPageSizeUndefined: Self = StObject.set(x, "preferCSSPageSize", js.undefined)
    
    inline def setPrintBackground(value: Boolean): Self = StObject.set(x, "printBackground", value.asInstanceOf[js.Any])
    
    inline def setPrintBackgroundUndefined: Self = StObject.set(x, "printBackground", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setWidth(value: LayoutDimension): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

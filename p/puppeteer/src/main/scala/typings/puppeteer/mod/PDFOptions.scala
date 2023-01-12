package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFOptions extends StObject {
  
  /**
    * Whether to show the header and footer.
    * @defaultValue false
    */
  var displayHeaderFooter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * HTML template for the print footer. Has the same constraints and support
    * for special classes as {@link PDFOptions.headerTemplate}.
    */
  var footerTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * @remarks
    * If set, this takes priority over the `width` and `height` options.
    * @defaultValue `letter`.
    */
  var format: js.UndefOr[PaperFormat] = js.undefined
  
  /**
    * HTML template for the print header. Should be valid HTML with the following
    * classes used to inject values into them:
    *
    * - `date` formatted print date
    *
    * - `title` document title
    *
    * - `url` document location
    *
    * - `pageNumber` current page number
    *
    * - `totalPages` total pages in the document
    */
  var headerTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the height of paper. You can pass in a number or a string with a unit.
    */
  var height: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Whether to print in landscape orientation.
    * @defaultValue = false
    */
  var landscape: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set the PDF margins.
    * @defaultValue no margins are set.
    */
  var margin: js.UndefOr[PDFMargin] = js.undefined
  
  /**
    * Hides default white background and allows generating pdfs with transparency.
    * @defaultValue false
    */
  var omitBackground: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Paper ranges to print, e.g. `1-5, 8, 11-13`.
    * @defaultValue The empty string, which means all pages are printed.
    */
  var pageRanges: js.UndefOr[String] = js.undefined
  
  /**
    * The path to save the file to.
    *
    * @remarks
    *
    * If the path is relative, it's resolved relative to the current working directory.
    *
    * @defaultValue the empty string, which means the PDF will not be written to disk.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Give any CSS `@page` size declared in the page priority over what is
    * declared in the `width` or `height` or `format` option.
    * @defaultValue `false`, which will scale the content to fit the paper size.
    */
  var preferCSSPageSize: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set to `true` to print background graphics.
    * @defaultValue false
    */
  var printBackground: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Scales the rendering of the web page. Amount must be between `0.1` and `2`.
    * @defaultValue 1
    */
  var scale: js.UndefOr[Double] = js.undefined
  
  /**
    * Timeout in milliseconds
    * @defaultValue 30000
    */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the width of paper. You can pass in a number or a string with a unit.
    */
  var width: js.UndefOr[String | Double] = js.undefined
}
object PDFOptions {
  
  inline def apply(): PDFOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PDFOptions] (val x: Self) extends AnyVal {
    
    inline def setDisplayHeaderFooter(value: Boolean): Self = StObject.set(x, "displayHeaderFooter", value.asInstanceOf[js.Any])
    
    inline def setDisplayHeaderFooterUndefined: Self = StObject.set(x, "displayHeaderFooter", js.undefined)
    
    inline def setFooterTemplate(value: String): Self = StObject.set(x, "footerTemplate", value.asInstanceOf[js.Any])
    
    inline def setFooterTemplateUndefined: Self = StObject.set(x, "footerTemplate", js.undefined)
    
    inline def setFormat(value: PaperFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHeaderTemplate(value: String): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
    
    inline def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
    
    inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLandscape(value: Boolean): Self = StObject.set(x, "landscape", value.asInstanceOf[js.Any])
    
    inline def setLandscapeUndefined: Self = StObject.set(x, "landscape", js.undefined)
    
    inline def setMargin(value: PDFMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setOmitBackground(value: Boolean): Self = StObject.set(x, "omitBackground", value.asInstanceOf[js.Any])
    
    inline def setOmitBackgroundUndefined: Self = StObject.set(x, "omitBackground", js.undefined)
    
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
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

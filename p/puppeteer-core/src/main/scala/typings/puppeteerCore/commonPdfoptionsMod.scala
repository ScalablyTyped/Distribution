package typings.puppeteerCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonPdfoptionsMod {
  
  /* Inlined std.Record<puppeteer-core.puppeteer-core/lib/esm/puppeteer/common/PDFOptions.PaperFormat, puppeteer-core.puppeteer-core/lib/esm/puppeteer/common/PDFOptions.PaperFormatDimensions> */
  object paperFormats {
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/PDFOptions", "paperFormats")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/PDFOptions", "paperFormats.a0")
    @js.native
    def a0: PaperFormatDimensions = js.native
    @scala.inline
    def a0_=(x: PaperFormatDimensions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("a0")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/PDFOptions", "paperFormats.a1")
    @js.native
    def a1: PaperFormatDimensions = js.native
    @scala.inline
    def a1_=(x: PaperFormatDimensions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("a1")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/PDFOptions", "paperFormats.a2")
    @js.native
    def a2: PaperFormatDimensions = js.native
    @scala.inline
    def a2_=(x: PaperFormatDimensions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("a2")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/PDFOptions", "paperFormats.a3")
    @js.native
    def a3: PaperFormatDimensions = js.native
    @scala.inline
    def a3_=(x: PaperFormatDimensions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("a3")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/PDFOptions", "paperFormats.a4")
    @js.native
    def a4: PaperFormatDimensions = js.native
    @scala.inline
    def a4_=(x: PaperFormatDimensions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("a4")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/PDFOptions", "paperFormats.a5")
    @js.native
    def a5: PaperFormatDimensions = js.native
    @scala.inline
    def a5_=(x: PaperFormatDimensions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("a5")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/PDFOptions", "paperFormats.a6")
    @js.native
    def a6: PaperFormatDimensions = js.native
    @scala.inline
    def a6_=(x: PaperFormatDimensions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("a6")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/PDFOptions", "paperFormats.ledger")
    @js.native
    def ledger: PaperFormatDimensions = js.native
    @scala.inline
    def ledger_=(x: PaperFormatDimensions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ledger")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/PDFOptions", "paperFormats.legal")
    @js.native
    def legal: PaperFormatDimensions = js.native
    @scala.inline
    def legal_=(x: PaperFormatDimensions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legal")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/PDFOptions", "paperFormats.letter")
    @js.native
    def letter: PaperFormatDimensions = js.native
    @scala.inline
    def letter_=(x: PaperFormatDimensions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("letter")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/PDFOptions", "paperFormats.tabloid")
    @js.native
    def tabloid: PaperFormatDimensions = js.native
    @scala.inline
    def tabloid_=(x: PaperFormatDimensions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabloid")(x.asInstanceOf[js.Any])
  }
  
  trait PDFMargin extends StObject {
    
    var bottom: js.UndefOr[String | Double] = js.undefined
    
    var left: js.UndefOr[String | Double] = js.undefined
    
    var right: js.UndefOr[String | Double] = js.undefined
    
    var top: js.UndefOr[String | Double] = js.undefined
  }
  object PDFMargin {
    
    @scala.inline
    def apply(): PDFMargin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PDFMargin]
    }
    
    @scala.inline
    implicit class PDFMarginMutableBuilder[Self <: PDFMargin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: String | Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: String | Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: String | Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: String | Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
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
      * Sets the width of paper. You can pass in a number or a string with a unit.
      */
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object PDFOptions {
    
    @scala.inline
    def apply(): PDFOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PDFOptions]
    }
    
    @scala.inline
    implicit class PDFOptionsMutableBuilder[Self <: PDFOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayHeaderFooter(value: Boolean): Self = StObject.set(x, "displayHeaderFooter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayHeaderFooterUndefined: Self = StObject.set(x, "displayHeaderFooter", js.undefined)
      
      @scala.inline
      def setFooterTemplate(value: String): Self = StObject.set(x, "footerTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterTemplateUndefined: Self = StObject.set(x, "footerTemplate", js.undefined)
      
      @scala.inline
      def setFormat(value: PaperFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setHeaderTemplate(value: String): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
      
      @scala.inline
      def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLandscape(value: Boolean): Self = StObject.set(x, "landscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLandscapeUndefined: Self = StObject.set(x, "landscape", js.undefined)
      
      @scala.inline
      def setMargin(value: PDFMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setPageRanges(value: String): Self = StObject.set(x, "pageRanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageRangesUndefined: Self = StObject.set(x, "pageRanges", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPreferCSSPageSize(value: Boolean): Self = StObject.set(x, "preferCSSPageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferCSSPageSizeUndefined: Self = StObject.set(x, "preferCSSPageSize", js.undefined)
      
      @scala.inline
      def setPrintBackground(value: Boolean): Self = StObject.set(x, "printBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintBackgroundUndefined: Self = StObject.set(x, "printBackground", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.puppeteerCore.puppeteerCoreStrings.letter
    - typings.puppeteerCore.puppeteerCoreStrings.legal
    - typings.puppeteerCore.puppeteerCoreStrings.tabloid
    - typings.puppeteerCore.puppeteerCoreStrings.ledger
    - typings.puppeteerCore.puppeteerCoreStrings.a0
    - typings.puppeteerCore.puppeteerCoreStrings.a1
    - typings.puppeteerCore.puppeteerCoreStrings.a2
    - typings.puppeteerCore.puppeteerCoreStrings.a3
    - typings.puppeteerCore.puppeteerCoreStrings.a4
    - typings.puppeteerCore.puppeteerCoreStrings.a5
    - typings.puppeteerCore.puppeteerCoreStrings.a6
  */
  trait PaperFormat extends StObject
  object PaperFormat {
    
    @scala.inline
    def a0: typings.puppeteerCore.puppeteerCoreStrings.a0 = "a0".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.a0]
    
    @scala.inline
    def a1: typings.puppeteerCore.puppeteerCoreStrings.a1 = "a1".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.a1]
    
    @scala.inline
    def a2: typings.puppeteerCore.puppeteerCoreStrings.a2 = "a2".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.a2]
    
    @scala.inline
    def a3: typings.puppeteerCore.puppeteerCoreStrings.a3 = "a3".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.a3]
    
    @scala.inline
    def a4: typings.puppeteerCore.puppeteerCoreStrings.a4 = "a4".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.a4]
    
    @scala.inline
    def a5: typings.puppeteerCore.puppeteerCoreStrings.a5 = "a5".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.a5]
    
    @scala.inline
    def a6: typings.puppeteerCore.puppeteerCoreStrings.a6 = "a6".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.a6]
    
    @scala.inline
    def ledger: typings.puppeteerCore.puppeteerCoreStrings.ledger = "ledger".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.ledger]
    
    @scala.inline
    def legal: typings.puppeteerCore.puppeteerCoreStrings.legal = "legal".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.legal]
    
    @scala.inline
    def letter: typings.puppeteerCore.puppeteerCoreStrings.letter = "letter".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.letter]
    
    @scala.inline
    def tabloid: typings.puppeteerCore.puppeteerCoreStrings.tabloid = "tabloid".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.tabloid]
  }
  
  trait PaperFormatDimensions extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object PaperFormatDimensions {
    
    @scala.inline
    def apply(height: Double, width: Double): PaperFormatDimensions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaperFormatDimensions]
    }
    
    @scala.inline
    implicit class PaperFormatDimensionsMutableBuilder[Self <: PaperFormatDimensions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}

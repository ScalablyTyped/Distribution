package typings.reactPdf

import typings.pdfjsDist.mod.PDFJSStatic
import typings.reactPdf.documentMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entryWebpackMod {
  
  @JSImport("react-pdf/dist/esm/entry.webpack", "Document")
  @js.native
  class Document () extends default
  
  @JSImport("react-pdf/dist/esm/entry.webpack", "Outline")
  @js.native
  class Outline ()
    extends typings.reactPdf.outlineMod.default
  
  @JSImport("react-pdf/dist/esm/entry.webpack", "Page")
  @js.native
  class Page ()
    extends typings.reactPdf.pageMod.default
  
  object pdfjs {
    
    @JSImport("react-pdf/dist/esm/entry.webpack", "pdfjs.CMapCompressionType")
    @js.native
    object CMapCompressionType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.pdfjsDist.mod.CMapCompressionType with Double] = js.native
      
      /* 1 */ val BINARY: typings.pdfjsDist.mod.CMapCompressionType.BINARY with Double = js.native
      
      /* 0 */ val NONE: typings.pdfjsDist.mod.CMapCompressionType.NONE with Double = js.native
      
      /* 2 */ val STREAM: typings.pdfjsDist.mod.CMapCompressionType.STREAM with Double = js.native
    }
    
    @JSImport("react-pdf/dist/esm/entry.webpack", "pdfjs.PDFJS")
    @js.native
    val PDFJS: PDFJSStatic = js.native
    
    @JSImport("react-pdf/dist/esm/entry.webpack", "pdfjs.VerbosityLevel")
    @js.native
    object VerbosityLevel extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.pdfjsDist.mod.VerbosityLevel with Double] = js.native
      
      /* 0 */ val ERRORS: typings.pdfjsDist.mod.VerbosityLevel.ERRORS with Double = js.native
      
      /* 5 */ val INFOS: typings.pdfjsDist.mod.VerbosityLevel.INFOS with Double = js.native
      
      /* 1 */ val WARNINGS: typings.pdfjsDist.mod.VerbosityLevel.WARNINGS with Double = js.native
    }
  }
}

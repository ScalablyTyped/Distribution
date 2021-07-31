package typings.reactPdf

import typings.pdfjsDist.mod.PDFJSStatic
import typings.reactPdf.documentMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-pdf", "Document")
  @js.native
  class Document () extends default
  
  @JSImport("react-pdf", "Outline")
  @js.native
  class Outline ()
    extends typings.reactPdf.outlineMod.default
  
  @JSImport("react-pdf", "Page")
  @js.native
  class Page ()
    extends typings.reactPdf.pageMod.default
  
  object pdfjs {
    
    @JSImport("react-pdf", "pdfjs.CMapCompressionType")
    @js.native
    object CMapCompressionType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.pdfjsDist.mod.CMapCompressionType & Double] = js.native
      
      /* 1 */ val BINARY: typings.pdfjsDist.mod.CMapCompressionType.BINARY & Double = js.native
      
      /* 0 */ val NONE: typings.pdfjsDist.mod.CMapCompressionType.NONE & Double = js.native
      
      /* 2 */ val STREAM: typings.pdfjsDist.mod.CMapCompressionType.STREAM & Double = js.native
    }
    
    @JSImport("react-pdf", "pdfjs.PDFJS")
    @js.native
    val PDFJS: PDFJSStatic = js.native
    
    @JSImport("react-pdf", "pdfjs.VerbosityLevel")
    @js.native
    object VerbosityLevel extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.pdfjsDist.mod.VerbosityLevel & Double] = js.native
      
      /* 0 */ val ERRORS: typings.pdfjsDist.mod.VerbosityLevel.ERRORS & Double = js.native
      
      /* 5 */ val INFOS: typings.pdfjsDist.mod.VerbosityLevel.INFOS & Double = js.native
      
      /* 1 */ val WARNINGS: typings.pdfjsDist.mod.VerbosityLevel.WARNINGS & Double = js.native
    }
  }
}

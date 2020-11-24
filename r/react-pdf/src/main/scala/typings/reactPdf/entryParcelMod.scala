package typings.reactPdf

import typings.pdfjsDist.mod.PDFJSStatic
import typings.react.mod.Component
import typings.reactPdf.documentMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-pdf/dist/esm/entry.parcel", JSImport.Namespace)
@js.native
object entryParcelMod extends js.Object {
  
  @js.native
  class Document ()
    extends Component[Props, js.Object, js.Any]
  
  @js.native
  class Outline ()
    extends Component[typings.reactPdf.outlineMod.Props, js.Object, js.Any]
  
  @js.native
  class Page ()
    extends Component[typings.reactPdf.pageMod.Props, js.Object, js.Any]
  
  @js.native
  object pdfjs extends js.Object {
    
    val PDFJS: PDFJSStatic = js.native
    
    @js.native
    object CMapCompressionType extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.pdfjsDist.mod.CMapCompressionType with Double] = js.native
      
      /* 1 */ val BINARY: typings.pdfjsDist.mod.CMapCompressionType.BINARY with Double = js.native
      
      /* 0 */ val NONE: typings.pdfjsDist.mod.CMapCompressionType.NONE with Double = js.native
      
      /* 2 */ val STREAM: typings.pdfjsDist.mod.CMapCompressionType.STREAM with Double = js.native
    }
    
    @js.native
    object VerbosityLevel extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.pdfjsDist.mod.VerbosityLevel with Double] = js.native
      
      /* 0 */ val ERRORS: typings.pdfjsDist.mod.VerbosityLevel.ERRORS with Double = js.native
      
      /* 5 */ val INFOS: typings.pdfjsDist.mod.VerbosityLevel.INFOS with Double = js.native
      
      /* 1 */ val WARNINGS: typings.pdfjsDist.mod.VerbosityLevel.WARNINGS with Double = js.native
    }
  }
}

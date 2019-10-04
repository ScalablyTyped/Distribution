package typings.reactDashPdf.distEntryDotParcelMod

import typings.pdfjsDashDist.pdfjsDashDistMod.PDFJSStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-pdf/dist/entry.parcel", "pdfjs")
@js.native
object pdfjsNs extends js.Object {
  val PDFJS: PDFJSStatic = js.native
  @js.native
  object CMapCompressionType extends js.Object {
    /* 1 */ val BINARY: typings.pdfjsDashDist.pdfjsDashDistMod.CMapCompressionType.BINARY with Double = js.native
    /* 0 */ val NONE: typings.pdfjsDashDist.pdfjsDashDistMod.CMapCompressionType.NONE with Double = js.native
    /* 2 */ val STREAM: typings.pdfjsDashDist.pdfjsDashDistMod.CMapCompressionType.STREAM with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.pdfjsDashDist.pdfjsDashDistMod.CMapCompressionType with Double] = js.native
  }
  
  @js.native
  object VerbosityLevel extends js.Object {
    /* 0 */ val ERRORS: typings.pdfjsDashDist.pdfjsDashDistMod.VerbosityLevel.ERRORS with Double = js.native
    /* 5 */ val INFOS: typings.pdfjsDashDist.pdfjsDashDistMod.VerbosityLevel.INFOS with Double = js.native
    /* 1 */ val WARNINGS: typings.pdfjsDashDist.pdfjsDashDistMod.VerbosityLevel.WARNINGS with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.pdfjsDashDist.pdfjsDashDistMod.VerbosityLevel with Double] = js.native
  }
  
}


package typings.rollupDashPluginDashTypescript2

import typings.rollupDashPluginDashTypescript2.distDiagnosticsDashFormatDashHostMod.FormatHost
import typings.typescript.typescriptMod.FormatDiagnosticsHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rollup-plugin-typescript2/dist/diagnostics-format-host", JSImport.Namespace)
@js.native
object distDiagnosticsDashFormatDashHostMod extends js.Object {
  @js.native
  class FormatHost () extends FormatDiagnosticsHost {
    /* CompleteClass */
    override def getCanonicalFileName(fileName: String): String = js.native
    /* CompleteClass */
    override def getCurrentDirectory(): String = js.native
    /* CompleteClass */
    override def getNewLine(): String = js.native
  }
  
  val formatHost: FormatHost = js.native
}


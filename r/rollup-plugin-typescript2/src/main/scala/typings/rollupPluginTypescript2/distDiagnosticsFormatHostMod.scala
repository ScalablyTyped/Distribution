package typings.rollupPluginTypescript2

import typings.typescript.mod.FormatDiagnosticsHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDiagnosticsFormatHostMod {
  
  @JSImport("rollup-plugin-typescript2/dist/diagnostics-format-host", "FormatHost")
  @js.native
  open class FormatHost_ ()
    extends StObject
       with FormatDiagnosticsHost {
    
    /* CompleteClass */
    override def getCanonicalFileName(fileName: String): String = js.native
    @JSName("getCanonicalFileName")
    var getCanonicalFileName_Original: js.Function1[/* path */ String, String] = js.native
    
    /* CompleteClass */
    override def getCurrentDirectory(): String = js.native
    
    /* CompleteClass */
    override def getNewLine(): String = js.native
  }
  
  @JSImport("rollup-plugin-typescript2/dist/diagnostics-format-host", "formatHost")
  @js.native
  val formatHost: FormatHost_ = js.native
}

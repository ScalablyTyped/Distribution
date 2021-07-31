package typings.rollupPluginTypescript2

import typings.rollupPluginTypescript2.contextMod.IContext
import typings.rollupPluginTypescript2.tscacheMod.IDiagnostics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object printDiagnosticsMod {
  
  @JSImport("rollup-plugin-typescript2/dist/print-diagnostics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def printDiagnostics(context: IContext, diagnostics: js.Array[IDiagnostics], pretty: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("printDiagnostics")(context.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], pretty.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

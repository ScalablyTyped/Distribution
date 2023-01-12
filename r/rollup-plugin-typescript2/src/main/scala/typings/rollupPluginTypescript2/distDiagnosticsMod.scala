package typings.rollupPluginTypescript2

import typings.rollupPluginTypescript2.distContextMod.RollupContext
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.DiagnosticCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDiagnosticsMod {
  
  @JSImport("rollup-plugin-typescript2/dist/diagnostics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertDiagnostic(`type`: String, data: js.Array[Diagnostic]): js.Array[IDiagnostics] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertDiagnostic")(`type`.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Array[IDiagnostics]]
  
  inline def printDiagnostics(context: RollupContext, diagnostics: js.Array[IDiagnostics]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("printDiagnostics")(context.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def printDiagnostics(context: RollupContext, diagnostics: js.Array[IDiagnostics], pretty: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("printDiagnostics")(context.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], pretty.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait IDiagnostics extends StObject {
    
    var category: DiagnosticCategory
    
    var code: Double
    
    var fileLine: js.UndefOr[String] = js.undefined
    
    var flatMessage: String
    
    var formatted: String
    
    var `type`: String
  }
  object IDiagnostics {
    
    inline def apply(category: DiagnosticCategory, code: Double, flatMessage: String, formatted: String, `type`: String): IDiagnostics = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], flatMessage = flatMessage.asInstanceOf[js.Any], formatted = formatted.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDiagnostics]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDiagnostics] (val x: Self) extends AnyVal {
      
      inline def setCategory(value: DiagnosticCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setFileLine(value: String): Self = StObject.set(x, "fileLine", value.asInstanceOf[js.Any])
      
      inline def setFileLineUndefined: Self = StObject.set(x, "fileLine", js.undefined)
      
      inline def setFlatMessage(value: String): Self = StObject.set(x, "flatMessage", value.asInstanceOf[js.Any])
      
      inline def setFormatted(value: String): Self = StObject.set(x, "formatted", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

package typings.rollupPluginTypescript2

import typings.rollupPluginTypescript2.contextMod.IContext
import typings.rollupPluginTypescript2.rollupPluginTypescript2Booleans.`false`
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.DiagnosticCategory
import typings.typescript.mod.EmitOutput
import typings.typescript.mod.IScriptSnapshot
import typings.typescript.mod.LanguageServiceHost
import typings.typescript.mod.OutputFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tscacheMod {
  
  @JSImport("rollup-plugin-typescript2/dist/tscache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rollup-plugin-typescript2/dist/tscache", "TsCache")
  @js.native
  class TsCache protected () extends StObject {
    def this(
      noCache: Boolean,
      hashIgnoreUnknown: Boolean,
      host: LanguageServiceHost,
      cacheRoot: String,
      options: CompilerOptions,
      rollupConfig: js.Any,
      rootFilenames: js.Array[String],
      context: IContext
    ) = this()
    
    /* private */ var ambientTypes: js.Any = js.native
    
    /* private */ var ambientTypesDirty: js.Any = js.native
    
    /* private */ var cacheDir: js.Any = js.native
    
    /* private */ var cachePrefix: js.Any = js.native
    
    /* private */ var cacheRoot: js.Any = js.native
    
    /* private */ var cacheVersion: js.Any = js.native
    
    /* private */ var checkAmbientTypes: js.Any = js.native
    
    def clean(): Unit = js.native
    
    /* private */ var codeCache: js.Any = js.native
    
    /* private */ var context: js.Any = js.native
    
    /* private */ var dependencyTree: js.Any = js.native
    
    def done(): Unit = js.native
    
    def getCompiled(id: String, snapshot: IScriptSnapshot, transform: js.Function0[js.UndefOr[ICode]]): js.UndefOr[ICode] = js.native
    
    /* private */ var getDiagnostics: js.Any = js.native
    
    def getSemanticDiagnostics(id: String, snapshot: IScriptSnapshot, check: js.Function0[js.Array[Diagnostic]]): js.Array[IDiagnostics] = js.native
    
    def getSyntacticDiagnostics(id: String, snapshot: IScriptSnapshot, check: js.Function0[js.Array[Diagnostic]]): js.Array[IDiagnostics] = js.native
    
    /* private */ var hashOptions: js.Any = js.native
    
    /* private */ var host: js.Any = js.native
    
    /* private */ var init: js.Any = js.native
    
    /* private */ var isDirty: js.Any = js.native
    
    /* private */ var makeName: js.Any = js.native
    
    /* private */ var markAsDirty: js.Any = js.native
    
    /* private */ var noCache: js.Any = js.native
    
    /* private */ var options: js.Any = js.native
    
    /* private */ var rollupConfig: js.Any = js.native
    
    /* private */ var semanticDiagnosticsCache: js.Any = js.native
    
    def setDependency(importee: String, importer: String): Unit = js.native
    
    /* private */ var syntacticDiagnosticsCache: js.Any = js.native
    
    /* private */ var typesCache: js.Any = js.native
    
    @JSName("walkTree")
    def walkTree_false(cb: js.Function1[/* id */ String, Unit | `false`]): Unit = js.native
  }
  
  inline def convertDiagnostic(`type`: String, data: js.Array[Diagnostic]): js.Array[IDiagnostics] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertDiagnostic")(`type`.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Array[IDiagnostics]]
  
  inline def convertEmitOutput(output: EmitOutput): ICode = ^.asInstanceOf[js.Dynamic].applyDynamic("convertEmitOutput")(output.asInstanceOf[js.Any]).asInstanceOf[ICode]
  inline def convertEmitOutput(output: EmitOutput, references: js.Array[String]): ICode = (^.asInstanceOf[js.Dynamic].applyDynamic("convertEmitOutput")(output.asInstanceOf[js.Any], references.asInstanceOf[js.Any])).asInstanceOf[ICode]
  
  inline def getAllReferences(importer: String, snapshot: Unit, options: CompilerOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllReferences")(importer.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def getAllReferences(importer: String, snapshot: IScriptSnapshot, options: CompilerOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllReferences")(importer.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  trait ICode extends StObject {
    
    var code: String
    
    var dts: js.UndefOr[OutputFile] = js.undefined
    
    var dtsmap: js.UndefOr[OutputFile] = js.undefined
    
    var map: js.UndefOr[String] = js.undefined
    
    var references: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ICode {
    
    inline def apply(code: String): ICode = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICode]
    }
    
    extension [Self <: ICode](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDts(value: OutputFile): Self = StObject.set(x, "dts", value.asInstanceOf[js.Any])
      
      inline def setDtsUndefined: Self = StObject.set(x, "dts", js.undefined)
      
      inline def setDtsmap(value: OutputFile): Self = StObject.set(x, "dtsmap", value.asInstanceOf[js.Any])
      
      inline def setDtsmapUndefined: Self = StObject.set(x, "dtsmap", js.undefined)
      
      inline def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setReferences(value: js.Array[String]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      inline def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
      
      inline def setReferencesVarargs(value: String*): Self = StObject.set(x, "references", js.Array(value :_*))
    }
  }
  
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
    
    extension [Self <: IDiagnostics](x: Self) {
      
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

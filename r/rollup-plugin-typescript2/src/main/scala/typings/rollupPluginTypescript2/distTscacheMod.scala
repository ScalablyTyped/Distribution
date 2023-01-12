package typings.rollupPluginTypescript2

import typings.rollupPluginTypescript2.distContextMod.RollupContext
import typings.rollupPluginTypescript2.distDiagnosticsMod.IDiagnostics
import typings.rollupPluginTypescript2.rollupPluginTypescript2Booleans.`false`
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.EmitOutput
import typings.typescript.mod.IScriptSnapshot
import typings.typescript.mod.LanguageServiceHost
import typings.typescript.mod.OutputFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTscacheMod {
  
  @JSImport("rollup-plugin-typescript2/dist/tscache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rollup-plugin-typescript2/dist/tscache", "TsCache")
  @js.native
  open class TsCache protected () extends StObject {
    def this(
      noCache: Boolean,
      hashIgnoreUnknown: Boolean,
      host: LanguageServiceHost,
      cacheRoot: String,
      options: CompilerOptions,
      rollupConfig: Any,
      rootFilenames: js.Array[String],
      context: RollupContext
    ) = this()
    
    /* private */ var ambientTypes: Any = js.native
    
    /* private */ var ambientTypesDirty: Any = js.native
    
    /* private */ var cacheDir: Any = js.native
    
    /* private */ var cachePrefix: Any = js.native
    
    /* private */ var cacheRoot: Any = js.native
    
    /* private */ var cacheVersion: Any = js.native
    
    /* private */ var checkAmbientTypes: Any = js.native
    
    /* private */ var clean: Any = js.native
    
    /* private */ var codeCache: Any = js.native
    
    /* private */ var context: Any = js.native
    
    /** @returns an FS-safe hash string for use as a path to the cached content */
    /* private */ var createHash: Any = js.native
    
    /* private */ var dependencyTree: Any = js.native
    
    def done(): Unit = js.native
    
    /* private */ var getCached: Any = js.native
    
    def getCompiled(id: String, snapshot: IScriptSnapshot, transform: js.Function0[js.UndefOr[ICode]]): js.UndefOr[ICode] = js.native
    
    /* private */ var getDiagnostics: Any = js.native
    
    def getSemanticDiagnostics(id: String, snapshot: IScriptSnapshot, check: js.Function0[js.Array[Diagnostic]]): js.Array[IDiagnostics] = js.native
    
    def getSyntacticDiagnostics(id: String, snapshot: IScriptSnapshot, check: js.Function0[js.Array[Diagnostic]]): js.Array[IDiagnostics] = js.native
    
    /* private */ var hashOptions: Any = js.native
    
    /* private */ var host: Any = js.native
    
    /* private */ var init: Any = js.native
    
    /** @returns true if node, any of its imports, or any ambient types changed */
    /* private */ var isDirty: Any = js.native
    
    /* private */ var markAsDirty: Any = js.native
    
    /* private */ var noCache: Any = js.native
    
    /* private */ var options: Any = js.native
    
    /* private */ var rollupConfig: Any = js.native
    
    /* private */ var semanticDiagnosticsCache: Any = js.native
    
    def setDependency(importee: String, importer: String): Unit = js.native
    
    /* private */ var syntacticDiagnosticsCache: Any = js.native
    
    /* private */ var typesCache: Any = js.native
    
    @JSName("walkTree")
    def walkTree_false(cb: js.Function1[/* id */ String, Unit | `false`]): Unit = js.native
  }
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICode] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDts(value: OutputFile): Self = StObject.set(x, "dts", value.asInstanceOf[js.Any])
      
      inline def setDtsUndefined: Self = StObject.set(x, "dts", js.undefined)
      
      inline def setDtsmap(value: OutputFile): Self = StObject.set(x, "dtsmap", value.asInstanceOf[js.Any])
      
      inline def setDtsmapUndefined: Self = StObject.set(x, "dtsmap", js.undefined)
      
      inline def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setReferences(value: js.Array[String]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      inline def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
      
      inline def setReferencesVarargs(value: String*): Self = StObject.set(x, "references", js.Array(value*))
    }
  }
}

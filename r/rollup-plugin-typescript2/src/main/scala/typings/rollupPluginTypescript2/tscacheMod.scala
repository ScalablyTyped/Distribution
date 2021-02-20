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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tscacheMod {
  
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
    
    var ambientTypes: js.Any = js.native
    
    var ambientTypesDirty: js.Any = js.native
    
    var cacheDir: js.Any = js.native
    
    var cachePrefix: js.Any = js.native
    
    var cacheRoot: js.Any = js.native
    
    var cacheVersion: js.Any = js.native
    
    var checkAmbientTypes: js.Any = js.native
    
    def clean(): Unit = js.native
    
    var codeCache: js.Any = js.native
    
    var context: js.Any = js.native
    
    var dependencyTree: js.Any = js.native
    
    def done(): Unit = js.native
    
    def getCompiled(id: String, snapshot: IScriptSnapshot, transform: js.Function0[js.UndefOr[ICode]]): js.UndefOr[ICode] = js.native
    
    var getDiagnostics: js.Any = js.native
    
    def getSemanticDiagnostics(id: String, snapshot: IScriptSnapshot, check: js.Function0[js.Array[Diagnostic]]): js.Array[IDiagnostics] = js.native
    
    def getSyntacticDiagnostics(id: String, snapshot: IScriptSnapshot, check: js.Function0[js.Array[Diagnostic]]): js.Array[IDiagnostics] = js.native
    
    var hashOptions: js.Any = js.native
    
    var host: js.Any = js.native
    
    var init: js.Any = js.native
    
    var isDirty: js.Any = js.native
    
    var makeName: js.Any = js.native
    
    var markAsDirty: js.Any = js.native
    
    var noCache: js.Any = js.native
    
    var options: js.Any = js.native
    
    var rollupConfig: js.Any = js.native
    
    var semanticDiagnosticsCache: js.Any = js.native
    
    def setDependency(importee: String, importer: String): Unit = js.native
    
    var syntacticDiagnosticsCache: js.Any = js.native
    
    var typesCache: js.Any = js.native
    
    @JSName("walkTree")
    def walkTree_false(cb: js.Function1[/* id */ String, Unit | `false`]): Unit = js.native
  }
  
  @JSImport("rollup-plugin-typescript2/dist/tscache", "convertDiagnostic")
  @js.native
  def convertDiagnostic(`type`: String, data: js.Array[Diagnostic]): js.Array[IDiagnostics] = js.native
  
  @JSImport("rollup-plugin-typescript2/dist/tscache", "convertEmitOutput")
  @js.native
  def convertEmitOutput(output: EmitOutput): ICode = js.native
  @JSImport("rollup-plugin-typescript2/dist/tscache", "convertEmitOutput")
  @js.native
  def convertEmitOutput(output: EmitOutput, references: js.Array[String]): ICode = js.native
  
  @JSImport("rollup-plugin-typescript2/dist/tscache", "getAllReferences")
  @js.native
  def getAllReferences(importer: String, snapshot: js.UndefOr[scala.Nothing], options: CompilerOptions): js.Array[String] = js.native
  @JSImport("rollup-plugin-typescript2/dist/tscache", "getAllReferences")
  @js.native
  def getAllReferences(importer: String, snapshot: IScriptSnapshot, options: CompilerOptions): js.Array[String] = js.native
  
  @js.native
  trait ICode extends StObject {
    
    var code: String = js.native
    
    var dts: js.UndefOr[OutputFile] = js.native
    
    var dtsmap: js.UndefOr[OutputFile] = js.native
    
    var map: js.UndefOr[String] = js.native
    
    var references: js.UndefOr[js.Array[String]] = js.native
  }
  object ICode {
    
    @scala.inline
    def apply(code: String): ICode = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICode]
    }
    
    @scala.inline
    implicit class ICodeMutableBuilder[Self <: ICode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDts(value: OutputFile): Self = StObject.set(x, "dts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDtsUndefined: Self = StObject.set(x, "dts", js.undefined)
      
      @scala.inline
      def setDtsmap(value: OutputFile): Self = StObject.set(x, "dtsmap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDtsmapUndefined: Self = StObject.set(x, "dtsmap", js.undefined)
      
      @scala.inline
      def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setReferences(value: js.Array[String]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
      
      @scala.inline
      def setReferencesVarargs(value: String*): Self = StObject.set(x, "references", js.Array(value :_*))
    }
  }
  
  @js.native
  trait IDiagnostics extends StObject {
    
    var category: DiagnosticCategory = js.native
    
    var code: Double = js.native
    
    var fileLine: js.UndefOr[String] = js.native
    
    var flatMessage: String = js.native
    
    var formatted: String = js.native
    
    var `type`: String = js.native
  }
  object IDiagnostics {
    
    @scala.inline
    def apply(category: DiagnosticCategory, code: Double, flatMessage: String, formatted: String, `type`: String): IDiagnostics = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], flatMessage = flatMessage.asInstanceOf[js.Any], formatted = formatted.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDiagnostics]
    }
    
    @scala.inline
    implicit class IDiagnosticsMutableBuilder[Self <: IDiagnostics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategory(value: DiagnosticCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileLine(value: String): Self = StObject.set(x, "fileLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileLineUndefined: Self = StObject.set(x, "fileLine", js.undefined)
      
      @scala.inline
      def setFlatMessage(value: String): Self = StObject.set(x, "flatMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatted(value: String): Self = StObject.set(x, "formatted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

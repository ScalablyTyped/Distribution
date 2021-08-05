package typings.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleJSON
  extends StObject
     with TransformModuleJSON {
  
  var alwaysRemovedCode: js.Array[js.Tuple2[Double, Double]]
  
  @JSName("ast")
  var ast_ModuleJSON: AcornNode
  
  var dependencies: js.Array[String]
  
  var id: String
  
  var transformFiles: js.UndefOr[js.Array[EmittedFile]] = js.undefined
}
object ModuleJSON {
  
  inline def apply(
    alwaysRemovedCode: js.Array[js.Tuple2[Double, Double]],
    ast: AcornNode,
    code: String,
    customTransformCache: Boolean,
    dependencies: js.Array[String],
    id: String,
    originalCode: String,
    sourcemapChain: js.Array[DecodedSourceMapOrMissing],
    transformDependencies: js.Array[String]
  ): ModuleJSON = {
    val __obj = js.Dynamic.literal(alwaysRemovedCode = alwaysRemovedCode.asInstanceOf[js.Any], ast = ast.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], customTransformCache = customTransformCache.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], originalCode = originalCode.asInstanceOf[js.Any], sourcemapChain = sourcemapChain.asInstanceOf[js.Any], transformDependencies = transformDependencies.asInstanceOf[js.Any], originalSourcemap = null)
    __obj.asInstanceOf[ModuleJSON]
  }
  
  extension [Self <: ModuleJSON](x: Self) {
    
    inline def setAlwaysRemovedCode(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "alwaysRemovedCode", value.asInstanceOf[js.Any])
    
    inline def setAlwaysRemovedCodeVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "alwaysRemovedCode", js.Array(value :_*))
    
    inline def setAst(value: AcornNode): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTransformFiles(value: js.Array[EmittedFile]): Self = StObject.set(x, "transformFiles", value.asInstanceOf[js.Any])
    
    inline def setTransformFilesUndefined: Self = StObject.set(x, "transformFiles", js.undefined)
    
    inline def setTransformFilesVarargs(value: EmittedFile*): Self = StObject.set(x, "transformFiles", js.Array(value :_*))
  }
}

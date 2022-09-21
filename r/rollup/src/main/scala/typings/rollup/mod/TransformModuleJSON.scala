package typings.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformModuleJSON extends StObject {
  
  var ast: js.UndefOr[AcornNode] = js.undefined
  
  var code: String
  
  // note if plugins use new this.cache to opt-out auto transform cache
  var customTransformCache: Boolean
  
  var originalCode: String
  
  var originalSourcemap: ExistingDecodedSourceMap | Null
  
  var sourcemapChain: js.Array[DecodedSourceMapOrMissing]
  
  var transformDependencies: js.Array[String]
}
object TransformModuleJSON {
  
  inline def apply(
    code: String,
    customTransformCache: Boolean,
    originalCode: String,
    sourcemapChain: js.Array[DecodedSourceMapOrMissing],
    transformDependencies: js.Array[String]
  ): TransformModuleJSON = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], customTransformCache = customTransformCache.asInstanceOf[js.Any], originalCode = originalCode.asInstanceOf[js.Any], sourcemapChain = sourcemapChain.asInstanceOf[js.Any], transformDependencies = transformDependencies.asInstanceOf[js.Any], originalSourcemap = null)
    __obj.asInstanceOf[TransformModuleJSON]
  }
  
  extension [Self <: TransformModuleJSON](x: Self) {
    
    inline def setAst(value: AcornNode): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    inline def setAstUndefined: Self = StObject.set(x, "ast", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCustomTransformCache(value: Boolean): Self = StObject.set(x, "customTransformCache", value.asInstanceOf[js.Any])
    
    inline def setOriginalCode(value: String): Self = StObject.set(x, "originalCode", value.asInstanceOf[js.Any])
    
    inline def setOriginalSourcemap(value: ExistingDecodedSourceMap): Self = StObject.set(x, "originalSourcemap", value.asInstanceOf[js.Any])
    
    inline def setOriginalSourcemapNull: Self = StObject.set(x, "originalSourcemap", null)
    
    inline def setSourcemapChain(value: js.Array[DecodedSourceMapOrMissing]): Self = StObject.set(x, "sourcemapChain", value.asInstanceOf[js.Any])
    
    inline def setSourcemapChainVarargs(value: DecodedSourceMapOrMissing*): Self = StObject.set(x, "sourcemapChain", js.Array(value*))
    
    inline def setTransformDependencies(value: js.Array[String]): Self = StObject.set(x, "transformDependencies", value.asInstanceOf[js.Any])
    
    inline def setTransformDependenciesVarargs(value: String*): Self = StObject.set(x, "transformDependencies", js.Array(value*))
  }
}

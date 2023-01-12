package typings.rollup.anon

import typings.rollup.mod.AcornNode
import typings.rollup.mod.CustomPluginOptions
import typings.rollup.mod.ResolvedIdMap
import typings.rollup.rollupStrings.`no-treeshake`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ast extends StObject {
  
  var ast: AcornNode
  
  var code: String
  
  var id: String
  
  var meta: CustomPluginOptions
  
  var moduleSideEffects: Boolean | `no-treeshake`
  
  var resolvedSources: ResolvedIdMap
  
  var syntheticNamedExports: Boolean | String
}
object Ast {
  
  inline def apply(
    ast: AcornNode,
    code: String,
    id: String,
    meta: CustomPluginOptions,
    moduleSideEffects: Boolean | `no-treeshake`,
    resolvedSources: ResolvedIdMap,
    syntheticNamedExports: Boolean | String
  ): Ast = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], moduleSideEffects = moduleSideEffects.asInstanceOf[js.Any], resolvedSources = resolvedSources.asInstanceOf[js.Any], syntheticNamedExports = syntheticNamedExports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ast]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ast] (val x: Self) extends AnyVal {
    
    inline def setAst(value: AcornNode): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: CustomPluginOptions): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setModuleSideEffects(value: Boolean | `no-treeshake`): Self = StObject.set(x, "moduleSideEffects", value.asInstanceOf[js.Any])
    
    inline def setResolvedSources(value: ResolvedIdMap): Self = StObject.set(x, "resolvedSources", value.asInstanceOf[js.Any])
    
    inline def setSyntheticNamedExports(value: Boolean | String): Self = StObject.set(x, "syntheticNamedExports", value.asInstanceOf[js.Any])
  }
}

package typings.rollup.mod

import typings.rollup.rollupStrings.`no-treeshake`
import typings.rollup.rollupStrings.absolute
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedId
  extends StObject
     with ModuleOptions {
  
  var external: Boolean | absolute
  
  var id: String
  
  var resolvedBy: String
}
object ResolvedId {
  
  inline def apply(
    assertions: Record[String, String],
    external: Boolean | absolute,
    id: String,
    meta: CustomPluginOptions,
    moduleSideEffects: Boolean | `no-treeshake`,
    resolvedBy: String,
    syntheticNamedExports: Boolean | String
  ): ResolvedId = {
    val __obj = js.Dynamic.literal(assertions = assertions.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], moduleSideEffects = moduleSideEffects.asInstanceOf[js.Any], resolvedBy = resolvedBy.asInstanceOf[js.Any], syntheticNamedExports = syntheticNamedExports.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolvedId] (val x: Self) extends AnyVal {
    
    inline def setExternal(value: Boolean | absolute): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setResolvedBy(value: String): Self = StObject.set(x, "resolvedBy", value.asInstanceOf[js.Any])
  }
}

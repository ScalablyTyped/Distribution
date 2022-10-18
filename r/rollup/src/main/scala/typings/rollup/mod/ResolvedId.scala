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
}
object ResolvedId {
  
  inline def apply(
    assertions: Record[String, String],
    external: Boolean | absolute,
    id: String,
    meta: CustomPluginOptions,
    moduleSideEffects: Boolean | `no-treeshake`,
    syntheticNamedExports: Boolean | String
  ): ResolvedId = {
    val __obj = js.Dynamic.literal(assertions = assertions.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], moduleSideEffects = moduleSideEffects.asInstanceOf[js.Any], syntheticNamedExports = syntheticNamedExports.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedId]
  }
  
  extension [Self <: ResolvedId](x: Self) {
    
    inline def setExternal(value: Boolean | absolute): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}

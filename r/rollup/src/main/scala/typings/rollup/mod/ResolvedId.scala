package typings.rollup.mod

import typings.rollup.rollupStrings.`no-treeshake`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedId
  extends StObject
     with ModuleOptions {
  
  var external: Boolean
  
  var id: String
}
object ResolvedId {
  
  @scala.inline
  def apply(
    external: Boolean,
    id: String,
    meta: CustomPluginOptions,
    moduleSideEffects: Boolean | `no-treeshake`,
    syntheticNamedExports: Boolean | String
  ): ResolvedId = {
    val __obj = js.Dynamic.literal(external = external.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], moduleSideEffects = moduleSideEffects.asInstanceOf[js.Any], syntheticNamedExports = syntheticNamedExports.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedId]
  }
  
  @scala.inline
  implicit class ResolvedIdMutableBuilder[Self <: ResolvedId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternal(value: Boolean): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}

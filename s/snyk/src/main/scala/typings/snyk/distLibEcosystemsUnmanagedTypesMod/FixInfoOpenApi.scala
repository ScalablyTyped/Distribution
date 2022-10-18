package typings.snyk.distLibEcosystemsUnmanagedTypesMod

import typings.snyk.distLibEcosystemsTypesMod.UpgradePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FixInfoOpenApi extends StObject {
  
  var is_patchable: Boolean
  
  var nearest_fixed_in_version: js.UndefOr[String] = js.undefined
  
  var upgrade_paths: js.Array[UpgradePath]
}
object FixInfoOpenApi {
  
  inline def apply(is_patchable: Boolean, upgrade_paths: js.Array[UpgradePath]): FixInfoOpenApi = {
    val __obj = js.Dynamic.literal(is_patchable = is_patchable.asInstanceOf[js.Any], upgrade_paths = upgrade_paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixInfoOpenApi]
  }
  
  extension [Self <: FixInfoOpenApi](x: Self) {
    
    inline def setIs_patchable(value: Boolean): Self = StObject.set(x, "is_patchable", value.asInstanceOf[js.Any])
    
    inline def setNearest_fixed_in_version(value: String): Self = StObject.set(x, "nearest_fixed_in_version", value.asInstanceOf[js.Any])
    
    inline def setNearest_fixed_in_versionUndefined: Self = StObject.set(x, "nearest_fixed_in_version", js.undefined)
    
    inline def setUpgrade_paths(value: js.Array[UpgradePath]): Self = StObject.set(x, "upgrade_paths", value.asInstanceOf[js.Any])
    
    inline def setUpgrade_pathsVarargs(value: UpgradePath*): Self = StObject.set(x, "upgrade_paths", js.Array(value*))
  }
}

package typings.snyk.distLibEcosystemsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradePath extends StObject {
  
  var path: js.Array[UpgradePathItem]
}
object UpgradePath {
  
  inline def apply(path: js.Array[UpgradePathItem]): UpgradePath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpgradePath]
  }
  
  extension [Self <: UpgradePath](x: Self) {
    
    inline def setPath(value: js.Array[UpgradePathItem]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: UpgradePathItem*): Self = StObject.set(x, "path", js.Array(value*))
  }
}

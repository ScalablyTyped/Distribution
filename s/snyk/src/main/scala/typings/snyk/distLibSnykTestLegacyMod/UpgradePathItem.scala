package typings.snyk.distLibSnykTestLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradePathItem extends StObject {
  
  var isDropped: js.UndefOr[Boolean] = js.undefined
  
  var name: String
  
  var newVersion: js.UndefOr[String] = js.undefined
  
  var version: String
}
object UpgradePathItem {
  
  inline def apply(name: String, version: String): UpgradePathItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpgradePathItem]
  }
  
  extension [Self <: UpgradePathItem](x: Self) {
    
    inline def setIsDropped(value: Boolean): Self = StObject.set(x, "isDropped", value.asInstanceOf[js.Any])
    
    inline def setIsDroppedUndefined: Self = StObject.set(x, "isDropped", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNewVersion(value: String): Self = StObject.set(x, "newVersion", value.asInstanceOf[js.Any])
    
    inline def setNewVersionUndefined: Self = StObject.set(x, "newVersion", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

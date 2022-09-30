package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BridgeProtocol extends StObject {
  
  var maxNpmVersion: String | Null
  
  /**
    * NPM version range that also supports this version.
    * Note that 'maxNpmVersion' is only set when the version is bumped.
    */
  var minNpmVersion: String
  
  /** Version supported by the current frontend/backend. */
  var version: Double
}
object BridgeProtocol {
  
  inline def apply(minNpmVersion: String, version: Double): BridgeProtocol = {
    val __obj = js.Dynamic.literal(minNpmVersion = minNpmVersion.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], maxNpmVersion = null)
    __obj.asInstanceOf[BridgeProtocol]
  }
  
  extension [Self <: BridgeProtocol](x: Self) {
    
    inline def setMaxNpmVersion(value: String): Self = StObject.set(x, "maxNpmVersion", value.asInstanceOf[js.Any])
    
    inline def setMaxNpmVersionNull: Self = StObject.set(x, "maxNpmVersion", null)
    
    inline def setMinNpmVersion(value: String): Self = StObject.set(x, "minNpmVersion", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

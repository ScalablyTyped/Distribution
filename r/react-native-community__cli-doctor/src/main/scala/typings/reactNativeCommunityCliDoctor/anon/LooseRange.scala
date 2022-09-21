package typings.reactNativeCommunityCliDoctor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LooseRange extends StObject {
  
  var looseRange: js.UndefOr[Boolean] = js.undefined
  
  var version: String
  
  var versionRange: String
}
object LooseRange {
  
  inline def apply(version: String, versionRange: String): LooseRange = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any], versionRange = versionRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[LooseRange]
  }
  
  extension [Self <: LooseRange](x: Self) {
    
    inline def setLooseRange(value: Boolean): Self = StObject.set(x, "looseRange", value.asInstanceOf[js.Any])
    
    inline def setLooseRangeUndefined: Self = StObject.set(x, "looseRange", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionRange(value: String): Self = StObject.set(x, "versionRange", value.asInstanceOf[js.Any])
  }
}

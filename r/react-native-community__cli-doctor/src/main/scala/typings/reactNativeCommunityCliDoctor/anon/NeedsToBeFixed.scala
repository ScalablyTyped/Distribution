package typings.reactNativeCommunityCliDoctor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NeedsToBeFixed extends StObject {
  
  var needsToBeFixed: Boolean | String
  
  var version: js.UndefOr[String] = js.undefined
  
  var versionRange: js.UndefOr[String] = js.undefined
  
  var versions: js.UndefOr[js.Array[String]] = js.undefined
}
object NeedsToBeFixed {
  
  inline def apply(needsToBeFixed: Boolean | String): NeedsToBeFixed = {
    val __obj = js.Dynamic.literal(needsToBeFixed = needsToBeFixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeedsToBeFixed]
  }
  
  extension [Self <: NeedsToBeFixed](x: Self) {
    
    inline def setNeedsToBeFixed(value: Boolean | String): Self = StObject.set(x, "needsToBeFixed", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionRange(value: String): Self = StObject.set(x, "versionRange", value.asInstanceOf[js.Any])
    
    inline def setVersionRangeUndefined: Self = StObject.set(x, "versionRange", js.undefined)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersions(value: js.Array[String]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    inline def setVersionsVarargs(value: String*): Self = StObject.set(x, "versions", js.Array(value*))
  }
}

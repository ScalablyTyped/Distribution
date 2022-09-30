package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseGetBuildsV2200
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var builds: js.UndefOr[js.Array[BuildV2]] = js.undefined
}
object ResponseGetBuildsV2200 {
  
  inline def apply(): ResponseGetBuildsV2200 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseGetBuildsV2200]
  }
  
  extension [Self <: ResponseGetBuildsV2200](x: Self) {
    
    inline def setBuilds(value: js.Array[BuildV2]): Self = StObject.set(x, "builds", value.asInstanceOf[js.Any])
    
    inline def setBuildsUndefined: Self = StObject.set(x, "builds", js.undefined)
    
    inline def setBuildsVarargs(value: BuildV2*): Self = StObject.set(x, "builds", js.Array(value*))
  }
}

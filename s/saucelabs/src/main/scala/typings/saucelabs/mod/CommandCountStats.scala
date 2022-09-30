package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandCountStats
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var all: js.UndefOr[Double] = js.undefined
  
  var error: js.UndefOr[Double] = js.undefined
}
object CommandCountStats {
  
  inline def apply(): CommandCountStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommandCountStats]
  }
  
  extension [Self <: CommandCountStats](x: Self) {
    
    inline def setAll(value: Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    inline def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
  }
}

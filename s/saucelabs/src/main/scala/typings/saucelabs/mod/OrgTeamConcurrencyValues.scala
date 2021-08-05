package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgTeamConcurrencyValues
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var allowed: js.UndefOr[ConcurrencyValues] = js.undefined
  
  var current: js.UndefOr[ConcurrencyValues] = js.undefined
}
object OrgTeamConcurrencyValues {
  
  inline def apply(): OrgTeamConcurrencyValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrgTeamConcurrencyValues]
  }
  
  extension [Self <: OrgTeamConcurrencyValues](x: Self) {
    
    inline def setAllowed(value: ConcurrencyValues): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
    
    inline def setAllowedUndefined: Self = StObject.set(x, "allowed", js.undefined)
    
    inline def setCurrent(value: ConcurrencyValues): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
  }
}

package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrgTeamConcurrencyValues
  extends /* key */ StringDictionary[js.Any] {
  
  var allowed: js.UndefOr[ConcurrencyValues] = js.native
  
  var current: js.UndefOr[ConcurrencyValues] = js.native
}
object OrgTeamConcurrencyValues {
  
  @scala.inline
  def apply(): OrgTeamConcurrencyValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrgTeamConcurrencyValues]
  }
  
  @scala.inline
  implicit class OrgTeamConcurrencyValuesMutableBuilder[Self <: OrgTeamConcurrencyValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowed(value: ConcurrencyValues): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedUndefined: Self = StObject.set(x, "allowed", js.undefined)
    
    @scala.inline
    def setCurrent(value: ConcurrencyValues): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
  }
}

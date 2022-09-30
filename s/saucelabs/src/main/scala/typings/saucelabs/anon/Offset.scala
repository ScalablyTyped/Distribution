package typings.saucelabs.anon

import typings.saucelabs.saucelabsStrings.active
import typings.saucelabs.saucelabsStrings.inactive
import typings.saucelabs.saucelabsStrings.pending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Offset extends StObject {
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var phrase: js.UndefOr[String] = js.undefined
  
  var roles: js.UndefOr[Double] = js.undefined
  
  var status: js.UndefOr[active | pending | inactive] = js.undefined
  
  var teamName: js.UndefOr[String] = js.undefined
  
  var teams: js.UndefOr[js.Array[String]] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object Offset {
  
  inline def apply(): Offset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Offset]
  }
  
  extension [Self <: Offset](x: Self) {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPhrase(value: String): Self = StObject.set(x, "phrase", value.asInstanceOf[js.Any])
    
    inline def setPhraseUndefined: Self = StObject.set(x, "phrase", js.undefined)
    
    inline def setRoles(value: Double): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setStatus(value: active | pending | inactive): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTeamName(value: String): Self = StObject.set(x, "teamName", value.asInstanceOf[js.Any])
    
    inline def setTeamNameUndefined: Self = StObject.set(x, "teamName", js.undefined)
    
    inline def setTeams(value: js.Array[String]): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
    
    inline def setTeamsUndefined: Self = StObject.set(x, "teams", js.undefined)
    
    inline def setTeamsVarargs(value: String*): Self = StObject.set(x, "teams", js.Array(value*))
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}

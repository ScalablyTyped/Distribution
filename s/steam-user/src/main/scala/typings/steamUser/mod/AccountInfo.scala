package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountInfo extends StObject {
  
  var authedMachines: Double
  
  var country: String
  
  var facebookID: String
  
  var facebookName: String
  
  var flags: EAccountFlags
  
  var name: String
}
object AccountInfo {
  
  inline def apply(
    authedMachines: Double,
    country: String,
    facebookID: String,
    facebookName: String,
    flags: EAccountFlags,
    name: String
  ): AccountInfo = {
    val __obj = js.Dynamic.literal(authedMachines = authedMachines.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], facebookID = facebookID.asInstanceOf[js.Any], facebookName = facebookName.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInfo]
  }
  
  extension [Self <: AccountInfo](x: Self) {
    
    inline def setAuthedMachines(value: Double): Self = StObject.set(x, "authedMachines", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setFacebookID(value: String): Self = StObject.set(x, "facebookID", value.asInstanceOf[js.Any])
    
    inline def setFacebookName(value: String): Self = StObject.set(x, "facebookName", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: EAccountFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamV1
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var group: js.UndefOr[TeamGroup] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var is_default: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var org_uuid: js.UndefOr[String] = js.undefined
  
  var settings: js.UndefOr[TeamSettings] = js.undefined
  
  var user_count: js.UndefOr[Double] = js.undefined
}
object TeamV1 {
  
  inline def apply(): TeamV1 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamV1]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TeamV1] (val x: Self) extends AnyVal {
    
    inline def setGroup(value: TeamGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIs_default(value: Boolean): Self = StObject.set(x, "is_default", value.asInstanceOf[js.Any])
    
    inline def setIs_defaultUndefined: Self = StObject.set(x, "is_default", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrg_uuid(value: String): Self = StObject.set(x, "org_uuid", value.asInstanceOf[js.Any])
    
    inline def setOrg_uuidUndefined: Self = StObject.set(x, "org_uuid", js.undefined)
    
    inline def setSettings(value: TeamSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setUser_count(value: Double): Self = StObject.set(x, "user_count", value.asInstanceOf[js.Any])
    
    inline def setUser_countUndefined: Self = StObject.set(x, "user_count", js.undefined)
  }
}

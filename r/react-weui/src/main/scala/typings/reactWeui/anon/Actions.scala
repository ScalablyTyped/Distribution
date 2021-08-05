package typings.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actions extends StObject {
  
  var actions: js.Array[js.Any]
  
  var autoDectect: Boolean
  
  var menus: js.Array[js.Any]
  
  var show: Boolean
  
  var `type`: String
}
object Actions {
  
  inline def apply(
    actions: js.Array[js.Any],
    autoDectect: Boolean,
    menus: js.Array[js.Any],
    show: Boolean,
    `type`: String
  ): Actions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], autoDectect = autoDectect.asInstanceOf[js.Any], menus = menus.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions]
  }
  
  extension [Self <: Actions](x: Self) {
    
    inline def setActions(value: js.Array[js.Any]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: js.Any*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    inline def setAutoDectect(value: Boolean): Self = StObject.set(x, "autoDectect", value.asInstanceOf[js.Any])
    
    inline def setMenus(value: js.Array[js.Any]): Self = StObject.set(x, "menus", value.asInstanceOf[js.Any])
    
    inline def setMenusVarargs(value: js.Any*): Self = StObject.set(x, "menus", js.Array(value :_*))
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

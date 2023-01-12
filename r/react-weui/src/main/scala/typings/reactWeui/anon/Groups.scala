package typings.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Groups extends StObject {
  
  var actions: js.Array[Any]
  
  var groups: js.Array[Any]
  
  var lang: LeftBtn
  
  var show: Boolean
}
object Groups {
  
  inline def apply(actions: js.Array[Any], groups: js.Array[Any], lang: LeftBtn, show: Boolean): Groups = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groups]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Groups] (val x: Self) extends AnyVal {
    
    inline def setActions(value: js.Array[Any]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: Any*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setGroups(value: js.Array[Any]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsVarargs(value: Any*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setLang(value: LeftBtn): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
  }
}

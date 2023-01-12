package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HooksNode extends StObject {
  
  var hookSource: js.UndefOr[HookSource] = js.undefined
  
  var id: Double | Null
  
  var isStateEditable: Boolean
  
  var name: String
  
  var subHooks: js.Array[HooksNode]
  
  var value: Any
}
object HooksNode {
  
  inline def apply(isStateEditable: Boolean, name: String, subHooks: js.Array[HooksNode], value: Any): HooksNode = {
    val __obj = js.Dynamic.literal(isStateEditable = isStateEditable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subHooks = subHooks.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], id = null)
    __obj.asInstanceOf[HooksNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HooksNode] (val x: Self) extends AnyVal {
    
    inline def setHookSource(value: HookSource): Self = StObject.set(x, "hookSource", value.asInstanceOf[js.Any])
    
    inline def setHookSourceUndefined: Self = StObject.set(x, "hookSource", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIsStateEditable(value: Boolean): Self = StObject.set(x, "isStateEditable", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSubHooks(value: js.Array[HooksNode]): Self = StObject.set(x, "subHooks", value.asInstanceOf[js.Any])
    
    inline def setSubHooksVarargs(value: HooksNode*): Self = StObject.set(x, "subHooks", js.Array(value*))
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

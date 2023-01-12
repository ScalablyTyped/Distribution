package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeDescription extends StObject {
  
  var context: js.Array[String] | Boolean | Null
  
  var didHooksChange: Boolean
  
  var hooks: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  var isFirstMount: Boolean
  
  var props: js.Array[String] | Null
  
  var state: js.Array[String] | Null
}
object ChangeDescription {
  
  inline def apply(didHooksChange: Boolean, isFirstMount: Boolean): ChangeDescription = {
    val __obj = js.Dynamic.literal(didHooksChange = didHooksChange.asInstanceOf[js.Any], isFirstMount = isFirstMount.asInstanceOf[js.Any], context = null, props = null, state = null)
    __obj.asInstanceOf[ChangeDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeDescription] (val x: Self) extends AnyVal {
    
    inline def setContext(value: js.Array[String] | Boolean): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextNull: Self = StObject.set(x, "context", null)
    
    inline def setContextVarargs(value: String*): Self = StObject.set(x, "context", js.Array(value*))
    
    inline def setDidHooksChange(value: Boolean): Self = StObject.set(x, "didHooksChange", value.asInstanceOf[js.Any])
    
    inline def setHooks(value: js.Array[Double]): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setHooksNull: Self = StObject.set(x, "hooks", null)
    
    inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    inline def setHooksVarargs(value: Double*): Self = StObject.set(x, "hooks", js.Array(value*))
    
    inline def setIsFirstMount(value: Boolean): Self = StObject.set(x, "isFirstMount", value.asInstanceOf[js.Any])
    
    inline def setProps(value: js.Array[String]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsNull: Self = StObject.set(x, "props", null)
    
    inline def setPropsVarargs(value: String*): Self = StObject.set(x, "props", js.Array(value*))
    
    inline def setState(value: js.Array[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateVarargs(value: String*): Self = StObject.set(x, "state", js.Array(value*))
  }
}

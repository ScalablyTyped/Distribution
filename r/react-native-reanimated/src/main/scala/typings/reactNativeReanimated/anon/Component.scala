package typings.reactNativeReanimated.anon

import typings.reactNativeReanimated.libTypesReanimated2JsReanimatedMod.JSReanimatedComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component extends StObject {
  
  var _component: js.UndefOr[JSReanimatedComponent] = js.undefined
}
object Component {
  
  inline def apply(): Component = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Component]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Component] (val x: Self) extends AnyVal {
    
    inline def set_component(value: JSReanimatedComponent): Self = StObject.set(x, "_component", value.asInstanceOf[js.Any])
    
    inline def set_componentUndefined: Self = StObject.set(x, "_component", js.undefined)
  }
}

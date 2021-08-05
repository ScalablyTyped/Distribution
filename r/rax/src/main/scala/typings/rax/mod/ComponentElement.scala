package typings.rax.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentElement[P, T /* <: Component[P, ComponentState, js.Any] */]
  extends StObject
     with RaxElement[P, ComponentClass[P, ComponentState]] {
  
  var ref: js.UndefOr[LegacyRef[T]] = js.undefined
}
object ComponentElement {
  
  inline def apply[P, T /* <: Component[P, ComponentState, js.Any] */](props: P, `type`: ComponentClass[P, ComponentState]): ComponentElement[P, T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentElement[P, T]]
  }
  
  extension [Self <: ComponentElement[?, ?], P, T /* <: Component[P, ComponentState, js.Any] */](x: Self & (ComponentElement[P, T])) {
    
    inline def setRef(value: LegacyRef[T]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ T | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}

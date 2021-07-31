package typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentElement[P, T /* <: Component[P, ComponentState, js.Any] */]
  extends StObject
     with ReactElement {
  
  var ref: js.UndefOr[LegacyRef[T]] = js.undefined
}
object ComponentElement {
  
  @scala.inline
  def apply[P, T /* <: Component[P, ComponentState, js.Any] */](props: js.Any, `type`: js.Any): ComponentElement[P, T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentElement[P, T]]
  }
  
  @scala.inline
  implicit class ComponentElementMutableBuilder[Self <: ComponentElement[?, ?], P, T /* <: Component[P, ComponentState, js.Any] */] (val x: Self & (ComponentElement[P, T])) extends AnyVal {
    
    @scala.inline
    def setRef(value: LegacyRef[T]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ T | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}

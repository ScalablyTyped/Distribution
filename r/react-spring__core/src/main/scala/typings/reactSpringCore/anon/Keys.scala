package typings.reactSpringCore.anon

import typings.react.mod.ReactNode
import typings.reactSpringCore.mod.ItemKeys
import typings.reactSpringCore.mod.Key
import typings.reactSpringCore.mod.PickAnimated
import typings.reactSpringCore.mod.SpringValues
import typings.reactSpringCore.mod.TransitionRenderFn
import typings.reactSpringCore.mod.TransitionState
import typings.reactSpringCore.reactSpringCoreBooleans.`true`
import typings.reactSpringTypes.mod.NoInfer
import typings.reactSpringTypes.mod.OneOrMore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Keys[Item, Props /* <: js.Object */] extends StObject {
  
  var children: TransitionRenderFn[NoInfer[Item], PickAnimated[Props, `true`]]
  
  var items: OneOrMore[Item]
  
  var keys: js.UndefOr[ItemKeys[NoInfer[Item]]] = js.undefined
}
object Keys {
  
  inline def apply[Item, Props /* <: js.Object */](
    children: (/* values */ SpringValues[PickAnimated[Props, `true`]], NoInfer[Item], /* transition */ TransitionState[NoInfer[Item], PickAnimated[Props, `true`]], /* index */ Double) => ReactNode,
    items: OneOrMore[Item]
  ): Keys[Item, Props] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction4(children), items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keys[Item, Props]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Keys[?, ?], Item, Props /* <: js.Object */] (val x: Self & (Keys[Item, Props])) extends AnyVal {
    
    inline def setChildren(
      value: (/* values */ SpringValues[PickAnimated[Props, `true`]], NoInfer[Item], /* transition */ TransitionState[NoInfer[Item], PickAnimated[Props, `true`]], /* index */ Double) => ReactNode
    ): Self = StObject.set(x, "children", js.Any.fromFunction4(value))
    
    inline def setItems(value: OneOrMore[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKeys(value: ItemKeys[NoInfer[Item]]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysFunction1(value: NoInfer[Item] => Key): Self = StObject.set(x, "keys", js.Any.fromFunction1(value))
    
    inline def setKeysNull: Self = StObject.set(x, "keys", null)
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: Key*): Self = StObject.set(x, "keys", js.Array(value*))
  }
}

package typings.reactSpringCore.anon

import typings.react.mod.ReactNode
import typings.reactSpringCore.distDeclarationsSrcTypesObjectsMod.SpringValues
import typings.reactSpringCore.distDeclarationsSrcTypesPropsMod.PickAnimated
import typings.reactSpringCore.reactSpringCoreBooleans.`true`
import typings.reactSpringTypes.utilMod.Falsy
import typings.reactSpringTypes.utilMod.NoInfer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Items[Item, Props /* <: js.Object */] extends StObject {
  
  def children(item: NoInfer[Item], index: Double): (js.Function1[/* values */ SpringValues[PickAnimated[Props, `true`]], ReactNode]) | Falsy
  
  var items: js.Array[Item]
}
object Items {
  
  inline def apply[Item, Props /* <: js.Object */](
    children: (NoInfer[Item], Double) => (js.Function1[/* values */ SpringValues[PickAnimated[Props, `true`]], ReactNode]) | Falsy,
    items: js.Array[Item]
  ): Items[Item, Props] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items[Item, Props]]
  }
  
  extension [Self <: Items[?, ?], Item, Props /* <: js.Object */](x: Self & (Items[Item, Props])) {
    
    inline def setChildren(
      value: (NoInfer[Item], Double) => (js.Function1[/* values */ SpringValues[PickAnimated[Props, `true`]], ReactNode]) | Falsy
    ): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
    
    inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
  }
}

package typings.reactSpringCore.anon

import typings.react.mod.global.JSX.Element
import typings.reactSpringCore.distDeclarationsSrcTypesObjectsMod.SpringValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children[State /* <: js.Object */] extends StObject {
  
  def children(values: SpringValues[State]): Element | Null
}
object Children {
  
  inline def apply[State /* <: js.Object */](children: SpringValues[State] => Element | Null): Children[State] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[Children[State]]
  }
  
  extension [Self <: Children[?], State /* <: js.Object */](x: Self & Children[State]) {
    
    inline def setChildren(value: SpringValues[State] => Element | Null): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
  }
}

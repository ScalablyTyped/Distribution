package typings.reactMdMenu.anon

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@react-md/menu.@react-md/menu/types/MenuVisibilityProvider.MenuVisibilityContext> */
trait ReadonlyMenuVisibilityCon extends StObject {
  
  val setVisible: Dispatch[SetStateAction[Boolean]]
  
  val visible: Boolean
}
object ReadonlyMenuVisibilityCon {
  
  inline def apply(setVisible: SetStateAction[Boolean] => Unit, visible: Boolean): ReadonlyMenuVisibilityCon = {
    val __obj = js.Dynamic.literal(setVisible = js.Any.fromFunction1(setVisible), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyMenuVisibilityCon]
  }
  
  extension [Self <: ReadonlyMenuVisibilityCon](x: Self) {
    
    inline def setSetVisible(value: SetStateAction[Boolean] => Unit): Self = StObject.set(x, "setVisible", js.Any.fromFunction1(value))
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}

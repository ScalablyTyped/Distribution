package typings.reactBulmaComponents.anon

import typings.react.mod.ReactElement
import typings.reactBulmaComponents.reactBulmaComponentsStrings.hr
import typings.reactBulmaComponents.reactBulmaComponentsStrings.renderAs
import typings.reactBulmaComponents.srcComponentsDropdownMod.DropdownItemProps
import typings.reactBulmaComponents.srcComponentsMod.ElementProps
import typings.reactBulmaComponents.srcComponentsMod.RenderAsComponent
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Divider extends StObject {
  
  def Divider(props: Omit[ElementProps[js.Object, hr], renderAs]): ReactElement
  
  def Item[TValue, TComponent /* <: RenderAsComponent */](props: DropdownItemProps[TValue] & (ElementProps[DropdownItemProps[TValue], TComponent])): ReactElement
}
object Divider {
  
  inline def apply(
    Divider: Omit[ElementProps[js.Object, hr], renderAs] => ReactElement,
    Item: DropdownItemProps[Any] & (ElementProps[DropdownItemProps[Any], Any]) => ReactElement
  ): Divider = {
    val __obj = js.Dynamic.literal(Divider = js.Any.fromFunction1(Divider), Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[Divider]
  }
  
  extension [Self <: Divider](x: Self) {
    
    inline def setDivider(value: Omit[ElementProps[js.Object, hr], renderAs] => ReactElement): Self = StObject.set(x, "Divider", js.Any.fromFunction1(value))
    
    inline def setItem(value: DropdownItemProps[Any] & (ElementProps[DropdownItemProps[Any], Any]) => ReactElement): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}

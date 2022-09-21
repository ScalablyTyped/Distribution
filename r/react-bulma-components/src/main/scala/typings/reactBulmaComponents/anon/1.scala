package typings.reactBulmaComponents.anon

import typings.react.mod.ReactElement
import typings.reactBulmaComponents.componentsMod.BulmaComponent
import typings.reactBulmaComponents.componentsMod.ElementProps
import typings.reactBulmaComponents.menuMod.MenuListItemProps
import typings.reactBulmaComponents.reactBulmaComponentsStrings.a
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var Item: BulmaComponent[MenuListItemProps, a]
}
object `1` {
  
  inline def apply(Item: /* props */ MenuListItemProps & (ElementProps[MenuListItemProps, a]) => ReactElement): `1` = {
    val __obj = js.Dynamic.literal(Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setItem(value: /* props */ MenuListItemProps & (ElementProps[MenuListItemProps, a]) => ReactElement): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}

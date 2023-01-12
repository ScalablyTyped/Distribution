package typings.reactBulmaComponents.anon

import typings.react.mod.ReactElement
import typings.reactBulmaComponents.reactBulmaComponentsStrings.a
import typings.reactBulmaComponents.srcComponentsMenuMod.MenuListItemProps
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typings.reactBulmaComponents.srcComponentsMod.ElementProps
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
    
    inline def setItem(value: /* props */ MenuListItemProps & (ElementProps[MenuListItemProps, a]) => ReactElement): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}

package typings.reactBulmaComponents.anon

import typings.react.mod.ReactElement
import typings.reactBulmaComponents.reactBulmaComponentsStrings.div
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typings.reactBulmaComponents.srcComponentsMod.ElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemBulmaComponent extends StObject {
  
  var Item: BulmaComponent[js.Object, div]
}
object ItemBulmaComponent {
  
  inline def apply(Item: /* props */ js.Object & (ElementProps[js.Object, div]) => ReactElement): ItemBulmaComponent = {
    val __obj = js.Dynamic.literal(Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[ItemBulmaComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemBulmaComponent] (val x: Self) extends AnyVal {
    
    inline def setItem(value: /* props */ js.Object & (ElementProps[js.Object, div]) => ReactElement): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}

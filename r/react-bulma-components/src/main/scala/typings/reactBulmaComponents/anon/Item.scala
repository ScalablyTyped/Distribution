package typings.reactBulmaComponents.anon

import typings.react.mod.ReactElement
import typings.reactBulmaComponents.reactBulmaComponentsStrings.li
import typings.reactBulmaComponents.srcComponentsBreadcrumbMod.BreadcrumbItemProps
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typings.reactBulmaComponents.srcComponentsMod.ElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  var Item: BulmaComponent[BreadcrumbItemProps, li]
}
object Item {
  
  inline def apply(Item: /* props */ BreadcrumbItemProps & (ElementProps[BreadcrumbItemProps, li]) => ReactElement): Item = {
    val __obj = js.Dynamic.literal(Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[Item]
  }
  
  extension [Self <: Item](x: Self) {
    
    inline def setItem(value: /* props */ BreadcrumbItemProps & (ElementProps[BreadcrumbItemProps, li]) => ReactElement): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}

package typings.reactBulmaComponents.anon

import typings.react.mod.ReactElement
import typings.reactBulmaComponents.componentsMod.BulmaComponent
import typings.reactBulmaComponents.componentsMod.ElementProps
import typings.reactBulmaComponents.mediaMod.MediaItemProps
import typings.reactBulmaComponents.reactBulmaComponentsStrings.div
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var Item: BulmaComponent[MediaItemProps, div]
}
object `0` {
  
  inline def apply(Item: /* props */ MediaItemProps & (ElementProps[MediaItemProps, div]) => ReactElement): `0` = {
    val __obj = js.Dynamic.literal(Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setItem(value: /* props */ MediaItemProps & (ElementProps[MediaItemProps, div]) => ReactElement): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}

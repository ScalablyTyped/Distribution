package typings.reactBulmaComponents.anon

import typings.react.mod.ReactElement
import typings.reactBulmaComponents.reactBulmaComponentsStrings.div
import typings.reactBulmaComponents.srcComponentsMediaMod.MediaItemProps
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typings.reactBulmaComponents.srcComponentsMod.ElementProps
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setItem(value: /* props */ MediaItemProps & (ElementProps[MediaItemProps, div]) => ReactElement): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}

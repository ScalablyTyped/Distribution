package typings.reactBulmaComponents.anon

import typings.react.mod.ReactElement
import typings.reactBulmaComponents.reactBulmaComponentsStrings.div
import typings.reactBulmaComponents.srcComponentsLevelMod.LevelSideProps
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typings.reactBulmaComponents.srcComponentsMod.ElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Side extends StObject {
  
  var Item: BulmaComponent[js.Object, div]
  
  var Side: BulmaComponent[LevelSideProps, div]
}
object Side {
  
  inline def apply(
    Item: /* props */ js.Object & (ElementProps[js.Object, div]) => ReactElement,
    Side: /* props */ LevelSideProps & (ElementProps[LevelSideProps, div]) => ReactElement
  ): Side = {
    val __obj = js.Dynamic.literal(Item = js.Any.fromFunction1(Item), Side = js.Any.fromFunction1(Side))
    __obj.asInstanceOf[Side]
  }
  
  extension [Self <: Side](x: Self) {
    
    inline def setItem(value: /* props */ js.Object & (ElementProps[js.Object, div]) => ReactElement): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setSide(value: /* props */ LevelSideProps & (ElementProps[LevelSideProps, div]) => ReactElement): Self = StObject.set(x, "Side", js.Any.fromFunction1(value))
  }
}

package typings.reactBulmaComponents.anon

import typings.react.mod.ReactElement
import typings.reactBulmaComponents.componentsMod.BulmaComponent
import typings.reactBulmaComponents.componentsMod.ElementProps
import typings.reactBulmaComponents.reactBulmaComponentsStrings.div
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Card extends StObject {
  
  var Card: (BulmaComponent[js.Object, div]) & Title
  
  var Content: BulmaComponent[js.Object, div]
}
object Card {
  
  inline def apply(
    Card: (BulmaComponent[js.Object, div]) & Title,
    Content: /* props */ js.Object & (ElementProps[js.Object, div]) => ReactElement
  ): Card = {
    val __obj = js.Dynamic.literal(Card = Card.asInstanceOf[js.Any], Content = js.Any.fromFunction1(Content))
    __obj.asInstanceOf[Card]
  }
  
  extension [Self <: Card](x: Self) {
    
    inline def setCard(value: (BulmaComponent[js.Object, div]) & Title): Self = StObject.set(x, "Card", value.asInstanceOf[js.Any])
    
    inline def setContent(value: /* props */ js.Object & (ElementProps[js.Object, div]) => ReactElement): Self = StObject.set(x, "Content", js.Any.fromFunction1(value))
  }
}

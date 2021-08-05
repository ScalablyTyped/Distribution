package typings.react.mod

import typings.react.reactStrings.backwards
import typings.react.reactStrings.forwards
import typings.std.Exclude
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonDirectionalSuspenseListProps
  extends StObject
     with typings.react.experimentalMod.reactAugmentingMod.SuspenseListCommonProps {
  
  /**
    * Defines the order in which the `SuspenseList` children should be revealed.
    */
  var revealOrder: js.UndefOr[
    Exclude[
      typings.react.experimentalMod.reactAugmentingMod.SuspenseListRevealOrder, 
      forwards | backwards
    ]
  ] = js.undefined
  
  /**
    * The tail property is invalid when not using the `forwards` or `backwards` reveal orders.
    */
  var tail: js.UndefOr[scala.Nothing] = js.undefined
}
object NonDirectionalSuspenseListProps {
  
  inline def apply(children: ReactElement | Iterable[ReactElement]): NonDirectionalSuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonDirectionalSuspenseListProps]
  }
  
  extension [Self <: NonDirectionalSuspenseListProps](x: Self) {
    
    inline def setRevealOrder(
      value: Exclude[
          typings.react.experimentalMod.reactAugmentingMod.SuspenseListRevealOrder, 
          forwards | backwards
        ]
    ): Self = StObject.set(x, "revealOrder", value.asInstanceOf[js.Any])
    
    inline def setRevealOrderUndefined: Self = StObject.set(x, "revealOrder", js.undefined)
  }
}

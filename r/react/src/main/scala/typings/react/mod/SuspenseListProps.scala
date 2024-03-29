package typings.react.mod

import typings.react.reactStrings.backwards
import typings.react.reactStrings.forwards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps
  - typings.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps
*/
trait SuspenseListProps extends StObject
object SuspenseListProps {
  
  inline def DirectionalSuspenseListProps(children: ReactElement | js.Iterable[ReactElement], revealOrder: forwards | backwards): typings.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps]
  }
  
  inline def NonDirectionalSuspenseListProps(children: ReactElement | js.Iterable[ReactElement]): typings.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps]
  }
}

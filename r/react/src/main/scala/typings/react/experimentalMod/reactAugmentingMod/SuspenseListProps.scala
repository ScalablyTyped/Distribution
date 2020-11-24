package typings.react.experimentalMod.reactAugmentingMod

import typings.react.mod.ReactElement
import typings.react.reactStrings.backwards
import typings.react.reactStrings.forwards
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps
  - typings.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps
*/
trait SuspenseListProps extends js.Object
object SuspenseListProps {
  
  @scala.inline
  def DirectionalSuspenseListProps(children: ReactElement | Iterable[ReactElement], revealOrder: forwards | backwards): SuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspenseListProps]
  }
  
  @scala.inline
  def NonDirectionalSuspenseListProps(children: ReactElement | Iterable[ReactElement]): SuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspenseListProps]
  }
}

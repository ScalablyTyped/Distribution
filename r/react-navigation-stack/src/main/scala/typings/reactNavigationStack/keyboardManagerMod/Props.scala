package typings.reactNavigationStack.keyboardManagerMod

import typings.react.mod.ReactNode
import typings.reactNavigationStack.AnonOnPageChangeCancel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var enabled: Boolean
  def children(props: AnonOnPageChangeCancel): ReactNode
}

object Props {
  @scala.inline
  def apply(children: AnonOnPageChangeCancel => ReactNode, enabled: Boolean): Props = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), enabled = enabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Props]
  }
}


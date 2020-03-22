package typings.reactNavigationStack.maskedViewMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: ReactElement
  var maskElement: ReactElement
}

object Props {
  @scala.inline
  def apply(children: ReactElement, maskElement: ReactElement): Props = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], maskElement = maskElement.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Props]
  }
}


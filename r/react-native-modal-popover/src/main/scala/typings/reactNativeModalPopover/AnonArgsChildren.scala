package typings.reactNativeModalPopover

import typings.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgsChildren extends js.Object {
  var children: Validator[js.Function1[/* repeated */ _, _]]
}

object AnonArgsChildren {
  @scala.inline
  def apply(children: Validator[js.Function1[/* repeated */ _, _]]): AnonArgsChildren = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArgsChildren]
  }
}


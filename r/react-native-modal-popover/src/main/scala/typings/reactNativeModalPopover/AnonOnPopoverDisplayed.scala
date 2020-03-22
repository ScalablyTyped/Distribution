package typings.reactNativeModalPopover

import typings.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnPopoverDisplayed extends js.Object {
  var onPopoverDisplayed: Requireable[js.Function1[/* repeated */ _, _]]
}

object AnonOnPopoverDisplayed {
  @scala.inline
  def apply(onPopoverDisplayed: Requireable[js.Function1[/* repeated */ _, _]]): AnonOnPopoverDisplayed = {
    val __obj = js.Dynamic.literal(onPopoverDisplayed = onPopoverDisplayed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOnPopoverDisplayed]
  }
}


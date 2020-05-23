package typings.reactNativeModalPopover.anon

import typings.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnPopoverDisplayed extends js.Object {
  var onPopoverDisplayed: Requireable[js.Function1[/* repeated */ _, _]]
}

object OnPopoverDisplayed {
  @scala.inline
  def apply(onPopoverDisplayed: Requireable[js.Function1[/* repeated */ _, _]]): OnPopoverDisplayed = {
    val __obj = js.Dynamic.literal(onPopoverDisplayed = onPopoverDisplayed.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnPopoverDisplayed]
  }
}


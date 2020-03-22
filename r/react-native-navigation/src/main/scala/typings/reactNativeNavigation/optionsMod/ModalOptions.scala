package typings.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalOptions extends js.Object {
  /**
    * Control wether this modal should be dismiss using swipe gesture when the modalPresentationStyle = 'pageSheet'
    * #### (iOS specific)
    */
  var swipeToDismiss: js.UndefOr[Boolean] = js.undefined
}

object ModalOptions {
  @scala.inline
  def apply(swipeToDismiss: js.UndefOr[Boolean] = js.undefined): ModalOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(swipeToDismiss)) __obj.updateDynamic("swipeToDismiss")(swipeToDismiss.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalOptions]
  }
}


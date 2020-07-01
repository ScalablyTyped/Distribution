package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalPropsAndroid extends js.Object {
  /**
    *  Controls whether to force hardware acceleration for the underlying window.
    */
  var hardwareAccelerated: js.UndefOr[Boolean] = js.undefined
  /**
    *  Determines whether your modal should go under the system statusbar.
    */
  var statusBarTranslucent: js.UndefOr[Boolean] = js.undefined
}

object ModalPropsAndroid {
  @scala.inline
  def apply(
    hardwareAccelerated: js.UndefOr[Boolean] = js.undefined,
    statusBarTranslucent: js.UndefOr[Boolean] = js.undefined
  ): ModalPropsAndroid = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hardwareAccelerated)) __obj.updateDynamic("hardwareAccelerated")(hardwareAccelerated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(statusBarTranslucent)) __obj.updateDynamic("statusBarTranslucent")(statusBarTranslucent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalPropsAndroid]
  }
}


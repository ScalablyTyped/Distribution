package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractionMixin extends js.Object {
  def clearInteractionHandle(clearHandle: scala.Double): scala.Unit
  def createInteractionHandle(): scala.Double
  /**
    * Schedule work for after all interactions have completed.
    *
    */
  def runAfterInteractions(callback: js.Function0[_]): scala.Unit
}

object InteractionMixin {
  @scala.inline
  def apply(
    clearInteractionHandle: js.Function1[scala.Double, scala.Unit],
    createInteractionHandle: js.Function0[scala.Double],
    runAfterInteractions: js.Function1[js.Function0[_], scala.Unit]
  ): InteractionMixin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearInteractionHandle")(clearInteractionHandle)
    __obj.updateDynamic("createInteractionHandle")(createInteractionHandle)
    __obj.updateDynamic("runAfterInteractions")(runAfterInteractions)
    __obj.asInstanceOf[InteractionMixin]
  }
}


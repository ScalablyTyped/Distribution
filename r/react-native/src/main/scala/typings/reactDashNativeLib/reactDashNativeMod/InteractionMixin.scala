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
    clearInteractionHandle: scala.Double => scala.Unit,
    createInteractionHandle: () => scala.Double,
    runAfterInteractions: js.Function0[_] => scala.Unit
  ): InteractionMixin = {
    val __obj = js.Dynamic.literal(clearInteractionHandle = js.Any.fromFunction1(clearInteractionHandle), createInteractionHandle = js.Any.fromFunction0(createInteractionHandle), runAfterInteractions = js.Any.fromFunction1(runAfterInteractions))
  
    __obj.asInstanceOf[InteractionMixin]
  }
}


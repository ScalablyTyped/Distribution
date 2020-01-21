package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractionMixin extends js.Object {
  def clearInteractionHandle(clearHandle: Double): Unit
  def createInteractionHandle(): Double
  /**
    * Schedule work for after all interactions have completed.
    *
    */
  def runAfterInteractions(callback: js.Function0[_]): Unit
}

object InteractionMixin {
  @scala.inline
  def apply(
    clearInteractionHandle: Double => Unit,
    createInteractionHandle: () => Double,
    runAfterInteractions: js.Function0[_] => Unit
  ): InteractionMixin = {
    val __obj = js.Dynamic.literal(clearInteractionHandle = js.Any.fromFunction1(clearInteractionHandle), createInteractionHandle = js.Any.fromFunction0(createInteractionHandle), runAfterInteractions = js.Any.fromFunction1(runAfterInteractions))
  
    __obj.asInstanceOf[InteractionMixin]
  }
}


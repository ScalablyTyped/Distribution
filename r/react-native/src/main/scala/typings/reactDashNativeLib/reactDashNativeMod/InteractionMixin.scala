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


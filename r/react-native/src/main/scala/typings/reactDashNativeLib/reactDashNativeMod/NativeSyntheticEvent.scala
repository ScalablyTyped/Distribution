package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NativeSyntheticEvent[T] extends js.Object {
  var bubbles: scala.Boolean
  var cancelable: scala.Boolean
  var currentTarget: reactDashNativeLib.NodeHandle
  var defaultPrevented: scala.Boolean
  var eventPhase: scala.Double
  var isTrusted: scala.Boolean
  var nativeEvent: T
  var target: reactDashNativeLib.NodeHandle
  var timeStamp: scala.Double
  var `type`: java.lang.String
  def isDefaultPrevented(): scala.Boolean
  def isPropagationStopped(): scala.Boolean
  def persist(): scala.Unit
  def preventDefault(): scala.Unit
  def stopPropagation(): scala.Unit
}


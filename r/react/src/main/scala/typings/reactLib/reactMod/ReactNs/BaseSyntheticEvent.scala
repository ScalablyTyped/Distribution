package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Event System
// ----------------------------------------------------------------------
// TODO: change any to unknown when moving to TS v3

trait BaseSyntheticEvent[E, C, T] extends js.Object {
  var bubbles: scala.Boolean
  var cancelable: scala.Boolean
  var currentTarget: C
  var defaultPrevented: scala.Boolean
  var eventPhase: scala.Double
  var isTrusted: scala.Boolean
  var nativeEvent: E
  var target: T
  var timeStamp: scala.Double
  var `type`: java.lang.String
  def isDefaultPrevented(): scala.Boolean
  def isPropagationStopped(): scala.Boolean
  def persist(): scala.Unit
  def preventDefault(): scala.Unit
  def stopPropagation(): scala.Unit
}


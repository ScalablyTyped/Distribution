package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Event System
// ----------------------------------------------------------------------

trait SyntheticEvent[T] extends js.Object {
  var bubbles: scala.Boolean
  var cancelable: scala.Boolean
  /**
           * A reference to the element on which the event listener is registered.
           */
  var currentTarget: reactLib.EventTarget with T
  var defaultPrevented: scala.Boolean
  var eventPhase: scala.Double
  var isTrusted: scala.Boolean
  var nativeEvent: reactLib.Event
  // If you thought this should be `EventTarget & T`, see https://github.com/DefinitelyTyped/DefinitelyTyped/pull/12239
  /**
           * A reference to the element from which the event was originally dispatched.
           * This might be a child element to the element on which the event listener is registered.
           *
           * @see currentTarget
           */
  var target: reactLib.EventTarget
  var timeStamp: scala.Double
  var `type`: java.lang.String
  def isDefaultPrevented(): scala.Boolean
  def isPropagationStopped(): scala.Boolean
  def persist(): scala.Unit
  def preventDefault(): scala.Unit
  def stopPropagation(): scala.Unit
}


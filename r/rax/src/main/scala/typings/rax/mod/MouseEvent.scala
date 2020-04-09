package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.std.Event_ because var conflicts: bubbles, cancelable, currentTarget, defaultPrevented, eventPhase, isTrusted, target, timeStamp, `type`. Inlined AT_TARGET, BUBBLING_PHASE, CAPTURING_PHASE, NONE, cancelBubble, composed, returnValue, srcElement, composedPath, initEvent, initEvent, initEvent, stopImmediatePropagation */ @js.native
trait MouseEvent[T, E] extends BaseSyntheticEvent[E, EventTarget with T, EventTarget] {
  val AT_TARGET: Double = js.native
  val BUBBLING_PHASE: Double = js.native
  val CAPTURING_PHASE: Double = js.native
  val NONE: Double = js.native
  var altKey: Boolean = js.native
  var button: Double = js.native
  var buttons: Double = js.native
  var cancelBubble: Boolean = js.native
  var clientX: Double = js.native
  var clientY: Double = js.native
  /**
    * Returns true or false depending on how event was initialized. True if event invokes listeners past a ShadowRoot node that is the root of its target, and false otherwise.
    */
  val composed: Boolean = js.native
  var ctrlKey: Boolean = js.native
  var metaKey: Boolean = js.native
  var movementX: Double = js.native
  var movementY: Double = js.native
  var pageX: Double = js.native
  var pageY: Double = js.native
  var relatedTarget: EventTarget = js.native
  var returnValue: Boolean = js.native
  var screenX: Double = js.native
  var screenY: Double = js.native
  var shiftKey: Boolean = js.native
  /** @deprecated */
  val srcElement: typings.std.EventTarget | Null = js.native
  /**
    * Returns the invocation target objects of event's path (objects on which listeners will be invoked), except for any nodes in shadow trees of which the shadow root's mode is "closed" that are not reachable from event's currentTarget.
    */
  def composedPath(): js.Array[typings.std.EventTarget] = js.native
  /**
    * See [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#keys-modifier). for a list of valid (case-sensitive) arguments to this method.
    */
  def getModifierState(key: String): Boolean = js.native
  def initEvent(`type`: String): Unit = js.native
  def initEvent(`type`: String, bubbles: Boolean): Unit = js.native
  def initEvent(`type`: String, bubbles: Boolean, cancelable: Boolean): Unit = js.native
  /**
    * Invoking this method prevents event from reaching any registered event listeners after the current one finishes running and, when dispatched in a tree, also prevents event from reaching any other objects.
    */
  def stopImmediatePropagation(): Unit = js.native
}


package typings.rax.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.std.Event because var conflicts: bubbles, cancelable, currentTarget, defaultPrevented, eventPhase, isTrusted, target, timeStamp, `type`. Inlined BUBBLING_PHASE, NONE, cancelBubble, composed, returnValue, AT_TARGET, CAPTURING_PHASE, srcElement, composedPath, initEvent, initEvent, initEvent, initEvent, stopImmediatePropagation */ @js.native
trait AnimationEvent[T] extends BaseSyntheticEvent[NativeAnimationEvent, EventTarget with T, EventTarget] {
  
  val AT_TARGET: Double = js.native
  
  val BUBBLING_PHASE: Double = js.native
  
  val CAPTURING_PHASE: Double = js.native
  
  val NONE: Double = js.native
  
  var animationName: String = js.native
  
  var cancelBubble: Boolean = js.native
  
  /**
    * Returns true or false depending on how event was initialized. True if event invokes listeners past a ShadowRoot node that is the root of its target, and false otherwise.
    */
  val composed: Boolean = js.native
  
  /**
    * Returns the invocation target objects of event's path (objects on which listeners will be invoked), except for any nodes in shadow trees of which the shadow root's mode is "closed" that are not reachable from event's currentTarget.
    */
  def composedPath(): js.Array[typings.std.EventTarget] = js.native
  
  var elapsedTime: Double = js.native
  
  def initEvent(`type`: String): Unit = js.native
  def initEvent(`type`: String, bubbles: js.UndefOr[scala.Nothing], cancelable: Boolean): Unit = js.native
  def initEvent(`type`: String, bubbles: Boolean): Unit = js.native
  def initEvent(`type`: String, bubbles: Boolean, cancelable: Boolean): Unit = js.native
  
  var pseudoElement: String = js.native
  
  var returnValue: Boolean = js.native
  
  /** @deprecated */
  val srcElement: typings.std.EventTarget | Null = js.native
  
  /**
    * Invoking this method prevents event from reaching any registered event listeners after the current one finishes running and, when dispatched in a tree, also prevents event from reaching any other objects.
    */
  def stopImmediatePropagation(): Unit = js.native
}

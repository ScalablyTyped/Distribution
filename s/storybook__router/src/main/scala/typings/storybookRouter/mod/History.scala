package typings.storybookRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A history is an interface to the navigation stack. The history serves as the
  * source of truth for the current location, as well as provides a set of
  * methods that may be used to change it.
  *
  * It is similar to the DOM's `window.history` object, but with a smaller, more
  * focused API.
  */
@js.native
trait History extends StObject {
  
  /**
    * The last action that modified the current location. This will always be
    * Action.Pop when a history instance is first created. This value is mutable.
    *
    * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#history.action
    */
  val action: Action = js.native
  
  /**
    * Navigates to the previous entry in the stack. Identical to go(-1).
    *
    * Warning: if the current location is the first location in the stack, this
    * will unload the current document.
    *
    * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#history.back
    */
  def back(): Unit = js.native
  
  /**
    * Prevents the current location from changing and sets up a listener that
    * will be called instead.
    *
    * @param blocker - A function that will be called when a transition is blocked
    * @returns unblock - A function that may be used to stop blocking
    *
    * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#history.block
    */
  def block(blocker: Blocker): js.Function0[Unit] = js.native
  
  /**
    * Returns a valid href for the given `to` value that may be used as
    * the value of an <a href> attribute.
    *
    * @param to - The destination URL
    *
    * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#history.createHref
    */
  def createHref(to: To): String = js.native
  
  /**
    * Navigates to the next entry in the stack. Identical to go(1).
    *
    * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#history.forward
    */
  def forward(): Unit = js.native
  
  /**
    * Navigates `n` entries backward/forward in the history stack relative to the
    * current index. For example, a "back" navigation would use go(-1).
    *
    * @param delta - The delta in the stack index
    *
    * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#history.go
    */
  def go(delta: Double): Unit = js.native
  
  /**
    * Sets up a listener that will be called whenever the current location
    * changes.
    *
    * @param listener - A function that will be called when the location changes
    * @returns unlisten - A function that may be used to stop listening
    *
    * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#history.listen
    */
  def listen(listener: Listener): js.Function0[Unit] = js.native
  
  /**
    * The current location. This value is mutable.
    *
    * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#history.location
    */
  val location: Location1 = js.native
  
  /**
    * Pushes a new location onto the history stack, increasing its length by one.
    * If there were any entries in the stack after the current one, they are
    * lost.
    *
    * @param to - The new URL
    * @param state - Data to associate with the new location
    *
    * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#history.push
    */
  def push(to: To): Unit = js.native
  def push(to: To, state: Any): Unit = js.native
  
  /**
    * Replaces the current location in the history stack with a new one.  The
    * location that was replaced will no longer be available.
    *
    * @param to - The new URL
    * @param state - Data to associate with the new location
    *
    * @see https://github.com/remix-run/history/tree/main/docs/api-reference.md#history.replace
    */
  def replace(to: To): Unit = js.native
  def replace(to: To, state: Any): Unit = js.native
}

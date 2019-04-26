package typings
package reactDashWaitLib.reactDashWaitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseWaitAPI extends js.Object {
  /**
    * Using Wait Component
    *
    * ```tsx
    * function Component() {
    *   const { Wait } = useWait();
    *   return (
    *     <Wait on="the waiting message" fallback={<div>Waiting...</div>}>
    *       The content after waiting done
    *     </Wait>
    *   );
    * }
    * ```
    *
    * Better example for a button with loading state:
    * ```tsx
    * <button disabled={isWaiting("creating user")}>
    *   <Wait on="creating user" fallback={<div>Creating User...</div>}>
    *     Create User
    *   </Wait>
    * </button>
    * ```
    */
  var Wait: reactLib.reactMod.ComponentType[WaitProps]
  /**
    * Returns boolean value if any loader exists in context.
    *
    * ```tsx
    * const { anyWaiting } = useWait();
    * return <button disabled={anyWaiting()}>Disabled while waiting</button>;
    * ```
    */
  def anyWaiting(): scala.Boolean
  /**
    * Stops the given waiter.
    *
    * ```tsx
    * const { end } = useWait();
    * return <button onClick={() => endWaiting("message")}>Stop</button>;
    * ```
    */
  def endWaiting(waiter: java.lang.String): scala.Unit
  /**
    * Returns boolean value if given loader exists in context.
    *
    * ```tsx
    * const { isWaiting } = useWait();
    * return (
    *   <button disabled={isWaiting("creating user")}>
    *     Disabled while creating user
    *   </button>
    * );
    * ```
    */
  def isWaiting(waiter: java.lang.String): scala.Boolean
  /**
    * Starts the given waiter.
    *
    * ```tsx
    * const { startWaiting } = useWait();
    * return <button onClick={() => startWaiting("message")}>Start</button>;
    * ```
    */
  def startWaiting(waiter: java.lang.String): scala.Unit
}

object UseWaitAPI {
  @scala.inline
  def apply(
    Wait: reactLib.reactMod.ComponentType[WaitProps],
    anyWaiting: () => scala.Boolean,
    endWaiting: java.lang.String => scala.Unit,
    isWaiting: java.lang.String => scala.Boolean,
    startWaiting: java.lang.String => scala.Unit
  ): UseWaitAPI = {
    val __obj = js.Dynamic.literal(Wait = Wait.asInstanceOf[js.Any], anyWaiting = js.Any.fromFunction0(anyWaiting), endWaiting = js.Any.fromFunction1(endWaiting), isWaiting = js.Any.fromFunction1(isWaiting), startWaiting = js.Any.fromFunction1(startWaiting))
  
    __obj.asInstanceOf[UseWaitAPI]
  }
}


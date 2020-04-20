package typings.reactWait.mod

import typings.react.mod.ComponentType
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
  var Wait: ComponentType[WaitProps]
  /**
    * Returns an array of waiters.
    */
  var waiters: js.Array[String]
  /**
    * Returns boolean value if any loader exists in context.
    *
    * ```tsx
    * const { anyWaiting } = useWait();
    * return <button disabled={anyWaiting()}>Disabled while waiting</button>;
    * ```
    */
  def anyWaiting(): Boolean
  /**
    * Creates a waiting context.
    *
    * ```tsx
    * const { startWaiting, endWaiting, isWaiting, Wait } = createWaitingContext("creating user");
    *  return (
    *   <button disabled={isWaiting()}>
    *     Disabled while creating user
    *   </button>
    * );
    * ```
    */
  def createWaitingContext(waiter: String): WaitingContext
  /**
    * Stops the given waiter.
    *
    * ```tsx
    * const { end } = useWait();
    * return <button onClick={() => endWaiting("message")}>Stop</button>;
    * ```
    */
  def endWaiting(waiter: String): Unit
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
  def isWaiting(waiter: String): Boolean
  /**
    * Starts the given waiter.
    *
    * ```tsx
    * const { startWaiting } = useWait();
    * return <button onClick={() => startWaiting("message")}>Start</button>;
    * ```
    */
  def startWaiting(waiter: String): Unit
}

object UseWaitAPI {
  @scala.inline
  def apply(
    Wait: ComponentType[WaitProps],
    anyWaiting: () => Boolean,
    createWaitingContext: String => WaitingContext,
    endWaiting: String => Unit,
    isWaiting: String => Boolean,
    startWaiting: String => Unit,
    waiters: js.Array[String]
  ): UseWaitAPI = {
    val __obj = js.Dynamic.literal(Wait = Wait.asInstanceOf[js.Any], anyWaiting = js.Any.fromFunction0(anyWaiting), createWaitingContext = js.Any.fromFunction1(createWaitingContext), endWaiting = js.Any.fromFunction1(endWaiting), isWaiting = js.Any.fromFunction1(isWaiting), startWaiting = js.Any.fromFunction1(startWaiting), waiters = waiters.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseWaitAPI]
  }
}


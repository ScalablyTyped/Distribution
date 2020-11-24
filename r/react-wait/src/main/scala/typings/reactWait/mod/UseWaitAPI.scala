package typings.reactWait.mod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var Wait: ComponentType[WaitProps] = js.native
  
  /**
    * Returns boolean value if any loader exists in context.
    *
    * ```tsx
    * const { anyWaiting } = useWait();
    * return <button disabled={anyWaiting()}>Disabled while waiting</button>;
    * ```
    */
  def anyWaiting(): Boolean = js.native
  
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
  def createWaitingContext(waiter: String): WaitingContext = js.native
  
  /**
    * Stops the given waiter.
    *
    * ```tsx
    * const { end } = useWait();
    * return <button onClick={() => endWaiting("message")}>Stop</button>;
    * ```
    */
  def endWaiting(waiter: String): Unit = js.native
  
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
  def isWaiting(waiter: String): Boolean = js.native
  
  /**
    * Starts the given waiter.
    *
    * ```tsx
    * const { startWaiting } = useWait();
    * return <button onClick={() => startWaiting("message")}>Start</button>;
    * ```
    */
  def startWaiting(waiter: String): Unit = js.native
  
  /**
    * Returns an array of waiters.
    */
  var waiters: js.Array[String] = js.native
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
  
  @scala.inline
  implicit class UseWaitAPIOps[Self <: UseWaitAPI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setWait(value: ComponentType[WaitProps]): Self = this.set("Wait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnyWaiting(value: () => Boolean): Self = this.set("anyWaiting", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateWaitingContext(value: String => WaitingContext): Self = this.set("createWaitingContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEndWaiting(value: String => Unit): Self = this.set("endWaiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsWaiting(value: String => Boolean): Self = this.set("isWaiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartWaiting(value: String => Unit): Self = this.set("startWaiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWaitersVarargs(value: String*): Self = this.set("waiters", js.Array(value :_*))
    
    @scala.inline
    def setWaiters(value: js.Array[String]): Self = this.set("waiters", value.asInstanceOf[js.Any])
  }
}

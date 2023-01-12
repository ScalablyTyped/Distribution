package typings.reactWait

import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactWait.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-wait", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-wait", "Waiter")
  @js.native
  val Waiter: FunctionComponent[Children] = js.native
  
  inline def useWait(): UseWaitAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("useWait")().asInstanceOf[UseWaitAPI]
  
  trait UseWaitAPI extends StObject {
    
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
    
    /**
      * Returns an array of waiters.
      */
    var waiters: js.Array[String]
  }
  object UseWaitAPI {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: UseWaitAPI] (val x: Self) extends AnyVal {
      
      inline def setAnyWaiting(value: () => Boolean): Self = StObject.set(x, "anyWaiting", js.Any.fromFunction0(value))
      
      inline def setCreateWaitingContext(value: String => WaitingContext): Self = StObject.set(x, "createWaitingContext", js.Any.fromFunction1(value))
      
      inline def setEndWaiting(value: String => Unit): Self = StObject.set(x, "endWaiting", js.Any.fromFunction1(value))
      
      inline def setIsWaiting(value: String => Boolean): Self = StObject.set(x, "isWaiting", js.Any.fromFunction1(value))
      
      inline def setStartWaiting(value: String => Unit): Self = StObject.set(x, "startWaiting", js.Any.fromFunction1(value))
      
      inline def setWait(value: ComponentType[WaitProps]): Self = StObject.set(x, "Wait", value.asInstanceOf[js.Any])
      
      inline def setWaiters(value: js.Array[String]): Self = StObject.set(x, "waiters", value.asInstanceOf[js.Any])
      
      inline def setWaitersVarargs(value: String*): Self = StObject.set(x, "waiters", js.Array(value*))
    }
  }
  
  trait WaitProps
    extends StObject
       with WaitingContextWaitProps {
    
    var on: String
  }
  object WaitProps {
    
    inline def apply(fallback: Element, on: String): WaitProps = {
      val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
      __obj.asInstanceOf[WaitProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WaitProps] (val x: Self) extends AnyVal {
      
      inline def setOn(value: String): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    }
  }
  
  trait WaitingContext extends StObject {
    
    var Wait: ComponentType[WaitingContextWaitProps]
    
    def endWaiting(): Unit
    
    def isWaiting(): Boolean
    
    def startWaiting(): Unit
  }
  object WaitingContext {
    
    inline def apply(
      Wait: ComponentType[WaitingContextWaitProps],
      endWaiting: () => Unit,
      isWaiting: () => Boolean,
      startWaiting: () => Unit
    ): WaitingContext = {
      val __obj = js.Dynamic.literal(Wait = Wait.asInstanceOf[js.Any], endWaiting = js.Any.fromFunction0(endWaiting), isWaiting = js.Any.fromFunction0(isWaiting), startWaiting = js.Any.fromFunction0(startWaiting))
      __obj.asInstanceOf[WaitingContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WaitingContext] (val x: Self) extends AnyVal {
      
      inline def setEndWaiting(value: () => Unit): Self = StObject.set(x, "endWaiting", js.Any.fromFunction0(value))
      
      inline def setIsWaiting(value: () => Boolean): Self = StObject.set(x, "isWaiting", js.Any.fromFunction0(value))
      
      inline def setStartWaiting(value: () => Unit): Self = StObject.set(x, "startWaiting", js.Any.fromFunction0(value))
      
      inline def setWait(value: ComponentType[WaitingContextWaitProps]): Self = StObject.set(x, "Wait", value.asInstanceOf[js.Any])
    }
  }
  
  trait WaitingContextWaitProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var fallback: Element
  }
  object WaitingContextWaitProps {
    
    inline def apply(fallback: Element): WaitingContextWaitProps = {
      val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any])
      __obj.asInstanceOf[WaitingContextWaitProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WaitingContextWaitProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setFallback(value: Element): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    }
  }
}

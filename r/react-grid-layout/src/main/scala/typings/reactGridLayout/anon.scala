package typings.reactGridLayout

import typings.std.DOMHighResTimeStamp
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait H extends StObject {
    
    var h: Double
    
    var i: String
    
    var w: Double
  }
  object H {
    
    inline def apply(h: Double, i: String, w: Double): H = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
      __obj.asInstanceOf[H]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: H] (val x: Self) extends AnyVal {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setI(value: String): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    }
  }
  
  trait W extends StObject {
    
    var h: js.UndefOr[Double] = js.undefined
    
    var w: js.UndefOr[Double] = js.undefined
  }
  object W {
    
    inline def apply(): W = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[W]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: W] (val x: Self) extends AnyVal {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    }
  }
  
  /* Inlined {  layerX :number,   layerY :number} & std.Event */
  @js.native
  trait layerXnumberlayerYnumberE extends StObject {
    
    /* standard dom */
    val AT_TARGET: Double = js.native
    
    /* standard dom */
    val BUBBLING_PHASE: Double = js.native
    
    /* standard dom */
    val CAPTURING_PHASE: Double = js.native
    
    /* standard dom */
    val NONE: Double = js.native
    
    /** Returns true or false depending on how event was initialized. True if event goes through its target's ancestors in reverse tree order, and false otherwise. */
    /* standard dom */
    val bubbles: Boolean = js.native
    
    /** @deprecated */
    /* standard dom */
    var cancelBubble: Boolean = js.native
    
    /** Returns true or false depending on how event was initialized. Its return value does not always carry meaning, but true can indicate that part of the operation during which event was dispatched, can be canceled by invoking the preventDefault() method. */
    /* standard dom */
    val cancelable: Boolean = js.native
    
    /** Returns true or false depending on how event was initialized. True if event invokes listeners past a ShadowRoot node that is the root of its target, and false otherwise. */
    /* standard dom */
    val composed: Boolean = js.native
    
    /** Returns the invocation target objects of event's path (objects on which listeners will be invoked), except for any nodes in shadow trees of which the shadow root's mode is "closed" that are not reachable from event's currentTarget. */
    /* standard dom */
    def composedPath(): js.Array[EventTarget] = js.native
    
    /** Returns the object whose event listener's callback is currently being invoked. */
    /* standard dom */
    val currentTarget: EventTarget | Null = js.native
    
    /** Returns true if preventDefault() was invoked successfully to indicate cancelation, and false otherwise. */
    /* standard dom */
    val defaultPrevented: Boolean = js.native
    
    /** Returns the event's phase, which is one of NONE, CAPTURING_PHASE, AT_TARGET, and BUBBLING_PHASE. */
    /* standard dom */
    val eventPhase: Double = js.native
    
    /** @deprecated */
    /* standard dom */
    def initEvent(`type`: String): Unit = js.native
    def initEvent(`type`: String, bubbles: Boolean): Unit = js.native
    def initEvent(`type`: String, bubbles: Boolean, cancelable: Boolean): Unit = js.native
    def initEvent(`type`: String, bubbles: Unit, cancelable: Boolean): Unit = js.native
    
    /** Returns true if event was dispatched by the user agent, and false otherwise. */
    /* standard dom */
    val isTrusted: Boolean = js.native
    
    var layerX: Double = js.native
    
    var layerY: Double = js.native
    
    /** If invoked when the cancelable attribute value is true, and while executing a listener for the event with passive set to false, signals to the operation that caused event to be dispatched that it needs to be canceled. */
    /* standard dom */
    def preventDefault(): Unit = js.native
    
    /** @deprecated */
    /* standard dom */
    var returnValue: Boolean = js.native
    
    /** @deprecated */
    /* standard dom */
    val srcElement: EventTarget | Null = js.native
    
    /** Invoking this method prevents event from reaching any registered event listeners after the current one finishes running and, when dispatched in a tree, also prevents event from reaching any other objects. */
    /* standard dom */
    def stopImmediatePropagation(): Unit = js.native
    
    /** When dispatched in a tree, invoking this method prevents event from reaching any objects other than the current object. */
    /* standard dom */
    def stopPropagation(): Unit = js.native
    
    /** Returns the object to which event is dispatched (its target). */
    /* standard dom */
    val target: EventTarget | Null = js.native
    
    /** Returns the event's timestamp as the number of milliseconds measured relative to the time origin. */
    /* standard dom */
    val timeStamp: DOMHighResTimeStamp = js.native
    
    /** Returns the type of event, e.g. "click", "hashchange", or "submit". */
    /* standard dom */
    val `type`: String = js.native
  }
}

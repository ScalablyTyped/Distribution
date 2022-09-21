package typings.simperium.mod

import typings.node.eventsMod.EventEmitter
import typings.simperium.simperiumStrings.AT_TARGET
import typings.simperium.simperiumStrings.BUBBLING_PHASE
import typings.simperium.simperiumStrings.CAPTURING_PHASE
import typings.simperium.simperiumStrings.NONE
import typings.simperium.simperiumStrings.`type`
import typings.simperium.simperiumStrings.bubbles
import typings.simperium.simperiumStrings.cancelBubble
import typings.simperium.simperiumStrings.cancelable
import typings.simperium.simperiumStrings.composed
import typings.simperium.simperiumStrings.composedPath
import typings.simperium.simperiumStrings.currentTarget
import typings.simperium.simperiumStrings.defaultPrevented
import typings.simperium.simperiumStrings.eventPhase
import typings.simperium.simperiumStrings.initEvent
import typings.simperium.simperiumStrings.isTrusted
import typings.simperium.simperiumStrings.preventDefault
import typings.simperium.simperiumStrings.returnValue
import typings.simperium.simperiumStrings.srcElement
import typings.simperium.simperiumStrings.stopImmediatePropagation
import typings.simperium.simperiumStrings.stopPropagation
import typings.simperium.simperiumStrings.target
import typings.simperium.simperiumStrings.timeStamp
import typings.std.DOMHighResTimeStamp
import typings.std.EventTarget
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomEventEmitter[Event /* <: SimperiumEvent */] extends EventEmitter {
  
  @JSName("addListener")
  def addListener_ATTARGET(`type`: AT_TARGET, callback: Double): this.type = js.native
  @JSName("addListener")
  def addListener_BUBBLINGPHASE(`type`: BUBBLING_PHASE, callback: Double): this.type = js.native
  @JSName("addListener")
  def addListener_CAPTURINGPHASE(`type`: CAPTURING_PHASE, callback: Double): this.type = js.native
  @JSName("addListener")
  def addListener_NONE(`type`: NONE, callback: Double): this.type = js.native
  @JSName("addListener")
  def addListener_bubbles(`type`: bubbles, callback: Boolean): this.type = js.native
  @JSName("addListener")
  def addListener_cancelBubble(`type`: cancelBubble, callback: Boolean): this.type = js.native
  @JSName("addListener")
  def addListener_cancelable(`type`: cancelable, callback: Boolean): this.type = js.native
  @JSName("addListener")
  def addListener_composed(`type`: composed, callback: Boolean): this.type = js.native
  @JSName("addListener")
  def addListener_currentTarget(`type`: currentTarget): this.type = js.native
  @JSName("addListener")
  def addListener_currentTarget(`type`: currentTarget, callback: EventTarget): this.type = js.native
  @JSName("addListener")
  def addListener_defaultPrevented(`type`: defaultPrevented, callback: Boolean): this.type = js.native
  @JSName("addListener")
  def addListener_eventPhase(`type`: eventPhase, callback: Double): this.type = js.native
  @JSName("addListener")
  def addListener_isTrusted(`type`: isTrusted, callback: Boolean): this.type = js.native
  @JSName("addListener")
  def addListener_returnValue(`type`: returnValue, callback: Boolean): this.type = js.native
  @JSName("addListener")
  def addListener_srcElement(`type`: srcElement): this.type = js.native
  @JSName("addListener")
  def addListener_srcElement(`type`: srcElement, callback: EventTarget): this.type = js.native
  @JSName("addListener")
  def addListener_target(`type`: target): this.type = js.native
  @JSName("addListener")
  def addListener_target(`type`: target, callback: EventTarget): this.type = js.native
  @JSName("addListener")
  def addListener_timeStamp(`type`: timeStamp, callback: DOMHighResTimeStamp): this.type = js.native
  @JSName("addListener")
  def addListener_type(`type`: `type`, callback: String): this.type = js.native
  
  @JSName("emit")
  def emit_ATTARGET(
    `type`: AT_TARGET,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Event[U]> is not an array type */ args: Parameters[Double]
  ): Boolean = js.native
  @JSName("emit")
  def emit_BUBBLINGPHASE(
    `type`: BUBBLING_PHASE,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Event[U]> is not an array type */ args: Parameters[Double]
  ): Boolean = js.native
  @JSName("emit")
  def emit_CAPTURINGPHASE(
    `type`: CAPTURING_PHASE,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Event[U]> is not an array type */ args: Parameters[Double]
  ): Boolean = js.native
  @JSName("emit")
  def emit_NONE(
    `type`: NONE,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Event[U]> is not an array type */ args: Parameters[Double]
  ): Boolean = js.native
  @JSName("emit")
  def emit_bubbles(
    `type`: bubbles,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Event[U]> is not an array type */ args: Parameters[Boolean]
  ): Boolean = js.native
  @JSName("emit")
  def emit_cancelBubble(
    `type`: cancelBubble,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Event[U]> is not an array type */ args: Parameters[Boolean]
  ): Boolean = js.native
  @JSName("emit")
  def emit_cancelable(
    `type`: cancelable,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Event[U]> is not an array type */ args: Parameters[Boolean]
  ): Boolean = js.native
  @JSName("emit")
  def emit_composed(
    `type`: composed,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Event[U]> is not an array type */ args: Parameters[Boolean]
  ): Boolean = js.native
  @JSName("emit")
  def emit_currentTarget(
    `type`: currentTarget,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Event[U]> is not an array type */ args: Parameters[EventTarget | Null]
  ): Boolean = js.native
  @JSName("emit")
  def emit_defaultPrevented(
    `type`: defaultPrevented,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Event[U]> is not an array type */ args: Parameters[Boolean]
  ): Boolean = js.native
  @JSName("emit")
  def emit_eventPhase(
    `type`: eventPhase,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Event[U]> is not an array type */ args: Parameters[Double]
  ): Boolean = js.native
  @JSName("emit")
  def emit_isTrusted(
    `type`: isTrusted,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Event[U]> is not an array type */ args: Parameters[Boolean]
  ): Boolean = js.native
  @JSName("emit")
  def emit_returnValue(
    `type`: returnValue,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Event[U]> is not an array type */ args: Parameters[Boolean]
  ): Boolean = js.native
  @JSName("emit")
  def emit_srcElement(
    `type`: srcElement,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Event[U]> is not an array type */ args: Parameters[EventTarget | Null]
  ): Boolean = js.native
  @JSName("emit")
  def emit_target(
    `type`: target,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Event[U]> is not an array type */ args: Parameters[EventTarget | Null]
  ): Boolean = js.native
  @JSName("emit")
  def emit_timeStamp(
    `type`: timeStamp,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Event[U]> is not an array type */ args: Parameters[DOMHighResTimeStamp]
  ): Boolean = js.native
  @JSName("emit")
  def emit_type(
    `type`: `type`,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Event[U]> is not an array type */ args: Parameters[String]
  ): Boolean = js.native
  
  def listenerCount(
    `type`: /* keyof Event */ bubbles | cancelBubble | cancelable | composed | currentTarget | defaultPrevented | eventPhase | isTrusted | returnValue | srcElement | target | timeStamp | `type` | composedPath | initEvent | preventDefault | stopImmediatePropagation | stopPropagation | AT_TARGET | BUBBLING_PHASE | CAPTURING_PHASE | NONE
  ): Double = js.native
  
  @JSName("listeners")
  def listeners_ATTARGET(`type`: AT_TARGET): js.Array[Double] = js.native
  @JSName("listeners")
  def listeners_BUBBLINGPHASE(`type`: BUBBLING_PHASE): js.Array[Double] = js.native
  @JSName("listeners")
  def listeners_CAPTURINGPHASE(`type`: CAPTURING_PHASE): js.Array[Double] = js.native
  @JSName("listeners")
  def listeners_NONE(`type`: NONE): js.Array[Double] = js.native
  @JSName("listeners")
  def listeners_bubbles(`type`: bubbles): js.Array[Boolean] = js.native
  @JSName("listeners")
  def listeners_cancelBubble(`type`: cancelBubble): js.Array[Boolean] = js.native
  @JSName("listeners")
  def listeners_cancelable(`type`: cancelable): js.Array[Boolean] = js.native
  @JSName("listeners")
  def listeners_composed(`type`: composed): js.Array[Boolean] = js.native
  @JSName("listeners")
  def listeners_currentTarget(`type`: currentTarget): js.Array[EventTarget | Null] = js.native
  @JSName("listeners")
  def listeners_defaultPrevented(`type`: defaultPrevented): js.Array[Boolean] = js.native
  @JSName("listeners")
  def listeners_eventPhase(`type`: eventPhase): js.Array[Double] = js.native
  @JSName("listeners")
  def listeners_isTrusted(`type`: isTrusted): js.Array[Boolean] = js.native
  @JSName("listeners")
  def listeners_returnValue(`type`: returnValue): js.Array[Boolean] = js.native
  @JSName("listeners")
  def listeners_srcElement(`type`: srcElement): js.Array[EventTarget | Null] = js.native
  @JSName("listeners")
  def listeners_target(`type`: target): js.Array[EventTarget | Null] = js.native
  @JSName("listeners")
  def listeners_timeStamp(`type`: timeStamp): js.Array[DOMHighResTimeStamp] = js.native
  @JSName("listeners")
  def listeners_type(`type`: `type`): js.Array[String] = js.native
  
  @JSName("off")
  def off_ATTARGET(`type`: AT_TARGET, callback: Double): this.type = js.native
  @JSName("off")
  def off_BUBBLINGPHASE(`type`: BUBBLING_PHASE, callback: Double): this.type = js.native
  @JSName("off")
  def off_CAPTURINGPHASE(`type`: CAPTURING_PHASE, callback: Double): this.type = js.native
  @JSName("off")
  def off_NONE(`type`: NONE, callback: Double): this.type = js.native
  @JSName("off")
  def off_bubbles(`type`: bubbles, callback: Boolean): this.type = js.native
  @JSName("off")
  def off_cancelBubble(`type`: cancelBubble, callback: Boolean): this.type = js.native
  @JSName("off")
  def off_cancelable(`type`: cancelable, callback: Boolean): this.type = js.native
  @JSName("off")
  def off_composed(`type`: composed, callback: Boolean): this.type = js.native
  @JSName("off")
  def off_currentTarget(`type`: currentTarget): this.type = js.native
  @JSName("off")
  def off_currentTarget(`type`: currentTarget, callback: EventTarget): this.type = js.native
  @JSName("off")
  def off_defaultPrevented(`type`: defaultPrevented, callback: Boolean): this.type = js.native
  @JSName("off")
  def off_eventPhase(`type`: eventPhase, callback: Double): this.type = js.native
  @JSName("off")
  def off_isTrusted(`type`: isTrusted, callback: Boolean): this.type = js.native
  @JSName("off")
  def off_returnValue(`type`: returnValue, callback: Boolean): this.type = js.native
  @JSName("off")
  def off_srcElement(`type`: srcElement): this.type = js.native
  @JSName("off")
  def off_srcElement(`type`: srcElement, callback: EventTarget): this.type = js.native
  @JSName("off")
  def off_target(`type`: target): this.type = js.native
  @JSName("off")
  def off_target(`type`: target, callback: EventTarget): this.type = js.native
  @JSName("off")
  def off_timeStamp(`type`: timeStamp, callback: DOMHighResTimeStamp): this.type = js.native
  @JSName("off")
  def off_type(`type`: `type`, callback: String): this.type = js.native
  
  @JSName("on")
  def on_ATTARGET(`type`: AT_TARGET, callback: Double): this.type = js.native
  @JSName("on")
  def on_BUBBLINGPHASE(`type`: BUBBLING_PHASE, callback: Double): this.type = js.native
  @JSName("on")
  def on_CAPTURINGPHASE(`type`: CAPTURING_PHASE, callback: Double): this.type = js.native
  @JSName("on")
  def on_NONE(`type`: NONE, callback: Double): this.type = js.native
  @JSName("on")
  def on_bubbles(`type`: bubbles, callback: Boolean): this.type = js.native
  @JSName("on")
  def on_cancelBubble(`type`: cancelBubble, callback: Boolean): this.type = js.native
  @JSName("on")
  def on_cancelable(`type`: cancelable, callback: Boolean): this.type = js.native
  @JSName("on")
  def on_composed(`type`: composed, callback: Boolean): this.type = js.native
  @JSName("on")
  def on_currentTarget(`type`: currentTarget): this.type = js.native
  @JSName("on")
  def on_currentTarget(`type`: currentTarget, callback: EventTarget): this.type = js.native
  @JSName("on")
  def on_defaultPrevented(`type`: defaultPrevented, callback: Boolean): this.type = js.native
  @JSName("on")
  def on_eventPhase(`type`: eventPhase, callback: Double): this.type = js.native
  @JSName("on")
  def on_isTrusted(`type`: isTrusted, callback: Boolean): this.type = js.native
  @JSName("on")
  def on_returnValue(`type`: returnValue, callback: Boolean): this.type = js.native
  @JSName("on")
  def on_srcElement(`type`: srcElement): this.type = js.native
  @JSName("on")
  def on_srcElement(`type`: srcElement, callback: EventTarget): this.type = js.native
  @JSName("on")
  def on_target(`type`: target): this.type = js.native
  @JSName("on")
  def on_target(`type`: target, callback: EventTarget): this.type = js.native
  @JSName("on")
  def on_timeStamp(`type`: timeStamp, callback: DOMHighResTimeStamp): this.type = js.native
  @JSName("on")
  def on_type(`type`: `type`, callback: String): this.type = js.native
  
  @JSName("once")
  def once_ATTARGET(`type`: AT_TARGET, callback: Double): this.type = js.native
  @JSName("once")
  def once_BUBBLINGPHASE(`type`: BUBBLING_PHASE, callback: Double): this.type = js.native
  @JSName("once")
  def once_CAPTURINGPHASE(`type`: CAPTURING_PHASE, callback: Double): this.type = js.native
  @JSName("once")
  def once_NONE(`type`: NONE, callback: Double): this.type = js.native
  @JSName("once")
  def once_bubbles(`type`: bubbles, callback: Boolean): this.type = js.native
  @JSName("once")
  def once_cancelBubble(`type`: cancelBubble, callback: Boolean): this.type = js.native
  @JSName("once")
  def once_cancelable(`type`: cancelable, callback: Boolean): this.type = js.native
  @JSName("once")
  def once_composed(`type`: composed, callback: Boolean): this.type = js.native
  @JSName("once")
  def once_currentTarget(`type`: currentTarget): this.type = js.native
  @JSName("once")
  def once_currentTarget(`type`: currentTarget, callback: EventTarget): this.type = js.native
  @JSName("once")
  def once_defaultPrevented(`type`: defaultPrevented, callback: Boolean): this.type = js.native
  @JSName("once")
  def once_eventPhase(`type`: eventPhase, callback: Double): this.type = js.native
  @JSName("once")
  def once_isTrusted(`type`: isTrusted, callback: Boolean): this.type = js.native
  @JSName("once")
  def once_returnValue(`type`: returnValue, callback: Boolean): this.type = js.native
  @JSName("once")
  def once_srcElement(`type`: srcElement): this.type = js.native
  @JSName("once")
  def once_srcElement(`type`: srcElement, callback: EventTarget): this.type = js.native
  @JSName("once")
  def once_target(`type`: target): this.type = js.native
  @JSName("once")
  def once_target(`type`: target, callback: EventTarget): this.type = js.native
  @JSName("once")
  def once_timeStamp(`type`: timeStamp, callback: DOMHighResTimeStamp): this.type = js.native
  @JSName("once")
  def once_type(`type`: `type`, callback: String): this.type = js.native
  
  @JSName("prependListener")
  def prependListener_ATTARGET(`type`: AT_TARGET, callback: Double): this.type = js.native
  @JSName("prependListener")
  def prependListener_BUBBLINGPHASE(`type`: BUBBLING_PHASE, callback: Double): this.type = js.native
  @JSName("prependListener")
  def prependListener_CAPTURINGPHASE(`type`: CAPTURING_PHASE, callback: Double): this.type = js.native
  @JSName("prependListener")
  def prependListener_NONE(`type`: NONE, callback: Double): this.type = js.native
  @JSName("prependListener")
  def prependListener_bubbles(`type`: bubbles, callback: Boolean): this.type = js.native
  @JSName("prependListener")
  def prependListener_cancelBubble(`type`: cancelBubble, callback: Boolean): this.type = js.native
  @JSName("prependListener")
  def prependListener_cancelable(`type`: cancelable, callback: Boolean): this.type = js.native
  @JSName("prependListener")
  def prependListener_composed(`type`: composed, callback: Boolean): this.type = js.native
  @JSName("prependListener")
  def prependListener_currentTarget(`type`: currentTarget): this.type = js.native
  @JSName("prependListener")
  def prependListener_currentTarget(`type`: currentTarget, callback: EventTarget): this.type = js.native
  @JSName("prependListener")
  def prependListener_defaultPrevented(`type`: defaultPrevented, callback: Boolean): this.type = js.native
  @JSName("prependListener")
  def prependListener_eventPhase(`type`: eventPhase, callback: Double): this.type = js.native
  @JSName("prependListener")
  def prependListener_isTrusted(`type`: isTrusted, callback: Boolean): this.type = js.native
  @JSName("prependListener")
  def prependListener_returnValue(`type`: returnValue, callback: Boolean): this.type = js.native
  @JSName("prependListener")
  def prependListener_srcElement(`type`: srcElement): this.type = js.native
  @JSName("prependListener")
  def prependListener_srcElement(`type`: srcElement, callback: EventTarget): this.type = js.native
  @JSName("prependListener")
  def prependListener_target(`type`: target): this.type = js.native
  @JSName("prependListener")
  def prependListener_target(`type`: target, callback: EventTarget): this.type = js.native
  @JSName("prependListener")
  def prependListener_timeStamp(`type`: timeStamp, callback: DOMHighResTimeStamp): this.type = js.native
  @JSName("prependListener")
  def prependListener_type(`type`: `type`, callback: String): this.type = js.native
  
  @JSName("prependOnceListener")
  def prependOnceListener_ATTARGET(`type`: AT_TARGET, callback: Double): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_BUBBLINGPHASE(`type`: BUBBLING_PHASE, callback: Double): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_CAPTURINGPHASE(`type`: CAPTURING_PHASE, callback: Double): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_NONE(`type`: NONE, callback: Double): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_bubbles(`type`: bubbles, callback: Boolean): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_cancelBubble(`type`: cancelBubble, callback: Boolean): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_cancelable(`type`: cancelable, callback: Boolean): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_composed(`type`: composed, callback: Boolean): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_currentTarget(`type`: currentTarget): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_currentTarget(`type`: currentTarget, callback: EventTarget): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_defaultPrevented(`type`: defaultPrevented, callback: Boolean): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_eventPhase(`type`: eventPhase, callback: Double): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_isTrusted(`type`: isTrusted, callback: Boolean): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_returnValue(`type`: returnValue, callback: Boolean): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_srcElement(`type`: srcElement): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_srcElement(`type`: srcElement, callback: EventTarget): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_target(`type`: target): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_target(`type`: target, callback: EventTarget): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_timeStamp(`type`: timeStamp, callback: DOMHighResTimeStamp): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_type(`type`: `type`, callback: String): this.type = js.native
  
  @JSName("rawListeners")
  def rawListeners_ATTARGET(`type`: AT_TARGET): js.Array[Double] = js.native
  @JSName("rawListeners")
  def rawListeners_BUBBLINGPHASE(`type`: BUBBLING_PHASE): js.Array[Double] = js.native
  @JSName("rawListeners")
  def rawListeners_CAPTURINGPHASE(`type`: CAPTURING_PHASE): js.Array[Double] = js.native
  @JSName("rawListeners")
  def rawListeners_NONE(`type`: NONE): js.Array[Double] = js.native
  @JSName("rawListeners")
  def rawListeners_bubbles(`type`: bubbles): js.Array[Boolean] = js.native
  @JSName("rawListeners")
  def rawListeners_cancelBubble(`type`: cancelBubble): js.Array[Boolean] = js.native
  @JSName("rawListeners")
  def rawListeners_cancelable(`type`: cancelable): js.Array[Boolean] = js.native
  @JSName("rawListeners")
  def rawListeners_composed(`type`: composed): js.Array[Boolean] = js.native
  @JSName("rawListeners")
  def rawListeners_currentTarget(`type`: currentTarget): js.Array[EventTarget | Null] = js.native
  @JSName("rawListeners")
  def rawListeners_defaultPrevented(`type`: defaultPrevented): js.Array[Boolean] = js.native
  @JSName("rawListeners")
  def rawListeners_eventPhase(`type`: eventPhase): js.Array[Double] = js.native
  @JSName("rawListeners")
  def rawListeners_isTrusted(`type`: isTrusted): js.Array[Boolean] = js.native
  @JSName("rawListeners")
  def rawListeners_returnValue(`type`: returnValue): js.Array[Boolean] = js.native
  @JSName("rawListeners")
  def rawListeners_srcElement(`type`: srcElement): js.Array[EventTarget | Null] = js.native
  @JSName("rawListeners")
  def rawListeners_target(`type`: target): js.Array[EventTarget | Null] = js.native
  @JSName("rawListeners")
  def rawListeners_timeStamp(`type`: timeStamp): js.Array[DOMHighResTimeStamp] = js.native
  @JSName("rawListeners")
  def rawListeners_type(`type`: `type`): js.Array[String] = js.native
  
  def removeAllListeners(
    `type`: /* keyof Event */ bubbles | cancelBubble | cancelable | composed | currentTarget | defaultPrevented | eventPhase | isTrusted | returnValue | srcElement | target | timeStamp | `type` | composedPath | initEvent | preventDefault | stopImmediatePropagation | stopPropagation | AT_TARGET | BUBBLING_PHASE | CAPTURING_PHASE | NONE
  ): this.type = js.native
  
  @JSName("removeListener")
  def removeListener_ATTARGET(`type`: AT_TARGET, callback: Double): this.type = js.native
  @JSName("removeListener")
  def removeListener_BUBBLINGPHASE(`type`: BUBBLING_PHASE, callback: Double): this.type = js.native
  @JSName("removeListener")
  def removeListener_CAPTURINGPHASE(`type`: CAPTURING_PHASE, callback: Double): this.type = js.native
  @JSName("removeListener")
  def removeListener_NONE(`type`: NONE, callback: Double): this.type = js.native
  @JSName("removeListener")
  def removeListener_bubbles(`type`: bubbles, callback: Boolean): this.type = js.native
  @JSName("removeListener")
  def removeListener_cancelBubble(`type`: cancelBubble, callback: Boolean): this.type = js.native
  @JSName("removeListener")
  def removeListener_cancelable(`type`: cancelable, callback: Boolean): this.type = js.native
  @JSName("removeListener")
  def removeListener_composed(`type`: composed, callback: Boolean): this.type = js.native
  @JSName("removeListener")
  def removeListener_currentTarget(`type`: currentTarget): this.type = js.native
  @JSName("removeListener")
  def removeListener_currentTarget(`type`: currentTarget, callback: EventTarget): this.type = js.native
  @JSName("removeListener")
  def removeListener_defaultPrevented(`type`: defaultPrevented, callback: Boolean): this.type = js.native
  @JSName("removeListener")
  def removeListener_eventPhase(`type`: eventPhase, callback: Double): this.type = js.native
  @JSName("removeListener")
  def removeListener_isTrusted(`type`: isTrusted, callback: Boolean): this.type = js.native
  @JSName("removeListener")
  def removeListener_returnValue(`type`: returnValue, callback: Boolean): this.type = js.native
  @JSName("removeListener")
  def removeListener_srcElement(`type`: srcElement): this.type = js.native
  @JSName("removeListener")
  def removeListener_srcElement(`type`: srcElement, callback: EventTarget): this.type = js.native
  @JSName("removeListener")
  def removeListener_target(`type`: target): this.type = js.native
  @JSName("removeListener")
  def removeListener_target(`type`: target, callback: EventTarget): this.type = js.native
  @JSName("removeListener")
  def removeListener_timeStamp(`type`: timeStamp, callback: DOMHighResTimeStamp): this.type = js.native
  @JSName("removeListener")
  def removeListener_type(`type`: `type`, callback: String): this.type = js.native
}

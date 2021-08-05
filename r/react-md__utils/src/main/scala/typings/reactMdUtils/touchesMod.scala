package typings.reactMdUtils

import typings.std.AddEventListenerOptions
import typings.std.HTMLElement
import typings.std.TouchEvent
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object touchesMod {
  
  @JSImport("@react-md/utils/types/events/touches", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addTouchEvent(
    /**
    * The element to add the touch event to.
    */
  el: HTMLElement,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addTouchEvent(
    /**
    * The element to add the touch event to.
    */
  el: HTMLElement,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addTouchEvent(
    /**
    * The element to add the touch event to.
    */
  el: HTMLElement,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean,
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addTouchEvent(
    /**
    * The element to add the touch event to.
    */
  el: HTMLElement,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Unit,
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addTouchEvent(
    /**
    * The element to add the touch event to.
    */
  el: Window,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addTouchEvent(
    /**
    * The element to add the touch event to.
    */
  el: Window,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addTouchEvent(
    /**
    * The element to add the touch event to.
    */
  el: Window,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean,
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addTouchEvent(
    /**
    * The element to add the touch event to.
    */
  el: Window,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Unit,
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeTouchEvent(
    el: HTMLElement,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeTouchEvent(
    el: HTMLElement,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeTouchEvent(
    el: HTMLElement,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean,
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeTouchEvent(
    el: HTMLElement,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Unit,
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeTouchEvent(
    el: Window,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeTouchEvent(
    el: Window,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeTouchEvent(
    el: Window,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean,
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeTouchEvent(
    el: Window,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Unit,
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setTouchEvent(
    /**
    * Boolean if the event should be added or removed.
    */
  add: Boolean,
    /**
    * The element to add the touch event to.
    */
  el: HTMLElement,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTouchEvent")(add.asInstanceOf[js.Any], el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setTouchEvent(
    /**
    * Boolean if the event should be added or removed.
    */
  add: Boolean,
    /**
    * The element to add the touch event to.
    */
  el: HTMLElement,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTouchEvent")(add.asInstanceOf[js.Any], el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setTouchEvent(
    /**
    * Boolean if the event should be added or removed.
    */
  add: Boolean,
    /**
    * The element to add the touch event to.
    */
  el: HTMLElement,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean,
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTouchEvent")(add.asInstanceOf[js.Any], el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setTouchEvent(
    /**
    * Boolean if the event should be added or removed.
    */
  add: Boolean,
    /**
    * The element to add the touch event to.
    */
  el: HTMLElement,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Unit,
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTouchEvent")(add.asInstanceOf[js.Any], el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setTouchEvent(
    /**
    * Boolean if the event should be added or removed.
    */
  add: Boolean,
    /**
    * The element to add the touch event to.
    */
  el: Window,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTouchEvent")(add.asInstanceOf[js.Any], el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setTouchEvent(
    /**
    * Boolean if the event should be added or removed.
    */
  add: Boolean,
    /**
    * The element to add the touch event to.
    */
  el: Window,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTouchEvent")(add.asInstanceOf[js.Any], el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setTouchEvent(
    /**
    * Boolean if the event should be added or removed.
    */
  add: Boolean,
    /**
    * The element to add the touch event to.
    */
  el: Window,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean,
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTouchEvent")(add.asInstanceOf[js.Any], el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setTouchEvent(
    /**
    * Boolean if the event should be added or removed.
    */
  add: Boolean,
    /**
    * The element to add the touch event to.
    */
  el: Window,
    /**
    * One of the touch types to modify.
    */
  eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Unit,
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTouchEvent")(add.asInstanceOf[js.Any], el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], capture.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdUtils.reactMdUtilsStrings.start
    - typings.reactMdUtils.reactMdUtilsStrings.end
    - typings.reactMdUtils.reactMdUtilsStrings.cancel
    - typings.reactMdUtils.reactMdUtilsStrings.move
  */
  trait TouchTypes extends StObject
  object TouchTypes {
    
    inline def cancel: typings.reactMdUtils.reactMdUtilsStrings.cancel = "cancel".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.cancel]
    
    inline def end: typings.reactMdUtils.reactMdUtilsStrings.end = "end".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.end]
    
    inline def move: typings.reactMdUtils.reactMdUtilsStrings.move = "move".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.move]
    
    inline def start: typings.reactMdUtils.reactMdUtilsStrings.start = "start".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.start]
  }
}

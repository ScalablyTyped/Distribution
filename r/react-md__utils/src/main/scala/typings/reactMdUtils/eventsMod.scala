package typings.reactMdUtils

import typings.reactMdUtils.delegateEventMod.DelegatedEventHandler
import typings.reactMdUtils.delegateEventMod.DelegatedEventTarget
import typings.reactMdUtils.scrollListenerMod.ScrollListenerProps
import typings.reactMdUtils.touchesMod.TouchTypes
import typings.reactMdUtils.useScrollListenerMod.Options
import typings.std.AddEventListenerOptions
import typings.std.HTMLElement
import typings.std.TouchEvent
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  @JSImport("@react-md/utils/types/events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object PassiveEvents {
    
    @JSImport("@react-md/utils/types/events", "PassiveEvents")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-md/utils/types/events", "PassiveEvents.isSupported")
    @js.native
    def isSupported: Boolean = js.native
    @scala.inline
    def isSupported_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSupported")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def update(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("update")().asInstanceOf[Boolean]
  }
  
  @scala.inline
  def ScrollListener(props: ScrollListenerProps): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("ScrollListener")(props.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  @scala.inline
  def addTouchEvent(
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
  @scala.inline
  def addTouchEvent(
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
  @scala.inline
  def addTouchEvent(
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
  @scala.inline
  def addTouchEvent(
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
  @scala.inline
  def addTouchEvent(
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
  @scala.inline
  def addTouchEvent(
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
  @scala.inline
  def addTouchEvent(
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
  @scala.inline
  def addTouchEvent(
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
  
  @scala.inline
  def delegateEvent(eventType: String): DelegatedEventHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[DelegatedEventHandler]
  @scala.inline
  def delegateEvent(eventType: String, eventTarget: Unit, throttle: Boolean): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  @scala.inline
  def delegateEvent(eventType: String, eventTarget: Unit, throttle: Boolean, options: Boolean): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  @scala.inline
  def delegateEvent(eventType: String, eventTarget: Unit, throttle: Boolean, options: AddEventListenerOptions): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  @scala.inline
  def delegateEvent(eventType: String, eventTarget: Unit, throttle: Unit, options: Boolean): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  @scala.inline
  def delegateEvent(eventType: String, eventTarget: Unit, throttle: Unit, options: AddEventListenerOptions): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  @scala.inline
  def delegateEvent(eventType: String, eventTarget: DelegatedEventTarget): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  @scala.inline
  def delegateEvent(eventType: String, eventTarget: DelegatedEventTarget, throttle: Boolean): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  @scala.inline
  def delegateEvent(eventType: String, eventTarget: DelegatedEventTarget, throttle: Boolean, options: Boolean): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  @scala.inline
  def delegateEvent(
    eventType: String,
    eventTarget: DelegatedEventTarget,
    throttle: Boolean,
    options: AddEventListenerOptions
  ): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  @scala.inline
  def delegateEvent(eventType: String, eventTarget: DelegatedEventTarget, throttle: Unit, options: Boolean): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  @scala.inline
  def delegateEvent(
    eventType: String,
    eventTarget: DelegatedEventTarget,
    throttle: Unit,
    options: AddEventListenerOptions
  ): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  
  @scala.inline
  def removeTouchEvent(
    el: HTMLElement,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeTouchEvent(
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
  @scala.inline
  def removeTouchEvent(
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
  @scala.inline
  def removeTouchEvent(
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
  @scala.inline
  def removeTouchEvent(
    el: Window,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeTouchEvent")(el.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeTouchEvent(
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
  @scala.inline
  def removeTouchEvent(
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
  @scala.inline
  def removeTouchEvent(
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
  
  @scala.inline
  def setTouchEvent(
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
  @scala.inline
  def setTouchEvent(
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
  @scala.inline
  def setTouchEvent(
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
  @scala.inline
  def setTouchEvent(
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
  @scala.inline
  def setTouchEvent(
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
  @scala.inline
  def setTouchEvent(
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
  @scala.inline
  def setTouchEvent(
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
  @scala.inline
  def setTouchEvent(
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
  
  @scala.inline
  def useScrollListener[E /* <: HTMLElement */](hasEnabledOnScrollElementOptions: Options[E]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useScrollListener")(hasEnabledOnScrollElementOptions.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

package typings.reactMdUtils

import typings.reactMdUtils.typesEventsScrollListenerMod.ScrollListenerProps
import typings.reactMdUtils.typesEventsUseScrollListenerMod.ScrollListenerHookOptions
import typings.reactMdUtils.typesEventsUtilsMod.DelegatedEventHandler
import typings.reactMdUtils.typesEventsUtilsMod.DelegatedEventTarget
import typings.std.AddEventListenerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEventsMod {
  
  @JSImport("@react-md/utils/types/events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ScrollListener(props: ScrollListenerProps): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("ScrollListener")(props.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  inline def delegateEvent(eventType: String): DelegatedEventHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: Unit, throttle: Boolean): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: Unit, throttle: Boolean, options: Boolean): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: Unit, throttle: Boolean, options: AddEventListenerOptions): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: Unit, throttle: Unit, options: Boolean): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: Unit, throttle: Unit, options: AddEventListenerOptions): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: DelegatedEventTarget): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: DelegatedEventTarget, throttle: Boolean): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: DelegatedEventTarget, throttle: Boolean, options: Boolean): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(
    eventType: String,
    eventTarget: DelegatedEventTarget,
    throttle: Boolean,
    options: AddEventListenerOptions
  ): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(eventType: String, eventTarget: DelegatedEventTarget, throttle: Unit, options: Boolean): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  inline def delegateEvent(
    eventType: String,
    eventTarget: DelegatedEventTarget,
    throttle: Unit,
    options: AddEventListenerOptions
  ): DelegatedEventHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("delegateEvent")(eventType.asInstanceOf[js.Any], eventTarget.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DelegatedEventHandler]
  
  inline def useScrollListener(param0: ScrollListenerHookOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useScrollListener")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

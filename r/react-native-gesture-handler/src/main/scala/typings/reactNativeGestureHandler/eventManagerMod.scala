package typings.reactNativeGestureHandler

import typings.reactNativeGestureHandler.interfacesMod.AdaptedEvent
import typings.reactNativeGestureHandler.interfacesMod.EventTypes
import typings.reactNativeGestureHandler.interfacesMod.TouchEventType
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventManagerMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/web/tools/EventManager", JSImport.Default)
  @js.native
  abstract class default protected ()
    extends StObject
       with EventManager {
    def this(view: HTMLElement) = this()
  }
  
  @js.native
  trait EventManager extends StObject {
    
    /* protected */ var activePointersCounter: Double = js.native
    
    /* protected */ def mapEvent(event: Event, eventType: EventTypes): AdaptedEvent = js.native
    /* protected */ def mapEvent(event: Event, eventType: EventTypes, index: Double): AdaptedEvent = js.native
    /* protected */ def mapEvent(event: Event, eventType: EventTypes, index: Double, touchEventType: TouchEventType): AdaptedEvent = js.native
    /* protected */ def mapEvent(event: Event, eventType: EventTypes, index: Unit, touchEventType: TouchEventType): AdaptedEvent = js.native
    
    /* protected */ def markAsInBounds(pointerId: Double): Unit = js.native
    
    /* protected */ def markAsOutOfBounds(pointerId: Double): Unit = js.native
    
    /* protected */ def onPointerAdd(_event: AdaptedEvent): Unit = js.native
    
    /* protected */ def onPointerCancel(_event: AdaptedEvent): Unit = js.native
    
    /* protected */ def onPointerDown(_event: AdaptedEvent): Unit = js.native
    
    /* protected */ def onPointerEnter(_event: AdaptedEvent): Unit = js.native
    
    /* protected */ def onPointerMove(_event: AdaptedEvent): Unit = js.native
    
    /* protected */ def onPointerOut(_event: AdaptedEvent): Unit = js.native
    
    /* protected */ def onPointerOutOfBounds(_event: AdaptedEvent): Unit = js.native
    
    /* protected */ def onPointerRemove(_event: AdaptedEvent): Unit = js.native
    
    /* protected */ def onPointerUp(_event: AdaptedEvent): Unit = js.native
    
    /* protected */ var pointersInBounds: js.Array[Double] = js.native
    
    def resetManager(): Unit = js.native
    
    def setListeners(): Unit = js.native
    
    def setOnPointerAdd(callback: js.Function1[/* event */ AdaptedEvent, Unit]): Unit = js.native
    
    def setOnPointerCancel(callback: js.Function1[/* event */ AdaptedEvent, Unit]): Unit = js.native
    
    def setOnPointerDown(callback: js.Function1[/* event */ AdaptedEvent, Unit]): Unit = js.native
    
    def setOnPointerEnter(callback: js.Function1[/* event */ AdaptedEvent, Unit]): Unit = js.native
    
    def setOnPointerMove(callback: js.Function1[/* event */ AdaptedEvent, Unit]): Unit = js.native
    
    def setOnPointerOut(callback: js.Function1[/* event */ AdaptedEvent, Unit]): Unit = js.native
    
    def setOnPointerOutOfBounds(callback: js.Function1[/* event */ AdaptedEvent, Unit]): Unit = js.native
    
    def setOnPointerRemove(callback: js.Function1[/* event */ AdaptedEvent, Unit]): Unit = js.native
    
    def setOnPointerUp(callback: js.Function1[/* event */ AdaptedEvent, Unit]): Unit = js.native
    
    /* protected */ val view: HTMLElement = js.native
  }
}

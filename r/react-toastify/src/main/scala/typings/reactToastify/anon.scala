package typings.reactToastify

import typings.react.mod.DOMAttributes
import typings.react.mod.MutableRefObject
import typings.react.mod.RefObject
import typings.reactToastify.reactToastifyStrings.ADD
import typings.reactToastify.reactToastifyStrings.REMOVE
import typings.reactToastify.toastContainerReducerMod.Action
import typings.reactToastify.typesMod.Id
import typings.reactToastify.typesMod.Toast
import typings.reactToastify.typesMod.ToastPosition
import typings.reactToastify.typesMod.TypeOptions
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BOTTOMCENTER extends StObject {
    
    var BOTTOM_CENTER: ToastPosition
    
    var BOTTOM_LEFT: ToastPosition
    
    var BOTTOM_RIGHT: ToastPosition
    
    var TOP_CENTER: ToastPosition
    
    var TOP_LEFT: ToastPosition
    
    var TOP_RIGHT: ToastPosition
  }
  object BOTTOMCENTER {
    
    @scala.inline
    def apply(
      BOTTOM_CENTER: ToastPosition,
      BOTTOM_LEFT: ToastPosition,
      BOTTOM_RIGHT: ToastPosition,
      TOP_CENTER: ToastPosition,
      TOP_LEFT: ToastPosition,
      TOP_RIGHT: ToastPosition
    ): BOTTOMCENTER = {
      val __obj = js.Dynamic.literal(BOTTOM_CENTER = BOTTOM_CENTER.asInstanceOf[js.Any], BOTTOM_LEFT = BOTTOM_LEFT.asInstanceOf[js.Any], BOTTOM_RIGHT = BOTTOM_RIGHT.asInstanceOf[js.Any], TOP_CENTER = TOP_CENTER.asInstanceOf[js.Any], TOP_LEFT = TOP_LEFT.asInstanceOf[js.Any], TOP_RIGHT = TOP_RIGHT.asInstanceOf[js.Any])
      __obj.asInstanceOf[BOTTOMCENTER]
    }
    
    @scala.inline
    implicit class BOTTOMCENTERMutableBuilder[Self <: BOTTOMCENTER] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBOTTOM_CENTER(value: ToastPosition): Self = StObject.set(x, "BOTTOM_CENTER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBOTTOM_LEFT(value: ToastPosition): Self = StObject.set(x, "BOTTOM_LEFT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBOTTOM_RIGHT(value: ToastPosition): Self = StObject.set(x, "BOTTOM_RIGHT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTOP_CENTER(value: ToastPosition): Self = StObject.set(x, "TOP_CENTER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTOP_LEFT(value: ToastPosition): Self = StObject.set(x, "TOP_LEFT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTOP_RIGHT(value: ToastPosition): Self = StObject.set(x, "TOP_RIGHT", value.asInstanceOf[js.Any])
    }
  }
  
  trait Collection extends StObject {
    
    var collection: Record[Id, Toast]
    
    var containerRef: MutableRefObject[Null]
    
    def getToastToRender[T](cb: js.Function2[/* position */ ToastPosition, /* toastList */ js.Array[Toast], T]): js.Array[T]
    
    def isToastActive(id: Id): Boolean
  }
  object Collection {
    
    @scala.inline
    def apply(
      collection: Record[Id, Toast],
      containerRef: MutableRefObject[Null],
      getToastToRender: js.Function2[/* position */ ToastPosition, /* toastList */ js.Array[Toast], js.Any] => js.Array[js.Any],
      isToastActive: Id => Boolean
    ): Collection = {
      val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], containerRef = containerRef.asInstanceOf[js.Any], getToastToRender = js.Any.fromFunction1(getToastToRender), isToastActive = js.Any.fromFunction1(isToastActive))
      __obj.asInstanceOf[Collection]
    }
    
    @scala.inline
    implicit class CollectionMutableBuilder[Self <: Collection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollection(value: Record[Id, Toast]): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerRef(value: MutableRefObject[Null]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetToastToRender(
        value: js.Function2[/* position */ ToastPosition, /* toastList */ js.Array[Toast], js.Any] => js.Array[js.Any]
      ): Self = StObject.set(x, "getToastToRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsToastActive(value: Id => Boolean): Self = StObject.set(x, "isToastActive", js.Any.fromFunction1(value))
    }
  }
  
  trait DARK extends StObject {
    
    var DARK: TypeOptions
    
    var DEFAULT: TypeOptions
    
    var ERROR: TypeOptions
    
    var INFO: TypeOptions
    
    var SUCCESS: TypeOptions
    
    var WARNING: TypeOptions
  }
  object DARK {
    
    @scala.inline
    def apply(
      DARK: TypeOptions,
      DEFAULT: TypeOptions,
      ERROR: TypeOptions,
      INFO: TypeOptions,
      SUCCESS: TypeOptions,
      WARNING: TypeOptions
    ): DARK = {
      val __obj = js.Dynamic.literal(DARK = DARK.asInstanceOf[js.Any], DEFAULT = DEFAULT.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], SUCCESS = SUCCESS.asInstanceOf[js.Any], WARNING = WARNING.asInstanceOf[js.Any])
      __obj.asInstanceOf[DARK]
    }
    
    @scala.inline
    implicit class DARKMutableBuilder[Self <: DARK] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDARK(value: TypeOptions): Self = StObject.set(x, "DARK", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDEFAULT(value: TypeOptions): Self = StObject.set(x, "DEFAULT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setERROR(value: TypeOptions): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setINFO(value: TypeOptions): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSUCCESS(value: TypeOptions): Self = StObject.set(x, "SUCCESS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWARNING(value: TypeOptions): Self = StObject.set(x, "WARNING", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultClassName extends StObject {
    
    var defaultClassName: js.UndefOr[String] = js.undefined
    
    var position: js.UndefOr[ToastPosition] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
  }
  object DefaultClassName {
    
    @scala.inline
    def apply(): DefaultClassName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultClassName]
    }
    
    @scala.inline
    implicit class DefaultClassNameMutableBuilder[Self <: DefaultClassName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultClassName(value: String): Self = StObject.set(x, "defaultClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultClassNameUndefined: Self = StObject.set(x, "defaultClassName", js.undefined)
      
      @scala.inline
      def setPosition(value: ToastPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    }
  }
  
  trait EventHandlers extends StObject {
    
    var eventHandlers: DOMAttributes[HTMLElement]
    
    var isRunning: Boolean
    
    def pauseToast(): Unit
    
    def playToast(): Unit
    
    var preventExitTransition: Boolean
    
    var toastRef: RefObject[HTMLDivElement]
  }
  object EventHandlers {
    
    @scala.inline
    def apply(
      eventHandlers: DOMAttributes[HTMLElement],
      isRunning: Boolean,
      pauseToast: () => Unit,
      playToast: () => Unit,
      preventExitTransition: Boolean,
      toastRef: RefObject[HTMLDivElement]
    ): EventHandlers = {
      val __obj = js.Dynamic.literal(eventHandlers = eventHandlers.asInstanceOf[js.Any], isRunning = isRunning.asInstanceOf[js.Any], pauseToast = js.Any.fromFunction0(pauseToast), playToast = js.Any.fromFunction0(playToast), preventExitTransition = preventExitTransition.asInstanceOf[js.Any], toastRef = toastRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventHandlers]
    }
    
    @scala.inline
    implicit class EventHandlersMutableBuilder[Self <: EventHandlers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventHandlers(value: DOMAttributes[HTMLElement]): Self = StObject.set(x, "eventHandlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRunning(value: Boolean): Self = StObject.set(x, "isRunning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseToast(value: () => Unit): Self = StObject.set(x, "pauseToast", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPlayToast(value: () => Unit): Self = StObject.set(x, "playToast", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPreventExitTransition(value: Boolean): Self = StObject.set(x, "preventExitTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToastRef(value: RefObject[HTMLDivElement]): Self = StObject.set(x, "toastRef", value.asInstanceOf[js.Any])
    }
  }
  
  trait Position extends StObject {
    
    var defaultClassName: js.UndefOr[String] = js.undefined
    
    var position: js.UndefOr[ToastPosition] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[TypeOptions] = js.undefined
  }
  object Position {
    
    @scala.inline
    def apply(): Position = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultClassName(value: String): Self = StObject.set(x, "defaultClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultClassNameUndefined: Self = StObject.set(x, "defaultClassName", js.undefined)
      
      @scala.inline
      def setPosition(value: ToastPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setType(value: TypeOptions): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait StaleId
    extends StObject
       with Action {
    
    var staleId: js.UndefOr[Id] = js.undefined
    
    var toastId: Id
    
    var `type`: ADD
  }
  object StaleId {
    
    @scala.inline
    def apply(toastId: Id): StaleId = {
      val __obj = js.Dynamic.literal(toastId = toastId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ADD")
      __obj.asInstanceOf[StaleId]
    }
    
    @scala.inline
    implicit class StaleIdMutableBuilder[Self <: StaleId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStaleId(value: Id): Self = StObject.set(x, "staleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaleIdUndefined: Self = StObject.set(x, "staleId", js.undefined)
      
      @scala.inline
      def setToastId(value: Id): Self = StObject.set(x, "toastId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: ADD): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ToastId
    extends StObject
       with Action {
    
    var toastId: js.UndefOr[Id] = js.undefined
    
    var `type`: REMOVE
  }
  object ToastId {
    
    @scala.inline
    def apply(): ToastId = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("REMOVE")
      __obj.asInstanceOf[ToastId]
    }
    
    @scala.inline
    implicit class ToastIdMutableBuilder[Self <: ToastId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToastId(value: Id): Self = StObject.set(x, "toastId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToastIdUndefined: Self = StObject.set(x, "toastId", js.undefined)
      
      @scala.inline
      def setType(value: REMOVE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

package typings.reactToastify

import typings.node.timersMod.global.NodeJS.Timeout
import typings.react.mod.DOMAttributes
import typings.react.mod.MutableRefObject
import typings.react.mod.RefObject
import typings.reactToastify.typesMod.Id
import typings.reactToastify.typesMod.Toast
import typings.reactToastify.typesMod.ToastPosition
import typings.reactToastify.typesMod.TypeOptions
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ContainerRef extends StObject {
    
    var containerRef: MutableRefObject[Null]
    
    def getToastToRender[T](cb: js.Function2[/* position */ ToastPosition, /* toastList */ js.Array[Toast], T]): js.Array[T]
    
    def isToastActive(id: Id): Boolean
  }
  object ContainerRef {
    
    inline def apply(
      containerRef: MutableRefObject[Null],
      getToastToRender: js.Function2[/* position */ ToastPosition, /* toastList */ js.Array[Toast], Any] => js.Array[Any],
      isToastActive: Id => Boolean
    ): ContainerRef = {
      val __obj = js.Dynamic.literal(containerRef = containerRef.asInstanceOf[js.Any], getToastToRender = js.Any.fromFunction1(getToastToRender), isToastActive = js.Any.fromFunction1(isToastActive))
      __obj.asInstanceOf[ContainerRef]
    }
    
    extension [Self <: ContainerRef](x: Self) {
      
      inline def setContainerRef(value: MutableRefObject[Null]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
      
      inline def setGetToastToRender(
        value: js.Function2[/* position */ ToastPosition, /* toastList */ js.Array[Toast], Any] => js.Array[Any]
      ): Self = StObject.set(x, "getToastToRender", js.Any.fromFunction1(value))
      
      inline def setIsToastActive(value: Id => Boolean): Self = StObject.set(x, "isToastActive", js.Any.fromFunction1(value))
    }
  }
  
  trait DefaultClassName extends StObject {
    
    var defaultClassName: js.UndefOr[String] = js.undefined
    
    var position: js.UndefOr[ToastPosition] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[TypeOptions] = js.undefined
  }
  object DefaultClassName {
    
    inline def apply(): DefaultClassName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultClassName]
    }
    
    extension [Self <: DefaultClassName](x: Self) {
      
      inline def setDefaultClassName(value: String): Self = StObject.set(x, "defaultClassName", value.asInstanceOf[js.Any])
      
      inline def setDefaultClassNameUndefined: Self = StObject.set(x, "defaultClassName", js.undefined)
      
      inline def setPosition(value: ToastPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setType(value: TypeOptions): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
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
    
    inline def apply(
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
    
    extension [Self <: EventHandlers](x: Self) {
      
      inline def setEventHandlers(value: DOMAttributes[HTMLElement]): Self = StObject.set(x, "eventHandlers", value.asInstanceOf[js.Any])
      
      inline def setIsRunning(value: Boolean): Self = StObject.set(x, "isRunning", value.asInstanceOf[js.Any])
      
      inline def setPauseToast(value: () => Unit): Self = StObject.set(x, "pauseToast", js.Any.fromFunction0(value))
      
      inline def setPlayToast(value: () => Unit): Self = StObject.set(x, "playToast", js.Any.fromFunction0(value))
      
      inline def setPreventExitTransition(value: Boolean): Self = StObject.set(x, "preventExitTransition", value.asInstanceOf[js.Any])
      
      inline def setToastRef(value: RefObject[HTMLDivElement]): Self = StObject.set(x, "toastRef", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofsetTimeout extends StObject {
    
    // util.promisify no rest args compability
    // tslint:disable-next-line void-return
    def apply(callback: js.Function1[/* args */ Unit, Unit]): Timeout = js.native
    def apply(callback: js.Function1[/* args */ Unit, Unit], ms: Double): Timeout = js.native
    def apply[TArgs /* <: js.Array[Any] */](
      callback: js.Function1[/* args */ TArgs, Unit],
      ms: Double,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
    ): Timeout = js.native
    def apply[TArgs /* <: js.Array[Any] */](
      callback: js.Function1[/* args */ TArgs, Unit],
      ms: Unit,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
    ): Timeout = js.native
  }
}

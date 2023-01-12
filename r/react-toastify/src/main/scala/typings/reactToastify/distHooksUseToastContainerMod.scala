package typings.reactToastify

import typings.react.mod.ReactNode
import typings.reactToastify.anon.ContainerRef
import typings.reactToastify.distTypesMod.Id
import typings.reactToastify.distTypesMod.Toast
import typings.reactToastify.distTypesMod.ToastContainerProps
import typings.reactToastify.distTypesMod.ToastContent
import typings.reactToastify.distTypesMod.ToastContentProps
import typings.reactToastify.distTypesMod.ToastProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHooksUseToastContainerMod {
  
  @JSImport("react-toastify/dist/hooks/useToastContainer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useToastContainer(props: ToastContainerProps): ContainerRef = ^.asInstanceOf[js.Dynamic].applyDynamic("useToastContainer")(props.asInstanceOf[js.Any]).asInstanceOf[ContainerRef]
  
  trait ContainerInstance extends StObject {
    
    var containerId: js.UndefOr[Id | Null] = js.undefined
    
    var count: Double
    
    var displayedToast: Double
    
    def getToast(id: Id): js.UndefOr[Toast | Null]
    
    def isToastActive(toastId: Id): Boolean
    
    var props: ToastContainerProps
    
    var queue: js.Array[QueuedToast]
    
    var toastKey: Double
  }
  object ContainerInstance {
    
    inline def apply(
      count: Double,
      displayedToast: Double,
      getToast: Id => js.UndefOr[Toast | Null],
      isToastActive: Id => Boolean,
      props: ToastContainerProps,
      queue: js.Array[QueuedToast],
      toastKey: Double
    ): ContainerInstance = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], displayedToast = displayedToast.asInstanceOf[js.Any], getToast = js.Any.fromFunction1(getToast), isToastActive = js.Any.fromFunction1(isToastActive), props = props.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], toastKey = toastKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainerInstance]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContainerInstance] (val x: Self) extends AnyVal {
      
      inline def setContainerId(value: Id): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
      
      inline def setContainerIdNull: Self = StObject.set(x, "containerId", null)
      
      inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setDisplayedToast(value: Double): Self = StObject.set(x, "displayedToast", value.asInstanceOf[js.Any])
      
      inline def setGetToast(value: Id => js.UndefOr[Toast | Null]): Self = StObject.set(x, "getToast", js.Any.fromFunction1(value))
      
      inline def setIsToastActive(value: Id => Boolean): Self = StObject.set(x, "isToastActive", js.Any.fromFunction1(value))
      
      inline def setProps(value: ToastContainerProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setQueue(value: js.Array[QueuedToast]): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      inline def setQueueVarargs(value: QueuedToast*): Self = StObject.set(x, "queue", js.Array(value*))
      
      inline def setToastKey(value: Double): Self = StObject.set(x, "toastKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueuedToast extends StObject {
    
    var staleId: js.UndefOr[Id] = js.undefined
    
    var toastContent: ToastContent[Any]
    
    var toastProps: ToastProps
  }
  object QueuedToast {
    
    inline def apply(toastProps: ToastProps): QueuedToast = {
      val __obj = js.Dynamic.literal(toastProps = toastProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueuedToast]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueuedToast] (val x: Self) extends AnyVal {
      
      inline def setStaleId(value: Id): Self = StObject.set(x, "staleId", value.asInstanceOf[js.Any])
      
      inline def setStaleIdUndefined: Self = StObject.set(x, "staleId", js.undefined)
      
      inline def setToastContent(value: ToastContent[Any]): Self = StObject.set(x, "toastContent", value.asInstanceOf[js.Any])
      
      inline def setToastContentFunction1(value: /* props */ ToastContentProps[Any] => ReactNode): Self = StObject.set(x, "toastContent", js.Any.fromFunction1(value))
      
      inline def setToastContentUndefined: Self = StObject.set(x, "toastContent", js.undefined)
      
      inline def setToastProps(value: ToastProps): Self = StObject.set(x, "toastProps", value.asInstanceOf[js.Any])
    }
  }
}

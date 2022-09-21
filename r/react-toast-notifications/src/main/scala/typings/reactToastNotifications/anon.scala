package typings.reactToastNotifications

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactToastNotifications.mod.AppearanceTypes
import typings.reactToastNotifications.mod.Options
import typings.reactToastNotifications.mod.RemoveAllToasts
import typings.reactToastNotifications.mod.RemoveToast
import typings.reactToastNotifications.mod.ToastContainerProps
import typings.reactToastNotifications.mod.ToastProps
import typings.reactToastNotifications.mod.UpdateOptions
import typings.reactToastNotifications.mod.UpdateToast
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AddToast extends StObject {
    
    var addToast: typings.reactToastNotifications.mod.AddToast
    
    var removeAllToasts: RemoveAllToasts
    
    var removeToast: RemoveToast
    
    var toastStack: js.Array[Appearance]
    
    var updateToast: UpdateToast
  }
  object AddToast {
    
    inline def apply(
      addToast: (/* content */ ReactNode, /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Unit,
      removeAllToasts: () => Unit,
      removeToast: (/* id */ String, /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Unit,
      toastStack: js.Array[Appearance],
      updateToast: (/* id */ String, /* options */ js.UndefOr[UpdateOptions], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Unit
    ): AddToast = {
      val __obj = js.Dynamic.literal(addToast = js.Any.fromFunction3(addToast), removeAllToasts = js.Any.fromFunction0(removeAllToasts), removeToast = js.Any.fromFunction2(removeToast), toastStack = toastStack.asInstanceOf[js.Any], updateToast = js.Any.fromFunction3(updateToast))
      __obj.asInstanceOf[AddToast]
    }
    
    extension [Self <: AddToast](x: Self) {
      
      inline def setAddToast(
        value: (/* content */ ReactNode, /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Unit
      ): Self = StObject.set(x, "addToast", js.Any.fromFunction3(value))
      
      inline def setRemoveAllToasts(value: () => Unit): Self = StObject.set(x, "removeAllToasts", js.Any.fromFunction0(value))
      
      inline def setRemoveToast(value: (/* id */ String, /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Unit): Self = StObject.set(x, "removeToast", js.Any.fromFunction2(value))
      
      inline def setToastStack(value: js.Array[Appearance]): Self = StObject.set(x, "toastStack", value.asInstanceOf[js.Any])
      
      inline def setToastStackVarargs(value: Appearance*): Self = StObject.set(x, "toastStack", js.Array(value*))
      
      inline def setUpdateToast(
        value: (/* id */ String, /* options */ js.UndefOr[UpdateOptions], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Unit
      ): Self = StObject.set(x, "updateToast", js.Any.fromFunction3(value))
    }
  }
  
  trait Appearance extends StObject {
    
    var appearance: AppearanceTypes
    
    var content: ReactNode
    
    var id: String
  }
  object Appearance {
    
    inline def apply(appearance: AppearanceTypes, id: String): Appearance = {
      val __obj = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Appearance]
    }
    
    extension [Self <: Appearance](x: Self) {
      
      inline def setAppearance(value: AppearanceTypes): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Toast extends StObject {
    
    var Toast: js.UndefOr[ComponentType[ToastProps]] = js.undefined
    
    var ToastContainer: js.UndefOr[ComponentType[ToastContainerProps]] = js.undefined
  }
  object Toast {
    
    inline def apply(): Toast = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Toast]
    }
    
    extension [Self <: Toast](x: Self) {
      
      inline def setToast(value: ComponentType[ToastProps]): Self = StObject.set(x, "Toast", value.asInstanceOf[js.Any])
      
      inline def setToastContainer(value: ComponentType[ToastContainerProps]): Self = StObject.set(x, "ToastContainer", value.asInstanceOf[js.Any])
      
      inline def setToastContainerUndefined: Self = StObject.set(x, "ToastContainer", js.undefined)
      
      inline def setToastUndefined: Self = StObject.set(x, "Toast", js.undefined)
    }
  }
}

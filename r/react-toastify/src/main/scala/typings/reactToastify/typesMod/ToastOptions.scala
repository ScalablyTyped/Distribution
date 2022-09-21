package typings.reactToastify.typesMod

import typings.react.mod.CSSProperties
import typings.reactToastify.anon.DefaultClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToastOptions[Data]
  extends StObject
     with CommonOptions {
  
  /**
    * An optional css class to set.
    */
  var className: js.UndefOr[ToastClassName] = js.undefined
  
  var data: js.UndefOr[Data] = js.undefined
  
  /**
    * Add a delay in ms before the toast appear.
    */
  var delay: js.UndefOr[Double] = js.undefined
  
  var isLoading: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Called when toast is unmounted.
    */
  var onClose: js.UndefOr[js.Function1[/* props */ js.Object, Unit]] = js.undefined
  
  /**
    * Called when toast is mounted.
    */
  var onOpen: js.UndefOr[js.Function1[/* props */ js.Object, Unit]] = js.undefined
  
  /**
    * Set the percentage for the controlled progress bar. `Value must be between 0 and 1.`
    */
  var progress: js.UndefOr[Double | String] = js.undefined
  
  /**
    * An optional inline style to apply.
    */
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  /**
    * Set a custom `toastId`
    */
  var toastId: js.UndefOr[Id] = js.undefined
  
  /**
    * Set the toast type.
    * `One of: 'info', 'success', 'warning', 'error', 'default'`
    */
  var `type`: js.UndefOr[TypeOptions] = js.undefined
  
  /**
    * Used during update
    */
  var updateId: js.UndefOr[Id] = js.undefined
}
object ToastOptions {
  
  inline def apply[Data](): ToastOptions[Data] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToastOptions[Data]]
  }
  
  extension [Self <: ToastOptions[?], Data](x: Self & ToastOptions[Data]) {
    
    inline def setClassName(value: ToastClassName): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameFunction1(value: /* context */ js.UndefOr[DefaultClassName] => String): Self = StObject.set(x, "className", js.Any.fromFunction1(value))
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    inline def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
    
    inline def setOnClose(value: /* props */ js.Object => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnOpen(value: /* props */ js.Object => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
    
    inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
    
    inline def setProgress(value: Double | String): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setToastId(value: Id): Self = StObject.set(x, "toastId", value.asInstanceOf[js.Any])
    
    inline def setToastIdUndefined: Self = StObject.set(x, "toastId", js.undefined)
    
    inline def setType(value: TypeOptions): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdateId(value: Id): Self = StObject.set(x, "updateId", value.asInstanceOf[js.Any])
    
    inline def setUpdateIdUndefined: Self = StObject.set(x, "updateId", js.undefined)
  }
}

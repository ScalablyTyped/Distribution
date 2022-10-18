package typings.reactToastify.distTypesMod

import typings.react.mod.CSSProperties
import typings.reactToastify.anon.DefaultClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToastContainerProps
  extends StObject
     with CommonOptions {
  
  /**
    * An optional css class to set.
    */
  var className: js.UndefOr[ToastClassName] = js.undefined
  
  /**
    * Show the toast only if it includes containerId and it's the same as containerId
    * `Default: false`
    */
  var enableMultiContainer: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Limit the number of toast displayed at the same time
    */
  var limit: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether or not to display the newest toast on top.
    * `Default: false`
    */
  var newestOnTop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An optional inline style to apply.
    */
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  /**
    * An optional css class for the toast.
    */
  var toastClassName: js.UndefOr[ToastClassName] = js.undefined
  
  /**
    * An optional inline style to apply for the toast.
    */
  var toastStyle: js.UndefOr[CSSProperties] = js.undefined
}
object ToastContainerProps {
  
  inline def apply(): ToastContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToastContainerProps]
  }
  
  extension [Self <: ToastContainerProps](x: Self) {
    
    inline def setClassName(value: ToastClassName): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameFunction1(value: /* context */ js.UndefOr[DefaultClassName] => String): Self = StObject.set(x, "className", js.Any.fromFunction1(value))
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setEnableMultiContainer(value: Boolean): Self = StObject.set(x, "enableMultiContainer", value.asInstanceOf[js.Any])
    
    inline def setEnableMultiContainerUndefined: Self = StObject.set(x, "enableMultiContainer", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setNewestOnTop(value: Boolean): Self = StObject.set(x, "newestOnTop", value.asInstanceOf[js.Any])
    
    inline def setNewestOnTopUndefined: Self = StObject.set(x, "newestOnTop", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setToastClassName(value: ToastClassName): Self = StObject.set(x, "toastClassName", value.asInstanceOf[js.Any])
    
    inline def setToastClassNameFunction1(value: /* context */ js.UndefOr[DefaultClassName] => String): Self = StObject.set(x, "toastClassName", js.Any.fromFunction1(value))
    
    inline def setToastClassNameUndefined: Self = StObject.set(x, "toastClassName", js.undefined)
    
    inline def setToastStyle(value: CSSProperties): Self = StObject.set(x, "toastStyle", value.asInstanceOf[js.Any])
    
    inline def setToastStyleUndefined: Self = StObject.set(x, "toastStyle", js.undefined)
  }
}

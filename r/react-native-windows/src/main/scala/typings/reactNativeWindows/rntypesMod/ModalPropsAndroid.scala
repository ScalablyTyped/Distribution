package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModalPropsAndroid extends StObject {
  
  /**
    *  Controls whether to force hardware acceleration for the underlying window.
    */
  var hardwareAccelerated: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Determines whether your modal should go under the system statusbar.
    */
  var statusBarTranslucent: js.UndefOr[Boolean] = js.undefined
}
object ModalPropsAndroid {
  
  inline def apply(): ModalPropsAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalPropsAndroid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModalPropsAndroid] (val x: Self) extends AnyVal {
    
    inline def setHardwareAccelerated(value: Boolean): Self = StObject.set(x, "hardwareAccelerated", value.asInstanceOf[js.Any])
    
    inline def setHardwareAcceleratedUndefined: Self = StObject.set(x, "hardwareAccelerated", js.undefined)
    
    inline def setStatusBarTranslucent(value: Boolean): Self = StObject.set(x, "statusBarTranslucent", value.asInstanceOf[js.Any])
    
    inline def setStatusBarTranslucentUndefined: Self = StObject.set(x, "statusBarTranslucent", js.undefined)
  }
}

package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalPropsAndroid extends StObject {
  
  /**
    *  Controls whether to force hardware acceleration for the underlying window.
    */
  var hardwareAccelerated: js.UndefOr[Boolean] = js.native
  
  /**
    *  Determines whether your modal should go under the system statusbar.
    */
  var statusBarTranslucent: js.UndefOr[Boolean] = js.native
}
object ModalPropsAndroid {
  
  @scala.inline
  def apply(): ModalPropsAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalPropsAndroid]
  }
  
  @scala.inline
  implicit class ModalPropsAndroidMutableBuilder[Self <: ModalPropsAndroid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHardwareAccelerated(value: Boolean): Self = StObject.set(x, "hardwareAccelerated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHardwareAcceleratedUndefined: Self = StObject.set(x, "hardwareAccelerated", js.undefined)
    
    @scala.inline
    def setStatusBarTranslucent(value: Boolean): Self = StObject.set(x, "statusBarTranslucent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusBarTranslucentUndefined: Self = StObject.set(x, "statusBarTranslucent", js.undefined)
  }
}

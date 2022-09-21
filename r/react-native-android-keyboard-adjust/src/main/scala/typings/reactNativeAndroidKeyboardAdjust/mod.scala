package typings.reactNativeAndroidKeyboardAdjust

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-native-android-keyboard-adjust", JSImport.Default)
  @js.native
  val default: AndroidKeyboardAdjust = js.native
  
  trait AndroidKeyboardAdjust extends StObject {
    
    def setAdjustNothing(): Unit
    
    def setAdjustPan(): Unit
    
    def setAdjustResize(): Unit
    
    def setAdjustUnspecified(): Unit
    
    def setAlwaysHidden(): Unit
    
    def setAlwaysVisible(): Unit
    
    def setHidden(): Unit
    
    def setStateUnspecified(): Unit
    
    def setUnchanged(): Unit
    
    def setVisible(): Unit
  }
  object AndroidKeyboardAdjust {
    
    inline def apply(
      setAdjustNothing: () => Unit,
      setAdjustPan: () => Unit,
      setAdjustResize: () => Unit,
      setAdjustUnspecified: () => Unit,
      setAlwaysHidden: () => Unit,
      setAlwaysVisible: () => Unit,
      setHidden: () => Unit,
      setStateUnspecified: () => Unit,
      setUnchanged: () => Unit,
      setVisible: () => Unit
    ): AndroidKeyboardAdjust = {
      val __obj = js.Dynamic.literal(setAdjustNothing = js.Any.fromFunction0(setAdjustNothing), setAdjustPan = js.Any.fromFunction0(setAdjustPan), setAdjustResize = js.Any.fromFunction0(setAdjustResize), setAdjustUnspecified = js.Any.fromFunction0(setAdjustUnspecified), setAlwaysHidden = js.Any.fromFunction0(setAlwaysHidden), setAlwaysVisible = js.Any.fromFunction0(setAlwaysVisible), setHidden = js.Any.fromFunction0(setHidden), setStateUnspecified = js.Any.fromFunction0(setStateUnspecified), setUnchanged = js.Any.fromFunction0(setUnchanged), setVisible = js.Any.fromFunction0(setVisible))
      __obj.asInstanceOf[AndroidKeyboardAdjust]
    }
    
    extension [Self <: AndroidKeyboardAdjust](x: Self) {
      
      inline def setSetAdjustNothing(value: () => Unit): Self = StObject.set(x, "setAdjustNothing", js.Any.fromFunction0(value))
      
      inline def setSetAdjustPan(value: () => Unit): Self = StObject.set(x, "setAdjustPan", js.Any.fromFunction0(value))
      
      inline def setSetAdjustResize(value: () => Unit): Self = StObject.set(x, "setAdjustResize", js.Any.fromFunction0(value))
      
      inline def setSetAdjustUnspecified(value: () => Unit): Self = StObject.set(x, "setAdjustUnspecified", js.Any.fromFunction0(value))
      
      inline def setSetAlwaysHidden(value: () => Unit): Self = StObject.set(x, "setAlwaysHidden", js.Any.fromFunction0(value))
      
      inline def setSetAlwaysVisible(value: () => Unit): Self = StObject.set(x, "setAlwaysVisible", js.Any.fromFunction0(value))
      
      inline def setSetHidden(value: () => Unit): Self = StObject.set(x, "setHidden", js.Any.fromFunction0(value))
      
      inline def setSetStateUnspecified(value: () => Unit): Self = StObject.set(x, "setStateUnspecified", js.Any.fromFunction0(value))
      
      inline def setSetUnchanged(value: () => Unit): Self = StObject.set(x, "setUnchanged", js.Any.fromFunction0(value))
      
      inline def setSetVisible(value: () => Unit): Self = StObject.set(x, "setVisible", js.Any.fromFunction0(value))
    }
  }
  
  type _To = AndroidKeyboardAdjust
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: AndroidKeyboardAdjust = default
}

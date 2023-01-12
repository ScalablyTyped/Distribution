package typings.rmcInputNumber

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIndexDotiosMod {
  
  @JSImport("rmc-input-number/lib/index.ios", JSImport.Default)
  @js.native
  open class default () extends InputNumber
  
  @js.native
  trait InputNumber
    extends typings.rmcInputNumber.libBaseMod.default[PropsType, StateType] {
    
    var _stepDown: Any = js.native
    
    var _stepDownText: Any = js.native
    
    var _stepUp: Any = js.native
    
    var _stepUpText: Any = js.native
    
    def onPressIn(`type`: String): Unit = js.native
    
    def onPressInDown(e: Any): Unit = js.native
    
    def onPressInUp(e: Any): Unit = js.native
    
    def onPressOut(`type`: Any): Unit = js.native
    
    def onPressOutDown(): Unit = js.native
    
    def onPressOutUp(): Unit = js.native
  }
  
  trait PropsType
    extends StObject
       with typings.rmcInputNumber.libBaseMod.PropsType {
    
    var downStyle: js.UndefOr[Any] = js.undefined
    
    var inputStyle: js.UndefOr[Any] = js.undefined
    
    var keyboardType: js.UndefOr[Any] = js.undefined
    
    var styles: js.UndefOr[Any] = js.undefined
    
    var upStyle: js.UndefOr[Any] = js.undefined
  }
  object PropsType {
    
    inline def apply(): PropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropsType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PropsType] (val x: Self) extends AnyVal {
      
      inline def setDownStyle(value: Any): Self = StObject.set(x, "downStyle", value.asInstanceOf[js.Any])
      
      inline def setDownStyleUndefined: Self = StObject.set(x, "downStyle", js.undefined)
      
      inline def setInputStyle(value: Any): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      inline def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
      
      inline def setKeyboardType(value: Any): Self = StObject.set(x, "keyboardType", value.asInstanceOf[js.Any])
      
      inline def setKeyboardTypeUndefined: Self = StObject.set(x, "keyboardType", js.undefined)
      
      inline def setStyles(value: Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setUpStyle(value: Any): Self = StObject.set(x, "upStyle", value.asInstanceOf[js.Any])
      
      inline def setUpStyleUndefined: Self = StObject.set(x, "upStyle", js.undefined)
    }
  }
  
  type StateType = typings.rmcInputNumber.libBaseMod.StateType
}

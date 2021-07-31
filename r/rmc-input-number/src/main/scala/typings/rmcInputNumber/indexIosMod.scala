package typings.rmcInputNumber

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexIosMod {
  
  @JSImport("rmc-input-number/lib/index.ios", JSImport.Default)
  @js.native
  class default () extends InputNumber
  
  @js.native
  trait InputNumber
    extends typings.rmcInputNumber.baseMod.default[PropsType, StateType] {
    
    var _stepDown: js.Any = js.native
    
    var _stepDownText: js.Any = js.native
    
    var _stepUp: js.Any = js.native
    
    var _stepUpText: js.Any = js.native
    
    def onPressIn(`type`: String): Unit = js.native
    
    def onPressInDown(e: js.Any): Unit = js.native
    
    def onPressInUp(e: js.Any): Unit = js.native
    
    def onPressOut(`type`: js.Any): Unit = js.native
    
    def onPressOutDown(): Unit = js.native
    
    def onPressOutUp(): Unit = js.native
  }
  
  trait PropsType
    extends StObject
       with typings.rmcInputNumber.baseMod.PropsType {
    
    var downStyle: js.UndefOr[js.Any] = js.undefined
    
    var inputStyle: js.UndefOr[js.Any] = js.undefined
    
    var keyboardType: js.UndefOr[js.Any] = js.undefined
    
    var styles: js.UndefOr[js.Any] = js.undefined
    
    var upStyle: js.UndefOr[js.Any] = js.undefined
  }
  object PropsType {
    
    @scala.inline
    def apply(): PropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropsType]
    }
    
    @scala.inline
    implicit class PropsTypeMutableBuilder[Self <: PropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDownStyle(value: js.Any): Self = StObject.set(x, "downStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownStyleUndefined: Self = StObject.set(x, "downStyle", js.undefined)
      
      @scala.inline
      def setInputStyle(value: js.Any): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
      
      @scala.inline
      def setKeyboardType(value: js.Any): Self = StObject.set(x, "keyboardType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardTypeUndefined: Self = StObject.set(x, "keyboardType", js.undefined)
      
      @scala.inline
      def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setUpStyle(value: js.Any): Self = StObject.set(x, "upStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpStyleUndefined: Self = StObject.set(x, "upStyle", js.undefined)
    }
  }
  
  type StateType = typings.rmcInputNumber.baseMod.StateType
}

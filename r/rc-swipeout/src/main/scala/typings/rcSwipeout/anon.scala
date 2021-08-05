package typings.rcSwipeout

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AutoClose extends StObject {
    
    var autoClose: Boolean
    
    var disabled: Boolean
    
    var left: js.Array[scala.Nothing]
    
    def onClose(): Unit
    
    def onOpen(): Unit
    
    var prefixCls: String
    
    var right: js.Array[scala.Nothing]
  }
  object AutoClose {
    
    inline def apply(
      autoClose: Boolean,
      disabled: Boolean,
      left: js.Array[scala.Nothing],
      onClose: () => Unit,
      onOpen: () => Unit,
      prefixCls: String,
      right: js.Array[scala.Nothing]
    ): AutoClose = {
      val __obj = js.Dynamic.literal(autoClose = autoClose.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose), onOpen = js.Any.fromFunction0(onOpen), prefixCls = prefixCls.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoClose]
    }
    
    extension [Self <: AutoClose](x: Self) {
      
      inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: js.Array[scala.Nothing]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftVarargs(value: scala.Nothing*): Self = StObject.set(x, "left", js.Array(value :_*))
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setRight(value: js.Array[scala.Nothing]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightVarargs(value: scala.Nothing*): Self = StObject.set(x, "right", js.Array(value :_*))
    }
  }
  
  trait BackgroundColor extends StObject {
    
    var backgroundColor: String
    
    var color: String
    
    var component: Element
    
    var disabled: Boolean
    
    var onPress: js.Any
    
    var text: js.Any
    
    var `type`: String
  }
  object BackgroundColor {
    
    inline def apply(
      backgroundColor: String,
      color: String,
      component: Element,
      disabled: Boolean,
      onPress: js.Any,
      text: js.Any,
      `type`: String
    ): BackgroundColor = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onPress = onPress.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackgroundColor]
    }
    
    extension [Self <: BackgroundColor](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: Element): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setOnPress(value: js.Any): Self = StObject.set(x, "onPress", value.asInstanceOf[js.Any])
      
      inline def setText(value: js.Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClassName extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var style: js.UndefOr[js.Any] = js.undefined
    
    var text: ReactNode
    
    var `type`: js.UndefOr[js.Any] = js.undefined
  }
  object ClassName {
    
    inline def apply(): ClassName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClassName]
    }
    
    extension [Self <: ClassName](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setText(value: ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}

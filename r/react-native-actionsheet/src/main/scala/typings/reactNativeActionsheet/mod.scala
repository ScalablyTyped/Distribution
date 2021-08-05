package typings.reactNativeActionsheet

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-actionsheet", JSImport.Default)
  @js.native
  class default () extends ActionSheet
  
  @JSImport("react-native-actionsheet", "ActionSheetCustom")
  @js.native
  class ActionSheetCustom protected ()
    extends Component[ActionSheetCustomProps, js.Object, js.Any] {
    def this(props: ActionSheetCustomProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ActionSheetCustomProps, context: js.Any) = this()
    
    def hide(): Unit = js.native
    def hide(index: Double): Unit = js.native
    
    def show(): Unit = js.native
  }
  
  @js.native
  trait ActionSheet
    extends Component[ActionSheetProps, js.Object, js.Any] {
    
    def show(): Unit = js.native
  }
  
  trait ActionSheetCustomProps extends StObject {
    
    var buttonUnderlayColor: js.UndefOr[String] = js.undefined
    
    var cancelButtonIndex: js.UndefOr[Double] = js.undefined
    
    var destructiveButtonIndex: js.UndefOr[Double] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    def onPress(index: Double): Unit
    
    var options: js.Array[ReactNode]
    
    var styles: js.UndefOr[js.Object] = js.undefined
    
    var tintColor: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object ActionSheetCustomProps {
    
    inline def apply(onPress: Double => Unit, options: js.Array[ReactNode]): ActionSheetCustomProps = {
      val __obj = js.Dynamic.literal(onPress = js.Any.fromFunction1(onPress), options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionSheetCustomProps]
    }
    
    extension [Self <: ActionSheetCustomProps](x: Self) {
      
      inline def setButtonUnderlayColor(value: String): Self = StObject.set(x, "buttonUnderlayColor", value.asInstanceOf[js.Any])
      
      inline def setButtonUnderlayColorUndefined: Self = StObject.set(x, "buttonUnderlayColor", js.undefined)
      
      inline def setCancelButtonIndex(value: Double): Self = StObject.set(x, "cancelButtonIndex", value.asInstanceOf[js.Any])
      
      inline def setCancelButtonIndexUndefined: Self = StObject.set(x, "cancelButtonIndex", js.undefined)
      
      inline def setDestructiveButtonIndex(value: Double): Self = StObject.set(x, "destructiveButtonIndex", value.asInstanceOf[js.Any])
      
      inline def setDestructiveButtonIndexUndefined: Self = StObject.set(x, "destructiveButtonIndex", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOnPress(value: Double => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      inline def setOptions(value: js.Array[ReactNode]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: ReactNode*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      inline def setStyles(value: js.Object): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
      inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait ActionSheetProps extends StObject {
    
    var cancelButtonIndex: js.UndefOr[Double] = js.undefined
    
    var destructiveButtonIndex: js.UndefOr[Double] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    def onPress(index: Double): Unit
    
    var options: js.Array[String]
    
    var tintColor: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object ActionSheetProps {
    
    inline def apply(onPress: Double => Unit, options: js.Array[String]): ActionSheetProps = {
      val __obj = js.Dynamic.literal(onPress = js.Any.fromFunction1(onPress), options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionSheetProps]
    }
    
    extension [Self <: ActionSheetProps](x: Self) {
      
      inline def setCancelButtonIndex(value: Double): Self = StObject.set(x, "cancelButtonIndex", value.asInstanceOf[js.Any])
      
      inline def setCancelButtonIndexUndefined: Self = StObject.set(x, "cancelButtonIndex", js.undefined)
      
      inline def setDestructiveButtonIndex(value: Double): Self = StObject.set(x, "destructiveButtonIndex", value.asInstanceOf[js.Any])
      
      inline def setDestructiveButtonIndexUndefined: Self = StObject.set(x, "destructiveButtonIndex", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOnPress(value: Double => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      inline def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      inline def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
      inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}

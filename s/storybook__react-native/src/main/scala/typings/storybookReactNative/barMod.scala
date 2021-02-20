package typings.storybookReactNative

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object barMod {
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/navigation/bar", JSImport.Default)
  @js.native
  class default () extends Bar
  
  @js.native
  trait Bar
    extends PureComponent[Props, js.Object, js.Any]
  
  @js.native
  trait Props extends StObject {
    
    var index: Double = js.native
    
    def onPress(id: Double): Unit = js.native
  }
  object Props {
    
    @scala.inline
    def apply(index: Double, onPress: Double => Unit): Props = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], onPress = js.Any.fromFunction1(onPress))
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPress(value: Double => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    }
  }
}

package typings.storybookReactNative

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelMod {
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/panel", JSImport.Default)
  @js.native
  class default () extends Panel
  
  @js.native
  trait Panel
    extends PureComponent[Props, js.Object, js.Any]
  
  @js.native
  trait Props extends StObject {
    
    var style: js.Array[_] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(style: js.Array[_]): Props = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: js.Array[_]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleVarargs(value: js.Any*): Self = StObject.set(x, "style", js.Array(value :_*))
    }
  }
}

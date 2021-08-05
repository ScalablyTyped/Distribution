package typings.storybookReactNative

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelMod {
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/panel", JSImport.Default)
  @js.native
  class default () extends Panel
  
  @js.native
  trait Panel
    extends PureComponent[Props, js.Object, js.Any]
  
  trait Props extends StObject {
    
    var style: js.Array[js.Any]
  }
  object Props {
    
    inline def apply(style: js.Array[js.Any]): Props = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setStyle(value: js.Array[js.Any]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleVarargs(value: js.Any*): Self = StObject.set(x, "style", js.Array(value :_*))
    }
  }
}

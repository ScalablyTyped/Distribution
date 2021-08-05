package typings.reactNativePullToRefresh

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-pull-to-refresh", JSImport.Default)
  @js.native
  class default ()
    extends Component[PTRViewProps, js.Any, js.Any]
  
  type PTRView = Component[PTRViewProps, js.Any, js.Any]
  
  trait PTRViewProps extends StObject {
    
    // default 80
    // android only
    var colors: js.UndefOr[String] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    // iOS only
    var offset: js.UndefOr[Double] = js.undefined
    
    var onRefresh: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    // default #000
    var progressBackgroundColor: js.UndefOr[String] = js.undefined
    
    // default O
    var style: js.UndefOr[js.Object] = js.undefined
  }
  object PTRViewProps {
    
    inline def apply(): PTRViewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PTRViewProps]
    }
    
    extension [Self <: PTRViewProps](x: Self) {
      
      inline def setColors(value: String): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOnRefresh(value: () => js.Any): Self = StObject.set(x, "onRefresh", js.Any.fromFunction0(value))
      
      inline def setOnRefreshUndefined: Self = StObject.set(x, "onRefresh", js.undefined)
      
      inline def setProgressBackgroundColor(value: String): Self = StObject.set(x, "progressBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setProgressBackgroundColorUndefined: Self = StObject.set(x, "progressBackgroundColor", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}

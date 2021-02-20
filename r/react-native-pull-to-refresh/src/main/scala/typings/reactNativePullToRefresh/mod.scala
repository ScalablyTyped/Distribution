package typings.reactNativePullToRefresh

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-pull-to-refresh", JSImport.Default)
  @js.native
  class default ()
    extends Component[PTRViewProps, js.Any, js.Any]
  
  type PTRView = Component[PTRViewProps, js.Any, js.Any]
  
  @js.native
  trait PTRViewProps extends StObject {
    
    // default 80
    // android only
    var colors: js.UndefOr[String] = js.native
    
    var delay: js.UndefOr[Double] = js.native
    
    // iOS only
    var offset: js.UndefOr[Double] = js.native
    
    var onRefresh: js.UndefOr[js.Function0[_]] = js.native
    
    // default #000
    var progressBackgroundColor: js.UndefOr[String] = js.native
    
    // default O
    var style: js.UndefOr[js.Object] = js.native
  }
  object PTRViewProps {
    
    @scala.inline
    def apply(): PTRViewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PTRViewProps]
    }
    
    @scala.inline
    implicit class PTRViewPropsMutableBuilder[Self <: PTRViewProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: String): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOnRefresh(value: () => _): Self = StObject.set(x, "onRefresh", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnRefreshUndefined: Self = StObject.set(x, "onRefresh", js.undefined)
      
      @scala.inline
      def setProgressBackgroundColor(value: String): Self = StObject.set(x, "progressBackgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressBackgroundColorUndefined: Self = StObject.set(x, "progressBackgroundColor", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}

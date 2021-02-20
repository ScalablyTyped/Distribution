package typings.reactNativeScaledImage

import typings.react.mod.Component
import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-scaled-image", JSImport.Default)
  @js.native
  class default ()
    extends Component[ScaledImageProps, js.Object, js.Any]
  
  type ScaledImage = Component[ScaledImageProps, js.Object, js.Any]
  
  @js.native
  trait ScaledImageProps extends StObject {
    
    var height: js.UndefOr[Double] = js.native
    
    var source: ImageSourcePropType = js.native
    
    var style: js.UndefOr[StyleProp[ImageStyle]] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object ScaledImageProps {
    
    @scala.inline
    def apply(source: ImageSourcePropType): ScaledImageProps = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScaledImageProps]
    }
    
    @scala.inline
    implicit class ScaledImagePropsMutableBuilder[Self <: ScaledImageProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setSource(value: ImageSourcePropType): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceVarargs(value: ImageURISource*): Self = StObject.set(x, "source", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: StyleProp[ImageStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}

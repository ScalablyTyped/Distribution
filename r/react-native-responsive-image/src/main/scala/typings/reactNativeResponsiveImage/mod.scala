package typings.reactNativeResponsiveImage

import typings.react.mod.Component
import typings.reactNative.mod.Image
import typings.reactNative.mod.ImageBackground
import typings.reactNative.mod.ImageErrorEventData
import typings.reactNative.mod.ImageLoadEventData
import typings.reactNative.mod.ImageProgressEventDataIOS
import typings.reactNative.mod.ImageResizeMode
import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.StyleProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-responsive-image", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ResponsiveImageProps, js.Object, Any]
  
  type ResponsiveImage = Component[ResponsiveImageProps, js.Object, Any]
  
  trait ResponsiveImageProps extends StObject {
    
    var borderRadius: js.UndefOr[Double] = js.undefined
    
    var component: js.UndefOr[Image | ImageBackground] = js.undefined
    
    /**
      * A static image to display while downloading the final image off the network.
      */
    var defaultSource: js.UndefOr[ImageURISource | Double] = js.undefined
    
    /**
      * Image initial height
      */
    var initHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Image initial width
      */
    var initWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Invoked on load error with {nativeEvent: {error}}
      */
    var onError: js.UndefOr[js.Function1[/* error */ NativeSyntheticEvent[ImageErrorEventData], Unit]] = js.undefined
    
    /**
      * Invoked when load completes successfully
      * { source: { url, height, width } }.
      */
    var onLoad: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[ImageLoadEventData], Unit]] = js.undefined
    
    /**
      * Invoked when load either succeeds or fails
      */
    var onLoadEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Invoked on load start
      */
    var onLoadStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Invoked on download progress with {nativeEvent: {loaded, total}}
      */
    var onProgress: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[ImageProgressEventDataIOS], Unit]] = js.undefined
    
    /**
      * Determines how to resize the image when the frame doesn't match the raw
      * image dimensions.
      *
      * 'cover': Scale the image uniformly (maintain the image's aspect ratio)
      * so that both dimensions (width and height) of the image will be equal
      * to or larger than the corresponding dimension of the view (minus padding).
      *
      * 'contain': Scale the image uniformly (maintain the image's aspect ratio)
      * so that both dimensions (width and height) of the image will be equal to
      * or less than the corresponding dimension of the view (minus padding).
      *
      * 'stretch': Scale width and height independently, This may change the
      * aspect ratio of the src.
      *
      * 'repeat': Repeat the image to cover the frame of the view.
      * The image will keep it's size and aspect ratio. (iOS only)
      *
      * 'center': Scale the image down so that it is completely visible,
      * if bigger than the area of the view.
      * The image will not be scaled up.
      */
    var resizeMode: js.UndefOr[ImageResizeMode] = js.undefined
    
    /**
      * The image source (either a remote URL or a local file resource).
      *
      * This prop can also contain several remote URLs, specified together with their width and height and potentially with scale/other URI arguments.
      * The native side will then choose the best uri to display based on the measured size of the image container.
      * A cache property can be added to control how networked request interacts with the local cache.
      *
      * The currently supported formats are png, jpg, jpeg, bmp, gif, webp (Android only), psd (iOS only).
      */
    var source: ImageSourcePropType
    
    /**
      * Style
      */
    var style: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
  }
  object ResponsiveImageProps {
    
    inline def apply(source: ImageSourcePropType): ResponsiveImageProps = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponsiveImageProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResponsiveImageProps] (val x: Self) extends AnyVal {
      
      inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      inline def setComponent(value: Image | ImageBackground): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setDefaultSource(value: ImageURISource | Double): Self = StObject.set(x, "defaultSource", value.asInstanceOf[js.Any])
      
      inline def setDefaultSourceUndefined: Self = StObject.set(x, "defaultSource", js.undefined)
      
      inline def setInitHeight(value: Double): Self = StObject.set(x, "initHeight", value.asInstanceOf[js.Any])
      
      inline def setInitHeightUndefined: Self = StObject.set(x, "initHeight", js.undefined)
      
      inline def setInitWidth(value: Double): Self = StObject.set(x, "initWidth", value.asInstanceOf[js.Any])
      
      inline def setInitWidthUndefined: Self = StObject.set(x, "initWidth", js.undefined)
      
      inline def setOnError(value: /* error */ NativeSyntheticEvent[ImageErrorEventData] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnLoad(value: /* event */ NativeSyntheticEvent[ImageLoadEventData] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadEnd(value: () => Unit): Self = StObject.set(x, "onLoadEnd", js.Any.fromFunction0(value))
      
      inline def setOnLoadEndUndefined: Self = StObject.set(x, "onLoadEnd", js.undefined)
      
      inline def setOnLoadStart(value: () => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction0(value))
      
      inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnProgress(value: /* event */ NativeSyntheticEvent[ImageProgressEventDataIOS] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setResizeMode(value: ImageResizeMode): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
      
      inline def setResizeModeUndefined: Self = StObject.set(x, "resizeMode", js.undefined)
      
      inline def setSource(value: ImageSourcePropType): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceVarargs(value: ImageURISource*): Self = StObject.set(x, "source", js.Array(value*))
      
      inline def setStyle(value: StyleProp[ImageStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}

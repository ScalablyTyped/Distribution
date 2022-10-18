package typings.reactNativePaper.anon

import typings.react.mod.ReactNode
import typings.reactNative.mod.ImageErrorEventData
import typings.reactNative.mod.ImageLoadEventData
import typings.reactNative.mod.ImageProgressEventDataIOS
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativePaper.libTypescriptComponentsAvatarAvatarImageMod.AvatarImageSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnError extends StObject {
  
  /**
    * Invoked on load error.
    */
  var onError: js.UndefOr[js.Function1[/* error */ NativeSyntheticEvent[ImageErrorEventData], Unit]] = js.undefined
  
  /**
    * Invoked on mount and on layout changes.
    */
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
  
  /**
    * Invoked when load completes successfully.
    */
  var onLoad: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[ImageLoadEventData], Unit]] = js.undefined
  
  /**
    * Invoked when load either succeeds or fails.
    */
  var onLoadEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Invoked on load start.
    */
  var onLoadStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Invoked on download progress.
    */
  var onProgress: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[ImageProgressEventDataIOS], Unit]] = js.undefined
  
  /**
    * Size of the avatar.
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * Image to display for the `Avatar`.
    * It accepts a standard React Native Image `source` prop
    * Or a function that returns an `Image`.
    */
  var source: AvatarImageSource
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @optional
    */
  var theme: typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
}
object OnError {
  
  inline def apply(
    source: AvatarImageSource,
    theme: typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
  ): OnError = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnError]
  }
  
  extension [Self <: OnError](x: Self) {
    
    inline def setOnError(value: /* error */ NativeSyntheticEvent[ImageErrorEventData] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
    
    inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    inline def setOnLoad(value: /* event */ NativeSyntheticEvent[ImageLoadEventData] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    inline def setOnLoadEnd(value: () => Unit): Self = StObject.set(x, "onLoadEnd", js.Any.fromFunction0(value))
    
    inline def setOnLoadEndUndefined: Self = StObject.set(x, "onLoadEnd", js.undefined)
    
    inline def setOnLoadStart(value: () => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction0(value))
    
    inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setOnProgress(value: /* event */ NativeSyntheticEvent[ImageProgressEventDataIOS] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
    
    inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSource(value: AvatarImageSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceFunction1(value: /* props */ SizeNumber => ReactNode): Self = StObject.set(x, "source", js.Any.fromFunction1(value))
    
    inline def setSourceVarargs(value: ImageURISource*): Self = StObject.set(x, "source", js.Array(value*))
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTheme(value: typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}

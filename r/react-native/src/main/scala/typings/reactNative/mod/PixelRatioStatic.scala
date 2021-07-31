package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PixelRatioStatic extends StObject {
  
  /*
    Returns the device pixel density. Some examples:
    PixelRatio.get() === 1
    mdpi Android devices (160 dpi)
    PixelRatio.get() === 1.5
    hdpi Android devices (240 dpi)
    PixelRatio.get() === 2
    iPhone 4, 4S
    iPhone 5, 5c, 5s
    iPhone 6
    xhdpi Android devices (320 dpi)
    PixelRatio.get() === 3
    iPhone 6 plus
    xxhdpi Android devices (480 dpi)
    PixelRatio.get() === 3.5
    Nexus 6
    */
  def get(): Double
  
  /*
    Returns the scaling factor for font sizes. This is the ratio that is
    used to calculate the absolute font size, so any elements that
    heavily depend on that should use this to do calculations.
    If a font scale is not set, this returns the device pixel ratio.
    Currently this is only implemented on Android and reflects the user
    preference set in Settings > Display > Font size,
    on iOS it will always return the default pixel ratio.
    */
  def getFontScale(): Double
  
  /**
    * Converts a layout size (dp) to pixel size (px).
    * Guaranteed to return an integer number.
    */
  def getPixelSizeForLayoutSize(layoutSize: Double): Double
  
  /**
    * Rounds a layout size (dp) to the nearest layout size that
    * corresponds to an integer number of pixels. For example,
    * on a device with a PixelRatio of 3,
    * PixelRatio.roundToNearestPixel(8.4) = 8.33,
    * which corresponds to exactly (8.33 * 3) = 25 pixels.
    */
  def roundToNearestPixel(layoutSize: Double): Double
  
  /**
    * No-op for iOS, but used on the web. Should not be documented. [sic]
    */
  def startDetecting(): Unit
}
object PixelRatioStatic {
  
  @scala.inline
  def apply(
    get: () => Double,
    getFontScale: () => Double,
    getPixelSizeForLayoutSize: Double => Double,
    roundToNearestPixel: Double => Double,
    startDetecting: () => Unit
  ): PixelRatioStatic = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), getFontScale = js.Any.fromFunction0(getFontScale), getPixelSizeForLayoutSize = js.Any.fromFunction1(getPixelSizeForLayoutSize), roundToNearestPixel = js.Any.fromFunction1(roundToNearestPixel), startDetecting = js.Any.fromFunction0(startDetecting))
    __obj.asInstanceOf[PixelRatioStatic]
  }
  
  @scala.inline
  implicit class PixelRatioStaticMutableBuilder[Self <: PixelRatioStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet(value: () => Double): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFontScale(value: () => Double): Self = StObject.set(x, "getFontScale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPixelSizeForLayoutSize(value: Double => Double): Self = StObject.set(x, "getPixelSizeForLayoutSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRoundToNearestPixel(value: Double => Double): Self = StObject.set(x, "roundToNearestPixel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartDetecting(value: () => Unit): Self = StObject.set(x, "startDetecting", js.Any.fromFunction0(value))
  }
}

package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchScreenshotOptions extends StObject {
  
  /**
    * The `allowableMismatchedPixels` value is the total number of pixels
    * that can be mismatched until the test fails. For example, if the value
    * is `100`, and if there were `101` pixels that were mismatched then the
    * test would fail. If the `allowableMismatchedRatio` is provided it will
    * take precedence, otherwise `allowableMismatchedPixels` will be used.
    */
  var allowableMismatchedPixels: js.UndefOr[Double] = js.undefined
  
  /**
    * The `allowableMismatchedRatio` ranges from `0` to `1` and is used to
    * determine an acceptable ratio of pixels that can be mismatched before
    * the image is considered to have changes. Realistically, two screenshots
    * representing the same content may have a small number of pixels that
    * are not identical due to anti-aliasing, which is perfectly normal. The
    * `allowableMismatchedRatio` is the number of pixels that were mismatched,
    * divided by the total number of pixels in the screenshot. For example,
    * a ratio value of `0.06` means 6% of the pixels can be mismatched before
    * the image is considered to have changes. If the `allowableMismatchedRatio`
    * is provided it will take precedence, otherwise `allowableMismatchedPixels`
    * will be used.
    */
  var allowableMismatchedRatio: js.UndefOr[Double] = js.undefined
}
object MatchScreenshotOptions {
  
  inline def apply(): MatchScreenshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchScreenshotOptions]
  }
  
  extension [Self <: MatchScreenshotOptions](x: Self) {
    
    inline def setAllowableMismatchedPixels(value: Double): Self = StObject.set(x, "allowableMismatchedPixels", value.asInstanceOf[js.Any])
    
    inline def setAllowableMismatchedPixelsUndefined: Self = StObject.set(x, "allowableMismatchedPixels", js.undefined)
    
    inline def setAllowableMismatchedRatio(value: Double): Self = StObject.set(x, "allowableMismatchedRatio", value.asInstanceOf[js.Any])
    
    inline def setAllowableMismatchedRatioUndefined: Self = StObject.set(x, "allowableMismatchedRatio", js.undefined)
  }
}

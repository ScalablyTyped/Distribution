package typings.qiniuJs.mod

import typings.qiniuJs.qiniuJsNumbers.`0`
import typings.qiniuJs.qiniuJsNumbers.`1`
import typings.qiniuJs.qiniuJsNumbers.`2`
import typings.qiniuJs.qiniuJsNumbers.`3`
import typings.qiniuJs.qiniuJsNumbers.`4`
import typings.qiniuJs.qiniuJsNumbers.`5`
import typings.qiniuJs.qiniuJsStrings.gif
import typings.qiniuJs.qiniuJsStrings.jpg
import typings.qiniuJs.qiniuJsStrings.png
import typings.qiniuJs.qiniuJsStrings.webp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageView2Options extends StObject {
  
  // 新图的图像质量，取值范围：1-100
  var format: jpg | gif | png | webp | String = js.native
  
  // 具体含义由缩略模式决定
  var h: Double = js.native
  
  var mode: `0` | `1` | `2` | `3` | `4` | `5` = js.native
  
  // 具体含义由缩略模式决定
  var q: Double = js.native
  
  // 缩略模式，共6种[0-5]
  var w: Double = js.native
}
object ImageView2Options {
  
  @scala.inline
  def apply(
    format: jpg | gif | png | webp | String,
    h: Double,
    mode: `0` | `1` | `2` | `3` | `4` | `5`,
    q: Double,
    w: Double
  ): ImageView2Options = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageView2Options]
  }
  
  @scala.inline
  implicit class ImageView2OptionsMutableBuilder[Self <: ImageView2Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: jpg | gif | png | webp | String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: `0` | `1` | `2` | `3` | `4` | `5`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ(value: Double): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
  }
}

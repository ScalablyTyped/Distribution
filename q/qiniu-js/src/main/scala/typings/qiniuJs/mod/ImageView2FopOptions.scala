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
trait ImageView2FopOptions extends ImageView2Options {
  
  var fop: typings.qiniuJs.qiniuJsStrings.imageView2 = js.native
}
object ImageView2FopOptions {
  
  @scala.inline
  def apply(
    fop: typings.qiniuJs.qiniuJsStrings.imageView2,
    format: jpg | gif | png | webp | String,
    h: Double,
    mode: `0` | `1` | `2` | `3` | `4` | `5`,
    q: Double,
    w: Double
  ): ImageView2FopOptions = {
    val __obj = js.Dynamic.literal(fop = fop.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageView2FopOptions]
  }
  
  @scala.inline
  implicit class ImageView2FopOptionsMutableBuilder[Self <: ImageView2FopOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFop(value: typings.qiniuJs.qiniuJsStrings.imageView2): Self = StObject.set(x, "fop", value.asInstanceOf[js.Any])
  }
}

package typings
package qiniuDashJsLib.qiniuDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageView2FopOptions extends ImageView2Options {
  var fop: qiniuDashJsLib.qiniuDashJsLibStrings.imageView2
}

object ImageView2FopOptions {
  @scala.inline
  def apply(
    fop: qiniuDashJsLib.qiniuDashJsLibStrings.imageView2,
    format: qiniuDashJsLib.qiniuDashJsLibStrings.jpg | qiniuDashJsLib.qiniuDashJsLibStrings.gif | qiniuDashJsLib.qiniuDashJsLibStrings.png | qiniuDashJsLib.qiniuDashJsLibStrings.webp | java.lang.String,
    h: scala.Double,
    mode: qiniuDashJsLib.qiniuDashJsLibNumbers.`0` | qiniuDashJsLib.qiniuDashJsLibNumbers.`1` | qiniuDashJsLib.qiniuDashJsLibNumbers.`2` | qiniuDashJsLib.qiniuDashJsLibNumbers.`3` | qiniuDashJsLib.qiniuDashJsLibNumbers.`4` | qiniuDashJsLib.qiniuDashJsLibNumbers.`5`,
    q: scala.Double,
    w: scala.Double
  ): ImageView2FopOptions = {
    val __obj = js.Dynamic.literal(fop = fop, format = format.asInstanceOf[js.Any], h = h, mode = mode.asInstanceOf[js.Any], q = q, w = w)
  
    __obj.asInstanceOf[ImageView2FopOptions]
  }
}


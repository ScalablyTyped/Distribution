package typings
package sharpLib.sharpMod.sharpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KernelEnum extends js.Object {
  var cubic: sharpLib.sharpLibStrings.cubic
  var lanczos2: sharpLib.sharpLibStrings.lanczos2
  var lanczos3: sharpLib.sharpLibStrings.lanczos3
  var nearest: sharpLib.sharpLibStrings.nearest
}

object KernelEnum {
  @scala.inline
  def apply(
    cubic: sharpLib.sharpLibStrings.cubic,
    lanczos2: sharpLib.sharpLibStrings.lanczos2,
    lanczos3: sharpLib.sharpLibStrings.lanczos3,
    nearest: sharpLib.sharpLibStrings.nearest
  ): KernelEnum = {
    val __obj = js.Dynamic.literal(cubic = cubic, lanczos2 = lanczos2, lanczos3 = lanczos3, nearest = nearest)
  
    __obj.asInstanceOf[KernelEnum]
  }
}


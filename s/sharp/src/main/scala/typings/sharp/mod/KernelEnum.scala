package typings.sharp.mod

import typings.sharp.sharpStrings.cubic
import typings.sharp.sharpStrings.lanczos2
import typings.sharp.sharpStrings.lanczos3
import typings.sharp.sharpStrings.mitchell
import typings.sharp.sharpStrings.nearest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KernelEnum extends js.Object {
  var cubic: typings.sharp.sharpStrings.cubic
  var lanczos2: typings.sharp.sharpStrings.lanczos2
  var lanczos3: typings.sharp.sharpStrings.lanczos3
  var mitchell: typings.sharp.sharpStrings.mitchell
  var nearest: typings.sharp.sharpStrings.nearest
}

object KernelEnum {
  @scala.inline
  def apply(cubic: cubic, lanczos2: lanczos2, lanczos3: lanczos3, mitchell: mitchell, nearest: nearest): KernelEnum = {
    val __obj = js.Dynamic.literal(cubic = cubic.asInstanceOf[js.Any], lanczos2 = lanczos2.asInstanceOf[js.Any], lanczos3 = lanczos3.asInstanceOf[js.Any], mitchell = mitchell.asInstanceOf[js.Any], nearest = nearest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KernelEnum]
  }
}


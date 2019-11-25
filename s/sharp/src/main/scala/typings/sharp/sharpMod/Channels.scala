package typings.sharp.sharpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 3 for sRGB, 4 for CMYK */
/* Rewritten from type alias, can be one of: 
  - typings.sharp.sharpNumbers.`3`
  - typings.sharp.sharpNumbers.`4`
*/
trait Channels extends js.Object

object Channels {
  @scala.inline
  def `3`: typings.sharp.sharpNumbers.`3` = this.cast(3)
  @scala.inline
  def `4`: typings.sharp.sharpNumbers.`4` = this.cast(4)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


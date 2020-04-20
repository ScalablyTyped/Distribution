package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EXTBlendMinmax extends js.Object {
  val MAX_EXT: GLenum
  val MIN_EXT: GLenum
}

object EXTBlendMinmax {
  @scala.inline
  def apply(MAX_EXT: GLenum, MIN_EXT: GLenum): EXTBlendMinmax = {
    val __obj = js.Dynamic.literal(MAX_EXT = MAX_EXT.asInstanceOf[js.Any], MIN_EXT = MIN_EXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[EXTBlendMinmax]
  }
}


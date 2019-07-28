package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EXT_blend_minmax extends js.Object {
  val MAX_EXT: GLenum
  val MIN_EXT: GLenum
}

object EXT_blend_minmax {
  @scala.inline
  def apply(MAX_EXT: GLenum, MIN_EXT: GLenum): EXT_blend_minmax = {
    val __obj = js.Dynamic.literal(MAX_EXT = MAX_EXT, MIN_EXT = MIN_EXT)
  
    __obj.asInstanceOf[EXT_blend_minmax]
  }
}


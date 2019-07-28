package typings.raphael

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaphaelFont extends js.Object {
  var face: js.Any
  var glyphs: js.Any
  var w: Double
}

object RaphaelFont {
  @scala.inline
  def apply(face: js.Any, glyphs: js.Any, w: Double): RaphaelFont = {
    val __obj = js.Dynamic.literal(face = face, glyphs = glyphs, w = w)
  
    __obj.asInstanceOf[RaphaelFont]
  }
}


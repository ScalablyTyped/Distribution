package typings.storybookTheming.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Black extends js.Object {
  var black: Double
  var bold: Double
  var regular: Double
}

object Black {
  @scala.inline
  def apply(black: Double, bold: Double, regular: Double): Black = {
    val __obj = js.Dynamic.literal(black = black.asInstanceOf[js.Any], bold = bold.asInstanceOf[js.Any], regular = regular.asInstanceOf[js.Any])
    __obj.asInstanceOf[Black]
  }
}


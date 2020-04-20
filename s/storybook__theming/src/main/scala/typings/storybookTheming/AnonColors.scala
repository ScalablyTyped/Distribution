package typings.storybookTheming

import typings.storybookTheming.syntaxMod.ColorsHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColors extends js.Object {
  var colors: ColorsHash
  var mono: String
}

object AnonColors {
  @scala.inline
  def apply(colors: ColorsHash, mono: String): AnonColors = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], mono = mono.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColors]
  }
}


package typings.storybookTheming.anon

import typings.storybookTheming.syntaxMod.ColorsHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Colors extends js.Object {
  var colors: ColorsHash
  var mono: String
}

object Colors {
  @scala.inline
  def apply(colors: ColorsHash, mono: String): Colors = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], mono = mono.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colors]
  }
}


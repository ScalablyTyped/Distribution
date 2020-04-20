package typings.rbx.heroHeroMod

import typings.rbx.rbxStrings.`fullheight-with-navbar`
import typings.rbx.rbxStrings.fullheight
import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeroVariablesDefaults extends js.Object {
  var sizes: small | medium | large | fullheight | `fullheight-with-navbar`
}

object HeroVariablesDefaults {
  @scala.inline
  def apply(sizes: small | medium | large | fullheight | `fullheight-with-navbar`): HeroVariablesDefaults = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeroVariablesDefaults]
  }
}


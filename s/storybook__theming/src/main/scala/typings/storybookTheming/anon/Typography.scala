package typings.storybookTheming.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typography extends js.Object {
  var typography: Fonts
}

object Typography {
  @scala.inline
  def apply(typography: Fonts): Typography = {
    val __obj = js.Dynamic.literal(typography = typography.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typography]
  }
}


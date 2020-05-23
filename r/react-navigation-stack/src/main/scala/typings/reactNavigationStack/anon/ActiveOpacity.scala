package typings.reactNavigationStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveOpacity extends js.Object {
  var activeOpacity: Double
  var borderless: Boolean
}

object ActiveOpacity {
  @scala.inline
  def apply(activeOpacity: Double, borderless: Boolean): ActiveOpacity = {
    val __obj = js.Dynamic.literal(activeOpacity = activeOpacity.asInstanceOf[js.Any], borderless = borderless.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveOpacity]
  }
}


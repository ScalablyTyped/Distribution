package typings.storybookComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsLink extends js.Object {
  var isLink: Boolean = js.native
}

object IsLink {
  @scala.inline
  def apply(isLink: Boolean): IsLink = {
    val __obj = js.Dynamic.literal(isLink = isLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsLink]
  }
}


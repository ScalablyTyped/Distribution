package typings.storybookComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsLink extends js.Object {
  var isLink: Boolean = js.native
}

object AnonIsLink {
  @scala.inline
  def apply(isLink: Boolean): AnonIsLink = {
    val __obj = js.Dynamic.literal(isLink = isLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsLink]
  }
}


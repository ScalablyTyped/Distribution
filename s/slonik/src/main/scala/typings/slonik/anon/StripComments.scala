package typings.slonik.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripComments extends js.Object {
  var stripComments: js.UndefOr[Boolean] = js.undefined
}

object StripComments {
  @scala.inline
  def apply(stripComments: js.UndefOr[Boolean] = js.undefined): StripComments = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stripComments)) __obj.updateDynamic("stripComments")(stripComments.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripComments]
  }
}


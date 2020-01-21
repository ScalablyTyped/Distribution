package typings.slonik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStripComments extends js.Object {
  var stripComments: js.UndefOr[Boolean] = js.undefined
}

object AnonStripComments {
  @scala.inline
  def apply(stripComments: js.UndefOr[Boolean] = js.undefined): AnonStripComments = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stripComments)) __obj.updateDynamic("stripComments")(stripComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStripComments]
  }
}


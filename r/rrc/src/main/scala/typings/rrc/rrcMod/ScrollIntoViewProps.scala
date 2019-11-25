package typings.rrc.rrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollIntoViewProps extends js.Object {
  var alignToTop: js.UndefOr[Boolean] = js.undefined
  var id: String
}

object ScrollIntoViewProps {
  @scala.inline
  def apply(id: String, alignToTop: js.UndefOr[Boolean] = js.undefined): ScrollIntoViewProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (!js.isUndefined(alignToTop)) __obj.updateDynamic("alignToTop")(alignToTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollIntoViewProps]
  }
}


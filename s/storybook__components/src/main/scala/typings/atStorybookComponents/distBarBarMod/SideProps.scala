package typings.atStorybookComponents.distBarBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SideProps extends js.Object {
  var left: js.UndefOr[Boolean] = js.undefined
  var right: js.UndefOr[Boolean] = js.undefined
}

object SideProps {
  @scala.inline
  def apply(left: js.UndefOr[Boolean] = js.undefined, right: js.UndefOr[Boolean] = js.undefined): SideProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left)
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right)
    __obj.asInstanceOf[SideProps]
  }
}


package typings.storybookComponents.barMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SideProps extends js.Object {
  var left: js.UndefOr[Boolean] = js.native
  var right: js.UndefOr[Boolean] = js.native
}

object SideProps {
  @scala.inline
  def apply(left: js.UndefOr[Boolean] = js.undefined, right: js.UndefOr[Boolean] = js.undefined): SideProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideProps]
  }
}


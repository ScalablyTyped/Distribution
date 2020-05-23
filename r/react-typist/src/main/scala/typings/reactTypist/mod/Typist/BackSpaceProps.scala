package typings.reactTypist.mod.Typist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackSpaceProps extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
}

object BackSpaceProps {
  @scala.inline
  def apply(count: js.UndefOr[Double] = js.undefined, delay: js.UndefOr[Double] = js.undefined): BackSpaceProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackSpaceProps]
  }
}


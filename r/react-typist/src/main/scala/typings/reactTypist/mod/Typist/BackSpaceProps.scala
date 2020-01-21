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
  def apply(count: Int | Double = null, delay: Int | Double = null): BackSpaceProps = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackSpaceProps]
  }
}


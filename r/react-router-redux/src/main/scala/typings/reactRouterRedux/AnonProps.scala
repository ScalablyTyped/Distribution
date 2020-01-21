package typings.reactRouterRedux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProps extends js.Object {
  var props: js.UndefOr[AnonHistory] = js.undefined
}

object AnonProps {
  @scala.inline
  def apply(props: AnonHistory = null): AnonProps = {
    val __obj = js.Dynamic.literal()
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProps]
  }
}


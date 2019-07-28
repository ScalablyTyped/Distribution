package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromPortToPort extends js.Object {
  var fromPort: js.UndefOr[Double] = js.undefined
  var toPort: js.UndefOr[Double] = js.undefined
}

object Anon_FromPortToPort {
  @scala.inline
  def apply(fromPort: Int | Double = null, toPort: Int | Double = null): Anon_FromPortToPort = {
    val __obj = js.Dynamic.literal()
    if (fromPort != null) __obj.updateDynamic("fromPort")(fromPort.asInstanceOf[js.Any])
    if (toPort != null) __obj.updateDynamic("toPort")(toPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FromPortToPort]
  }
}


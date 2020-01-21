package typings.reactRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataUnknown extends js.Object {
  @JSName(" $data")
  val Space$data: js.UndefOr[js.Any] = js.undefined
}

object AnonDataUnknown {
  @scala.inline
  def apply(Space$data: js.Any = null): AnonDataUnknown = {
    val __obj = js.Dynamic.literal()
    if (Space$data != null) __obj.updateDynamic(" $data")(Space$data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataUnknown]
  }
}


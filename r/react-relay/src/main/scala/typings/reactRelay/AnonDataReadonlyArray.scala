package typings.reactRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataReadonlyArray extends js.Object {
  @JSName(" $data")
  val Space$data: js.UndefOr[js.Array[_]] = js.undefined
}

object AnonDataReadonlyArray {
  @scala.inline
  def apply(Space$data: js.Array[_] = null): AnonDataReadonlyArray = {
    val __obj = js.Dynamic.literal()
    if (Space$data != null) __obj.updateDynamic(" $data")(Space$data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataReadonlyArray]
  }
}


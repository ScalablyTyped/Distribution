package typings.reactRelay.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  @JSName(" $data")
  val Space$data: js.UndefOr[js.Array[_]] = js.undefined
}

object Data {
  @scala.inline
  def apply(Space$data: js.Array[_] = null): Data = {
    val __obj = js.Dynamic.literal()
    if (Space$data != null) __obj.updateDynamic(" $data")(Space$data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}


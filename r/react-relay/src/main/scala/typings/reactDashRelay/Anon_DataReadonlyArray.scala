package typings.reactDashRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataReadonlyArray extends js.Object {
  @JSName(" $data")
  val Space$data: js.UndefOr[js.Array[_]] = js.undefined
}

object Anon_DataReadonlyArray {
  @scala.inline
  def apply(Space$data: js.Array[_] = null): Anon_DataReadonlyArray = {
    val __obj = js.Dynamic.literal()
    if (Space$data != null) __obj.updateDynamic(" $data")(Space$data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataReadonlyArray]
  }
}


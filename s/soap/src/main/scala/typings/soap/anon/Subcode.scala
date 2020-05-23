package typings.soap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subcode extends js.Object {
  var Subcode: js.UndefOr[Value] = js.undefined
  var Value: String
}

object Subcode {
  @scala.inline
  def apply(Value: String, Subcode: Value = null): Subcode = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    if (Subcode != null) __obj.updateDynamic("Subcode")(Subcode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subcode]
  }
}


package typings.soap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Subcode extends js.Object {
  var Subcode: js.UndefOr[Anon_Value] = js.undefined
  var Value: String
}

object Anon_Subcode {
  @scala.inline
  def apply(Value: String, Subcode: Anon_Value = null): Anon_Subcode = {
    val __obj = js.Dynamic.literal(Value = Value)
    if (Subcode != null) __obj.updateDynamic("Subcode")(Subcode)
    __obj.asInstanceOf[Anon_Subcode]
  }
}


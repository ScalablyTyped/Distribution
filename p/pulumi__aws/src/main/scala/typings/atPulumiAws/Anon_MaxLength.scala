package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxLength extends js.Object {
  var maxLength: js.UndefOr[String] = js.undefined
  var minLength: js.UndefOr[String] = js.undefined
}

object Anon_MaxLength {
  @scala.inline
  def apply(maxLength: String = null, minLength: String = null): Anon_MaxLength = {
    val __obj = js.Dynamic.literal()
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength)
    if (minLength != null) __obj.updateDynamic("minLength")(minLength)
    __obj.asInstanceOf[Anon_MaxLength]
  }
}


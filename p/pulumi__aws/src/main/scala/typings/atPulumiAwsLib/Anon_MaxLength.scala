package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxLength extends js.Object {
  var maxLength: js.UndefOr[java.lang.String] = js.undefined
  var minLength: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_MaxLength {
  @scala.inline
  def apply(maxLength: java.lang.String = null, minLength: java.lang.String = null): Anon_MaxLength = {
    val __obj = js.Dynamic.literal()
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength)
    if (minLength != null) __obj.updateDynamic("minLength")(minLength)
    __obj.asInstanceOf[Anon_MaxLength]
  }
}


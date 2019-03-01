package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BitDepth extends js.Object {
  var bitDepth: js.UndefOr[java.lang.String] = js.undefined
  var bitOrder: js.UndefOr[java.lang.String] = js.undefined
  var profile: js.UndefOr[java.lang.String] = js.undefined
  var signed: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BitDepth {
  @scala.inline
  def apply(
    bitDepth: java.lang.String = null,
    bitOrder: java.lang.String = null,
    profile: java.lang.String = null,
    signed: java.lang.String = null
  ): Anon_BitDepth = {
    val __obj = js.Dynamic.literal()
    if (bitDepth != null) __obj.updateDynamic("bitDepth")(bitDepth)
    if (bitOrder != null) __obj.updateDynamic("bitOrder")(bitOrder)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (signed != null) __obj.updateDynamic("signed")(signed)
    __obj.asInstanceOf[Anon_BitDepth]
  }
}


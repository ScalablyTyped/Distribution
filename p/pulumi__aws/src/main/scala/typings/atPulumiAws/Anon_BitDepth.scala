package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BitDepth extends js.Object {
  var bitDepth: js.UndefOr[String] = js.undefined
  var bitOrder: js.UndefOr[String] = js.undefined
  var profile: js.UndefOr[String] = js.undefined
  var signed: js.UndefOr[String] = js.undefined
}

object Anon_BitDepth {
  @scala.inline
  def apply(bitDepth: String = null, bitOrder: String = null, profile: String = null, signed: String = null): Anon_BitDepth = {
    val __obj = js.Dynamic.literal()
    if (bitDepth != null) __obj.updateDynamic("bitDepth")(bitDepth)
    if (bitOrder != null) __obj.updateDynamic("bitOrder")(bitOrder)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (signed != null) __obj.updateDynamic("signed")(signed)
    __obj.asInstanceOf[Anon_BitDepth]
  }
}


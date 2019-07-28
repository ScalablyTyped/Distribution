package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Forward extends js.Object {
  var forward: String
  var whitelistedNames: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_Forward {
  @scala.inline
  def apply(forward: String, whitelistedNames: js.Array[String] = null): Anon_Forward = {
    val __obj = js.Dynamic.literal(forward = forward)
    if (whitelistedNames != null) __obj.updateDynamic("whitelistedNames")(whitelistedNames)
    __obj.asInstanceOf[Anon_Forward]
  }
}


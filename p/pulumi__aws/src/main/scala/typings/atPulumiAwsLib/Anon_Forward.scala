package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Forward extends js.Object {
  var forward: java.lang.String
  var whitelistedNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Forward {
  @scala.inline
  def apply(forward: java.lang.String, whitelistedNames: js.Array[java.lang.String] = null): Anon_Forward = {
    val __obj = js.Dynamic.literal(forward = forward)
    if (whitelistedNames != null) __obj.updateDynamic("whitelistedNames")(whitelistedNames)
    __obj.asInstanceOf[Anon_Forward]
  }
}


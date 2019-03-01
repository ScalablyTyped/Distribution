package typings
package saslprepLib.saslprepMod.saslPrepNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowUnassigned: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(allowUnassigned: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUnassigned)) __obj.updateDynamic("allowUnassigned")(allowUnassigned)
    __obj.asInstanceOf[Options]
  }
}


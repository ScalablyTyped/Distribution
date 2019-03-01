package typings
package stellarDashBaseLib.stellarDashBaseMod.SignerOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreAuthTx
  extends stellarDashBaseLib.stellarDashBaseMod.SignerOptions {
  var preAuthTx: nodeLib.Buffer | java.lang.String
  var weight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object PreAuthTx {
  @scala.inline
  def apply(preAuthTx: nodeLib.Buffer | java.lang.String, weight: scala.Double | java.lang.String = null): PreAuthTx = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("preAuthTx")(preAuthTx.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreAuthTx]
  }
}


package typings
package stellarDashBaseLib.stellarDashBaseMod.SignerOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sha256Hash
  extends stellarDashBaseLib.stellarDashBaseMod.SignerOptions {
  var sha256Hash: nodeLib.Buffer | java.lang.String
  var weight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object Sha256Hash {
  @scala.inline
  def apply(sha256Hash: nodeLib.Buffer | java.lang.String, weight: scala.Double | java.lang.String = null): Sha256Hash = {
    val __obj = js.Dynamic.literal(sha256Hash = sha256Hash.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sha256Hash]
  }
}


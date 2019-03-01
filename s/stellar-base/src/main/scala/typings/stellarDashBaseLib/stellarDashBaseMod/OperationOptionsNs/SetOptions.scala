package typings
package stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetOptions[T /* <: stellarDashBaseLib.stellarDashBaseMod.SignerOptions */] extends BaseOptions {
  var clearFlags: js.UndefOr[stellarDashBaseLib.stellarDashBaseMod.AuthFlag] = js.undefined
  var highThreshold: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var homeDomain: js.UndefOr[java.lang.String] = js.undefined
  var inflationDest: js.UndefOr[java.lang.String] = js.undefined
  var lowThreshold: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var masterWeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var medThreshold: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var setFlags: js.UndefOr[stellarDashBaseLib.stellarDashBaseMod.AuthFlag] = js.undefined
  var signer: js.UndefOr[T] = js.undefined
}

object SetOptions {
  @scala.inline
  def apply[T /* <: stellarDashBaseLib.stellarDashBaseMod.SignerOptions */](
    clearFlags: stellarDashBaseLib.stellarDashBaseMod.AuthFlag = null,
    highThreshold: scala.Double | java.lang.String = null,
    homeDomain: java.lang.String = null,
    inflationDest: java.lang.String = null,
    lowThreshold: scala.Double | java.lang.String = null,
    masterWeight: scala.Double | java.lang.String = null,
    medThreshold: scala.Double | java.lang.String = null,
    setFlags: stellarDashBaseLib.stellarDashBaseMod.AuthFlag = null,
    signer: T = null,
    source: java.lang.String = null
  ): SetOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (clearFlags != null) __obj.updateDynamic("clearFlags")(clearFlags.asInstanceOf[js.Any])
    if (highThreshold != null) __obj.updateDynamic("highThreshold")(highThreshold.asInstanceOf[js.Any])
    if (homeDomain != null) __obj.updateDynamic("homeDomain")(homeDomain)
    if (inflationDest != null) __obj.updateDynamic("inflationDest")(inflationDest)
    if (lowThreshold != null) __obj.updateDynamic("lowThreshold")(lowThreshold.asInstanceOf[js.Any])
    if (masterWeight != null) __obj.updateDynamic("masterWeight")(masterWeight.asInstanceOf[js.Any])
    if (medThreshold != null) __obj.updateDynamic("medThreshold")(medThreshold.asInstanceOf[js.Any])
    if (setFlags != null) __obj.updateDynamic("setFlags")(setFlags.asInstanceOf[js.Any])
    if (signer != null) __obj.updateDynamic("signer")(signer.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[SetOptions[T]]
  }
}


package typings.soap.libSecurityWSSecurityCertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWSSecurityCertOptions extends js.Object {
  var hasTimeStamp: js.UndefOr[Boolean] = js.undefined
  var signatureAlgorithm: js.UndefOr[String] = js.undefined
  var signatureTransformations: js.UndefOr[js.Array[String]] = js.undefined
}

object IWSSecurityCertOptions {
  @scala.inline
  def apply(
    hasTimeStamp: js.UndefOr[Boolean] = js.undefined,
    signatureAlgorithm: String = null,
    signatureTransformations: js.Array[String] = null
  ): IWSSecurityCertOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasTimeStamp)) __obj.updateDynamic("hasTimeStamp")(hasTimeStamp)
    if (signatureAlgorithm != null) __obj.updateDynamic("signatureAlgorithm")(signatureAlgorithm)
    if (signatureTransformations != null) __obj.updateDynamic("signatureTransformations")(signatureTransformations)
    __obj.asInstanceOf[IWSSecurityCertOptions]
  }
}


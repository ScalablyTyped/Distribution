package typings
package soapLib.libSecurityWSSecurityCertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWSSecurityCertOptions extends js.Object {
  var hasTimeStamp: js.UndefOr[scala.Boolean] = js.undefined
  var signatureAlgorithm: js.UndefOr[java.lang.String] = js.undefined
  var signatureTransformations: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object IWSSecurityCertOptions {
  @scala.inline
  def apply(
    hasTimeStamp: js.UndefOr[scala.Boolean] = js.undefined,
    signatureAlgorithm: java.lang.String = null,
    signatureTransformations: js.Array[java.lang.String] = null
  ): IWSSecurityCertOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasTimeStamp)) __obj.updateDynamic("hasTimeStamp")(hasTimeStamp)
    if (signatureAlgorithm != null) __obj.updateDynamic("signatureAlgorithm")(signatureAlgorithm)
    if (signatureTransformations != null) __obj.updateDynamic("signatureTransformations")(signatureTransformations)
    __obj.asInstanceOf[IWSSecurityCertOptions]
  }
}


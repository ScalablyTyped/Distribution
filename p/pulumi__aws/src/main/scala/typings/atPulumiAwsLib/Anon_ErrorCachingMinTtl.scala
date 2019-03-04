package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorCachingMinTtl extends js.Object {
  var errorCachingMinTtl: js.UndefOr[scala.Double] = js.undefined
  var errorCode: scala.Double
  var responseCode: js.UndefOr[scala.Double] = js.undefined
  var responsePagePath: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ErrorCachingMinTtl {
  @scala.inline
  def apply(
    errorCode: scala.Double,
    errorCachingMinTtl: scala.Int | scala.Double = null,
    responseCode: scala.Int | scala.Double = null,
    responsePagePath: java.lang.String = null
  ): Anon_ErrorCachingMinTtl = {
    val __obj = js.Dynamic.literal(errorCode = errorCode)
    if (errorCachingMinTtl != null) __obj.updateDynamic("errorCachingMinTtl")(errorCachingMinTtl.asInstanceOf[js.Any])
    if (responseCode != null) __obj.updateDynamic("responseCode")(responseCode.asInstanceOf[js.Any])
    if (responsePagePath != null) __obj.updateDynamic("responsePagePath")(responsePagePath)
    __obj.asInstanceOf[Anon_ErrorCachingMinTtl]
  }
}


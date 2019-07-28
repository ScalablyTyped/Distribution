package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorCachingMinTtl extends js.Object {
  var errorCachingMinTtl: js.UndefOr[Double] = js.undefined
  var errorCode: Double
  var responseCode: js.UndefOr[Double] = js.undefined
  var responsePagePath: js.UndefOr[String] = js.undefined
}

object Anon_ErrorCachingMinTtl {
  @scala.inline
  def apply(
    errorCode: Double,
    errorCachingMinTtl: Int | Double = null,
    responseCode: Int | Double = null,
    responsePagePath: String = null
  ): Anon_ErrorCachingMinTtl = {
    val __obj = js.Dynamic.literal(errorCode = errorCode)
    if (errorCachingMinTtl != null) __obj.updateDynamic("errorCachingMinTtl")(errorCachingMinTtl.asInstanceOf[js.Any])
    if (responseCode != null) __obj.updateDynamic("responseCode")(responseCode.asInstanceOf[js.Any])
    if (responsePagePath != null) __obj.updateDynamic("responsePagePath")(responsePagePath)
    __obj.asInstanceOf[Anon_ErrorCachingMinTtl]
  }
}


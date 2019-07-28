package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorCachingMinTtlErrorCode extends js.Object {
  var errorCachingMinTtl: js.UndefOr[Input[Double]] = js.undefined
  var errorCode: Input[Double]
  var responseCode: js.UndefOr[Input[Double]] = js.undefined
  var responsePagePath: js.UndefOr[Input[String]] = js.undefined
}

object Anon_ErrorCachingMinTtlErrorCode {
  @scala.inline
  def apply(
    errorCode: Input[Double],
    errorCachingMinTtl: Input[Double] = null,
    responseCode: Input[Double] = null,
    responsePagePath: Input[String] = null
  ): Anon_ErrorCachingMinTtlErrorCode = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
    if (errorCachingMinTtl != null) __obj.updateDynamic("errorCachingMinTtl")(errorCachingMinTtl.asInstanceOf[js.Any])
    if (responseCode != null) __obj.updateDynamic("responseCode")(responseCode.asInstanceOf[js.Any])
    if (responsePagePath != null) __obj.updateDynamic("responsePagePath")(responsePagePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ErrorCachingMinTtlErrorCode]
  }
}


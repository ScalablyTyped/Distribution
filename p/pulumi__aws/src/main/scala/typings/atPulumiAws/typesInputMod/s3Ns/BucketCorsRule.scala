package typings.atPulumiAws.typesInputMod.s3Ns

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketCorsRule extends js.Object {
  /**
    * Specifies which headers are allowed.
    */
  var allowedHeaders: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Specifies which methods are allowed. Can be `GET`, `PUT`, `POST`, `DELETE` or `HEAD`.
    */
  var allowedMethods: Input[js.Array[Input[String]]]
  /**
    * Specifies which origins are allowed.
    */
  var allowedOrigins: Input[js.Array[Input[String]]]
  /**
    * Specifies expose header in the response.
    */
  var exposeHeaders: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Specifies time in seconds that browser can cache the response for a preflight request.
    */
  var maxAgeSeconds: js.UndefOr[Input[Double]] = js.undefined
}

object BucketCorsRule {
  @scala.inline
  def apply(
    allowedMethods: Input[js.Array[Input[String]]],
    allowedOrigins: Input[js.Array[Input[String]]],
    allowedHeaders: Input[js.Array[Input[String]]] = null,
    exposeHeaders: Input[js.Array[Input[String]]] = null,
    maxAgeSeconds: Input[Double] = null
  ): BucketCorsRule = {
    val __obj = js.Dynamic.literal(allowedMethods = allowedMethods.asInstanceOf[js.Any], allowedOrigins = allowedOrigins.asInstanceOf[js.Any])
    if (allowedHeaders != null) __obj.updateDynamic("allowedHeaders")(allowedHeaders.asInstanceOf[js.Any])
    if (exposeHeaders != null) __obj.updateDynamic("exposeHeaders")(exposeHeaders.asInstanceOf[js.Any])
    if (maxAgeSeconds != null) __obj.updateDynamic("maxAgeSeconds")(maxAgeSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketCorsRule]
  }
}


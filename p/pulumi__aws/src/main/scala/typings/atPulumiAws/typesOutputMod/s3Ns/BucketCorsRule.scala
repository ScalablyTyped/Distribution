package typings.atPulumiAws.typesOutputMod.s3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketCorsRule extends js.Object {
  /**
    * Specifies which headers are allowed.
    */
  var allowedHeaders: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Specifies which methods are allowed. Can be `GET`, `PUT`, `POST`, `DELETE` or `HEAD`.
    */
  var allowedMethods: js.Array[String]
  /**
    * Specifies which origins are allowed.
    */
  var allowedOrigins: js.Array[String]
  /**
    * Specifies expose header in the response.
    */
  var exposeHeaders: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Specifies time in seconds that browser can cache the response for a preflight request.
    */
  var maxAgeSeconds: js.UndefOr[Double] = js.undefined
}

object BucketCorsRule {
  @scala.inline
  def apply(
    allowedMethods: js.Array[String],
    allowedOrigins: js.Array[String],
    allowedHeaders: js.Array[String] = null,
    exposeHeaders: js.Array[String] = null,
    maxAgeSeconds: Int | Double = null
  ): BucketCorsRule = {
    val __obj = js.Dynamic.literal(allowedMethods = allowedMethods, allowedOrigins = allowedOrigins)
    if (allowedHeaders != null) __obj.updateDynamic("allowedHeaders")(allowedHeaders)
    if (exposeHeaders != null) __obj.updateDynamic("exposeHeaders")(exposeHeaders)
    if (maxAgeSeconds != null) __obj.updateDynamic("maxAgeSeconds")(maxAgeSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketCorsRule]
  }
}


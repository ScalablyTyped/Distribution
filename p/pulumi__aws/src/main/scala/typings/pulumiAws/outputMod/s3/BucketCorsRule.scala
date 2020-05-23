package typings.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketCorsRule extends js.Object {
  /**
    * Specifies which headers are allowed.
    */
  var allowedHeaders: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specifies which methods are allowed. Can be `GET`, `PUT`, `POST`, `DELETE` or `HEAD`.
    */
  var allowedMethods: js.Array[String] = js.native
  /**
    * Specifies which origins are allowed.
    */
  var allowedOrigins: js.Array[String] = js.native
  /**
    * Specifies expose header in the response.
    */
  var exposeHeaders: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specifies time in seconds that browser can cache the response for a preflight request.
    */
  var maxAgeSeconds: js.UndefOr[Double] = js.native
}

object BucketCorsRule {
  @scala.inline
  def apply(
    allowedMethods: js.Array[String],
    allowedOrigins: js.Array[String],
    allowedHeaders: js.Array[String] = null,
    exposeHeaders: js.Array[String] = null,
    maxAgeSeconds: js.UndefOr[Double] = js.undefined
  ): BucketCorsRule = {
    val __obj = js.Dynamic.literal(allowedMethods = allowedMethods.asInstanceOf[js.Any], allowedOrigins = allowedOrigins.asInstanceOf[js.Any])
    if (allowedHeaders != null) __obj.updateDynamic("allowedHeaders")(allowedHeaders.asInstanceOf[js.Any])
    if (exposeHeaders != null) __obj.updateDynamic("exposeHeaders")(exposeHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAgeSeconds)) __obj.updateDynamic("maxAgeSeconds")(maxAgeSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketCorsRule]
  }
}


package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowedHeaders extends js.Object {
  var allowedHeaders: js.UndefOr[js.Array[String]] = js.undefined
  var allowedMethods: js.Array[String]
  var allowedOrigins: js.Array[String]
  var exposeHeaders: js.UndefOr[js.Array[String]] = js.undefined
  var maxAgeSeconds: js.UndefOr[Double] = js.undefined
}

object Anon_AllowedHeaders {
  @scala.inline
  def apply(
    allowedMethods: js.Array[String],
    allowedOrigins: js.Array[String],
    allowedHeaders: js.Array[String] = null,
    exposeHeaders: js.Array[String] = null,
    maxAgeSeconds: Int | Double = null
  ): Anon_AllowedHeaders = {
    val __obj = js.Dynamic.literal(allowedMethods = allowedMethods, allowedOrigins = allowedOrigins)
    if (allowedHeaders != null) __obj.updateDynamic("allowedHeaders")(allowedHeaders)
    if (exposeHeaders != null) __obj.updateDynamic("exposeHeaders")(exposeHeaders)
    if (maxAgeSeconds != null) __obj.updateDynamic("maxAgeSeconds")(maxAgeSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllowedHeaders]
  }
}


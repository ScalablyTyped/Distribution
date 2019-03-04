package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowedHeaders extends js.Object {
  var allowedHeaders: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var allowedMethods: js.Array[java.lang.String]
  var allowedOrigins: js.Array[java.lang.String]
  var exposeHeaders: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var maxAgeSeconds: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AllowedHeaders {
  @scala.inline
  def apply(
    allowedMethods: js.Array[java.lang.String],
    allowedOrigins: js.Array[java.lang.String],
    allowedHeaders: js.Array[java.lang.String] = null,
    exposeHeaders: js.Array[java.lang.String] = null,
    maxAgeSeconds: scala.Int | scala.Double = null
  ): Anon_AllowedHeaders = {
    val __obj = js.Dynamic.literal(allowedMethods = allowedMethods, allowedOrigins = allowedOrigins)
    if (allowedHeaders != null) __obj.updateDynamic("allowedHeaders")(allowedHeaders)
    if (exposeHeaders != null) __obj.updateDynamic("exposeHeaders")(exposeHeaders)
    if (maxAgeSeconds != null) __obj.updateDynamic("maxAgeSeconds")(maxAgeSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllowedHeaders]
  }
}


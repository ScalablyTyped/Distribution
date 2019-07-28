package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowedHeadersAllowedMethods extends js.Object {
  var allowedHeaders: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var allowedMethods: Input[js.Array[Input[String]]]
  var allowedOrigins: Input[js.Array[Input[String]]]
  var exposeHeaders: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var maxAgeSeconds: js.UndefOr[Input[Double]] = js.undefined
}

object Anon_AllowedHeadersAllowedMethods {
  @scala.inline
  def apply(
    allowedMethods: Input[js.Array[Input[String]]],
    allowedOrigins: Input[js.Array[Input[String]]],
    allowedHeaders: Input[js.Array[Input[String]]] = null,
    exposeHeaders: Input[js.Array[Input[String]]] = null,
    maxAgeSeconds: Input[Double] = null
  ): Anon_AllowedHeadersAllowedMethods = {
    val __obj = js.Dynamic.literal(allowedMethods = allowedMethods.asInstanceOf[js.Any], allowedOrigins = allowedOrigins.asInstanceOf[js.Any])
    if (allowedHeaders != null) __obj.updateDynamic("allowedHeaders")(allowedHeaders.asInstanceOf[js.Any])
    if (exposeHeaders != null) __obj.updateDynamic("exposeHeaders")(exposeHeaders.asInstanceOf[js.Any])
    if (maxAgeSeconds != null) __obj.updateDynamic("maxAgeSeconds")(maxAgeSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllowedHeadersAllowedMethods]
  }
}


package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpRequestValidation extends js.Object {
  var parameters: js.UndefOr[HttpRequestParametersValidation] = js.undefined
  var schema: js.UndefOr[StringDictionary[String]] = js.undefined
}

object HttpRequestValidation {
  @scala.inline
  def apply(parameters: HttpRequestParametersValidation = null, schema: StringDictionary[String] = null): HttpRequestValidation = {
    val __obj = js.Dynamic.literal()
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpRequestValidation]
  }
}


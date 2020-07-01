package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpRequestParametersValidation extends js.Object {
  var headers: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  var paths: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  var querystrings: js.UndefOr[StringDictionary[Boolean]] = js.undefined
}

object HttpRequestParametersValidation {
  @scala.inline
  def apply(
    headers: StringDictionary[Boolean] = null,
    paths: StringDictionary[Boolean] = null,
    querystrings: StringDictionary[Boolean] = null
  ): HttpRequestParametersValidation = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (querystrings != null) __obj.updateDynamic("querystrings")(querystrings.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpRequestParametersValidation]
  }
}


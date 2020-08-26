package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpRequestParametersValidation extends js.Object {
  var headers: js.UndefOr[StringDictionary[Boolean]] = js.native
  var paths: js.UndefOr[StringDictionary[Boolean]] = js.native
  var querystrings: js.UndefOr[StringDictionary[Boolean]] = js.native
}

object HttpRequestParametersValidation {
  @scala.inline
  def apply(): HttpRequestParametersValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpRequestParametersValidation]
  }
  @scala.inline
  implicit class HttpRequestParametersValidationOps[Self <: HttpRequestParametersValidation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeaders(value: StringDictionary[Boolean]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setPaths(value: StringDictionary[Boolean]): Self = this.set("paths", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
    @scala.inline
    def setQuerystrings(value: StringDictionary[Boolean]): Self = this.set("querystrings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuerystrings: Self = this.set("querystrings", js.undefined)
  }
  
}


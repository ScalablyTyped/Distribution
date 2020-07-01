package typings.psi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var analysisUTCTimestamp: String
  var captchaResult: String
  var id: String
  var kind: String
  var lighthouseResult: LighthouseResult
  var loadingExperience: Experience
  var originLoadingExperience: Experience
  var version: Version
}

object Result {
  @scala.inline
  def apply(
    analysisUTCTimestamp: String,
    captchaResult: String,
    id: String,
    kind: String,
    lighthouseResult: LighthouseResult,
    loadingExperience: Experience,
    originLoadingExperience: Experience,
    version: Version
  ): Result = {
    val __obj = js.Dynamic.literal(analysisUTCTimestamp = analysisUTCTimestamp.asInstanceOf[js.Any], captchaResult = captchaResult.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], lighthouseResult = lighthouseResult.asInstanceOf[js.Any], loadingExperience = loadingExperience.asInstanceOf[js.Any], originLoadingExperience = originLoadingExperience.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}


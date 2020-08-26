package typings.psi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  var analysisUTCTimestamp: String = js.native
  var captchaResult: String = js.native
  var id: String = js.native
  var kind: String = js.native
  var lighthouseResult: LighthouseResult = js.native
  var loadingExperience: Experience = js.native
  var originLoadingExperience: Experience = js.native
  var version: Version = js.native
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
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
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
    def setAnalysisUTCTimestamp(value: String): Self = this.set("analysisUTCTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaptchaResult(value: String): Self = this.set("captchaResult", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setLighthouseResult(value: LighthouseResult): Self = this.set("lighthouseResult", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadingExperience(value: Experience): Self = this.set("loadingExperience", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginLoadingExperience(value: Experience): Self = this.set("originLoadingExperience", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Version): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}


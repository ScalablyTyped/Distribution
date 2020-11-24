package typings.puppeteerLottie.mod

import typings.puppeteerLottie.puppeteerLottieStrings.baseline
import typings.puppeteerLottie.puppeteerLottieStrings.fast
import typings.puppeteerLottie.puppeteerLottieStrings.faster
import typings.puppeteerLottie.puppeteerLottieStrings.high
import typings.puppeteerLottie.puppeteerLottieStrings.high10
import typings.puppeteerLottie.puppeteerLottieStrings.high422
import typings.puppeteerLottie.puppeteerLottieStrings.high444
import typings.puppeteerLottie.puppeteerLottieStrings.main
import typings.puppeteerLottie.puppeteerLottieStrings.medium
import typings.puppeteerLottie.puppeteerLottieStrings.placebo
import typings.puppeteerLottie.puppeteerLottieStrings.slow
import typings.puppeteerLottie.puppeteerLottieStrings.slower
import typings.puppeteerLottie.puppeteerLottieStrings.superfast
import typings.puppeteerLottie.puppeteerLottieStrings.ultrafast
import typings.puppeteerLottie.puppeteerLottieStrings.veryfast
import typings.puppeteerLottie.puppeteerLottieStrings.veryslow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Optional ffmpeg settings
  */
@js.native
trait FFmpegOptions extends js.Object {
  
  var crf: js.UndefOr[Double] = js.native
  
  var preset: js.UndefOr[
    ultrafast | superfast | veryfast | faster | fast | medium | slow | slower | veryslow | placebo
  ] = js.native
  
  var profileVideo: js.UndefOr[baseline | main | high | high10 | high422 | high444] = js.native
}
object FFmpegOptions {
  
  @scala.inline
  def apply(): FFmpegOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FFmpegOptions]
  }
  
  @scala.inline
  implicit class FFmpegOptionsOps[Self <: FFmpegOptions] (val x: Self) extends AnyVal {
    
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
    def setCrf(value: Double): Self = this.set("crf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrf: Self = this.set("crf", js.undefined)
    
    @scala.inline
    def setPreset(
      value: ultrafast | superfast | veryfast | faster | fast | medium | slow | slower | veryslow | placebo
    ): Self = this.set("preset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreset: Self = this.set("preset", js.undefined)
    
    @scala.inline
    def setProfileVideo(value: baseline | main | high | high10 | high422 | high444): Self = this.set("profileVideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileVideo: Self = this.set("profileVideo", js.undefined)
  }
}

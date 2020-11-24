package typings.skyway

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnswerOptions extends js.Object {
  
  var audioBandwidth: js.UndefOr[Double] = js.native
  
  var audioCodec: js.UndefOr[String] = js.native
  
  var videoBandwidth: js.UndefOr[Double] = js.native
  
  var videoCodec: js.UndefOr[String] = js.native
}
object AnswerOptions {
  
  @scala.inline
  def apply(): AnswerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnswerOptions]
  }
  
  @scala.inline
  implicit class AnswerOptionsOps[Self <: AnswerOptions] (val x: Self) extends AnyVal {
    
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
    def setAudioBandwidth(value: Double): Self = this.set("audioBandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioBandwidth: Self = this.set("audioBandwidth", js.undefined)
    
    @scala.inline
    def setAudioCodec(value: String): Self = this.set("audioCodec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioCodec: Self = this.set("audioCodec", js.undefined)
    
    @scala.inline
    def setVideoBandwidth(value: Double): Self = this.set("videoBandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoBandwidth: Self = this.set("videoBandwidth", js.undefined)
    
    @scala.inline
    def setVideoCodec(value: String): Self = this.set("videoCodec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoCodec: Self = this.set("videoCodec", js.undefined)
  }
}

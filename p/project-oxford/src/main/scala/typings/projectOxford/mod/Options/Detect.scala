package typings.projectOxford.mod.Options

import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Detect extends js.Object {
  
   // Analyze face landmarks?
  var analyzesAge: js.UndefOr[Boolean] = js.native
  
   // Stream of an image to be used
  var analyzesFaceLandmarks: js.UndefOr[Boolean] = js.native
  
   // Analyze age?
  var analyzesGender: js.UndefOr[Boolean] = js.native
  
   // Analyze gender?
  var analyzesHeadPose: js.UndefOr[Boolean] = js.native
  
   // URL to image to be used
  var path: js.UndefOr[String] = js.native
  
   // Path to image to be used
  var stream: js.UndefOr[Stream] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object Detect {
  
  @scala.inline
  def apply(): Detect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Detect]
  }
  
  @scala.inline
  implicit class DetectOps[Self <: Detect] (val x: Self) extends AnyVal {
    
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
    def setAnalyzesAge(value: Boolean): Self = this.set("analyzesAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalyzesAge: Self = this.set("analyzesAge", js.undefined)
    
    @scala.inline
    def setAnalyzesFaceLandmarks(value: Boolean): Self = this.set("analyzesFaceLandmarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalyzesFaceLandmarks: Self = this.set("analyzesFaceLandmarks", js.undefined)
    
    @scala.inline
    def setAnalyzesGender(value: Boolean): Self = this.set("analyzesGender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalyzesGender: Self = this.set("analyzesGender", js.undefined)
    
    @scala.inline
    def setAnalyzesHeadPose(value: Boolean): Self = this.set("analyzesHeadPose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalyzesHeadPose: Self = this.set("analyzesHeadPose", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setStream(value: Stream): Self = this.set("stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}

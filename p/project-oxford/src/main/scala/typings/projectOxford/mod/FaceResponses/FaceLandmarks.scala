package typings.projectOxford.mod.FaceResponses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FaceLandmarks extends js.Object {
  
  var eyeLeftBottom: point = js.native
  
  var eyeLeftInner: point = js.native
  
  var eyeLeftOuter: point = js.native
  
  var eyeLeftTop: point = js.native
  
  var eyeRightBottom: point = js.native
  
  var eyeRightInner: point = js.native
  
  var eyeRightOuter: point = js.native
  
  var eyeRightTop: point = js.native
  
  var eyebrowLeftInner: point = js.native
  
  var eyebrowLeftOuter: point = js.native
  
  var eyebrowRightInner: point = js.native
  
  var eyebrowRightOuter: point = js.native
  
  var mouthLeft: point = js.native
  
  var mouthRight: point = js.native
  
  var noseLeftAlarOutTip: point = js.native
  
  var noseLeftAlarTop: point = js.native
  
  var noseRightAlarOutTip: point = js.native
  
  var noseRightAlarTop: point = js.native
  
  var noseRootLeft: point = js.native
  
  var noseRootRight: point = js.native
  
  var noseTip: point = js.native
  
  var pupilLeft: point = js.native
  
  var pupilRight: point = js.native
  
  var underLipBottom: point = js.native
  
  var underLipTop: point = js.native
  
  var upperLipBottom: point = js.native
  
  var upperLipTop: point = js.native
}
object FaceLandmarks {
  
  @scala.inline
  def apply(
    eyeLeftBottom: point,
    eyeLeftInner: point,
    eyeLeftOuter: point,
    eyeLeftTop: point,
    eyeRightBottom: point,
    eyeRightInner: point,
    eyeRightOuter: point,
    eyeRightTop: point,
    eyebrowLeftInner: point,
    eyebrowLeftOuter: point,
    eyebrowRightInner: point,
    eyebrowRightOuter: point,
    mouthLeft: point,
    mouthRight: point,
    noseLeftAlarOutTip: point,
    noseLeftAlarTop: point,
    noseRightAlarOutTip: point,
    noseRightAlarTop: point,
    noseRootLeft: point,
    noseRootRight: point,
    noseTip: point,
    pupilLeft: point,
    pupilRight: point,
    underLipBottom: point,
    underLipTop: point,
    upperLipBottom: point,
    upperLipTop: point
  ): FaceLandmarks = {
    val __obj = js.Dynamic.literal(eyeLeftBottom = eyeLeftBottom.asInstanceOf[js.Any], eyeLeftInner = eyeLeftInner.asInstanceOf[js.Any], eyeLeftOuter = eyeLeftOuter.asInstanceOf[js.Any], eyeLeftTop = eyeLeftTop.asInstanceOf[js.Any], eyeRightBottom = eyeRightBottom.asInstanceOf[js.Any], eyeRightInner = eyeRightInner.asInstanceOf[js.Any], eyeRightOuter = eyeRightOuter.asInstanceOf[js.Any], eyeRightTop = eyeRightTop.asInstanceOf[js.Any], eyebrowLeftInner = eyebrowLeftInner.asInstanceOf[js.Any], eyebrowLeftOuter = eyebrowLeftOuter.asInstanceOf[js.Any], eyebrowRightInner = eyebrowRightInner.asInstanceOf[js.Any], eyebrowRightOuter = eyebrowRightOuter.asInstanceOf[js.Any], mouthLeft = mouthLeft.asInstanceOf[js.Any], mouthRight = mouthRight.asInstanceOf[js.Any], noseLeftAlarOutTip = noseLeftAlarOutTip.asInstanceOf[js.Any], noseLeftAlarTop = noseLeftAlarTop.asInstanceOf[js.Any], noseRightAlarOutTip = noseRightAlarOutTip.asInstanceOf[js.Any], noseRightAlarTop = noseRightAlarTop.asInstanceOf[js.Any], noseRootLeft = noseRootLeft.asInstanceOf[js.Any], noseRootRight = noseRootRight.asInstanceOf[js.Any], noseTip = noseTip.asInstanceOf[js.Any], pupilLeft = pupilLeft.asInstanceOf[js.Any], pupilRight = pupilRight.asInstanceOf[js.Any], underLipBottom = underLipBottom.asInstanceOf[js.Any], underLipTop = underLipTop.asInstanceOf[js.Any], upperLipBottom = upperLipBottom.asInstanceOf[js.Any], upperLipTop = upperLipTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceLandmarks]
  }
  
  @scala.inline
  implicit class FaceLandmarksOps[Self <: FaceLandmarks] (val x: Self) extends AnyVal {
    
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
    def setEyeLeftBottom(value: point): Self = this.set("eyeLeftBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEyeLeftInner(value: point): Self = this.set("eyeLeftInner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEyeLeftOuter(value: point): Self = this.set("eyeLeftOuter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEyeLeftTop(value: point): Self = this.set("eyeLeftTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEyeRightBottom(value: point): Self = this.set("eyeRightBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEyeRightInner(value: point): Self = this.set("eyeRightInner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEyeRightOuter(value: point): Self = this.set("eyeRightOuter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEyeRightTop(value: point): Self = this.set("eyeRightTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEyebrowLeftInner(value: point): Self = this.set("eyebrowLeftInner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEyebrowLeftOuter(value: point): Self = this.set("eyebrowLeftOuter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEyebrowRightInner(value: point): Self = this.set("eyebrowRightInner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEyebrowRightOuter(value: point): Self = this.set("eyebrowRightOuter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouthLeft(value: point): Self = this.set("mouthLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouthRight(value: point): Self = this.set("mouthRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoseLeftAlarOutTip(value: point): Self = this.set("noseLeftAlarOutTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoseLeftAlarTop(value: point): Self = this.set("noseLeftAlarTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoseRightAlarOutTip(value: point): Self = this.set("noseRightAlarOutTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoseRightAlarTop(value: point): Self = this.set("noseRightAlarTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoseRootLeft(value: point): Self = this.set("noseRootLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoseRootRight(value: point): Self = this.set("noseRootRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoseTip(value: point): Self = this.set("noseTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPupilLeft(value: point): Self = this.set("pupilLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPupilRight(value: point): Self = this.set("pupilRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderLipBottom(value: point): Self = this.set("underLipBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderLipTop(value: point): Self = this.set("underLipTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpperLipBottom(value: point): Self = this.set("upperLipBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpperLipTop(value: point): Self = this.set("upperLipTop", value.asInstanceOf[js.Any])
  }
}

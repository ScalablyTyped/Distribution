package typings.rcGesture.anon

import typings.rcGesture.mod.Finger
import typings.rcGesture.mod.MultiFingerStatus
import typings.rcGesture.mod.SingeFingerMoveStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvailablePan extends js.Object {
  
  var availablePan: js.UndefOr[Boolean] = js.native
  
  var direction: js.UndefOr[Double] = js.native
  
  var moveStatus: js.UndefOr[SingeFingerMoveStatus] = js.native
  
  var mutliFingerStatus: js.UndefOr[js.Array[MultiFingerStatus]] = js.native
  
  var pan: js.UndefOr[Boolean] = js.native
  
  var pinch: js.UndefOr[Boolean] = js.native
  
  var preTouches: js.Array[Finger] = js.native
  
  var press: js.UndefOr[Boolean] = js.native
  
  var rotate: js.UndefOr[Boolean] = js.native
  
  var rotation: js.UndefOr[Double] = js.native
  
  var scale: js.UndefOr[Double] = js.native
  
  var srcEvent: js.Any = js.native
  
  var startMutliFingerStatus: js.UndefOr[js.Array[MultiFingerStatus]] = js.native
  
  var startTime: Double = js.native
  
  var startTouches: js.Array[Finger] = js.native
  
  var swipe: js.UndefOr[Boolean] = js.native
  
  var time: Double = js.native
  
  var touches: js.Array[Finger] = js.native
}
object AvailablePan {
  
  @scala.inline
  def apply(
    preTouches: js.Array[Finger],
    srcEvent: js.Any,
    startTime: Double,
    startTouches: js.Array[Finger],
    time: Double,
    touches: js.Array[Finger]
  ): AvailablePan = {
    val __obj = js.Dynamic.literal(preTouches = preTouches.asInstanceOf[js.Any], srcEvent = srcEvent.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], startTouches = startTouches.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailablePan]
  }
  
  @scala.inline
  implicit class AvailablePanOps[Self <: AvailablePan] (val x: Self) extends AnyVal {
    
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
    def setPreTouchesVarargs(value: Finger*): Self = this.set("preTouches", js.Array(value :_*))
    
    @scala.inline
    def setPreTouches(value: js.Array[Finger]): Self = this.set("preTouches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcEvent(value: js.Any): Self = this.set("srcEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTouchesVarargs(value: Finger*): Self = this.set("startTouches", js.Array(value :_*))
    
    @scala.inline
    def setStartTouches(value: js.Array[Finger]): Self = this.set("startTouches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchesVarargs(value: Finger*): Self = this.set("touches", js.Array(value :_*))
    
    @scala.inline
    def setTouches(value: js.Array[Finger]): Self = this.set("touches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailablePan(value: Boolean): Self = this.set("availablePan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailablePan: Self = this.set("availablePan", js.undefined)
    
    @scala.inline
    def setDirection(value: Double): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setMoveStatus(value: SingeFingerMoveStatus): Self = this.set("moveStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoveStatus: Self = this.set("moveStatus", js.undefined)
    
    @scala.inline
    def setMutliFingerStatusVarargs(value: MultiFingerStatus*): Self = this.set("mutliFingerStatus", js.Array(value :_*))
    
    @scala.inline
    def setMutliFingerStatus(value: js.Array[MultiFingerStatus]): Self = this.set("mutliFingerStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMutliFingerStatus: Self = this.set("mutliFingerStatus", js.undefined)
    
    @scala.inline
    def setPan(value: Boolean): Self = this.set("pan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePan: Self = this.set("pan", js.undefined)
    
    @scala.inline
    def setPinch(value: Boolean): Self = this.set("pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinch: Self = this.set("pinch", js.undefined)
    
    @scala.inline
    def setPress(value: Boolean): Self = this.set("press", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePress: Self = this.set("press", js.undefined)
    
    @scala.inline
    def setRotate(value: Boolean): Self = this.set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setStartMutliFingerStatusVarargs(value: MultiFingerStatus*): Self = this.set("startMutliFingerStatus", js.Array(value :_*))
    
    @scala.inline
    def setStartMutliFingerStatus(value: js.Array[MultiFingerStatus]): Self = this.set("startMutliFingerStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartMutliFingerStatus: Self = this.set("startMutliFingerStatus", js.undefined)
    
    @scala.inline
    def setSwipe(value: Boolean): Self = this.set("swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipe: Self = this.set("swipe", js.undefined)
  }
}

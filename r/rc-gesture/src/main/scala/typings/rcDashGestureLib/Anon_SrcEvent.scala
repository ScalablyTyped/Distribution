package typings
package rcDashGestureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_SrcEvent extends js.Object {
  var availablePan: js.UndefOr[scala.Boolean] = js.undefined
  var direction: js.UndefOr[scala.Double] = js.undefined
  var moveStatus: js.UndefOr[rcDashGestureLib.rcDashGestureMod.SingeFingerMoveStatus] = js.undefined
  var mutliFingerStatus: js.UndefOr[js.Array[rcDashGestureLib.rcDashGestureMod.MultiFingerStatus]] = js.undefined
  var pan: js.UndefOr[scala.Boolean] = js.undefined
  var pinch: js.UndefOr[scala.Boolean] = js.undefined
  var preTouches: js.Array[rcDashGestureLib.rcDashGestureMod.Finger]
  var press: js.UndefOr[scala.Boolean] = js.undefined
  var rotate: js.UndefOr[scala.Boolean] = js.undefined
  var rotation: js.UndefOr[scala.Double] = js.undefined
  var scale: js.UndefOr[scala.Double] = js.undefined
  var srcEvent: js.Any
  var startMutliFingerStatus: js.UndefOr[js.Array[rcDashGestureLib.rcDashGestureMod.MultiFingerStatus]] = js.undefined
  var startTime: scala.Double
  var startTouches: js.Array[rcDashGestureLib.rcDashGestureMod.Finger]
  var swipe: js.UndefOr[scala.Boolean] = js.undefined
  var time: scala.Double
  var touches: js.Array[rcDashGestureLib.rcDashGestureMod.Finger]
}


package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MediaTrackConstraintSet extends js.Object {
  var aspectRatio: js.UndefOr[scala.Double | ConstrainDoubleRange] = js.undefined
  var channelCount: js.UndefOr[scala.Double | ConstrainLongRange] = js.undefined
  var deviceId: js.UndefOr[java.lang.String | js.Array[java.lang.String] | ConstrainDOMStringParameters] = js.undefined
  var displaySurface: js.UndefOr[java.lang.String | js.Array[java.lang.String] | ConstrainDOMStringParameters] = js.undefined
  var echoCancellation: js.UndefOr[scala.Boolean | ConstrainBooleanParameters] = js.undefined
  var facingMode: js.UndefOr[java.lang.String | js.Array[java.lang.String] | ConstrainDOMStringParameters] = js.undefined
  var frameRate: js.UndefOr[scala.Double | ConstrainDoubleRange] = js.undefined
  var groupId: js.UndefOr[java.lang.String | js.Array[java.lang.String] | ConstrainDOMStringParameters] = js.undefined
  var height: js.UndefOr[scala.Double | ConstrainLongRange] = js.undefined
  var latency: js.UndefOr[scala.Double | ConstrainDoubleRange] = js.undefined
  var logicalSurface: js.UndefOr[scala.Boolean | ConstrainBooleanParameters] = js.undefined
  var sampleRate: js.UndefOr[scala.Double | ConstrainLongRange] = js.undefined
  var sampleSize: js.UndefOr[scala.Double | ConstrainLongRange] = js.undefined
  var volume: js.UndefOr[scala.Double | ConstrainDoubleRange] = js.undefined
  var width: js.UndefOr[scala.Double | ConstrainLongRange] = js.undefined
}


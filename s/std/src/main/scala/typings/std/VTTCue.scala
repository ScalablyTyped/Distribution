package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VTTCue extends TextTrackCue {
  var align: AlignSetting = js.native
  var line: LineAndPositionSetting = js.native
  var lineAlign: LineAlignSetting = js.native
  var position: LineAndPositionSetting = js.native
  var positionAlign: PositionAlignSetting = js.native
  var region: VTTRegion | Null = js.native
  var size: Double = js.native
  var snapToLines: scala.Boolean = js.native
  var text: java.lang.String = js.native
  var vertical: DirectionSetting = js.native
  def getCueAsHTML(): DocumentFragment = js.native
}


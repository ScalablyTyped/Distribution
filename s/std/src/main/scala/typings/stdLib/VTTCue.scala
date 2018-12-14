package typings
package stdLib

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
  var region: VTTRegion | scala.Null = js.native
  var size: scala.Double = js.native
  var snapToLines: scala.Boolean = js.native
  var vertical: DirectionSetting = js.native
}

@JSGlobal("VTTCue")
@js.native
object VTTCue
  extends org.scalablytyped.runtime.Instantiable3[
      /* startTime */ scala.Double, 
      /* endTime */ scala.Double, 
      /* text */ java.lang.String, 
      VTTCue
    ]


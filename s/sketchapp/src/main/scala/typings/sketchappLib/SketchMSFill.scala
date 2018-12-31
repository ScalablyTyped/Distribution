package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSFill extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.fill
  var color: js.UndefOr[SketchMSColor] = js.undefined
  var fillType: SketchMSFillTypeEnum
  var image: js.UndefOr[SketchMSImageDataReference] = js.undefined
  var isEnabled: scala.Boolean
  var noiseIndex: scala.Double
  var noiseIntensity: scala.Double
  var patternFillType: SketchMSPatternFillTypeEnum
  var patternTileScale: scala.Double
}


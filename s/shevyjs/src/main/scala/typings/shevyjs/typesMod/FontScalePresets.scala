package typings.shevyjs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontScalePresets extends js.Object {
  var augmentedFourth: Scale
  var majorSecond: Scale
  var majorThird: Scale
  var minorThird: Scale
  var perfectFourth: Scale
}

object FontScalePresets {
  @scala.inline
  def apply(
    augmentedFourth: Scale,
    majorSecond: Scale,
    majorThird: Scale,
    minorThird: Scale,
    perfectFourth: Scale
  ): FontScalePresets = {
    val __obj = js.Dynamic.literal(augmentedFourth = augmentedFourth.asInstanceOf[js.Any], majorSecond = majorSecond.asInstanceOf[js.Any], majorThird = majorThird.asInstanceOf[js.Any], minorThird = minorThird.asInstanceOf[js.Any], perfectFourth = perfectFourth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FontScalePresets]
  }
}


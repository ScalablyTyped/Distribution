package typings.shevyjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<shevyjs.shevyjs/types.RhythmProperties, std.Exclude<keyof shevyjs.shevyjs/types.RhythmProperties, 'marginBottom'>> */
trait PickRhythmPropertiesExclu extends js.Object {
  var fontSize: String
  var lineHeight: Double
}

object PickRhythmPropertiesExclu {
  @scala.inline
  def apply(fontSize: String, lineHeight: Double): PickRhythmPropertiesExclu = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickRhythmPropertiesExclu]
  }
}


package typings.shevyjs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RhythmProperties extends js.Object {
  var fontSize: String
  var lineHeight: Double
  var marginBottom: String
}

object RhythmProperties {
  @scala.inline
  def apply(fontSize: String, lineHeight: Double, marginBottom: String): RhythmProperties = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], marginBottom = marginBottom.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RhythmProperties]
  }
}


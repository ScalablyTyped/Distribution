package typings.reactSvgRadarChart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontFamily extends js.Object {
  var className: String
  var fontFamily: String
  var fontSize: Double
  var textAnchor: String
}

object FontFamily {
  @scala.inline
  def apply(className: String, fontFamily: String, fontSize: Double, textAnchor: String): FontFamily = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], textAnchor = textAnchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFamily]
  }
}


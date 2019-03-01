package typings
package reactDashEasyDashChartLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorStroke extends js.Object {
  var color: java.lang.String
  var stroke: java.lang.String
  var `type`: java.lang.String
}

object Anon_ColorStroke {
  @scala.inline
  def apply(color: java.lang.String, stroke: java.lang.String, `type`: java.lang.String): Anon_ColorStroke = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("stroke")(stroke)
    __obj.asInstanceOf[Anon_ColorStroke]
  }
}


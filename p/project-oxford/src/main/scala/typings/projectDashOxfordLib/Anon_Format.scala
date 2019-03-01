package typings
package projectDashOxfordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format extends js.Object {
  var format: java.lang.String
  var height: scala.Double
  var width: scala.Double
}

object Anon_Format {
  @scala.inline
  def apply(format: java.lang.String, height: scala.Double, width: scala.Double): Anon_Format = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_Format]
  }
}


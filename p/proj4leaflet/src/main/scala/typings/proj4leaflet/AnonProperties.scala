package typings.proj4leaflet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProperties extends js.Object {
  var properties: AnonName
  var `type`: String
}

object AnonProperties {
  @scala.inline
  def apply(properties: AnonName, `type`: String): AnonProperties = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProperties]
  }
}


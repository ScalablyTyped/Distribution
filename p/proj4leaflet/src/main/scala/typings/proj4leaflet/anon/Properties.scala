package typings.proj4leaflet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Properties extends js.Object {
  var properties: Name
  var `type`: String
}

object Properties {
  @scala.inline
  def apply(properties: Name, `type`: String): Properties = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Properties]
  }
}


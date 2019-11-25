package typings.proj4leaflet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Properties extends js.Object {
  var properties: Anon_Name
  var `type`: String
}

object Anon_Properties {
  @scala.inline
  def apply(properties: Anon_Name, `type`: String): Anon_Properties = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Properties]
  }
}


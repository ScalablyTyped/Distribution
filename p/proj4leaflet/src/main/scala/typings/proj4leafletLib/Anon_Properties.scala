package typings
package proj4leafletLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Properties extends js.Object {
  var properties: Anon_Name
  var `type`: java.lang.String
}

object Anon_Properties {
  @scala.inline
  def apply(properties: Anon_Name, `type`: java.lang.String): Anon_Properties = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[Anon_Properties]
  }
}


package typings
package sequelizeLib.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Where Geometry Options
  */
trait WhereGeometryOptions extends js.Object {
  var coordinates: js.Array[js.Array[scala.Double] | scala.Double]
  var `type`: java.lang.String
}

object WhereGeometryOptions {
  @scala.inline
  def apply(coordinates: js.Array[js.Array[scala.Double] | scala.Double], `type`: java.lang.String): WhereGeometryOptions = {
    val __obj = js.Dynamic.literal(coordinates = coordinates)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WhereGeometryOptions]
  }
}


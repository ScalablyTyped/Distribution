package typings.sequelize.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Where Geometry Options
  */
trait WhereGeometryOptions extends js.Object {
  var coordinates: js.Array[js.Array[Double] | Double]
  var `type`: String
}

object WhereGeometryOptions {
  @scala.inline
  def apply(coordinates: js.Array[js.Array[Double] | Double], `type`: String): WhereGeometryOptions = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhereGeometryOptions]
  }
}


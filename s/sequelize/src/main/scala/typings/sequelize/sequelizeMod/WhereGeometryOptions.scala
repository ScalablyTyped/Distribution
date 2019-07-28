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
    val __obj = js.Dynamic.literal(coordinates = coordinates)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WhereGeometryOptions]
  }
}


package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column extends js.Object {
  var column: java.lang.String
  var sortOrder: scala.Double
}

object Anon_Column {
  @scala.inline
  def apply(column: java.lang.String, sortOrder: scala.Double): Anon_Column = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("sortOrder")(sortOrder)
    __obj.asInstanceOf[Anon_Column]
  }
}


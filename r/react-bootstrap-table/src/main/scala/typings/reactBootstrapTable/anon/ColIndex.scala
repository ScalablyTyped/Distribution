package typings.reactBootstrapTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColIndex extends js.Object {
  var colIndex: Double
  var rowIndex: Double
}

object ColIndex {
  @scala.inline
  def apply(colIndex: Double, rowIndex: Double): ColIndex = {
    val __obj = js.Dynamic.literal(colIndex = colIndex.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColIndex]
  }
}


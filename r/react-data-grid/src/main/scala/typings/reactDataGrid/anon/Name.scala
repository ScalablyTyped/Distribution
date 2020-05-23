package typings.reactDataGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var idx: Double
  var name: String
  var rowIdx: Double
}

object Name {
  @scala.inline
  def apply(idx: Double, name: String, rowIdx: Double): Name = {
    val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}


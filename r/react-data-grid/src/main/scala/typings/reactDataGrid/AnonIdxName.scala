package typings.reactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdxName extends js.Object {
  var idx: Double
  var name: String
  var rowIdx: Double
}

object AnonIdxName {
  @scala.inline
  def apply(idx: Double, name: String, rowIdx: Double): AnonIdxName = {
    val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIdxName]
  }
}


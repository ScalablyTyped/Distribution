package typings.reactDataGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Idx extends js.Object {
  var idx: Double
  var rowIdx: Double
}

object Idx {
  @scala.inline
  def apply(idx: Double, rowIdx: Double): Idx = {
    val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Idx]
  }
}


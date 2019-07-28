package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnSortOrder extends js.Object {
  var column: Input[String]
  var sortOrder: Input[Double]
}

object Anon_ColumnSortOrder {
  @scala.inline
  def apply(column: Input[String], sortOrder: Input[Double]): Anon_ColumnSortOrder = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ColumnSortOrder]
  }
}


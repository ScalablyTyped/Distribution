package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnSortOrder extends js.Object {
  var column: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var sortOrder: atPulumiPulumiLib.outputMod.Input[scala.Double]
}

object Anon_ColumnSortOrder {
  @scala.inline
  def apply(
    column: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    sortOrder: atPulumiPulumiLib.outputMod.Input[scala.Double]
  ): Anon_ColumnSortOrder = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ColumnSortOrder]
  }
}


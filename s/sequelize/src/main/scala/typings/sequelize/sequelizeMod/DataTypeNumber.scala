package typings.sequelize.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTypeNumber extends DataTypeAbstractNumber[DataTypeNumber]

object DataTypeNumber {
  @scala.inline
  def apply(UNSIGNED: DataTypeNumber, ZEROFILL: DataTypeNumber, dialectTypes: String): DataTypeNumber = {
    val __obj = js.Dynamic.literal(UNSIGNED = UNSIGNED, ZEROFILL = ZEROFILL, dialectTypes = dialectTypes)
  
    __obj.asInstanceOf[DataTypeNumber]
  }
}


package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTypeNumber extends DataTypeAbstractNumber[DataTypeNumber]

object DataTypeNumber {
  @scala.inline
  def apply(UNSIGNED: DataTypeNumber, ZEROFILL: DataTypeNumber, dialectTypes: java.lang.String): DataTypeNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("UNSIGNED")(UNSIGNED)
    __obj.updateDynamic("ZEROFILL")(ZEROFILL)
    __obj.updateDynamic("dialectTypes")(dialectTypes)
    __obj.asInstanceOf[DataTypeNumber]
  }
}


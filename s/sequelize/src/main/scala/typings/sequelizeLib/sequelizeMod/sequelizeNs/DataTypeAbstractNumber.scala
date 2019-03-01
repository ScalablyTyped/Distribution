package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTypeAbstractNumber[T] extends DataTypeAbstract {
  var UNSIGNED: T
  var ZEROFILL: T
}

object DataTypeAbstractNumber {
  @scala.inline
  def apply[T](UNSIGNED: T, ZEROFILL: T, dialectTypes: java.lang.String): DataTypeAbstractNumber[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("UNSIGNED")(UNSIGNED.asInstanceOf[js.Any])
    __obj.updateDynamic("ZEROFILL")(ZEROFILL.asInstanceOf[js.Any])
    __obj.updateDynamic("dialectTypes")(dialectTypes)
    __obj.asInstanceOf[DataTypeAbstractNumber[T]]
  }
}


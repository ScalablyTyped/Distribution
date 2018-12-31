package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTypeDecimal extends DataTypeAbstractNumber[DataTypeDecimal] {
  /**
    * Precision and scale for the decimal number
    */
  def apply(): DataTypeDecimal = js.native
  def apply(options: sequelizeLib.Anon_Scale): DataTypeDecimal = js.native
  def apply(precision: scala.Double): DataTypeDecimal = js.native
  def apply(precision: scala.Double, scale: scala.Double): DataTypeDecimal = js.native
}


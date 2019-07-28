package typings.sequelize.sequelizeMod

import typings.sequelize.Anon_Precision
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTypeDecimal extends DataTypeAbstractNumber[DataTypeDecimal] {
  /**
    * Precision and scale for the decimal number
    */
  def apply(): DataTypeDecimal = js.native
  def apply(options: Anon_Precision): DataTypeDecimal = js.native
  def apply(precision: Double): DataTypeDecimal = js.native
  def apply(precision: Double, scale: Double): DataTypeDecimal = js.native
}


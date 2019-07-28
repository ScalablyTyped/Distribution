package typings.sequelize.sequelizeMod

import typings.sequelize.Anon_Decimals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTypeDouble extends DataTypeAbstractNumber[DataTypeDouble] {
  /**
    * Length of the number field and decimals of the real
    */
  def apply(): DataTypeDouble = js.native
  def apply(length: Double): DataTypeDouble = js.native
  def apply(length: Double, decimals: Double): DataTypeDouble = js.native
  def apply(options: Anon_Decimals): DataTypeDouble = js.native
}


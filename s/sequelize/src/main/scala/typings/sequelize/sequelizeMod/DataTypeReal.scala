package typings.sequelize.sequelizeMod

import typings.sequelize.Anon_Decimals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTypeReal extends DataTypeAbstractNumber[DataTypeReal] {
  /**
    * Length of the number field and decimals of the real
    */
  def apply(): DataTypeReal = js.native
  def apply(length: Double): DataTypeReal = js.native
  def apply(length: Double, decimals: Double): DataTypeReal = js.native
  def apply(options: Anon_Decimals): DataTypeReal = js.native
}


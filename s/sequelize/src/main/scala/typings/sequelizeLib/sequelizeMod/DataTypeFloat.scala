package typings
package sequelizeLib.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTypeFloat extends DataTypeAbstractNumber[DataTypeFloat] {
  /**
    * Length of the number field and decimals of the float
    */
  def apply(): DataTypeFloat = js.native
  def apply(length: scala.Double): DataTypeFloat = js.native
  def apply(length: scala.Double, decimals: scala.Double): DataTypeFloat = js.native
  def apply(options: sequelizeLib.Anon_Decimals): DataTypeFloat = js.native
}


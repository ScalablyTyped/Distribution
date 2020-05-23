package typings.sequelize.mod

import typings.sequelize.anon.Length
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTypeInteger extends DataTypeAbstractNumber[DataTypeInteger] {
  /**
    * Length of the number field.
    */
  def apply(): DataTypeInteger = js.native
  def apply(length: Double): DataTypeInteger = js.native
  def apply(options: Length): DataTypeInteger = js.native
}


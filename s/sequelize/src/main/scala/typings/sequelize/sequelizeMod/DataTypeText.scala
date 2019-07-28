package typings.sequelize.sequelizeMod

import typings.sequelize.Anon_LengthString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTypeText extends DataTypeAbstract {
  /**
    * Length of the text field.
    *
    * Available lengths: `tiny`, `medium`, `long`
    */
  def apply(): DataTypeText = js.native
  def apply(length: String): DataTypeText = js.native
  def apply(options: Anon_LengthString): DataTypeText = js.native
}


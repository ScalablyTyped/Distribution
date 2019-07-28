package typings.sequelize.sequelizeMod

import typings.sequelize.Anon_LengthString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTypeBlob extends DataTypeAbstract {
  /**
    * Length of the blob field.
    *
    * Available lengths: `tiny`, `medium`, `long`
    */
  def apply(): DataTypeBlob = js.native
  def apply(length: String): DataTypeBlob = js.native
  def apply(options: Anon_LengthString): DataTypeBlob = js.native
}


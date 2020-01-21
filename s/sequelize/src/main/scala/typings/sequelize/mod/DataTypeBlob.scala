package typings.sequelize.mod

import typings.sequelize.AnonLengthString
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
  def apply(options: AnonLengthString): DataTypeBlob = js.native
}


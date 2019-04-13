package typings
package sequelizeLib.sequelizeMod

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
  def apply(length: java.lang.String): DataTypeBlob = js.native
  def apply(options: sequelizeLib.Anon_LengthString): DataTypeBlob = js.native
}


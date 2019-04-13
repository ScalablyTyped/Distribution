package typings
package sequelizeLib.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTypeRange extends DataTypeAbstract {
  /**
    * Range field for Postgre
    *
    * Accepts subtype any of the ranges
    */
  def apply(): DataTypeRange = js.native
  def apply(options: sequelizeLib.Anon_Subtype): DataTypeRange = js.native
  def apply(subtype: DataTypeAbstract): DataTypeRange = js.native
}


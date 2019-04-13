package typings
package sequelizeLib.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTypeAbstractString[T] extends DataTypeAbstract {
  /**
    * Property BINARY for the type
    */
  var BINARY: T = js.native
  /**
    * A variable length string. Default length 255
    */
  def apply(): T = js.native
  def apply(length: scala.Double): T = js.native
  def apply(options: sequelizeLib.Anon_Length): T = js.native
}


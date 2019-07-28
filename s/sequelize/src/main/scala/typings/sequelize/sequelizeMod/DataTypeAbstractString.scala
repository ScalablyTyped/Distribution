package typings.sequelize.sequelizeMod

import typings.sequelize.Anon_Length
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
  def apply(length: Double): T = js.native
  def apply(options: Anon_Length): T = js.native
}


package typings
package shortidLib.shortidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShortId extends js.Object {
  def apply(): java.lang.String = js.native
  def characters(string: java.lang.String): java.lang.String = js.native
  def generate(): java.lang.String = js.native
  def isValid(id: js.Any): scala.Boolean = js.native
  def seed(float: scala.Double): scala.Unit = js.native
  def worker(integer: scala.Double): scala.Unit = js.native
}


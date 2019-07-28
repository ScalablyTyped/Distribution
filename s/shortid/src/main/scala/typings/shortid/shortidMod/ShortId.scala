package typings.shortid.shortidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShortId extends js.Object {
  def apply(): String = js.native
  def characters(string: String): String = js.native
  def generate(): String = js.native
  def isValid(id: js.Any): Boolean = js.native
  def seed(float: Double): Unit = js.native
  def worker(integer: Double): Unit = js.native
}


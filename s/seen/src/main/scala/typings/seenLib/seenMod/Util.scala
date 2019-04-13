package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Util")
@js.native
object Util extends js.Object {
  def arraysEqual[T](a: js.Array[T], b: js.Array[T]): scala.Boolean = js.native
  def defaults[T](obj: T, opts: stdLib.Partial[T], defaults: stdLib.Partial[T]): scala.Unit = js.native
  def element(elementOrId: java.lang.String): stdLib.HTMLElement = js.native
  def element(elementOrId: stdLib.HTMLElement): stdLib.HTMLElement = js.native
  def uniqueId(): java.lang.String = js.native
  def uniqueId(prefix: java.lang.String): java.lang.String = js.native
}


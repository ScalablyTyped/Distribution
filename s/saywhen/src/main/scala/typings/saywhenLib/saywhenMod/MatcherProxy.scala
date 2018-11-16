package typings
package saywhenLib.saywhenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatcherProxy[T] extends js.Object {
  val latest: T = js.native
  def apply(arg: T): scala.Boolean = js.native
  def values(): js.Array[T] = js.native
}


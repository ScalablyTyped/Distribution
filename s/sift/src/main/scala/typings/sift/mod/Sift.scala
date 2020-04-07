package typings.sift.mod

import typings.sift.siftNumbers.`-1`
import typings.sift.siftNumbers.`0`
import typings.sift.siftNumbers.`1`
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sift extends js.Object {
  def apply[T /* <: js.Array[SupportedTypes] */](query: SiftQuery[T]): FilterFn = js.native
  def apply[T](query: SiftQuery[_], rawSelector: js.Function1[/* item */ T, Boolean]): Exec = js.native
  def apply[T /* <: SupportedTypes */](query: SiftQuery[T], target: T): T = js.native
  def apply[T /* <: SupportedTypes */](query: SiftQuery[T], target: T, rawSelector: js.Any): T = js.native
  def apply[T /* <: SupportedTypes */](query: RegExp, target: T): T = js.native
  def apply[T /* <: SupportedTypes */](query: RegExp, target: T, rawSelector: js.Any): T = js.native
  def compare[T, K](a: T, b: K): `0` | `-1` | `1` = js.native
  def indexOf[T /* <: SupportedTypes */](query: SiftQuery[T], target: T): Double = js.native
  def indexOf[T /* <: SupportedTypes */](query: SiftQuery[T], target: T, rawSelector: js.Any): Double = js.native
  def use[K](plugin: PluginDefinition[K]): Unit = js.native
  def use[K](plugin: PluginFunction[K]): Unit = js.native
}


package typings
package siftLib.siftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sift extends js.Object {
  def apply[T /* <: js.Array[SupportedTypes] */](query: SiftQuery[T]): FilterFn = js.native
  def apply[T](query: SiftQuery[_], rawSelector: js.Function1[/* item */ T, scala.Boolean]): Exec = js.native
  def apply[T /* <: SupportedTypes */](query: SiftQuery[T], target: T): T = js.native
  def apply[T /* <: SupportedTypes */](query: SiftQuery[T], target: T, rawSelector: js.Any): T = js.native
  def apply[T /* <: SupportedTypes */](query: stdLib.RegExp, target: T): T = js.native
  def apply[T /* <: SupportedTypes */](query: stdLib.RegExp, target: T, rawSelector: js.Any): T = js.native
  def compare[T, K](a: T, b: K): siftLib.siftLibNumbers.`0` | siftLib.siftLibNumbers.`-1` | siftLib.siftLibNumbers.`1` = js.native
  def indexOf[T /* <: SupportedTypes */](query: SiftQuery[T], target: T): scala.Double = js.native
  def indexOf[T /* <: SupportedTypes */](query: SiftQuery[T], target: T, rawSelector: js.Any): scala.Double = js.native
  def use[K](plugin: PluginDefinition[K]): scala.Unit = js.native
  def use[K](plugin: PluginFunction[K]): scala.Unit = js.native
}


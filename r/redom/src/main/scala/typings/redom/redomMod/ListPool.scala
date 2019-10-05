package typings.redom.redomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redom", "ListPool")
@js.native
class ListPool protected () extends js.Object {
  def this(View: RedomComponentConstructor) = this()
  def this(View: RedomComponentConstructor, key: String) = this()
  def this(View: RedomComponentConstructor, key: String, initData: js.Any) = this()
  def update(data: js.Array[_]): Unit = js.native
  def update(data: js.Array[_], context: js.Any): Unit = js.native
}

@JSImport("redom", "listPool")
@js.native
object listPool extends js.Object {
  def apply(View: RedomComponentConstructor): ListPool = js.native
  def apply(View: RedomComponentConstructor, key: String): ListPool = js.native
  def apply(View: RedomComponentConstructor, key: String, initData: js.Any): ListPool = js.native
}


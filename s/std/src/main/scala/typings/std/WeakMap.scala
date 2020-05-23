package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeakMap[K /* <: js.Object */, V] extends js.Object {
  @JSName(js.Symbol.toStringTag)
  val toStringTag: java.lang.String = js.native
  def delete(key: K): scala.Boolean = js.native
  def get(key: K): js.UndefOr[V] = js.native
  def has(key: K): scala.Boolean = js.native
  def set(key: K, value: V): this.type = js.native
}


package typings.store2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("store2", "transact")
@js.native
object transact extends js.Object {
  def apply(key: js.Any, fn: js.Function1[/* data */ js.Any, _]): StoreAPI = js.native
  def apply(key: js.Any, fn: js.Function1[/* data */ js.Any, _], alt: js.Any): StoreAPI = js.native
}


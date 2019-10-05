package typings.store2.store2Mod

import typings.store2.store2Numbers.`0`
import typings.store2.store2Numbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("store2", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(clearIfFalsy: `0`): StoreAPI = js.native
  def apply(clearIfFalsy: `false`): StoreAPI = js.native
  def apply(eachFn: js.Function2[/* key */ js.Any, /* data */ js.Any, `false` | _]): StoredData = js.native
  def apply(eachFn: js.Function2[/* key */ js.Any, /* data */ js.Any, `false` | _], value: js.Any): StoredData = js.native
  def apply(key: js.Any): js.Any = js.native
  def apply(key: js.Any, data: js.Any): js.Any = js.native
  def apply(key: js.Any, fn: js.Function1[/* data */ js.Any, _]): StoreAPI = js.native
  def apply(key: js.Any, fn: js.Function1[/* data */ js.Any, _], alt: js.Any): StoreAPI = js.native
  def apply(obj: js.Object): StoredData = js.native
}


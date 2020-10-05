package typings.reactNative

import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Based on definitions of lib.dom and lib.dom.iterable
  */
@js.native
trait URLSearchParams extends js.Object {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[js.Tuple2[String, String]]] = js.native
  def append(name: String, value: String): Unit = js.native
  def delete(name: String): Unit = js.native
  def entries(): IterableIterator[js.Tuple2[String, String]] = js.native
  def forEach(callbackfn: js.Function3[/* value */ String, /* key */ String, /* parent */ this.type, Unit]): Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ String, /* key */ String, /* parent */ this.type, Unit],
    thisArg: js.Any
  ): Unit = js.native
  def get(name: String): String | Null = js.native
  def getAll(name: String): js.Array[String] = js.native
  def has(name: String): Boolean = js.native
  def keys(): IterableIterator[String] = js.native
  def set(name: String, value: String): Unit = js.native
  def sort(): Unit = js.native
  def values(): IterableIterator[String] = js.native
}


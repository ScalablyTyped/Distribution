package typings.reactDashNative

import typings.std.IterableIterator
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Based on definitions of lib.dom and  lib.dom.iteralbe
  */
@JSGlobal("URLSearchParams")
@js.native
class URLSearchParams () extends js.Object {
  def this(init: String) = this()
  def this(init: js.Array[js.Array[String]]) = this()
  def this(init: URLSearchParams) = this()
  def this(init: Record[String, String]) = this()
  @JSName(scala.scalajs.js.Symbol.iterator)
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


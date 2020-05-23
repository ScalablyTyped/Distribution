package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait URLSearchParams extends _BodyInit {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[js.Tuple2[java.lang.String, java.lang.String]]] = js.native
  /**
    * Appends a specified key/value pair as a new search parameter.
    */
  def append(name: java.lang.String, value: java.lang.String): Unit = js.native
  /**
    * Deletes the given search parameter, and its associated value, from the list of all search parameters.
    */
  def delete(name: java.lang.String): Unit = js.native
  /**
    * Returns an array of key, value pairs for every entry in the search params.
    */
  def entries(): IterableIterator[js.Tuple2[java.lang.String, java.lang.String]] = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ java.lang.String, /* key */ java.lang.String, /* parent */ this.type, Unit]
  ): Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ java.lang.String, /* key */ java.lang.String, /* parent */ this.type, Unit],
    thisArg: js.Any
  ): Unit = js.native
  /**
    * Returns the first value associated to the given search parameter.
    */
  def get(name: java.lang.String): java.lang.String | Null = js.native
  /**
    * Returns all the values association with a given search parameter.
    */
  def getAll(name: java.lang.String): js.Array[java.lang.String] = js.native
  /**
    * Returns a Boolean indicating if such a search parameter exists.
    */
  def has(name: java.lang.String): scala.Boolean = js.native
  /**
    * Returns a list of keys in the search params.
    */
  def keys(): IterableIterator[java.lang.String] = js.native
  /**
    * Sets the value associated to a given search parameter to the given value. If there were several values, delete the others.
    */
  def set(name: java.lang.String, value: java.lang.String): Unit = js.native
  def sort(): Unit = js.native
  /**
    * Returns a list of values in the search params.
    */
  def values(): IterableIterator[java.lang.String] = js.native
}


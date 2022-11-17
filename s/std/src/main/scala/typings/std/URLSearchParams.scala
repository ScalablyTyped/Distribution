package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait URLSearchParams extends StObject {
  
  /** Appends a specified key/value pair as a new search parameter. */
  /* standard dom */
  def append(name: java.lang.String, value: java.lang.String): Unit = js.native
  
  /** Deletes the given search parameter, and its associated value, from the list of all search parameters. */
  /* standard dom */
  def delete(name: java.lang.String): Unit = js.native
  
  /** Returns an array of key, value pairs for every entry in the search params. */
  /* standard dom.iterable */
  def entries(): IterableIterator[js.Tuple2[java.lang.String, java.lang.String]] = js.native
  
  /* standard dom */
  def forEach(
    callbackfn: js.Function3[/* value */ java.lang.String, /* key */ java.lang.String, /* parent */ this.type, Unit]
  ): Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ java.lang.String, /* key */ java.lang.String, /* parent */ this.type, Unit],
    thisArg: Any
  ): Unit = js.native
  
  /** Returns the first value associated to the given search parameter. */
  /* standard dom */
  def get(name: java.lang.String): java.lang.String | Null = js.native
  
  /** Returns all the values association with a given search parameter. */
  /* standard dom */
  def getAll(name: java.lang.String): js.Array[java.lang.String] = js.native
  
  /** Returns a Boolean indicating if such a search parameter exists. */
  /* standard dom */
  def has(name: java.lang.String): scala.Boolean = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[js.Tuple2[java.lang.String, java.lang.String]]] = js.native
  
  /** Returns a list of keys in the search params. */
  /* standard dom.iterable */
  def keys(): IterableIterator[java.lang.String] = js.native
  
  /** Sets the value associated to a given search parameter to the given value. If there were several values, delete the others. */
  /* standard dom */
  def set(name: java.lang.String, value: java.lang.String): Unit = js.native
  
  /* standard dom */
  def sort(): Unit = js.native
  
  /** Returns a list of values in the search params. */
  /* standard dom.iterable */
  def values(): IterableIterator[java.lang.String] = js.native
}

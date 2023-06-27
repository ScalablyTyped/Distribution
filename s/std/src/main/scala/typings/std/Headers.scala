package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Fetch API interface allows you to perform various actions on HTTP request and response headers. These actions include retrieving, setting, adding to, and removing. A Headers object has an associated header list, which is initially empty and consists of zero or more name and value pairs.  You can add to this using methods like append() (see Examples.) In all methods of this interface, header names are matched by case-insensitive byte sequence.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers)
  */
@js.native
trait Headers extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/append) */
  /* standard dom */
  def append(name: java.lang.String, value: java.lang.String): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/delete) */
  /* standard dom */
  def delete(name: java.lang.String): Unit = js.native
  
  /** Returns an iterator allowing to go through all key/value pairs contained in this object. */
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/get) */
  /* standard dom */
  def get(name: java.lang.String): java.lang.String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/has) */
  /* standard dom */
  def has(name: java.lang.String): scala.Boolean = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[js.Tuple2[java.lang.String, java.lang.String]]] = js.native
  
  /** Returns an iterator allowing to go through all keys of the key/value pairs contained in this object. */
  /* standard dom.iterable */
  def keys(): IterableIterator[java.lang.String] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/set) */
  /* standard dom */
  def set(name: java.lang.String, value: java.lang.String): Unit = js.native
  
  /** Returns an iterator allowing to go through all values of the key/value pairs contained in this object. */
  /* standard dom.iterable */
  def values(): IterableIterator[java.lang.String] = js.native
}

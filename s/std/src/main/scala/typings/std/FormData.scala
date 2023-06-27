package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a way to easily construct a set of key/value pairs representing form fields and their values, which can then be easily sent using the XMLHttpRequest.send() method. It uses the same format a form would use if the encoding type were set to "multipart/form-data".
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData)
  */
@js.native
trait FormData
  extends StObject
     with _XMLHttpRequestBodyInit {
  
  def append(name: java.lang.String, blobValue: Blob, filename: java.lang.String): Unit = js.native
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/append) */
  /* standard dom */
  def append(name: java.lang.String, value: java.lang.String): Unit = js.native
  /* standard dom */
  def append(name: java.lang.String, value: Blob): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/delete) */
  /* standard dom */
  def delete(name: java.lang.String): Unit = js.native
  
  /** Returns an array of key, value pairs for every entry in the list. */
  /* standard dom.iterable */
  def entries(): IterableIterator[js.Tuple2[java.lang.String, FormDataEntryValue]] = js.native
  
  /* standard dom */
  def forEach(
    callbackfn: js.Function3[
      /* value */ FormDataEntryValue, 
      /* key */ java.lang.String, 
      /* parent */ this.type, 
      Unit
    ]
  ): Unit = js.native
  def forEach(
    callbackfn: js.Function3[
      /* value */ FormDataEntryValue, 
      /* key */ java.lang.String, 
      /* parent */ this.type, 
      Unit
    ],
    thisArg: Any
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/get) */
  /* standard dom */
  def get(name: java.lang.String): FormDataEntryValue | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/getAll) */
  /* standard dom */
  def getAll(name: java.lang.String): js.Array[FormDataEntryValue] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/has) */
  /* standard dom */
  def has(name: java.lang.String): scala.Boolean = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[js.Tuple2[java.lang.String, FormDataEntryValue]]] = js.native
  
  /** Returns a list of keys in the list. */
  /* standard dom.iterable */
  def keys(): IterableIterator[java.lang.String] = js.native
  
  def set(name: java.lang.String, blobValue: Blob, filename: java.lang.String): Unit = js.native
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/set) */
  /* standard dom */
  def set(name: java.lang.String, value: java.lang.String): Unit = js.native
  /* standard dom */
  def set(name: java.lang.String, value: Blob): Unit = js.native
  
  /** Returns a list of values in the list. */
  /* standard dom.iterable */
  def values(): IterableIterator[FormDataEntryValue] = js.native
}

package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormData extends js.Object {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[js.Tuple2[java.lang.String, FormDataEntryValue]]] = js.native
  def append(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def append(name: java.lang.String, value: java.lang.String, fileName: java.lang.String): scala.Unit = js.native
  def append(name: java.lang.String, value: Blob): scala.Unit = js.native
  def append(name: java.lang.String, value: Blob, fileName: java.lang.String): scala.Unit = js.native
  def delete(name: java.lang.String): scala.Unit = js.native
  /**
       * Returns an array of key, value pairs for every entry in the list.
       */
  def entries(): IterableIterator[js.Tuple2[java.lang.String, FormDataEntryValue]] = js.native
  def forEach(
    callbackfn: js.Function3[
      /* value */ FormDataEntryValue, 
      /* key */ java.lang.String, 
      /* parent */ this.type, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def forEach(
    callbackfn: js.Function3[
      /* value */ FormDataEntryValue, 
      /* key */ java.lang.String, 
      /* parent */ this.type, 
      scala.Unit
    ],
    thisArg: js.Any
  ): scala.Unit = js.native
  def get(name: java.lang.String): FormDataEntryValue | scala.Null = js.native
  def getAll(name: java.lang.String): js.Array[FormDataEntryValue] = js.native
  def has(name: java.lang.String): scala.Boolean = js.native
  /**
       * Returns a list of keys in the list.
       */
  def keys(): IterableIterator[java.lang.String] = js.native
  def set(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def set(name: java.lang.String, value: java.lang.String, fileName: java.lang.String): scala.Unit = js.native
  def set(name: java.lang.String, value: Blob): scala.Unit = js.native
  def set(name: java.lang.String, value: Blob, fileName: java.lang.String): scala.Unit = js.native
  /**
       * Returns a list of values in the list.
       */
  def values(): IterableIterator[FormDataEntryValue] = js.native
}

@JSGlobal("FormData")
@js.native
object FormData
  extends org.scalablytyped.runtime.Instantiable0[FormData]
     with org.scalablytyped.runtime.Instantiable1[/* form */ HTMLFormElement, FormData]


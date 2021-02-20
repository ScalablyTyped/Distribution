package typings.rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Map[K, V] extends StObject {
  
  def clear(): Unit = js.native
  
  def delete(key: K): Boolean = js.native
  
  def entries(): IterableIterator[js.Tuple2[K, V]] = js.native
  
  def forEach(callbackfn: js.Function3[/* value */ V, /* index */ K, /* map */ Map[K, V], Unit]): Unit = js.native
  def forEach(callbackfn: js.Function3[/* value */ V, /* index */ K, /* map */ Map[K, V], Unit], thisArg: js.Any): Unit = js.native
  
  def get(key: K): V = js.native
  
  def has(key: K): Boolean = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[js.Tuple2[K, V]]] = js.native
  
  def keys(): IterableIterator[K] = js.native
  
  def set(key: K): Map[K, V] = js.native
  def set(key: K, value: V): Map[K, V] = js.native
  
  var size: Double = js.native
  
  @JSName(js.Symbol.toStringTag)
  var toStringTag: String = js.native
  
  def values(): IterableIterator[V] = js.native
}

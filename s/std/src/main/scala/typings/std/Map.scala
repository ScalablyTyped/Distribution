package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Map[K, V] extends StObject {
  
  /* standard es2015.collection */
  def clear(): Unit = js.native
  
  /**
    * @returns true if an element in the Map existed and has been removed, or false if the element does not exist.
    */
  /* standard es2015.collection */
  def delete(key: K): scala.Boolean = js.native
  
  /**
    * Returns an iterable of key, value pairs for every entry in the map.
    */
  /* standard es2015.iterable */
  def entries(): IterableIterator[js.Tuple2[K, V]] = js.native
  
  /**
    * Executes a provided function once per each key/value pair in the Map, in insertion order.
    */
  /* standard es2015.collection */
  def forEach(callbackfn: js.Function3[/* value */ V, /* key */ K, /* map */ Map[K, V], Unit]): Unit = js.native
  def forEach(callbackfn: js.Function3[/* value */ V, /* key */ K, /* map */ Map[K, V], Unit], thisArg: Any): Unit = js.native
  
  /**
    * Returns a specified element from the Map object. If the value that is associated to the provided key is an object, then you will get a reference to that object and any change made to that object will effectively modify it inside the Map.
    * @returns Returns the element associated with the specified key. If no element is associated with the specified key, undefined is returned.
    */
  /* standard es2015.collection */
  def get(key: K): js.UndefOr[V] = js.native
  
  /**
    * @returns boolean indicating whether an element with the specified key exists or not.
    */
  /* standard es2015.collection */
  def has(key: K): scala.Boolean = js.native
  
  /** Returns an iterable of entries in the map. */
  /* standard es2015.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[js.Tuple2[K, V]]] = js.native
  
  /**
    * Returns an iterable of keys in the map
    */
  /* standard es2015.iterable */
  def keys(): IterableIterator[K] = js.native
  
  /**
    * Adds a new element with a specified key and value to the Map. If an element with the same key already exists, the element will be updated.
    */
  /* standard es2015.collection */
  def set(key: K, value: V): this.type = js.native
  
  /**
    * @returns the number of elements in the Map.
    */
  /* standard es2015.collection */
  val size: Double = js.native
  
  /* standard es2015.symbol.wellknown */
  @JSName(js.Symbol.toStringTag)
  val toStringTag: java.lang.String = js.native
  
  /**
    * Returns an iterable of values in the map
    */
  /* standard es2015.iterable */
  def values(): IterableIterator[V] = js.native
}

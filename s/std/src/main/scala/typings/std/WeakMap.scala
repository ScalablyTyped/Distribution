package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WeakMap[K /* <: js.Object */, V] extends StObject {
  
  /**
    * Removes the specified element from the WeakMap.
    * @returns true if the element was successfully removed, or false if it was not present.
    */
  /* standard es2015.collection */
  def delete(key: K): scala.Boolean = js.native
  
  /**
    * @returns a specified element.
    */
  /* standard es2015.collection */
  def get(key: K): js.UndefOr[V] = js.native
  
  /**
    * @returns a boolean indicating whether an element with the specified key exists or not.
    */
  /* standard es2015.collection */
  def has(key: K): scala.Boolean = js.native
  
  /**
    * Adds a new element with a specified key and value.
    * @param key Must be an object.
    */
  /* standard es2015.collection */
  def set(key: K, value: V): this.type = js.native
  
  /* standard es2015.symbol.wellknown */
  @JSName(js.Symbol.toStringTag)
  val toStringTag: java.lang.String = js.native
}

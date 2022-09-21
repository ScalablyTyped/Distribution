package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WeakSet[T /* <: js.Object */] extends StObject {
  
  /**
    * Appends a new object to the end of the WeakSet.
    */
  /* standard es2015.collection */
  def add(value: T): this.type = js.native
  
  /**
    * Removes the specified element from the WeakSet.
    * @returns Returns true if the element existed and has been removed, or false if the element does not exist.
    */
  /* standard es2015.collection */
  def delete(value: T): scala.Boolean = js.native
  
  /**
    * @returns a boolean indicating whether an object exists in the WeakSet or not.
    */
  /* standard es2015.collection */
  def has(value: T): scala.Boolean = js.native
  
  /* standard es2015.symbol.wellknown */
  @JSName(js.Symbol.toStringTag)
  val toStringTag: java.lang.String = js.native
}

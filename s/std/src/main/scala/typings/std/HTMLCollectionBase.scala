package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A generic collection (array-like object similar to arguments) of elements (in document order) and offers methods and properties for selecting from the list. */
@js.native
trait HTMLCollectionBase
  extends StObject
     with /* index */ NumberDictionary[Element] {
  
  /**
    * Retrieves an object from various collections.
    */
  def item(index: Double): Element | Null = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Element]] = js.native
  
  /**
    * Sets or retrieves the number of objects in a collection.
    */
  val length: Double = js.native
}

package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HTMLCollectionBase
  extends /* index */ ScalablyTyped.runtime.NumberDictionary[Element] {
  @JSName(ScalablyTyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Element]]
  /**
       * Sets or retrieves the number of objects in a collection.
       */
  val length: scala.Double
  /**
       * Retrieves an object from various collections.
       */
  def item(index: scala.Double): Element | scala.Null
}


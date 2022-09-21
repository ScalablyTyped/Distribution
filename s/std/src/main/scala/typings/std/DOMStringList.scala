package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A type returned by some APIs which contains a list of DOMString (strings). */
@js.native
trait DOMStringList
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[java.lang.String] {
  
  /** Returns true if strings contains string, and false otherwise. */
  /* standard dom */
  def contains(string: java.lang.String): scala.Boolean = js.native
  
  /** Returns the string with index index from strings. */
  /* standard dom */
  def item(index: Double): java.lang.String | Null = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[java.lang.String]] = js.native
  
  /** Returns the number of strings in strings. */
  /* standard dom */
  val length: Double = js.native
}

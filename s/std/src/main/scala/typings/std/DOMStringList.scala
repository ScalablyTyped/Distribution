package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A type returned by some APIs which contains a list of DOMString (strings).
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMStringList)
  */
@js.native
trait DOMStringList
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[java.lang.String] {
  
  /**
    * Returns true if strings contains string, and false otherwise.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMStringList/contains)
    */
  /* standard dom */
  def contains(string: java.lang.String): scala.Boolean = js.native
  
  /**
    * Returns the string with index index from strings.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMStringList/item)
    */
  /* standard dom */
  def item(index: Double): java.lang.String | Null = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[java.lang.String]] = js.native
  
  /**
    * Returns the number of strings in strings.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMStringList/length)
    */
  /* standard dom */
  val length: Double = js.native
}

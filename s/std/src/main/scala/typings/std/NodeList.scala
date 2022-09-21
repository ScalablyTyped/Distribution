package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NodeList objects are collections of nodes, usually returned by properties such as Node.childNodes and methods such as document.querySelectorAll(). */
@js.native
trait NodeList
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[Node] {
  
  /** Returns an array of key, value pairs for every entry in the list. */
  /* standard dom.iterable */
  def entries(): IterableIterator[js.Tuple2[Double, Node]] = js.native
  
  /**
    * Performs the specified action for each node in an list.
    * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the list.
    * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
    */
  /* standard dom */
  def forEach(callbackfn: js.Function3[/* value */ Node, /* key */ Double, /* parent */ this.type, Unit]): Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ Node, /* key */ Double, /* parent */ this.type, Unit],
    thisArg: Any
  ): Unit = js.native
  
  /** Returns the node with index index from the collection. The nodes are sorted in tree order. */
  /* standard dom */
  def item(index: Double): Node | Null = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Node]] = js.native
  
  /** Returns an list of keys in the list. */
  /* standard dom.iterable */
  def keys(): IterableIterator[Double] = js.native
  
  /** Returns the number of nodes in the collection. */
  /* standard dom */
  val length: Double = js.native
  
  /** Returns an list of values in the list. */
  /* standard dom.iterable */
  def values(): IterableIterator[Node] = js.native
}

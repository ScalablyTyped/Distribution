package typings.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** NodeList objects are collections of nodes, usually returned by properties such as Node.childNodes and methods such as document.querySelectorAll(). */
@js.native
trait NodeList extends /* index */ NumberDictionary[Node] {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Node]] = js.native
  /**
    * Returns the number of nodes in the collection.
    */
  val length: Double = js.native
  /**
    * Returns an array of key, value pairs for every entry in the list.
    */
  def entries(): IterableIterator[js.Tuple2[Double, Node]] = js.native
  /**
    * Performs the specified action for each node in an list.
    * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the list.
    * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
    */
  def forEach(callbackfn: js.Function3[/* value */ Node, /* key */ Double, /* parent */ this.type, Unit]): Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ Node, /* key */ Double, /* parent */ this.type, Unit],
    thisArg: js.Any
  ): Unit = js.native
  /**
    * Returns the node with index index from the collection. The nodes are sorted in tree order.
    */
  def item(index: Double): Node | Null = js.native
  /**
    * Returns an list of keys in the list.
    */
  def keys(): IterableIterator[Double] = js.native
  /**
    * Returns an list of values in the list.
    */
  def values(): IterableIterator[Node] = js.native
}


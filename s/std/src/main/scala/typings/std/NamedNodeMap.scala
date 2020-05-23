package typings.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A collection of Attr objects. Objects inside a NamedNodeMap are not in any particular order, unlike NodeList, although they may be accessed by an index as in an array. */
@js.native
trait NamedNodeMap extends /* index */ NumberDictionary[Attr] {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Attr]] = js.native
  val length: Double = js.native
  def getNamedItem(qualifiedName: java.lang.String): Attr | Null = js.native
  def getNamedItemNS(namespace: java.lang.String, localName: java.lang.String): Attr | Null = js.native
  def getNamedItemNS(namespace: Null, localName: java.lang.String): Attr | Null = js.native
  def item(index: Double): Attr | Null = js.native
  def removeNamedItem(qualifiedName: java.lang.String): Attr = js.native
  def removeNamedItemNS(namespace: java.lang.String, localName: java.lang.String): Attr = js.native
  def removeNamedItemNS(namespace: Null, localName: java.lang.String): Attr = js.native
  def setNamedItem(attr: Attr): Attr | Null = js.native
  def setNamedItemNS(attr: Attr): Attr | Null = js.native
}


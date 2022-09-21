package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A collection of Attr objects. Objects inside a NamedNodeMap are not in any particular order, unlike NodeList, although they may be accessed by an index as in an array. */
@js.native
trait NamedNodeMap
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[Attr] {
  
  /* standard dom */
  def getNamedItem(qualifiedName: java.lang.String): Attr | Null = js.native
  
  /* standard dom */
  def getNamedItemNS(namespace: java.lang.String, localName: java.lang.String): Attr | Null = js.native
  def getNamedItemNS(namespace: Null, localName: java.lang.String): Attr | Null = js.native
  
  /* standard dom */
  def item(index: Double): Attr | Null = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Attr]] = js.native
  
  /* standard dom */
  val length: Double = js.native
  
  /* standard dom */
  def removeNamedItem(qualifiedName: java.lang.String): Attr = js.native
  
  /* standard dom */
  def removeNamedItemNS(namespace: java.lang.String, localName: java.lang.String): Attr = js.native
  def removeNamedItemNS(namespace: Null, localName: java.lang.String): Attr = js.native
  
  /* standard dom */
  def setNamedItem(attr: Attr): Attr | Null = js.native
  
  /* standard dom */
  def setNamedItemNS(attr: Attr): Attr | Null = js.native
}

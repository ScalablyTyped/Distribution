package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The SVGStringList defines a list of DOMString objects. */
@js.native
trait SVGStringList
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[java.lang.String] {
  
  /* standard dom */
  def appendItem(newItem: java.lang.String): java.lang.String = js.native
  
  /* standard dom */
  def clear(): Unit = js.native
  
  /* standard dom */
  def getItem(index: Double): java.lang.String = js.native
  
  /* standard dom */
  def initialize(newItem: java.lang.String): java.lang.String = js.native
  
  /* standard dom */
  def insertItemBefore(newItem: java.lang.String, index: Double): java.lang.String = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[java.lang.String]] = js.native
  
  /* standard dom */
  val length: Double = js.native
  
  /* standard dom */
  val numberOfItems: Double = js.native
  
  /* standard dom */
  def removeItem(index: Double): java.lang.String = js.native
  
  /* standard dom */
  def replaceItem(newItem: java.lang.String, index: Double): java.lang.String = js.native
}

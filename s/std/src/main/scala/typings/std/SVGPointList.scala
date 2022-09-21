package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGPointList
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[DOMPoint] {
  
  /* standard dom */
  def appendItem(newItem: DOMPoint): DOMPoint = js.native
  
  /* standard dom */
  def clear(): Unit = js.native
  
  /* standard dom */
  def getItem(index: Double): DOMPoint = js.native
  
  /* standard dom */
  def initialize(newItem: DOMPoint): DOMPoint = js.native
  
  /* standard dom */
  def insertItemBefore(newItem: DOMPoint, index: Double): DOMPoint = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[DOMPoint]] = js.native
  
  /* standard dom */
  val length: Double = js.native
  
  /* standard dom */
  val numberOfItems: Double = js.native
  
  /* standard dom */
  def removeItem(index: Double): DOMPoint = js.native
  
  /* standard dom */
  def replaceItem(newItem: DOMPoint, index: Double): DOMPoint = js.native
}

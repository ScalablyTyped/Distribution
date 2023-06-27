package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList) */
@js.native
trait SVGPointList
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[DOMPoint] {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/appendItem) */
  /* standard dom */
  def appendItem(newItem: DOMPoint): DOMPoint = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/clear) */
  /* standard dom */
  def clear(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/getItem) */
  /* standard dom */
  def getItem(index: Double): DOMPoint = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/initialize) */
  /* standard dom */
  def initialize(newItem: DOMPoint): DOMPoint = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/insertItemBefore) */
  /* standard dom */
  def insertItemBefore(newItem: DOMPoint, index: Double): DOMPoint = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[DOMPoint]] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/length) */
  /* standard dom */
  val length: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/numberOfItems) */
  /* standard dom */
  val numberOfItems: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/removeItem) */
  /* standard dom */
  def removeItem(index: Double): DOMPoint = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/replaceItem) */
  /* standard dom */
  def replaceItem(newItem: DOMPoint, index: Double): DOMPoint = js.native
}

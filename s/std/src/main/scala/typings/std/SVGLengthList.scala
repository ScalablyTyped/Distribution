package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The SVGLengthList defines a list of SVGLength objects.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList)
  */
@js.native
trait SVGLengthList
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[SVGLength] {
  
  /* standard dom */
  def appendItem(newItem: SVGLength): SVGLength = js.native
  
  /* standard dom */
  def clear(): Unit = js.native
  
  /* standard dom */
  def getItem(index: Double): SVGLength = js.native
  
  /* standard dom */
  def initialize(newItem: SVGLength): SVGLength = js.native
  
  /* standard dom */
  def insertItemBefore(newItem: SVGLength, index: Double): SVGLength = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SVGLength]] = js.native
  
  /* standard dom */
  val length: Double = js.native
  
  /* standard dom */
  val numberOfItems: Double = js.native
  
  /* standard dom */
  def removeItem(index: Double): SVGLength = js.native
  
  /* standard dom */
  def replaceItem(newItem: SVGLength, index: Double): SVGLength = js.native
}

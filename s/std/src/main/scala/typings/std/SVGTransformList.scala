package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The SVGTransformList defines a list of SVGTransform objects. */
@js.native
trait SVGTransformList
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[SVGTransform] {
  
  /* standard dom */
  def appendItem(newItem: SVGTransform): SVGTransform = js.native
  
  /* standard dom */
  def clear(): Unit = js.native
  
  /* standard dom */
  def consolidate(): SVGTransform | Null = js.native
  
  /* standard dom */
  def createSVGTransformFromMatrix(): SVGTransform = js.native
  def createSVGTransformFromMatrix(matrix: DOMMatrix2DInit): SVGTransform = js.native
  
  /* standard dom */
  def getItem(index: Double): SVGTransform = js.native
  
  /* standard dom */
  def initialize(newItem: SVGTransform): SVGTransform = js.native
  
  /* standard dom */
  def insertItemBefore(newItem: SVGTransform, index: Double): SVGTransform = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SVGTransform]] = js.native
  
  /* standard dom */
  val length: Double = js.native
  
  /* standard dom */
  val numberOfItems: Double = js.native
  
  /* standard dom */
  def removeItem(index: Double): SVGTransform = js.native
  
  /* standard dom */
  def replaceItem(newItem: SVGTransform, index: Double): SVGTransform = js.native
}

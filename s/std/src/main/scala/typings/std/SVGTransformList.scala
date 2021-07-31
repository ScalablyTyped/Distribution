package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The SVGTransformList defines a list of SVGTransform objects. */
trait SVGTransformList extends StObject {
  
  def appendItem(newItem: SVGTransform): SVGTransform
  
  def clear(): Unit
  
  def consolidate(): SVGTransform
  
  def createSVGTransformFromMatrix(matrix: SVGMatrix): SVGTransform
  
  def getItem(index: Double): SVGTransform
  
  def initialize(newItem: SVGTransform): SVGTransform
  
  def insertItemBefore(newItem: SVGTransform, index: Double): SVGTransform
  
  val numberOfItems: Double
  
  def removeItem(index: Double): SVGTransform
  
  def replaceItem(newItem: SVGTransform, index: Double): SVGTransform
}
object SVGTransformList {
  
  @scala.inline
  def apply(
    appendItem: SVGTransform => SVGTransform,
    clear: () => Unit,
    consolidate: () => SVGTransform,
    createSVGTransformFromMatrix: SVGMatrix => SVGTransform,
    getItem: Double => SVGTransform,
    initialize: SVGTransform => SVGTransform,
    insertItemBefore: (SVGTransform, Double) => SVGTransform,
    numberOfItems: Double,
    removeItem: Double => SVGTransform,
    replaceItem: (SVGTransform, Double) => SVGTransform
  ): SVGTransformList = {
    val __obj = js.Dynamic.literal(appendItem = js.Any.fromFunction1(appendItem), clear = js.Any.fromFunction0(clear), consolidate = js.Any.fromFunction0(consolidate), createSVGTransformFromMatrix = js.Any.fromFunction1(createSVGTransformFromMatrix), getItem = js.Any.fromFunction1(getItem), initialize = js.Any.fromFunction1(initialize), insertItemBefore = js.Any.fromFunction2(insertItemBefore), numberOfItems = numberOfItems.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), replaceItem = js.Any.fromFunction2(replaceItem))
    __obj.asInstanceOf[SVGTransformList]
  }
  
  @scala.inline
  implicit class SVGTransformListMutableBuilder[Self <: SVGTransformList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendItem(value: SVGTransform => SVGTransform): Self = StObject.set(x, "appendItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConsolidate(value: () => SVGTransform): Self = StObject.set(x, "consolidate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateSVGTransformFromMatrix(value: SVGMatrix => SVGTransform): Self = StObject.set(x, "createSVGTransformFromMatrix", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItem(value: Double => SVGTransform): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitialize(value: SVGTransform => SVGTransform): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertItemBefore(value: (SVGTransform, Double) => SVGTransform): Self = StObject.set(x, "insertItemBefore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNumberOfItems(value: Double): Self = StObject.set(x, "numberOfItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveItem(value: Double => SVGTransform): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplaceItem(value: (SVGTransform, Double) => SVGTransform): Self = StObject.set(x, "replaceItem", js.Any.fromFunction2(value))
  }
}

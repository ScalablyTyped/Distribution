package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGPathSegList extends StObject {
  
  def appendItem(newItem: SVGPathSeg): SVGPathSeg = js.native
  
  def clear(): Unit = js.native
  
  def getItem(index: Double): SVGPathSeg = js.native
  
  def initialize(newItem: SVGPathSeg): SVGPathSeg = js.native
  
  def insertItemBefore(newItem: SVGPathSeg, index: Double): SVGPathSeg = js.native
  
  val numberOfItems: Double = js.native
  
  def removeItem(index: Double): SVGPathSeg = js.native
  
  def replaceItem(newItem: SVGPathSeg, index: Double): SVGPathSeg = js.native
}
object SVGPathSegList {
  
  @scala.inline
  def apply(
    appendItem: SVGPathSeg => SVGPathSeg,
    clear: () => Unit,
    getItem: Double => SVGPathSeg,
    initialize: SVGPathSeg => SVGPathSeg,
    insertItemBefore: (SVGPathSeg, Double) => SVGPathSeg,
    numberOfItems: Double,
    removeItem: Double => SVGPathSeg,
    replaceItem: (SVGPathSeg, Double) => SVGPathSeg
  ): SVGPathSegList = {
    val __obj = js.Dynamic.literal(appendItem = js.Any.fromFunction1(appendItem), clear = js.Any.fromFunction0(clear), getItem = js.Any.fromFunction1(getItem), initialize = js.Any.fromFunction1(initialize), insertItemBefore = js.Any.fromFunction2(insertItemBefore), numberOfItems = numberOfItems.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), replaceItem = js.Any.fromFunction2(replaceItem))
    __obj.asInstanceOf[SVGPathSegList]
  }
  
  @scala.inline
  implicit class SVGPathSegListMutableBuilder[Self <: SVGPathSegList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendItem(value: SVGPathSeg => SVGPathSeg): Self = StObject.set(x, "appendItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItem(value: Double => SVGPathSeg): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitialize(value: SVGPathSeg => SVGPathSeg): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertItemBefore(value: (SVGPathSeg, Double) => SVGPathSeg): Self = StObject.set(x, "insertItemBefore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNumberOfItems(value: Double): Self = StObject.set(x, "numberOfItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveItem(value: Double => SVGPathSeg): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplaceItem(value: (SVGPathSeg, Double) => SVGPathSeg): Self = StObject.set(x, "replaceItem", js.Any.fromFunction2(value))
  }
}

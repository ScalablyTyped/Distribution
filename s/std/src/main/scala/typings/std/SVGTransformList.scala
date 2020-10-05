package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The SVGTransformList defines a list of SVGTransform objects. */
@js.native
trait SVGTransformList extends js.Object {
  val numberOfItems: Double = js.native
  def appendItem(newItem: SVGTransform): SVGTransform = js.native
  def clear(): Unit = js.native
  def consolidate(): SVGTransform = js.native
  def createSVGTransformFromMatrix(matrix: SVGMatrix): SVGTransform = js.native
  def getItem(index: Double): SVGTransform = js.native
  def initialize(newItem: SVGTransform): SVGTransform = js.native
  def insertItemBefore(newItem: SVGTransform, index: Double): SVGTransform = js.native
  def removeItem(index: Double): SVGTransform = js.native
  def replaceItem(newItem: SVGTransform, index: Double): SVGTransform = js.native
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
  implicit class SVGTransformListOps[Self <: SVGTransformList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppendItem(value: SVGTransform => SVGTransform): Self = this.set("appendItem", js.Any.fromFunction1(value))
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setConsolidate(value: () => SVGTransform): Self = this.set("consolidate", js.Any.fromFunction0(value))
    @scala.inline
    def setCreateSVGTransformFromMatrix(value: SVGMatrix => SVGTransform): Self = this.set("createSVGTransformFromMatrix", js.Any.fromFunction1(value))
    @scala.inline
    def setGetItem(value: Double => SVGTransform): Self = this.set("getItem", js.Any.fromFunction1(value))
    @scala.inline
    def setInitialize(value: SVGTransform => SVGTransform): Self = this.set("initialize", js.Any.fromFunction1(value))
    @scala.inline
    def setInsertItemBefore(value: (SVGTransform, Double) => SVGTransform): Self = this.set("insertItemBefore", js.Any.fromFunction2(value))
    @scala.inline
    def setNumberOfItems(value: Double): Self = this.set("numberOfItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveItem(value: Double => SVGTransform): Self = this.set("removeItem", js.Any.fromFunction1(value))
    @scala.inline
    def setReplaceItem(value: (SVGTransform, Double) => SVGTransform): Self = this.set("replaceItem", js.Any.fromFunction2(value))
  }
  
}


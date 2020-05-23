package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPathSegList extends js.Object {
  val numberOfItems: Double
  def appendItem(newItem: SVGPathSeg): SVGPathSeg
  def clear(): Unit
  def getItem(index: Double): SVGPathSeg
  def initialize(newItem: SVGPathSeg): SVGPathSeg
  def insertItemBefore(newItem: SVGPathSeg, index: Double): SVGPathSeg
  def removeItem(index: Double): SVGPathSeg
  def replaceItem(newItem: SVGPathSeg, index: Double): SVGPathSeg
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
}


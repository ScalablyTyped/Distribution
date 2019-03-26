package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPathSegList extends js.Object {
  val numberOfItems: scala.Double
  def appendItem(newItem: SVGPathSeg): SVGPathSeg
  def clear(): scala.Unit
  def getItem(index: scala.Double): SVGPathSeg
  def initialize(newItem: SVGPathSeg): SVGPathSeg
  def insertItemBefore(newItem: SVGPathSeg, index: scala.Double): SVGPathSeg
  def removeItem(index: scala.Double): SVGPathSeg
  def replaceItem(newItem: SVGPathSeg, index: scala.Double): SVGPathSeg
}

@JSGlobal("SVGPathSegList")
@js.native
class SVGPathSegListCls () extends SVGPathSegList {
  /* CompleteClass */
  override val numberOfItems: scala.Double = js.native
  /* CompleteClass */
  override def appendItem(newItem: SVGPathSeg): SVGPathSeg = js.native
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /* CompleteClass */
  override def getItem(index: scala.Double): SVGPathSeg = js.native
  /* CompleteClass */
  override def initialize(newItem: SVGPathSeg): SVGPathSeg = js.native
  /* CompleteClass */
  override def insertItemBefore(newItem: SVGPathSeg, index: scala.Double): SVGPathSeg = js.native
  /* CompleteClass */
  override def removeItem(index: scala.Double): SVGPathSeg = js.native
  /* CompleteClass */
  override def replaceItem(newItem: SVGPathSeg, index: scala.Double): SVGPathSeg = js.native
}

@JSGlobal("SVGPathSegList")
@js.native
object SVGPathSegList
  extends org.scalablytyped.runtime.Instantiable0[SVGPathSegList]


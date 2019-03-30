package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The SVGTransformList defines a list of SVGTransform objects. */
trait SVGTransformList extends js.Object {
  val numberOfItems: scala.Double
  def appendItem(newItem: SVGTransform): SVGTransform
  def clear(): scala.Unit
  def consolidate(): SVGTransform
  def createSVGTransformFromMatrix(matrix: SVGMatrix): SVGTransform
  def getItem(index: scala.Double): SVGTransform
  def initialize(newItem: SVGTransform): SVGTransform
  def insertItemBefore(newItem: SVGTransform, index: scala.Double): SVGTransform
  def removeItem(index: scala.Double): SVGTransform
  def replaceItem(newItem: SVGTransform, index: scala.Double): SVGTransform
}

@JSGlobal("SVGTransformList")
@js.native
class SVGTransformListCls () extends SVGTransformList {
  /* CompleteClass */
  override val numberOfItems: scala.Double = js.native
  /* CompleteClass */
  override def appendItem(newItem: SVGTransform): SVGTransform = js.native
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /* CompleteClass */
  override def consolidate(): SVGTransform = js.native
  /* CompleteClass */
  override def createSVGTransformFromMatrix(matrix: SVGMatrix): SVGTransform = js.native
  /* CompleteClass */
  override def getItem(index: scala.Double): SVGTransform = js.native
  /* CompleteClass */
  override def initialize(newItem: SVGTransform): SVGTransform = js.native
  /* CompleteClass */
  override def insertItemBefore(newItem: SVGTransform, index: scala.Double): SVGTransform = js.native
  /* CompleteClass */
  override def removeItem(index: scala.Double): SVGTransform = js.native
  /* CompleteClass */
  override def replaceItem(newItem: SVGTransform, index: scala.Double): SVGTransform = js.native
}

@JSGlobal("SVGTransformList")
@js.native
object SVGTransformList
  extends org.scalablytyped.runtime.Instantiable0[SVGTransformList]


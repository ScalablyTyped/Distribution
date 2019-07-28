package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The SVGTransformList defines a list of SVGTransform objects. */
trait SVGTransformList extends js.Object {
  val numberOfItems: Double
  def appendItem(newItem: SVGTransform): SVGTransform
  def clear(): Unit
  def consolidate(): SVGTransform
  def createSVGTransformFromMatrix(matrix: SVGMatrix): SVGTransform
  def getItem(index: Double): SVGTransform
  def initialize(newItem: SVGTransform): SVGTransform
  def insertItemBefore(newItem: SVGTransform, index: Double): SVGTransform
  def removeItem(index: Double): SVGTransform
  def replaceItem(newItem: SVGTransform, index: Double): SVGTransform
}

@JSGlobal("SVGTransformList")
@js.native
class SVGTransformListCls () extends SVGTransformList {
  /* CompleteClass */
  override val numberOfItems: Double = js.native
  /* CompleteClass */
  override def appendItem(newItem: SVGTransform): SVGTransform = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def consolidate(): SVGTransform = js.native
  /* CompleteClass */
  override def createSVGTransformFromMatrix(matrix: SVGMatrix): SVGTransform = js.native
  /* CompleteClass */
  override def getItem(index: Double): SVGTransform = js.native
  /* CompleteClass */
  override def initialize(newItem: SVGTransform): SVGTransform = js.native
  /* CompleteClass */
  override def insertItemBefore(newItem: SVGTransform, index: Double): SVGTransform = js.native
  /* CompleteClass */
  override def removeItem(index: Double): SVGTransform = js.native
  /* CompleteClass */
  override def replaceItem(newItem: SVGTransform, index: Double): SVGTransform = js.native
}

@JSGlobal("SVGTransformList")
@js.native
object SVGTransformList extends Instantiable0[SVGTransformList]


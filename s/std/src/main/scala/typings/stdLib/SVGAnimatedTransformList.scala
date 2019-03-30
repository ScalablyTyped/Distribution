package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The SVGAnimatedTransformList interface is used for attributes which take a list of numbers and which can be animated. */
trait SVGAnimatedTransformList extends js.Object {
  val animVal: SVGTransformList
  val baseVal: SVGTransformList
}

@JSGlobal("SVGAnimatedTransformList")
@js.native
class SVGAnimatedTransformListCls () extends SVGAnimatedTransformList {
  /* CompleteClass */
  override val animVal: SVGTransformList = js.native
  /* CompleteClass */
  override val baseVal: SVGTransformList = js.native
}

@JSGlobal("SVGAnimatedTransformList")
@js.native
object SVGAnimatedTransformList
  extends org.scalablytyped.runtime.Instantiable0[SVGAnimatedTransformList]


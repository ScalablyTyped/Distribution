package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The legacy PerformanceNavigation interface represents information about how the navigation to the current document was done. */
trait PerformanceNavigation extends js.Object {
  val TYPE_BACK_FORWARD: scala.Double
  val TYPE_NAVIGATE: scala.Double
  val TYPE_RELOAD: scala.Double
  val TYPE_RESERVED: scala.Double
  val redirectCount: scala.Double
  val `type`: scala.Double
  def toJSON(): js.Any
}

@JSGlobal("PerformanceNavigation")
@js.native
class PerformanceNavigationCls () extends PerformanceNavigation {
  /* CompleteClass */
  override val TYPE_BACK_FORWARD: scala.Double = js.native
  /* CompleteClass */
  override val TYPE_NAVIGATE: scala.Double = js.native
  /* CompleteClass */
  override val TYPE_RELOAD: scala.Double = js.native
  /* CompleteClass */
  override val TYPE_RESERVED: scala.Double = js.native
  /* CompleteClass */
  override val redirectCount: scala.Double = js.native
  /* CompleteClass */
  override val `type`: scala.Double = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

@JSGlobal("PerformanceNavigation")
@js.native
object PerformanceNavigation
  extends org.scalablytyped.runtime.Instantiable0[PerformanceNavigation] {
  val TYPE_BACK_FORWARD: scala.Double = js.native
  val TYPE_NAVIGATE: scala.Double = js.native
  val TYPE_RELOAD: scala.Double = js.native
  val TYPE_RESERVED: scala.Double = js.native
}


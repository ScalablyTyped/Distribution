package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The legacy PerformanceNavigation interface represents information about how the navigation to the current document was done. */
trait PerformanceNavigation extends js.Object {
  val TYPE_BACK_FORWARD: Double
  val TYPE_NAVIGATE: Double
  val TYPE_RELOAD: Double
  val TYPE_RESERVED: Double
  val redirectCount: Double
  val `type`: Double
  def toJSON(): js.Any
}

@JSGlobal("PerformanceNavigation")
@js.native
object PerformanceNavigation extends Instantiable0[PerformanceNavigation] {
  val TYPE_BACK_FORWARD: Double = js.native
  val TYPE_NAVIGATE: Double = js.native
  val TYPE_RELOAD: Double = js.native
  val TYPE_RESERVED: Double = js.native
}


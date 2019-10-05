package typings.rxDashLiteDashTesting.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx.Recorded")
@js.native
class Recorded protected () extends js.Object {
  def this(time: Double, value: js.Any) = this()
  def this(
    time: Double,
    value: js.Any,
    equalityComparer: js.Function2[/* x */ js.Any, /* y */ js.Any, Boolean]
  ) = this()
  var time: Double = js.native
  var value: js.Any = js.native
  def equals(other: Recorded): Boolean = js.native
}


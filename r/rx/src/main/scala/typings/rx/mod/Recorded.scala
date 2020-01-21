package typings.rx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "Recorded")
@js.native
class Recorded protected ()
  extends typings.rxLiteTesting.Rx.Recorded {
  def this(time: Double, value: js.Any) = this()
  def this(
    time: Double,
    value: js.Any,
    equalityComparer: js.Function2[/* x */ js.Any, /* y */ js.Any, Boolean]
  ) = this()
}


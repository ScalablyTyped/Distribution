package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qlik", "setOnError")
@js.native
object setOnError extends js.Object {
  def apply(
    onError: js.Function1[/* error */ Error, Unit],
    onWarning: js.Function1[/* warning */ String, Unit]
  ): Unit = js.native
}


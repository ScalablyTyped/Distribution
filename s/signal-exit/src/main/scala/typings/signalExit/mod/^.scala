package typings.signalExit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("signal-exit", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(callback: js.Function2[/* code */ Double | Null, /* signal */ Signal | Null, Unit]): js.Function0[Unit] = js.native
  def apply(
    callback: js.Function2[/* code */ Double | Null, /* signal */ Signal | Null, Unit],
    options: Options
  ): js.Function0[Unit] = js.native
}


package typings
package signalDashExitLib.signalDashExitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("signal-exit", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    callback: js.Function2[/* code */ scala.Double | scala.Null, /* signal */ Signal | scala.Null, scala.Unit]
  ): js.Function0[scala.Unit] = js.native
  def apply(
    callback: js.Function2[/* code */ scala.Double | scala.Null, /* signal */ Signal | scala.Null, scala.Unit],
    options: Options
  ): js.Function0[scala.Unit] = js.native
  def load(): scala.Unit = js.native
  def signals(): js.Array[Signal] = js.native
  def unload(): scala.Unit = js.native
}


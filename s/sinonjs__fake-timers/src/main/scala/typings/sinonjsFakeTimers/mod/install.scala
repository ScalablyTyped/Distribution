package typings.sinonjsFakeTimers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@sinonjs/fake-timers", "install")
@js.native
object install extends js.Object {
  def apply(): InstalledClock = js.native
  def apply(opts: FakeTimerInstallOpts): InstalledClock = js.native
}


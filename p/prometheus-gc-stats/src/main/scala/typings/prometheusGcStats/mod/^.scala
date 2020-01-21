package typings.prometheusGcStats.mod

import typings.prometheusGcStats.mod.prometheusGcStats.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prometheus-gc-stats", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // register is typeof require('prom-client').Registry which has its own .d.ts
  def apply(register: js.Any): js.Function0[Unit] = js.native
  def apply(register: js.Any, config: Config): js.Function0[Unit] = js.native
}


package typings.restifyPlugins.mod

import typings.restifyPlugins.anon.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify-plugins", "metrics")
@js.native
object metrics extends js.Object {
  def apply(opts: Server, callback: js.Function1[/* options */ MetricsCallback, _]): js.Function1[/* repeated */ js.Any, Unit] = js.native
}


package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tracing extends js.Object {
  def start(options: TracingStartOptions): js.Promise[scala.Unit]
  def stop(): js.Promise[nodeLib.Buffer]
}

object Tracing {
  @scala.inline
  def apply(
    start: js.Function1[TracingStartOptions, js.Promise[scala.Unit]],
    stop: js.Function0[js.Promise[nodeLib.Buffer]]
  ): Tracing = {
    val __obj = js.Dynamic.literal(start = start, stop = stop)
  
    __obj.asInstanceOf[Tracing]
  }
}


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
  def apply(start: TracingStartOptions => js.Promise[scala.Unit], stop: () => js.Promise[nodeLib.Buffer]): Tracing = {
    val __obj = js.Dynamic.literal(start = js.Any.fromFunction1(start), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[Tracing]
  }
}


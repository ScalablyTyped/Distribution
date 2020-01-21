package typings.puppeteer.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tracing extends js.Object {
  def start(options: TracingStartOptions): js.Promise[Unit]
  def stop(): js.Promise[Buffer]
}

object Tracing {
  @scala.inline
  def apply(start: TracingStartOptions => js.Promise[Unit], stop: () => js.Promise[Buffer]): Tracing = {
    val __obj = js.Dynamic.literal(start = js.Any.fromFunction1(start), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[Tracing]
  }
}


package typings.puppeteer.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tracing extends js.Object {
  def start(options: TracingStartOptions): js.Promise[Unit] = js.native
  def stop(): js.Promise[Buffer] = js.native
}

object Tracing {
  @scala.inline
  def apply(start: TracingStartOptions => js.Promise[Unit], stop: () => js.Promise[Buffer]): Tracing = {
    val __obj = js.Dynamic.literal(start = js.Any.fromFunction1(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[Tracing]
  }
  @scala.inline
  implicit class TracingOps[Self <: Tracing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStart(value: TracingStartOptions => js.Promise[Unit]): Self = this.set("start", js.Any.fromFunction1(value))
    @scala.inline
    def setStop(value: () => js.Promise[Buffer]): Self = this.set("stop", js.Any.fromFunction0(value))
  }
  
}


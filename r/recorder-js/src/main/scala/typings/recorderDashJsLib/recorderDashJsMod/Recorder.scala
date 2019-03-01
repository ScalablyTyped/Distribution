package typings
package recorderDashJsLib.recorderDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Recorder extends js.Object {
  def init(stream: stdLib.MediaStream): js.Promise[scala.Unit]
  def start(): js.Promise[js.UndefOr[stdLib.MediaStream]]
  def stop(): js.Promise[recorderDashJsLib.recorderDashJsMod.RecorderNs.RecorderResult]
}

object Recorder {
  @scala.inline
  def apply(
    init: js.Function1[stdLib.MediaStream, js.Promise[scala.Unit]],
    start: js.Function0[js.Promise[js.UndefOr[stdLib.MediaStream]]],
    stop: js.Function0[js.Promise[recorderDashJsLib.recorderDashJsMod.RecorderNs.RecorderResult]]
  ): Recorder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[Recorder]
  }
}


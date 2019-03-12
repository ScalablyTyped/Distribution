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
    init: stdLib.MediaStream => js.Promise[scala.Unit],
    start: () => js.Promise[js.UndefOr[stdLib.MediaStream]],
    stop: () => js.Promise[recorderDashJsLib.recorderDashJsMod.RecorderNs.RecorderResult]
  ): Recorder = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[Recorder]
  }
}


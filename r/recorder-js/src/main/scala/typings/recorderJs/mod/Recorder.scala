package typings.recorderJs.mod

import typings.std.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Recorder extends js.Object {
  def init(stream: MediaStream): js.Promise[Unit]
  def start(): js.Promise[js.UndefOr[MediaStream]]
  def stop(): js.Promise[RecorderResult]
}

object Recorder {
  @scala.inline
  def apply(
    init: MediaStream => js.Promise[Unit],
    start: () => js.Promise[js.UndefOr[MediaStream]],
    stop: () => js.Promise[RecorderResult]
  ): Recorder = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[Recorder]
  }
}


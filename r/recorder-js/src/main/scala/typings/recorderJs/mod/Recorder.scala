package typings.recorderJs.mod

import typings.std.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Recorder extends js.Object {
  
  def init(stream: MediaStream): js.Promise[Unit] = js.native
  
  def start(): js.Promise[js.UndefOr[MediaStream]] = js.native
  
  def stop(): js.Promise[RecorderResult] = js.native
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
  
  @scala.inline
  implicit class RecorderOps[Self <: Recorder] (val x: Self) extends AnyVal {
    
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
    def setInit(value: MediaStream => js.Promise[Unit]): Self = this.set("init", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStart(value: () => js.Promise[js.UndefOr[MediaStream]]): Self = this.set("start", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStop(value: () => js.Promise[RecorderResult]): Self = this.set("stop", js.Any.fromFunction0(value))
  }
}

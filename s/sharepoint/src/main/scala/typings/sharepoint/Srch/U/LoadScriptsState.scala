package typings.sharepoint.Srch.U

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadScriptsState extends js.Object {
  var progress: Double = js.native
  var scriptsToLoad: js.Any = js.native
  var timeoutHandle: js.Any = js.native
}

object LoadScriptsState {
  @scala.inline
  def apply(progress: Double, scriptsToLoad: js.Any, timeoutHandle: js.Any): LoadScriptsState = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], scriptsToLoad = scriptsToLoad.asInstanceOf[js.Any], timeoutHandle = timeoutHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadScriptsState]
  }
  @scala.inline
  implicit class LoadScriptsStateOps[Self <: LoadScriptsState] (val x: Self) extends AnyVal {
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
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def setScriptsToLoad(value: js.Any): Self = this.set("scriptsToLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeoutHandle(value: js.Any): Self = this.set("timeoutHandle", value.asInstanceOf[js.Any])
  }
  
}


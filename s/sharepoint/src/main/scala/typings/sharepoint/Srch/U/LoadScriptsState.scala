package typings.sharepoint.Srch.U

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadScriptsState extends js.Object {
  var progress: Double
  var scriptsToLoad: js.Any
  var timeoutHandle: js.Any
}

object LoadScriptsState {
  @scala.inline
  def apply(progress: Double, scriptsToLoad: js.Any, timeoutHandle: js.Any): LoadScriptsState = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], scriptsToLoad = scriptsToLoad.asInstanceOf[js.Any], timeoutHandle = timeoutHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadScriptsState]
  }
}


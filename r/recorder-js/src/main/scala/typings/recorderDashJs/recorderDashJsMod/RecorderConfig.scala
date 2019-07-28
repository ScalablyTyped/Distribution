package typings.recorderDashJs.recorderDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecorderConfig extends js.Object {
  var onAnalysed: js.UndefOr[OnAnalysedHandler] = js.undefined
}

object RecorderConfig {
  @scala.inline
  def apply(onAnalysed: OnAnalysedHandler = null): RecorderConfig = {
    val __obj = js.Dynamic.literal()
    if (onAnalysed != null) __obj.updateDynamic("onAnalysed")(onAnalysed)
    __obj.asInstanceOf[RecorderConfig]
  }
}


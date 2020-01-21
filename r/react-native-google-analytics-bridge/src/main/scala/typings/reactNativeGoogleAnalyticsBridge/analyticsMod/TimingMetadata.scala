package typings.reactNativeGoogleAnalyticsBridge.analyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimingMetadata extends js.Object {
  var label: js.UndefOr[String] = js.undefined
  var name: String
}

object TimingMetadata {
  @scala.inline
  def apply(name: String, label: String = null): TimingMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimingMetadata]
  }
}


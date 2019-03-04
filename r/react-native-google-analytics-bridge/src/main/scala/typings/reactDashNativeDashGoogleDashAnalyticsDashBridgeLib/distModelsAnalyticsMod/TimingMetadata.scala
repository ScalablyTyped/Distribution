package typings
package reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsAnalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimingMetadata extends js.Object {
  var label: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
}

object TimingMetadata {
  @scala.inline
  def apply(name: java.lang.String, label: java.lang.String = null): TimingMetadata = {
    val __obj = js.Dynamic.literal(name = name)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[TimingMetadata]
  }
}


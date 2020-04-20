package typings.sdpTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApp extends js.Object {
  var app: String
  var maxMessageSize: Double
  var sctpmapNumber: Double | String
}

object AnonApp {
  @scala.inline
  def apply(app: String, maxMessageSize: Double, sctpmapNumber: Double | String): AnonApp = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], maxMessageSize = maxMessageSize.asInstanceOf[js.Any], sctpmapNumber = sctpmapNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApp]
  }
}


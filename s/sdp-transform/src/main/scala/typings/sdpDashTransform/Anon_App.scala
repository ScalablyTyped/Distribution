package typings.sdpDashTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_App extends js.Object {
  var app: String
  var maxMessageSize: Double
  var sctpmapNumber: Double | String
}

object Anon_App {
  @scala.inline
  def apply(app: String, maxMessageSize: Double, sctpmapNumber: Double | String): Anon_App = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], maxMessageSize = maxMessageSize.asInstanceOf[js.Any], sctpmapNumber = sctpmapNumber.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_App]
  }
}


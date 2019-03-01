package typings
package sdpDashTransformLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_App extends js.Object {
  var app: java.lang.String
  var maxMessageSize: scala.Double
  var sctpmapNumber: scala.Double | java.lang.String
}

object Anon_App {
  @scala.inline
  def apply(
    app: java.lang.String,
    maxMessageSize: scala.Double,
    sctpmapNumber: scala.Double | java.lang.String
  ): Anon_App = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("app")(app)
    __obj.updateDynamic("maxMessageSize")(maxMessageSize)
    __obj.updateDynamic("sctpmapNumber")(sctpmapNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_App]
  }
}


package typings.stellarSdk.horizonApiMod.Horizon.ErrorResponseData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base extends js.Object {
  var details: String
  var instance: String
  var status: Double
  var title: String
  var `type`: String
}

object Base {
  @scala.inline
  def apply(details: String, instance: String, status: Double, title: String, `type`: String): Base = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
}


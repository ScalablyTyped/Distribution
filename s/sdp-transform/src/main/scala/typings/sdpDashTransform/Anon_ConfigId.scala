package typings.sdpDashTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConfigId extends js.Object {
  var config: String
  var id: Double
  var sessionConfig: js.UndefOr[String] = js.undefined
  var suite: String
}

object Anon_ConfigId {
  @scala.inline
  def apply(config: String, id: Double, suite: String, sessionConfig: String = null): Anon_ConfigId = {
    val __obj = js.Dynamic.literal(config = config, id = id, suite = suite)
    if (sessionConfig != null) __obj.updateDynamic("sessionConfig")(sessionConfig)
    __obj.asInstanceOf[Anon_ConfigId]
  }
}


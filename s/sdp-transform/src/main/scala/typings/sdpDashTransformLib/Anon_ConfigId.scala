package typings
package sdpDashTransformLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConfigId extends js.Object {
  var config: java.lang.String
  var id: scala.Double
  var sessionConfig: js.UndefOr[java.lang.String] = js.undefined
  var suite: java.lang.String
}

object Anon_ConfigId {
  @scala.inline
  def apply(
    config: java.lang.String,
    id: scala.Double,
    suite: java.lang.String,
    sessionConfig: java.lang.String = null
  ): Anon_ConfigId = {
    val __obj = js.Dynamic.literal(config = config, id = id, suite = suite)
    if (sessionConfig != null) __obj.updateDynamic("sessionConfig")(sessionConfig)
    __obj.asInstanceOf[Anon_ConfigId]
  }
}


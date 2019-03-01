package typings
package sdpDashTransformLib.sdpDashTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedDescriptionFields extends js.Object {
  // b=AS:4000
  var bandwidth: js.UndefOr[sdpDashTransformLib.Anon_AS] = js.undefined
  // c=IN IP4 10.47.197.26
  var connection: js.UndefOr[sdpDashTransformLib.Anon_Ip] = js.undefined
  // i=
  var description: js.UndefOr[java.lang.String] = js.undefined
}

object SharedDescriptionFields {
  @scala.inline
  def apply(
    bandwidth: sdpDashTransformLib.Anon_AS = null,
    connection: sdpDashTransformLib.Anon_Ip = null,
    description: java.lang.String = null
  ): SharedDescriptionFields = {
    val __obj = js.Dynamic.literal()
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth)
    if (connection != null) __obj.updateDynamic("connection")(connection)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[SharedDescriptionFields]
  }
}


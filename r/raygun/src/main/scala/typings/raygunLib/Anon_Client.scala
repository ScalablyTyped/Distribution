package typings
package raygunLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Client extends js.Object {
  var client: Anon_Name
  var environment: Anon_Architecture
  var error: raygunLib.raygunMod.raygunNs.RaygunErrorObject
  var groupingKey: js.UndefOr[java.lang.String] = js.undefined
  var machineName: java.lang.String
  var request: js.UndefOr[raygunLib.raygunMod.raygunNs.RaygunRequest] = js.undefined
  var tags: js.Array[java.lang.String]
  var user: js.UndefOr[raygunLib.raygunMod.raygunNs.RaygunUser | Anon_Identifier] = js.undefined
  var userCustomData: js.UndefOr[raygunLib.raygunMod.raygunNs.KeyValueObject] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Client {
  @scala.inline
  def apply(
    client: Anon_Name,
    environment: Anon_Architecture,
    error: raygunLib.raygunMod.raygunNs.RaygunErrorObject,
    machineName: java.lang.String,
    tags: js.Array[java.lang.String],
    groupingKey: java.lang.String = null,
    request: raygunLib.raygunMod.raygunNs.RaygunRequest = null,
    user: raygunLib.raygunMod.raygunNs.RaygunUser | Anon_Identifier = null,
    userCustomData: raygunLib.raygunMod.raygunNs.KeyValueObject = null,
    version: java.lang.String = null
  ): Anon_Client = {
    val __obj = js.Dynamic.literal(client = client, environment = environment, error = error, machineName = machineName, tags = tags)
    if (groupingKey != null) __obj.updateDynamic("groupingKey")(groupingKey)
    if (request != null) __obj.updateDynamic("request")(request)
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (userCustomData != null) __obj.updateDynamic("userCustomData")(userCustomData)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_Client]
  }
}


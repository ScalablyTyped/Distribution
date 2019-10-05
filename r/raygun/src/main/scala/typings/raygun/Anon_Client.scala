package typings.raygun

import typings.raygun.raygunMod.raygun.KeyValueObject
import typings.raygun.raygunMod.raygun.RaygunErrorObject
import typings.raygun.raygunMod.raygun.RaygunRequest
import typings.raygun.raygunMod.raygun.RaygunUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Client extends js.Object {
  var client: Anon_Name
  var environment: Anon_Architecture
  var error: RaygunErrorObject
  var groupingKey: js.UndefOr[String] = js.undefined
  var machineName: String
  var request: js.UndefOr[RaygunRequest] = js.undefined
  var tags: js.Array[String]
  var user: js.UndefOr[RaygunUser | Anon_Identifier] = js.undefined
  var userCustomData: js.UndefOr[KeyValueObject] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object Anon_Client {
  @scala.inline
  def apply(
    client: Anon_Name,
    environment: Anon_Architecture,
    error: RaygunErrorObject,
    machineName: String,
    tags: js.Array[String],
    groupingKey: String = null,
    request: RaygunRequest = null,
    user: RaygunUser | Anon_Identifier = null,
    userCustomData: KeyValueObject = null,
    version: String = null
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


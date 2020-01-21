package typings.raygun

import typings.raygun.mod.raygun.KeyValueObject
import typings.raygun.mod.raygun.RaygunErrorObject
import typings.raygun.mod.raygun.RaygunRequest
import typings.raygun.mod.raygun.RaygunUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClient extends js.Object {
  var client: AnonName
  var environment: AnonArchitecture
  var error: RaygunErrorObject
  var groupingKey: js.UndefOr[String] = js.undefined
  var machineName: String
  var request: js.UndefOr[RaygunRequest] = js.undefined
  var tags: js.Array[String]
  var user: js.UndefOr[RaygunUser | AnonIdentifier] = js.undefined
  var userCustomData: js.UndefOr[KeyValueObject] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object AnonClient {
  @scala.inline
  def apply(
    client: AnonName,
    environment: AnonArchitecture,
    error: RaygunErrorObject,
    machineName: String,
    tags: js.Array[String],
    groupingKey: String = null,
    request: RaygunRequest = null,
    user: RaygunUser | AnonIdentifier = null,
    userCustomData: KeyValueObject = null,
    version: String = null
  ): AnonClient = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], machineName = machineName.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    if (groupingKey != null) __obj.updateDynamic("groupingKey")(groupingKey.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (userCustomData != null) __obj.updateDynamic("userCustomData")(userCustomData.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClient]
  }
}


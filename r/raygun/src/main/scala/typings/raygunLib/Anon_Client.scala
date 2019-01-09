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


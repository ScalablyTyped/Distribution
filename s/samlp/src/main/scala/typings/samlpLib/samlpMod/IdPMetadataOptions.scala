package typings
package samlpLib.samlpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdPMetadataOptions extends js.Object {
  var cert: java.lang.String | nodeLib.Buffer
  var issuer: java.lang.String
  var logoutEndpointPaths: js.UndefOr[samlpLib.Anon_Post] = js.undefined
  var postEndpointPath: js.UndefOr[java.lang.String] = js.undefined
  var profileMapper: js.UndefOr[ProfileMapperConstructor] = js.undefined
  var redirectEndpointPath: js.UndefOr[java.lang.String] = js.undefined
}


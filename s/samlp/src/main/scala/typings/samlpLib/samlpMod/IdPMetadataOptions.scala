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

object IdPMetadataOptions {
  @scala.inline
  def apply(
    cert: java.lang.String | nodeLib.Buffer,
    issuer: java.lang.String,
    logoutEndpointPaths: samlpLib.Anon_Post = null,
    postEndpointPath: java.lang.String = null,
    profileMapper: ProfileMapperConstructor = null,
    redirectEndpointPath: java.lang.String = null
  ): IdPMetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    __obj.updateDynamic("issuer")(issuer)
    if (logoutEndpointPaths != null) __obj.updateDynamic("logoutEndpointPaths")(logoutEndpointPaths)
    if (postEndpointPath != null) __obj.updateDynamic("postEndpointPath")(postEndpointPath)
    if (profileMapper != null) __obj.updateDynamic("profileMapper")(profileMapper)
    if (redirectEndpointPath != null) __obj.updateDynamic("redirectEndpointPath")(redirectEndpointPath)
    __obj.asInstanceOf[IdPMetadataOptions]
  }
}


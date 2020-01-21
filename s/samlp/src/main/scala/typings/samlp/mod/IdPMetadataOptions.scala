package typings.samlp.mod

import typings.node.Buffer
import typings.samlp.AnonPost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdPMetadataOptions extends js.Object {
  var cert: String | Buffer
  var issuer: String
  var logoutEndpointPaths: js.UndefOr[AnonPost] = js.undefined
  var postEndpointPath: js.UndefOr[String] = js.undefined
  var profileMapper: js.UndefOr[ProfileMapperConstructor] = js.undefined
  var redirectEndpointPath: js.UndefOr[String] = js.undefined
}

object IdPMetadataOptions {
  @scala.inline
  def apply(
    cert: String | Buffer,
    issuer: String,
    logoutEndpointPaths: AnonPost = null,
    postEndpointPath: String = null,
    profileMapper: ProfileMapperConstructor = null,
    redirectEndpointPath: String = null
  ): IdPMetadataOptions = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any])
    if (logoutEndpointPaths != null) __obj.updateDynamic("logoutEndpointPaths")(logoutEndpointPaths.asInstanceOf[js.Any])
    if (postEndpointPath != null) __obj.updateDynamic("postEndpointPath")(postEndpointPath.asInstanceOf[js.Any])
    if (profileMapper != null) __obj.updateDynamic("profileMapper")(profileMapper.asInstanceOf[js.Any])
    if (redirectEndpointPath != null) __obj.updateDynamic("redirectEndpointPath")(redirectEndpointPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdPMetadataOptions]
  }
}


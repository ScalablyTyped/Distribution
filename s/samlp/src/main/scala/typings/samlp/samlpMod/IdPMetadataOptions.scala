package typings.samlp.samlpMod

import typings.node.Buffer
import typings.samlp.Anon_Post
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdPMetadataOptions extends js.Object {
  var cert: String | Buffer
  var issuer: String
  var logoutEndpointPaths: js.UndefOr[Anon_Post] = js.undefined
  var postEndpointPath: js.UndefOr[String] = js.undefined
  var profileMapper: js.UndefOr[ProfileMapperConstructor] = js.undefined
  var redirectEndpointPath: js.UndefOr[String] = js.undefined
}

object IdPMetadataOptions {
  @scala.inline
  def apply(
    cert: String | Buffer,
    issuer: String,
    logoutEndpointPaths: Anon_Post = null,
    postEndpointPath: String = null,
    profileMapper: ProfileMapperConstructor = null,
    redirectEndpointPath: String = null
  ): IdPMetadataOptions = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], issuer = issuer)
    if (logoutEndpointPaths != null) __obj.updateDynamic("logoutEndpointPaths")(logoutEndpointPaths)
    if (postEndpointPath != null) __obj.updateDynamic("postEndpointPath")(postEndpointPath)
    if (profileMapper != null) __obj.updateDynamic("profileMapper")(profileMapper)
    if (redirectEndpointPath != null) __obj.updateDynamic("redirectEndpointPath")(redirectEndpointPath)
    __obj.asInstanceOf[IdPMetadataOptions]
  }
}


package typings
package saml2DashJsLib.saml2DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("saml2-js", "ServiceProvider")
@js.native
class ServiceProvider protected () extends js.Object {
  def this(options: ServiceProviderOptions) = this()
  def create_login_request_url(
    IdP: IdentityProvider,
    options: CreateLoginRequestUrlOptions,
    cb: js.Function3[
      /* error */ js.Any, 
      /* login_url */ java.lang.String, 
      /* request_id */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def create_logout_request_url(
    IdP: IdentityProvider,
    options: CreateLogoutRequestUrlOptions,
    cb: js.Function2[/* error */ js.Any, /* request_url */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def create_logout_response_url(
    IdP: IdentityProvider,
    options: CreateLogoutResponseUrlOptions,
    cb: js.Function2[/* error */ js.Any, /* response_url */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def create_metadata(): java.lang.String = js.native
  def post_assert(
    IdP: IdentityProvider,
    options: GetAssertOptions,
    cb: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def redirect_assert(
    IdP: IdentityProvider,
    options: GetAssertOptions,
    cb: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}


package typings.saml2Js.mod

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
    cb: js.Function3[/* error */ js.Any, /* login_url */ String, /* request_id */ String, Unit]
  ): Unit = js.native
  def create_logout_request_url(
    IdP: IdentityProvider,
    options: CreateLogoutRequestUrlOptions,
    cb: js.Function2[/* error */ js.Any, /* request_url */ String, Unit]
  ): Unit = js.native
  def create_logout_response_url(
    IdP: IdentityProvider,
    options: CreateLogoutResponseUrlOptions,
    cb: js.Function2[/* error */ js.Any, /* response_url */ String, Unit]
  ): Unit = js.native
  def create_metadata(): String = js.native
  def post_assert(
    IdP: IdentityProvider,
    options: GetAssertOptions,
    cb: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
  def redirect_assert(
    IdP: IdentityProvider,
    options: GetAssertOptions,
    cb: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
}


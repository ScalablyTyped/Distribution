package typings.pulumiAws.getServerCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServerCertificateArgs extends js.Object {
  /**
    * sort results by expiration date. returns the certificate with expiration date in furthest in the future.
    */
  val latest: js.UndefOr[Boolean] = js.native
  /**
    * exact name of the cert to lookup
    */
  val name: js.UndefOr[String] = js.native
  /**
    * prefix of cert to filter by
    */
  val namePrefix: js.UndefOr[String] = js.native
  /**
    * prefix of path to filter by
    */
  val pathPrefix: js.UndefOr[String] = js.native
}

object GetServerCertificateArgs {
  @scala.inline
  def apply(
    latest: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    namePrefix: String = null,
    pathPrefix: String = null
  ): GetServerCertificateArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(latest)) __obj.updateDynamic("latest")(latest.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (pathPrefix != null) __obj.updateDynamic("pathPrefix")(pathPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServerCertificateArgs]
  }
}


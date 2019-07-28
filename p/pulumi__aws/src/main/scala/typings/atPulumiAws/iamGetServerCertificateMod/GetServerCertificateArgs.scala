package typings.atPulumiAws.iamGetServerCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServerCertificateArgs extends js.Object {
  /**
    * sort results by expiration date. returns the certificate with expiration date in furthest in the future.
    */
  val latest: js.UndefOr[Boolean] = js.undefined
  /**
    * exact name of the cert to lookup
    */
  val name: js.UndefOr[String] = js.undefined
  /**
    * prefix of cert to filter by
    */
  val namePrefix: js.UndefOr[String] = js.undefined
  /**
    * prefix of path to filter by
    */
  val pathPrefix: js.UndefOr[String] = js.undefined
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
    if (!js.isUndefined(latest)) __obj.updateDynamic("latest")(latest)
    if (name != null) __obj.updateDynamic("name")(name)
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix)
    if (pathPrefix != null) __obj.updateDynamic("pathPrefix")(pathPrefix)
    __obj.asInstanceOf[GetServerCertificateArgs]
  }
}


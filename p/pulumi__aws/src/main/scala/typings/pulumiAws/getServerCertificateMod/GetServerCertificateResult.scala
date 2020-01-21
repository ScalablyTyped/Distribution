package typings.pulumiAws.getServerCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServerCertificateResult extends js.Object {
  val arn: String = js.native
  val certificateBody: String = js.native
  val certificateChain: String = js.native
  val expirationDate: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val latest: js.UndefOr[Boolean] = js.native
  val name: String = js.native
  val namePrefix: js.UndefOr[String] = js.native
  val path: String = js.native
  val pathPrefix: js.UndefOr[String] = js.native
  val uploadDate: String = js.native
}

object GetServerCertificateResult {
  @scala.inline
  def apply(
    arn: String,
    certificateBody: String,
    certificateChain: String,
    expirationDate: String,
    id: String,
    name: String,
    path: String,
    uploadDate: String,
    latest: js.UndefOr[Boolean] = js.undefined,
    namePrefix: String = null,
    pathPrefix: String = null
  ): GetServerCertificateResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], certificateBody = certificateBody.asInstanceOf[js.Any], certificateChain = certificateChain.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], uploadDate = uploadDate.asInstanceOf[js.Any])
    if (!js.isUndefined(latest)) __obj.updateDynamic("latest")(latest.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (pathPrefix != null) __obj.updateDynamic("pathPrefix")(pathPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServerCertificateResult]
  }
}


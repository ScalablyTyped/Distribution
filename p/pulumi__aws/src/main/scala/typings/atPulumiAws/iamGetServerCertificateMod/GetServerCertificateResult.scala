package typings.atPulumiAws.iamGetServerCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServerCertificateResult extends js.Object {
  val arn: String
  val certificateBody: String
  val certificateChain: String
  val expirationDate: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val latest: js.UndefOr[Boolean] = js.undefined
  val name: String
  val namePrefix: js.UndefOr[String] = js.undefined
  val path: String
  val pathPrefix: js.UndefOr[String] = js.undefined
  val uploadDate: String
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
    val __obj = js.Dynamic.literal(arn = arn, certificateBody = certificateBody, certificateChain = certificateChain, expirationDate = expirationDate, id = id, name = name, path = path, uploadDate = uploadDate)
    if (!js.isUndefined(latest)) __obj.updateDynamic("latest")(latest)
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix)
    if (pathPrefix != null) __obj.updateDynamic("pathPrefix")(pathPrefix)
    __obj.asInstanceOf[GetServerCertificateResult]
  }
}


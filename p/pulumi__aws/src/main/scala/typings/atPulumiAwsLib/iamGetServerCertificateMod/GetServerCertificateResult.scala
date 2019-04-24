package typings
package atPulumiAwsLib.iamGetServerCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServerCertificateResult extends js.Object {
  val arn: java.lang.String
  val certificateBody: java.lang.String
  val certificateChain: java.lang.String
  val expirationDate: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val latest: js.UndefOr[scala.Boolean] = js.undefined
  val name: java.lang.String
  val namePrefix: js.UndefOr[java.lang.String] = js.undefined
  val path: java.lang.String
  val pathPrefix: js.UndefOr[java.lang.String] = js.undefined
  val uploadDate: java.lang.String
}

object GetServerCertificateResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    certificateBody: java.lang.String,
    certificateChain: java.lang.String,
    expirationDate: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    path: java.lang.String,
    uploadDate: java.lang.String,
    latest: js.UndefOr[scala.Boolean] = js.undefined,
    namePrefix: java.lang.String = null,
    pathPrefix: java.lang.String = null
  ): GetServerCertificateResult = {
    val __obj = js.Dynamic.literal(arn = arn, certificateBody = certificateBody, certificateChain = certificateChain, expirationDate = expirationDate, id = id, name = name, path = path, uploadDate = uploadDate)
    if (!js.isUndefined(latest)) __obj.updateDynamic("latest")(latest)
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix)
    if (pathPrefix != null) __obj.updateDynamic("pathPrefix")(pathPrefix)
    __obj.asInstanceOf[GetServerCertificateResult]
  }
}


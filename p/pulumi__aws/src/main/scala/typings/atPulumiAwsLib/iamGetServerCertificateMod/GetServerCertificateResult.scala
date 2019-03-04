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
  val name: java.lang.String
  val path: java.lang.String
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
    uploadDate: java.lang.String
  ): GetServerCertificateResult = {
    val __obj = js.Dynamic.literal(arn = arn, certificateBody = certificateBody, certificateChain = certificateChain, expirationDate = expirationDate, id = id, name = name, path = path, uploadDate = uploadDate)
  
    __obj.asInstanceOf[GetServerCertificateResult]
  }
}


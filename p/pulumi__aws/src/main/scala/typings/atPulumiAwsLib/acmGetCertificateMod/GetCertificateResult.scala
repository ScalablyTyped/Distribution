package typings
package atPulumiAwsLib.acmGetCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCertificateResult extends js.Object {
  /**
    * Set to the ARN of the found certificate, suitable for referencing in other resources that support ACM certificates.
    */
  val arn: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
}

object GetCertificateResult {
  @scala.inline
  def apply(arn: java.lang.String, id: java.lang.String): GetCertificateResult = {
    val __obj = js.Dynamic.literal(arn = arn, id = id)
  
    __obj.asInstanceOf[GetCertificateResult]
  }
}


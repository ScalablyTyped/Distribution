package typings
package atPulumiAwsLib.acmpcaGetCertificateAuthorityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCertificateAuthorityArgs extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the certificate authority.
    */
  val arn: java.lang.String
  val revocationConfigurations: js.UndefOr[js.Array[atPulumiAwsLib.Anon_CrlConfigurations]] = js.undefined
  val tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object GetCertificateAuthorityArgs {
  @scala.inline
  def apply(
    arn: java.lang.String,
    revocationConfigurations: js.Array[atPulumiAwsLib.Anon_CrlConfigurations] = null,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): GetCertificateAuthorityArgs = {
    val __obj = js.Dynamic.literal(arn = arn)
    if (revocationConfigurations != null) __obj.updateDynamic("revocationConfigurations")(revocationConfigurations)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetCertificateAuthorityArgs]
  }
}


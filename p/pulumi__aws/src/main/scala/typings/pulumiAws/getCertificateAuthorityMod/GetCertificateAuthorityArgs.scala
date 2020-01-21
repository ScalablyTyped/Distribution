package typings.pulumiAws.getCertificateAuthorityMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.acmpca.GetCertificateAuthorityRevocationConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCertificateAuthorityArgs extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the certificate authority.
    */
  val arn: String = js.native
  val revocationConfigurations: js.UndefOr[js.Array[GetCertificateAuthorityRevocationConfiguration]] = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetCertificateAuthorityArgs {
  @scala.inline
  def apply(
    arn: String,
    revocationConfigurations: js.Array[GetCertificateAuthorityRevocationConfiguration] = null,
    tags: StringDictionary[js.Any] = null
  ): GetCertificateAuthorityArgs = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    if (revocationConfigurations != null) __obj.updateDynamic("revocationConfigurations")(revocationConfigurations.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCertificateAuthorityArgs]
  }
}


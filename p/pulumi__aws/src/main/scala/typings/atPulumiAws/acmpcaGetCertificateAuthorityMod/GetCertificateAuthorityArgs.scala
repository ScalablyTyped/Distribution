package typings.atPulumiAws.acmpcaGetCertificateAuthorityMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_CrlConfigurations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCertificateAuthorityArgs extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the certificate authority.
    */
  val arn: String
  val revocationConfigurations: js.UndefOr[js.Array[Anon_CrlConfigurations]] = js.undefined
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object GetCertificateAuthorityArgs {
  @scala.inline
  def apply(
    arn: String,
    revocationConfigurations: js.Array[Anon_CrlConfigurations] = null,
    tags: StringDictionary[js.Any] = null
  ): GetCertificateAuthorityArgs = {
    val __obj = js.Dynamic.literal(arn = arn)
    if (revocationConfigurations != null) __obj.updateDynamic("revocationConfigurations")(revocationConfigurations)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetCertificateAuthorityArgs]
  }
}


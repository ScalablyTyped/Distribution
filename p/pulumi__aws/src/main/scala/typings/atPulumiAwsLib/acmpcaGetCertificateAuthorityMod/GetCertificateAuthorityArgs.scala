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


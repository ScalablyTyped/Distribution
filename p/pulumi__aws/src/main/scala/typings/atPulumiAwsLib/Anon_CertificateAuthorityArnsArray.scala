package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CertificateAuthorityArnsArray extends js.Object {
  var certificateAuthorityArns: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
}

object Anon_CertificateAuthorityArnsArray {
  @scala.inline
  def apply(
    certificateAuthorityArns: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null
  ): Anon_CertificateAuthorityArnsArray = {
    val __obj = js.Dynamic.literal()
    if (certificateAuthorityArns != null) __obj.updateDynamic("certificateAuthorityArns")(certificateAuthorityArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CertificateAuthorityArnsArray]
  }
}


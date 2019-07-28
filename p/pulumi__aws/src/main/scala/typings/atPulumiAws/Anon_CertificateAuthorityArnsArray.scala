package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CertificateAuthorityArnsArray extends js.Object {
  var certificateAuthorityArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object Anon_CertificateAuthorityArnsArray {
  @scala.inline
  def apply(certificateAuthorityArns: Input[js.Array[Input[String]]] = null): Anon_CertificateAuthorityArnsArray = {
    val __obj = js.Dynamic.literal()
    if (certificateAuthorityArns != null) __obj.updateDynamic("certificateAuthorityArns")(certificateAuthorityArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CertificateAuthorityArnsArray]
  }
}


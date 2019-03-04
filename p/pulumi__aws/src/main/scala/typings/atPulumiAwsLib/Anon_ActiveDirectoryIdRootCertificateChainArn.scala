package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveDirectoryIdRootCertificateChainArn extends js.Object {
  var activeDirectoryId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var rootCertificateChainArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_ActiveDirectoryIdRootCertificateChainArn {
  @scala.inline
  def apply(
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    activeDirectoryId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    rootCertificateChainArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_ActiveDirectoryIdRootCertificateChainArn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (activeDirectoryId != null) __obj.updateDynamic("activeDirectoryId")(activeDirectoryId.asInstanceOf[js.Any])
    if (rootCertificateChainArn != null) __obj.updateDynamic("rootCertificateChainArn")(rootCertificateChainArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActiveDirectoryIdRootCertificateChainArn]
  }
}


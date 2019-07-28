package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveDirectoryIdRootCertificateChainArn extends js.Object {
  var activeDirectoryId: js.UndefOr[Input[String]] = js.undefined
  var rootCertificateChainArn: js.UndefOr[Input[String]] = js.undefined
  var `type`: Input[String]
}

object Anon_ActiveDirectoryIdRootCertificateChainArn {
  @scala.inline
  def apply(
    `type`: Input[String],
    activeDirectoryId: Input[String] = null,
    rootCertificateChainArn: Input[String] = null
  ): Anon_ActiveDirectoryIdRootCertificateChainArn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (activeDirectoryId != null) __obj.updateDynamic("activeDirectoryId")(activeDirectoryId.asInstanceOf[js.Any])
    if (rootCertificateChainArn != null) __obj.updateDynamic("rootCertificateChainArn")(rootCertificateChainArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActiveDirectoryIdRootCertificateChainArn]
  }
}


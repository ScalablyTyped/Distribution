package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveDirectoryId extends js.Object {
  var activeDirectoryId: js.UndefOr[java.lang.String] = js.undefined
  var rootCertificateChainArn: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object Anon_ActiveDirectoryId {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    activeDirectoryId: java.lang.String = null,
    rootCertificateChainArn: java.lang.String = null
  ): Anon_ActiveDirectoryId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (activeDirectoryId != null) __obj.updateDynamic("activeDirectoryId")(activeDirectoryId)
    if (rootCertificateChainArn != null) __obj.updateDynamic("rootCertificateChainArn")(rootCertificateChainArn)
    __obj.asInstanceOf[Anon_ActiveDirectoryId]
  }
}


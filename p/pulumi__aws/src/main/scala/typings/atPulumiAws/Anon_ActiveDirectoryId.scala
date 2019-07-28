package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveDirectoryId extends js.Object {
  var activeDirectoryId: js.UndefOr[String] = js.undefined
  var rootCertificateChainArn: js.UndefOr[String] = js.undefined
  var `type`: String
}

object Anon_ActiveDirectoryId {
  @scala.inline
  def apply(`type`: String, activeDirectoryId: String = null, rootCertificateChainArn: String = null): Anon_ActiveDirectoryId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (activeDirectoryId != null) __obj.updateDynamic("activeDirectoryId")(activeDirectoryId)
    if (rootCertificateChainArn != null) __obj.updateDynamic("rootCertificateChainArn")(rootCertificateChainArn)
    __obj.asInstanceOf[Anon_ActiveDirectoryId]
  }
}


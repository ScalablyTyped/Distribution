package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AwsCloudMap extends js.Object {
  var awsCloudMap: js.UndefOr[Anon_Attributes] = js.undefined
  var dns: js.UndefOr[Anon_Hostname] = js.undefined
}

object Anon_AwsCloudMap {
  @scala.inline
  def apply(awsCloudMap: Anon_Attributes = null, dns: Anon_Hostname = null): Anon_AwsCloudMap = {
    val __obj = js.Dynamic.literal()
    if (awsCloudMap != null) __obj.updateDynamic("awsCloudMap")(awsCloudMap)
    if (dns != null) __obj.updateDynamic("dns")(dns)
    __obj.asInstanceOf[Anon_AwsCloudMap]
  }
}


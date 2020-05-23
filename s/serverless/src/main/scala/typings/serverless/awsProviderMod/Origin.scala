package typings.serverless.awsProviderMod

import typings.serverless.anon.OriginProtocolPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Origin extends js.Object {
  var CustomOriginConfig: OriginProtocolPolicy
  var DomainName: String
  var OriginPath: String
}

object Origin {
  @scala.inline
  def apply(CustomOriginConfig: OriginProtocolPolicy, DomainName: String, OriginPath: String): Origin = {
    val __obj = js.Dynamic.literal(CustomOriginConfig = CustomOriginConfig.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], OriginPath = OriginPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Origin]
  }
}


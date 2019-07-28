package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndpointPrivateAccessEndpointPublicAccessSecurityGroupIds extends js.Object {
  var endpointPrivateAccess: Boolean
  var endpointPublicAccess: Boolean
  var securityGroupIds: js.Array[String]
  var subnetIds: js.Array[String]
  var vpcId: String
}

object Anon_EndpointPrivateAccessEndpointPublicAccessSecurityGroupIds {
  @scala.inline
  def apply(
    endpointPrivateAccess: Boolean,
    endpointPublicAccess: Boolean,
    securityGroupIds: js.Array[String],
    subnetIds: js.Array[String],
    vpcId: String
  ): Anon_EndpointPrivateAccessEndpointPublicAccessSecurityGroupIds = {
    val __obj = js.Dynamic.literal(endpointPrivateAccess = endpointPrivateAccess, endpointPublicAccess = endpointPublicAccess, securityGroupIds = securityGroupIds, subnetIds = subnetIds, vpcId = vpcId)
  
    __obj.asInstanceOf[Anon_EndpointPrivateAccessEndpointPublicAccessSecurityGroupIds]
  }
}


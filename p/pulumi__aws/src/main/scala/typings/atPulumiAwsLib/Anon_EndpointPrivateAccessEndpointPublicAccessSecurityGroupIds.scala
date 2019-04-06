package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndpointPrivateAccessEndpointPublicAccessSecurityGroupIds extends js.Object {
  var endpointPrivateAccess: scala.Boolean
  var endpointPublicAccess: scala.Boolean
  var securityGroupIds: js.Array[java.lang.String]
  var subnetIds: js.Array[java.lang.String]
  var vpcId: java.lang.String
}

object Anon_EndpointPrivateAccessEndpointPublicAccessSecurityGroupIds {
  @scala.inline
  def apply(
    endpointPrivateAccess: scala.Boolean,
    endpointPublicAccess: scala.Boolean,
    securityGroupIds: js.Array[java.lang.String],
    subnetIds: js.Array[java.lang.String],
    vpcId: java.lang.String
  ): Anon_EndpointPrivateAccessEndpointPublicAccessSecurityGroupIds = {
    val __obj = js.Dynamic.literal(endpointPrivateAccess = endpointPrivateAccess, endpointPublicAccess = endpointPublicAccess, securityGroupIds = securityGroupIds, subnetIds = subnetIds, vpcId = vpcId)
  
    __obj.asInstanceOf[Anon_EndpointPrivateAccessEndpointPublicAccessSecurityGroupIds]
  }
}


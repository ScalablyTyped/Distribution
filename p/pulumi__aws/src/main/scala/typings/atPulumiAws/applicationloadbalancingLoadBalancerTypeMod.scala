package typings.atPulumiAws

import typings.atPulumiAws.applicationloadbalancingLoadBalancerTypeMod.LoadBalancerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/applicationloadbalancing/loadBalancerType", JSImport.Namespace)
@js.native
object applicationloadbalancingLoadBalancerTypeMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.atPulumiAws.atPulumiAwsStrings.application
    - typings.atPulumiAws.atPulumiAwsStrings.network
  */
  trait LoadBalancerType extends js.Object
  
  val ApplicationLoadBalancer: LoadBalancerType = js.native
  val NetworkLoadBalancer: LoadBalancerType = js.native
}


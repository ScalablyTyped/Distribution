package typings.atPulumiKubernetes.typesMod.input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/types", "input.networking")
@js.native
object networking extends js.Object {
  @js.native
  object v1 extends js.Object {
    def isNetworkPolicy(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.networking.v1.NetworkPolicy */ Boolean = js.native
    def isNetworkPolicyList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.networking.v1.NetworkPolicyList */ Boolean = js.native
  }
  
  @js.native
  object v1beta1 extends js.Object {
    def isIngress(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.networking.v1beta1.Ingress */ Boolean = js.native
    def isIngressList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.networking.v1beta1.IngressList */ Boolean = js.native
  }
  
}


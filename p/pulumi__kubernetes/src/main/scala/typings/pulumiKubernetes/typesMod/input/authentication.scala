package typings.pulumiKubernetes.typesMod.input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/types", "input.authentication")
@js.native
object authentication extends js.Object {
  @js.native
  object v1 extends js.Object {
    def isBoundObjectReference(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.authentication.v1.BoundObjectReference */ Boolean = js.native
    def isTokenRequest(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.authentication.v1.TokenRequest */ Boolean = js.native
    def isTokenReview(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.authentication.v1.TokenReview */ Boolean = js.native
  }
  
  @js.native
  object v1beta1 extends js.Object {
    def isTokenReview(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.authentication.v1beta1.TokenReview */ Boolean = js.native
  }
  
}


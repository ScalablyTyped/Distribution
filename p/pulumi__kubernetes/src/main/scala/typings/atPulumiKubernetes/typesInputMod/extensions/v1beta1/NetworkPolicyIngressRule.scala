package typings.atPulumiKubernetes.typesInputMod.extensions.v1beta1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED 1.9 - This group version of NetworkPolicyIngressRule is deprecated by
  * networking/v1/NetworkPolicyIngressRule. This NetworkPolicyIngressRule matches traffic if and
  * only if the traffic matches both ports AND from.
  */
trait NetworkPolicyIngressRule extends js.Object {
  /**
    * List of sources which should be able to access the pods selected for this rule. Items in
    * this list are combined using a logical OR operation. If this field is empty or missing,
    * this rule matches all sources (traffic not restricted by source). If this field is present
    * and contains at least one item, this rule allows traffic only if the traffic matches at
    * least one item in the from list.
    */
  var from: js.UndefOr[Input[js.Array[Input[NetworkPolicyPeer]]]] = js.undefined
  /**
    * List of ports which should be made accessible on the pods selected for this rule. Each item
    * in this list is combined using a logical OR. If this field is empty or missing, this rule
    * matches all ports (traffic not restricted by port). If this field is present and contains
    * at least one item, then this rule allows traffic only if the traffic matches at least one
    * port in the list.
    */
  var ports: js.UndefOr[Input[js.Array[Input[NetworkPolicyPort]]]] = js.undefined
}

object NetworkPolicyIngressRule {
  @scala.inline
  def apply(
    from: Input[js.Array[Input[NetworkPolicyPeer]]] = null,
    ports: Input[js.Array[Input[NetworkPolicyPort]]] = null
  ): NetworkPolicyIngressRule = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (ports != null) __obj.updateDynamic("ports")(ports.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkPolicyIngressRule]
  }
}


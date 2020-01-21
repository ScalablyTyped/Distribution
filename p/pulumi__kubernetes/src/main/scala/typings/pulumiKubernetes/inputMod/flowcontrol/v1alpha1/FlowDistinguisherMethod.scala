package typings.pulumiKubernetes.inputMod.flowcontrol.v1alpha1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FlowDistinguisherMethod specifies the method of a flow distinguisher.
  */
trait FlowDistinguisherMethod extends js.Object {
  /**
    * `type` is the type of flow distinguisher method The supported types are "ByUser" and
    * "ByNamespace". Required.
    */
  var `type`: Input[String]
}

object FlowDistinguisherMethod {
  @scala.inline
  def apply(`type`: Input[String]): FlowDistinguisherMethod = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDistinguisherMethod]
  }
}


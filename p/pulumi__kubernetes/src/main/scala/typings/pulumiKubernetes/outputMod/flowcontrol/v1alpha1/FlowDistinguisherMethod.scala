package typings.pulumiKubernetes.outputMod.flowcontrol.v1alpha1

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
  val `type`: String
}

object FlowDistinguisherMethod {
  @scala.inline
  def apply(`type`: String): FlowDistinguisherMethod = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDistinguisherMethod]
  }
}


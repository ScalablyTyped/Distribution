package typings.pulumiKubernetes.inputMod.auditregistration.v1alpha1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Policy defines the configuration of how audit events are logged
  */
trait Policy extends js.Object {
  /**
    * The Level that all requests are recorded at. available options: None, Metadata, Request,
    * RequestResponse required
    */
  var level: Input[String]
  /**
    * Stages is a list of stages for which events are created.
    */
  var stages: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object Policy {
  @scala.inline
  def apply(level: Input[String], stages: Input[js.Array[Input[String]]] = null): Policy = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    if (stages != null) __obj.updateDynamic("stages")(stages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Policy]
  }
}


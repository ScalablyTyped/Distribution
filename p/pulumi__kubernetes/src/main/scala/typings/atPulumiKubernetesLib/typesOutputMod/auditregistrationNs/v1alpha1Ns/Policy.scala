package typings
package atPulumiKubernetesLib.typesOutputMod.auditregistrationNs.v1alpha1Ns

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
  val level: java.lang.String
  /**
    * Stages is a list of stages for which events are created.
    */
  val stages: js.Array[java.lang.String]
}

object Policy {
  @scala.inline
  def apply(level: java.lang.String, stages: js.Array[java.lang.String]): Policy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("stages")(stages)
    __obj.asInstanceOf[Policy]
  }
}


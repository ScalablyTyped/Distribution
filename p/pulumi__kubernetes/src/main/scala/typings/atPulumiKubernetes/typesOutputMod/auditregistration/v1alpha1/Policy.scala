package typings.atPulumiKubernetes.typesOutputMod.auditregistration.v1alpha1

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
  val level: String
  /**
    * Stages is a list of stages for which events are created.
    */
  val stages: js.Array[String]
}

object Policy {
  @scala.inline
  def apply(level: String, stages: js.Array[String]): Policy = {
    val __obj = js.Dynamic.literal(level = level, stages = stages)
  
    __obj.asInstanceOf[Policy]
  }
}


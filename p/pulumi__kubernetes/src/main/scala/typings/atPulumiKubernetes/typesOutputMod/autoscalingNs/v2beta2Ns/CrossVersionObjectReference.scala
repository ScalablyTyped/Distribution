package typings.atPulumiKubernetes.typesOutputMod.autoscalingNs.v2beta2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CrossVersionObjectReference contains enough information to let you identify the referred
  * resource.
  */
trait CrossVersionObjectReference extends js.Object {
  /**
    * API version of the referent
    */
  val apiVersion: String
  /**
    * Kind of the referent; More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds"
    */
  val kind: String
  /**
    * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
    */
  val name: String
}

object CrossVersionObjectReference {
  @scala.inline
  def apply(apiVersion: String, kind: String, name: String): CrossVersionObjectReference = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, kind = kind, name = name)
  
    __obj.asInstanceOf[CrossVersionObjectReference]
  }
}


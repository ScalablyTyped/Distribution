package typings
package atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta2Ns

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
  val apiVersion: java.lang.String
  /**
    * Kind of the referent; More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds"
    */
  val kind: java.lang.String
  /**
    * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
    */
  val name: java.lang.String
}

object CrossVersionObjectReference {
  @scala.inline
  def apply(apiVersion: java.lang.String, kind: java.lang.String, name: java.lang.String): CrossVersionObjectReference = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, kind = kind, name = name)
  
    __obj.asInstanceOf[CrossVersionObjectReference]
  }
}


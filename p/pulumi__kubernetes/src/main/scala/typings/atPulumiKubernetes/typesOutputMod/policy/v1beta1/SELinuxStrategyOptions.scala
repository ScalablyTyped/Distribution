package typings.atPulumiKubernetes.typesOutputMod.policy.v1beta1

import typings.atPulumiKubernetes.typesOutputMod.core.v1.SELinuxOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SELinuxStrategyOptions defines the strategy type and any options used to create the strategy.
  */
trait SELinuxStrategyOptions extends js.Object {
  /**
    * rule is the strategy that will dictate the allowable labels that may be set.
    */
  val rule: String
  /**
    * seLinuxOptions required to run as; required for MustRunAs More info:
    * https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
    */
  val seLinuxOptions: SELinuxOptions
}

object SELinuxStrategyOptions {
  @scala.inline
  def apply(rule: String, seLinuxOptions: SELinuxOptions): SELinuxStrategyOptions = {
    val __obj = js.Dynamic.literal(rule = rule, seLinuxOptions = seLinuxOptions)
  
    __obj.asInstanceOf[SELinuxStrategyOptions]
  }
}


package typings.atPulumiKubernetes.typesInputMod.autoscaling.v2beta2

import typings.atPulumiPulumi.outputMod.Input
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
  var apiVersion: js.UndefOr[Input[String]] = js.undefined
  /**
    * Kind of the referent; More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds"
    */
  var kind: Input[String]
  /**
    * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
    */
  var name: Input[String]
}

object CrossVersionObjectReference {
  @scala.inline
  def apply(kind: Input[String], name: Input[String], apiVersion: Input[String] = null): CrossVersionObjectReference = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossVersionObjectReference]
  }
}


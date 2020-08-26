package typings.pulumiKubernetes.inputMod.autoscaling.v2beta2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CrossVersionObjectReference contains enough information to let you identify the referred resource.
  */
@js.native
trait CrossVersionObjectReference extends js.Object {
  /**
    * API version of the referent
    */
  var apiVersion: js.UndefOr[Input[String]] = js.native
  /**
    * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds"
    */
  var kind: Input[String] = js.native
  /**
    * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
    */
  var name: Input[String] = js.native
}

object CrossVersionObjectReference {
  @scala.inline
  def apply(kind: Input[String], name: Input[String]): CrossVersionObjectReference = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossVersionObjectReference]
  }
  @scala.inline
  implicit class CrossVersionObjectReferenceOps[Self <: CrossVersionObjectReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKind(value: Input[String]): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setApiVersion(value: Input[String]): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
  }
  
}


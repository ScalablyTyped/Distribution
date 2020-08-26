package typings.pulumiKubernetes.customResourceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomResourceArgs extends /* othersFields */ StringDictionary[Input[_]] {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  var apiVersion: Input[String] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  var kind: Input[String] = js.native
  /**
    * Standard object metadata; More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.native
}

object CustomResourceArgs {
  @scala.inline
  def apply(apiVersion: Input[String], kind: Input[String]): CustomResourceArgs = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceArgs]
  }
  @scala.inline
  implicit class CustomResourceArgsOps[Self <: CustomResourceArgs] (val x: Self) extends AnyVal {
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
    def setApiVersion(value: Input[String]): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: Input[String]): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: Input[ObjectMeta]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
  
}


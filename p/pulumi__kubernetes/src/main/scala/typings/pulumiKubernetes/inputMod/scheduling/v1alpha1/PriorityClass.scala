package typings.pulumiKubernetes.inputMod.scheduling.v1alpha1

import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.schedulingDotk8sDotioSlashv1alpha1
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED - This group version of PriorityClass is deprecated by scheduling.k8s.io/v1/PriorityClass. PriorityClass defines mapping from a priority class name to the priority integer value. The value can be any valid integer.
  */
@js.native
trait PriorityClass extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[schedulingDotk8sDotioSlashv1alpha1]] = js.native
  /**
    * description is an arbitrary string that usually provides guidelines on when this priority class should be used.
    */
  var description: js.UndefOr[Input[String]] = js.native
  /**
    * globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
    */
  var globalDefault: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.PriorityClass]] = js.native
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.native
  /**
    * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level and is only honored by servers that enable the NonPreemptingPriority feature.
    */
  var preemptionPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
    */
  var value: Input[Double] = js.native
}

object PriorityClass {
  @scala.inline
  def apply(value: Input[Double]): PriorityClass = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityClass]
  }
  @scala.inline
  implicit class PriorityClassOps[Self <: PriorityClass] (val x: Self) extends AnyVal {
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
    def setValue(value: Input[Double]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setApiVersion(value: Input[schedulingDotk8sDotioSlashv1alpha1]): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setGlobalDefault(value: Input[Boolean]): Self = this.set("globalDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalDefault: Self = this.set("globalDefault", js.undefined)
    @scala.inline
    def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.PriorityClass]): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMetadata(value: Input[ObjectMeta]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setPreemptionPolicy(value: Input[String]): Self = this.set("preemptionPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreemptionPolicy: Self = this.set("preemptionPolicy", js.undefined)
  }
  
}


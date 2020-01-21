package typings.pulumiKubernetes.inputMod.scheduling.v1

import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.schedulingDotk8sDotioSlashv1
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PriorityClass defines mapping from a priority class name to the priority integer value. The
  * value can be any valid integer.
  */
trait PriorityClass extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[schedulingDotk8sDotioSlashv1]] = js.undefined
  /**
    * description is an arbitrary string that usually provides guidelines on when this priority
    * class should be used.
    */
  var description: js.UndefOr[Input[String]] = js.undefined
  /**
    * globalDefault specifies whether this PriorityClass should be considered as the default
    * priority for pods that do not have any priority class. Only one PriorityClass can be marked
    * as `globalDefault`. However, if more than one PriorityClasses exists with their
    * `globalDefault` field set to true, the smallest value of such global default
    * PriorityClasses will be used as the default priority.
    */
  var globalDefault: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.PriorityClass]] = js.undefined
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  /**
    * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never,
    * PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level
    * and is only honored by servers that enable the NonPreemptingPriority feature.
    */
  var preemptionPolicy: js.UndefOr[Input[String]] = js.undefined
  /**
    * The value of this priority class. This is the actual priority that pods receive when they
    * have the name of this class in their pod spec.
    */
  var value: Input[Double]
}

object PriorityClass {
  @scala.inline
  def apply(
    value: Input[Double],
    apiVersion: Input[schedulingDotk8sDotioSlashv1] = null,
    description: Input[String] = null,
    globalDefault: Input[Boolean] = null,
    kind: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.PriorityClass] = null,
    metadata: Input[ObjectMeta] = null,
    preemptionPolicy: Input[String] = null
  ): PriorityClass = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (globalDefault != null) __obj.updateDynamic("globalDefault")(globalDefault.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (preemptionPolicy != null) __obj.updateDynamic("preemptionPolicy")(preemptionPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityClass]
  }
}


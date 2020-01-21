package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ObjectReference contains enough information to let you inspect or modify the referred object.
  */
trait ObjectReference extends js.Object {
  /**
    * API version of the referent.
    */
  var apiVersion: js.UndefOr[Input[String]] = js.undefined
  /**
    * If referring to a piece of an object instead of an entire object, this string should
    * contain a valid JSON/Go field access statement, such as
    * desiredState.manifest.containers[2]. For example, if the object reference is to a container
    * within a pod, this would take on a value like: "spec.containers{name}" (where "name" refers
    * to the name of the container that triggered the event) or if no container name is specified
    * "spec.containers[2]" (container with index 2 in this pod). This syntax is chosen only to
    * have some well-defined way of referencing a part of an object.
    */
  var fieldPath: js.UndefOr[Input[String]] = js.undefined
  /**
    * Kind of the referent. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[String]] = js.undefined
  /**
    * Name of the referent. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Namespace of the referent. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/
    */
  var namespace: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specific resourceVersion to which this reference is made, if any. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
    */
  var resourceVersion: js.UndefOr[Input[String]] = js.undefined
  /**
    * UID of the referent. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#uids
    */
  var uid: js.UndefOr[Input[String]] = js.undefined
}

object ObjectReference {
  @scala.inline
  def apply(
    apiVersion: Input[String] = null,
    fieldPath: Input[String] = null,
    kind: Input[String] = null,
    name: Input[String] = null,
    namespace: Input[String] = null,
    resourceVersion: Input[String] = null,
    uid: Input[String] = null
  ): ObjectReference = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (fieldPath != null) __obj.updateDynamic("fieldPath")(fieldPath.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (resourceVersion != null) __obj.updateDynamic("resourceVersion")(resourceVersion.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectReference]
  }
}


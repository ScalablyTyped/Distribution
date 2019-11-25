package typings.atPulumiKubernetes.typesOutputMod.core.v1

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
  val apiVersion: String
  /**
    * If referring to a piece of an object instead of an entire object, this string should
    * contain a valid JSON/Go field access statement, such as
    * desiredState.manifest.containers[2]. For example, if the object reference is to a container
    * within a pod, this would take on a value like: "spec.containers{name}" (where "name" refers
    * to the name of the container that triggered the event) or if no container name is specified
    * "spec.containers[2]" (container with index 2 in this pod). This syntax is chosen only to
    * have some well-defined way of referencing a part of an object.
    */
  val fieldPath: String
  /**
    * Kind of the referent. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: String
  /**
    * Name of the referent. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  val name: String
  /**
    * Namespace of the referent. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/
    */
  val namespace: String
  /**
    * Specific resourceVersion to which this reference is made, if any. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
    */
  val resourceVersion: String
  /**
    * UID of the referent. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#uids
    */
  val uid: String
}

object ObjectReference {
  @scala.inline
  def apply(
    apiVersion: String,
    fieldPath: String,
    kind: String,
    name: String,
    namespace: String,
    resourceVersion: String,
    uid: String
  ): ObjectReference = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], fieldPath = fieldPath.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], resourceVersion = resourceVersion.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ObjectReference]
  }
}


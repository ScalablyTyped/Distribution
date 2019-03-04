package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
  val apiVersion: java.lang.String
  /**
    * If referring to a piece of an object instead of an entire object, this string should
    * contain a valid JSON/Go field access statement, such as
    * desiredState.manifest.containers[2]. For example, if the object reference is to a container
    * within a pod, this would take on a value like: "spec.containers{name}" (where "name" refers
    * to the name of the container that triggered the event) or if no container name is specified
    * "spec.containers[2]" (container with index 2 in this pod). This syntax is chosen only to
    * have some well-defined way of referencing a part of an object.
    */
  val fieldPath: java.lang.String
  /**
    * Kind of the referent. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: java.lang.String
  /**
    * Name of the referent. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  val name: java.lang.String
  /**
    * Namespace of the referent. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/
    */
  val namespace: java.lang.String
  /**
    * Specific resourceVersion to which this reference is made, if any. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#concurrency-control-and-consistency
    */
  val resourceVersion: java.lang.String
  /**
    * UID of the referent. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#uids
    */
  val uid: java.lang.String
}

object ObjectReference {
  @scala.inline
  def apply(
    apiVersion: java.lang.String,
    fieldPath: java.lang.String,
    kind: java.lang.String,
    name: java.lang.String,
    namespace: java.lang.String,
    resourceVersion: java.lang.String,
    uid: java.lang.String
  ): ObjectReference = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, fieldPath = fieldPath, kind = kind, name = name, namespace = namespace, resourceVersion = resourceVersion, uid = uid)
  
    __obj.asInstanceOf[ObjectReference]
  }
}


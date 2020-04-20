package typings.pulumiKubernetes.outputMod.rbac.v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Subject contains a reference to the object or user identities a role binding applies to.
  * This can either hold a direct API object reference, or a value for non-objects such as user
  * and group names.
  */
trait Subject extends js.Object {
  /**
    * APIVersion holds the API group and version of the referenced subject. Defaults to "v1" for
    * ServiceAccount subjects. Defaults to "rbac.authorization.k8s.io/v1alpha1" for User and
    * Group subjects.
    */
  val apiVersion: String
  /**
    * Kind of object being referenced. Values defined by this API group are "User", "Group", and
    * "ServiceAccount". If the Authorizer does not recognized the kind value, the Authorizer
    * should report an error.
    */
  val kind: String
  /**
    * Name of the object being referenced.
    */
  val name: String
  /**
    * Namespace of the referenced object.  If the object kind is non-namespace, such as "User" or
    * "Group", and this value is not empty the Authorizer should report an error.
    */
  val namespace: String
}

object Subject {
  @scala.inline
  def apply(apiVersion: String, kind: String, name: String, namespace: String): Subject = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subject]
  }
}


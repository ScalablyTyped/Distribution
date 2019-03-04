package typings
package atPulumiKubernetesLib.typesOutputMod.rbacNs.v1beta1Ns

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
    * APIGroup holds the API group of the referenced subject. Defaults to "" for ServiceAccount
    * subjects. Defaults to "rbac.authorization.k8s.io" for User and Group subjects.
    */
  val apiGroup: java.lang.String
  /**
    * Kind of object being referenced. Values defined by this API group are "User", "Group", and
    * "ServiceAccount". If the Authorizer does not recognized the kind value, the Authorizer
    * should report an error.
    */
  val kind: java.lang.String
  /**
    * Name of the object being referenced.
    */
  val name: java.lang.String
  /**
    * Namespace of the referenced object.  If the object kind is non-namespace, such as "User" or
    * "Group", and this value is not empty the Authorizer should report an error.
    */
  val namespace: java.lang.String
}

object Subject {
  @scala.inline
  def apply(
    apiGroup: java.lang.String,
    kind: java.lang.String,
    name: java.lang.String,
    namespace: java.lang.String
  ): Subject = {
    val __obj = js.Dynamic.literal(apiGroup = apiGroup, kind = kind, name = name, namespace = namespace)
  
    __obj.asInstanceOf[Subject]
  }
}


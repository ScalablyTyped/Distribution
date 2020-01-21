package typings.pulumiKubernetes.inputMod.rbac.v1alpha1

import typings.pulumiPulumi.outputMod.Input
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
  var apiVersion: js.UndefOr[Input[String]] = js.undefined
  /**
    * Kind of object being referenced. Values defined by this API group are "User", "Group", and
    * "ServiceAccount". If the Authorizer does not recognized the kind value, the Authorizer
    * should report an error.
    */
  var kind: Input[String]
  /**
    * Name of the object being referenced.
    */
  var name: Input[String]
  /**
    * Namespace of the referenced object.  If the object kind is non-namespace, such as "User" or
    * "Group", and this value is not empty the Authorizer should report an error.
    */
  var namespace: js.UndefOr[Input[String]] = js.undefined
}

object Subject {
  @scala.inline
  def apply(
    kind: Input[String],
    name: Input[String],
    apiVersion: Input[String] = null,
    namespace: Input[String] = null
  ): Subject = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subject]
  }
}


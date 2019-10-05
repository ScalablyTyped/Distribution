package typings.atPulumiKubernetes.typesInputMod.admissionregistration.v1beta1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RuleWithOperations is a tuple of Operations and Resources. It is recommended to make sure
  * that all the tuple expansions are valid.
  */
trait RuleWithOperations extends js.Object {
  /**
    * APIGroups is the API groups the resources belong to. '*' is all groups. If '*' is present,
    * the length of the slice must be one. Required.
    */
  var apiGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * APIVersions is the API versions the resources belong to. '*' is all versions. If '*' is
    * present, the length of the slice must be one. Required.
    */
  var apiVersions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Operations is the operations the admission hook cares about - CREATE, UPDATE, or * for all
    * operations. If '*' is present, the length of the slice must be one. Required.
    */
  var operations: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Resources is a list of resources this rule applies to.
    *
    * For example: 'pods' means pods. 'pods/log' means the log subresource of pods. '*' means all
    * resources, but not subresources. 'pods/ *' means all subresources of pods. '*&#8205;/scale'
    * means all scale subresources. '*&#8205;/ *' means all resources and their subresources.
    *
    * If wildcard is present, the validation rule will ensure resources do not overlap with each
    * other.
    *
    * Depending on the enclosing object, subresources might not be allowed. Required.
    */
  var resources: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * scope specifies the scope of this rule. Valid values are "Cluster", "Namespaced", and "*"
    * "Cluster" means that only cluster-scoped resources will match this rule. Namespace API
    * objects are cluster-scoped. "Namespaced" means that only namespaced resources will match
    * this rule. "*" means that there are no scope restrictions. Subresources match the scope of
    * their parent resource. Default is "*".
    */
  var scope: js.UndefOr[Input[String]] = js.undefined
}

object RuleWithOperations {
  @scala.inline
  def apply(
    apiGroups: Input[js.Array[Input[String]]] = null,
    apiVersions: Input[js.Array[Input[String]]] = null,
    operations: Input[js.Array[Input[String]]] = null,
    resources: Input[js.Array[Input[String]]] = null,
    scope: Input[String] = null
  ): RuleWithOperations = {
    val __obj = js.Dynamic.literal()
    if (apiGroups != null) __obj.updateDynamic("apiGroups")(apiGroups.asInstanceOf[js.Any])
    if (apiVersions != null) __obj.updateDynamic("apiVersions")(apiVersions.asInstanceOf[js.Any])
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleWithOperations]
  }
}


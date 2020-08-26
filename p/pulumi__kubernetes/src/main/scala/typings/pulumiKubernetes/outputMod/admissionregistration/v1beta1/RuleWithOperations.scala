package typings.pulumiKubernetes.outputMod.admissionregistration.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RuleWithOperations is a tuple of Operations and Resources. It is recommended to make sure that all the tuple expansions are valid.
  */
@js.native
trait RuleWithOperations extends js.Object {
  /**
    * APIGroups is the API groups the resources belong to. '*' is all groups. If '*' is present, the length of the slice must be one. Required.
    */
  var apiGroups: js.Array[String] = js.native
  /**
    * APIVersions is the API versions the resources belong to. '*' is all versions. If '*' is present, the length of the slice must be one. Required.
    */
  var apiVersions: js.Array[String] = js.native
  /**
    * Operations is the operations the admission hook cares about - CREATE, UPDATE, or * for all operations. If '*' is present, the length of the slice must be one. Required.
    */
  var operations: js.Array[String] = js.native
  /**
    * Resources is a list of resources this rule applies to.
    *
    * For example: 'pods' means pods. 'pods/log' means the log subresource of pods. '*' means all resources, but not subresources. 'pods/ *' means all subresources of pods. '*&#47;scale' means all scale subresources. '*&#47;*' means all resources and their subresources.
    *
    * If wildcard is present, the validation rule will ensure resources do not overlap with each other.
    *
    * Depending on the enclosing object, subresources might not be allowed. Required.
    */
  var resources: js.Array[String] = js.native
  /**
    * scope specifies the scope of this rule. Valid values are "Cluster", "Namespaced", and "*" "Cluster" means that only cluster-scoped resources will match this rule. Namespace API objects are cluster-scoped. "Namespaced" means that only namespaced resources will match this rule. "*" means that there are no scope restrictions. Subresources match the scope of their parent resource. Default is "*".
    */
  var scope: String = js.native
}

object RuleWithOperations {
  @scala.inline
  def apply(
    apiGroups: js.Array[String],
    apiVersions: js.Array[String],
    operations: js.Array[String],
    resources: js.Array[String],
    scope: String
  ): RuleWithOperations = {
    val __obj = js.Dynamic.literal(apiGroups = apiGroups.asInstanceOf[js.Any], apiVersions = apiVersions.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleWithOperations]
  }
  @scala.inline
  implicit class RuleWithOperationsOps[Self <: RuleWithOperations] (val x: Self) extends AnyVal {
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
    def setApiGroupsVarargs(value: String*): Self = this.set("apiGroups", js.Array(value :_*))
    @scala.inline
    def setApiGroups(value: js.Array[String]): Self = this.set("apiGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def setApiVersionsVarargs(value: String*): Self = this.set("apiVersions", js.Array(value :_*))
    @scala.inline
    def setApiVersions(value: js.Array[String]): Self = this.set("apiVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationsVarargs(value: String*): Self = this.set("operations", js.Array(value :_*))
    @scala.inline
    def setOperations(value: js.Array[String]): Self = this.set("operations", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourcesVarargs(value: String*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: js.Array[String]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
  }
  
}


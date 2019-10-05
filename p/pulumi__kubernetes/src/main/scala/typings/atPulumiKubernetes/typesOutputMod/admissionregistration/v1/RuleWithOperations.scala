package typings.atPulumiKubernetes.typesOutputMod.admissionregistration.v1

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
  val apiGroups: js.Array[String]
  /**
    * APIVersions is the API versions the resources belong to. '*' is all versions. If '*' is
    * present, the length of the slice must be one. Required.
    */
  val apiVersions: js.Array[String]
  /**
    * Operations is the operations the admission hook cares about - CREATE, UPDATE, or * for all
    * operations. If '*' is present, the length of the slice must be one. Required.
    */
  val operations: js.Array[String]
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
  val resources: js.Array[String]
  /**
    * scope specifies the scope of this rule. Valid values are "Cluster", "Namespaced", and "*"
    * "Cluster" means that only cluster-scoped resources will match this rule. Namespace API
    * objects are cluster-scoped. "Namespaced" means that only namespaced resources will match
    * this rule. "*" means that there are no scope restrictions. Subresources match the scope of
    * their parent resource. Default is "*".
    */
  val scope: String
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
    val __obj = js.Dynamic.literal(apiGroups = apiGroups, apiVersions = apiVersions, operations = operations, resources = resources, scope = scope)
  
    __obj.asInstanceOf[RuleWithOperations]
  }
}


package typings.pulumiKubernetes.inputMod.flowcontrol.v1alpha1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ResourcePolicyRule is a predicate that matches some resource requests, testing the request's verb and the target resource. A ResourcePolicyRule matches a resource request if and only if: (a) at least one member of verbs matches the request, (b) at least one member of apiGroups matches the request, (c) at least one member of resources matches the request, and (d) least one member of namespaces matches the request.
  */
@js.native
trait ResourcePolicyRule extends js.Object {
  /**
    * `apiGroups` is a list of matching API groups and may not be empty. "*" matches all API groups and, if present, must be the only entry. Required.
    */
  var apiGroups: Input[js.Array[Input[String]]] = js.native
  /**
    * `clusterScope` indicates whether to match requests that do not specify a namespace (which happens either because the resource is not namespaced or the request targets all namespaces). If this field is omitted or false then the `namespaces` field must contain a non-empty list.
    */
  var clusterScope: js.UndefOr[Input[Boolean]] = js.native
  /**
    * `namespaces` is a list of target namespaces that restricts matches.  A request that specifies a target namespace matches only if either (a) this list contains that target namespace or (b) this list contains "*".  Note that "*" matches any specified namespace but does not match a request that _does not specify_ a namespace (see the `clusterScope` field for that). This list may be empty, but only if `clusterScope` is true.
    */
  var namespaces: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * `resources` is a list of matching resources (i.e., lowercase and plural) with, if desired, subresource.  For example, [ "services", "nodes/status" ].  This list may not be empty. "*" matches all resources and, if present, must be the only entry. Required.
    */
  var resources: Input[js.Array[Input[String]]] = js.native
  /**
    * `verbs` is a list of matching verbs and may not be empty. "*" matches all verbs and, if present, must be the only entry. Required.
    */
  var verbs: Input[js.Array[Input[String]]] = js.native
}

object ResourcePolicyRule {
  @scala.inline
  def apply(
    apiGroups: Input[js.Array[Input[String]]],
    resources: Input[js.Array[Input[String]]],
    verbs: Input[js.Array[Input[String]]]
  ): ResourcePolicyRule = {
    val __obj = js.Dynamic.literal(apiGroups = apiGroups.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], verbs = verbs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourcePolicyRule]
  }
  @scala.inline
  implicit class ResourcePolicyRuleOps[Self <: ResourcePolicyRule] (val x: Self) extends AnyVal {
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
    def setApiGroupsVarargs(value: Input[String]*): Self = this.set("apiGroups", js.Array(value :_*))
    @scala.inline
    def setApiGroups(value: Input[js.Array[Input[String]]]): Self = this.set("apiGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourcesVarargs(value: Input[String]*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: Input[js.Array[Input[String]]]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerbsVarargs(value: Input[String]*): Self = this.set("verbs", js.Array(value :_*))
    @scala.inline
    def setVerbs(value: Input[js.Array[Input[String]]]): Self = this.set("verbs", value.asInstanceOf[js.Any])
    @scala.inline
    def setClusterScope(value: Input[Boolean]): Self = this.set("clusterScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterScope: Self = this.set("clusterScope", js.undefined)
    @scala.inline
    def setNamespacesVarargs(value: Input[String]*): Self = this.set("namespaces", js.Array(value :_*))
    @scala.inline
    def setNamespaces(value: Input[js.Array[Input[String]]]): Self = this.set("namespaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespaces: Self = this.set("namespaces", js.undefined)
  }
  
}


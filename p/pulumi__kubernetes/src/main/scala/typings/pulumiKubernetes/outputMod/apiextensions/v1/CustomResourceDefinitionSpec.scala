package typings.pulumiKubernetes.outputMod.apiextensions.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceDefinitionSpec describes how a user wants their resource to appear
  */
@js.native
trait CustomResourceDefinitionSpec extends js.Object {
  /**
    * conversion defines conversion settings for the CRD.
    */
  var conversion: CustomResourceConversion = js.native
  /**
    * group is the API group of the defined custom resource. The custom resources are served under `/apis/<group>/...`. Must match the name of the CustomResourceDefinition (in the form `<names.plural>.<group>`).
    */
  var group: String = js.native
  /**
    * names specify the resource and kind names for the custom resource.
    */
  var names: CustomResourceDefinitionNames = js.native
  /**
    * preserveUnknownFields indicates that object fields which are not specified in the OpenAPI schema should be preserved when persisting to storage. apiVersion, kind, metadata and known fields inside metadata are always preserved. This field is deprecated in favor of setting `x-preserve-unknown-fields` to true in `spec.versions[*].schema.openAPIV3Schema`. See https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions/#pruning-versus-preserving-unknown-fields for details.
    */
  var preserveUnknownFields: Boolean = js.native
  /**
    * scope indicates whether the defined custom resource is cluster- or namespace-scoped. Allowed values are `Cluster` and `Namespaced`.
    */
  var scope: String = js.native
  /**
    * versions is the list of all API versions of the defined custom resource. Version names are used to compute the order in which served versions are listed in API discovery. If the version string is "kube-like", it will sort above non "kube-like" version strings, which are ordered lexicographically. "Kube-like" versions start with a "v", then are followed by a number (the major version), then optionally the string "alpha" or "beta" and another number (the minor version). These are sorted first by GA > beta > alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
    */
  var versions: js.Array[CustomResourceDefinitionVersion] = js.native
}

object CustomResourceDefinitionSpec {
  @scala.inline
  def apply(
    conversion: CustomResourceConversion,
    group: String,
    names: CustomResourceDefinitionNames,
    preserveUnknownFields: Boolean,
    scope: String,
    versions: js.Array[CustomResourceDefinitionVersion]
  ): CustomResourceDefinitionSpec = {
    val __obj = js.Dynamic.literal(conversion = conversion.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], preserveUnknownFields = preserveUnknownFields.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceDefinitionSpec]
  }
  @scala.inline
  implicit class CustomResourceDefinitionSpecOps[Self <: CustomResourceDefinitionSpec] (val x: Self) extends AnyVal {
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
    def setConversion(value: CustomResourceConversion): Self = this.set("conversion", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def setNames(value: CustomResourceDefinitionNames): Self = this.set("names", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreserveUnknownFields(value: Boolean): Self = this.set("preserveUnknownFields", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionsVarargs(value: CustomResourceDefinitionVersion*): Self = this.set("versions", js.Array(value :_*))
    @scala.inline
    def setVersions(value: js.Array[CustomResourceDefinitionVersion]): Self = this.set("versions", value.asInstanceOf[js.Any])
  }
  
}


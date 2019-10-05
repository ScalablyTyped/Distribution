package typings.atPulumiKubernetes.typesInputMod.apiextensions.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceDefinitionSpec describes how a user wants their resource to appear
  */
trait CustomResourceDefinitionSpec extends js.Object {
  /**
    * conversion defines conversion settings for the CRD.
    */
  var conversion: js.UndefOr[Input[CustomResourceConversion]] = js.undefined
  /**
    * group is the API group of the defined custom resource. The custom resources are served
    * under `/apis/<group>/...`. Must match the name of the CustomResourceDefinition (in the form
    * `<names.plural>.<group>`).
    */
  var group: Input[String]
  /**
    * names specify the resource and kind names for the custom resource.
    */
  var names: Input[CustomResourceDefinitionNames]
  /**
    * preserveUnknownFields indicates that object fields which are not specified in the OpenAPI
    * schema should be preserved when persisting to storage. apiVersion, kind, metadata and known
    * fields inside metadata are always preserved. This field is deprecated in favor of setting
    * `x-preserve-unknown-fields` to true in `spec.versions[*].schema.openAPIV3Schema`. See
    * https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions/#pruning-versus-preserving-unknown-fields
    * for details.
    */
  var preserveUnknownFields: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * scope indicates whether the defined custom resource is cluster- or namespace-scoped.
    * Allowed values are `Cluster` and `Namespaced`. Default is `Namespaced`.
    */
  var scope: Input[String]
  /**
    * versions is the list of all API versions of the defined custom resource. Version names are
    * used to compute the order in which served versions are listed in API discovery. If the
    * version string is "kube-like", it will sort above non "kube-like" version strings, which
    * are ordered lexicographically. "Kube-like" versions start with a "v", then are followed by
    * a number (the major version), then optionally the string "alpha" or "beta" and another
    * number (the minor version). These are sorted first by GA > beta > alpha (where GA is a
    * version with no suffix such as beta or alpha), and then by comparing major version, then
    * minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3,
    * v3beta1, v12alpha1, v11alpha2, foo1, foo10.
    */
  var versions: Input[js.Array[Input[CustomResourceDefinitionVersion]]]
}

object CustomResourceDefinitionSpec {
  @scala.inline
  def apply(
    group: Input[String],
    names: Input[CustomResourceDefinitionNames],
    scope: Input[String],
    versions: Input[js.Array[Input[CustomResourceDefinitionVersion]]],
    conversion: Input[CustomResourceConversion] = null,
    preserveUnknownFields: Input[Boolean] = null
  ): CustomResourceDefinitionSpec = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    if (conversion != null) __obj.updateDynamic("conversion")(conversion.asInstanceOf[js.Any])
    if (preserveUnknownFields != null) __obj.updateDynamic("preserveUnknownFields")(preserveUnknownFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceDefinitionSpec]
  }
}


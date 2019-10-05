package typings.atPulumiKubernetes.typesInputMod.apiextensions.v1beta1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceDefinitionSpec describes how a user wants their resource to appear
  */
trait CustomResourceDefinitionSpec extends js.Object {
  /**
    * additionalPrinterColumns specifies additional columns returned in Table output. See
    * https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables
    * for details. If present, this field configures columns for all versions. Top-level and
    * per-version columns are mutually exclusive. If no top-level or per-version columns are
    * specified, a single column displaying the age of the custom resource is used.
    */
  var additionalPrinterColumns: js.UndefOr[Input[js.Array[Input[CustomResourceColumnDefinition]]]] = js.undefined
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
    * fields inside metadata are always preserved. If false, schemas must be defined for all
    * versions. Defaults to true in v1beta for backwards compatibility. Deprecated: will be
    * required to be false in v1. Preservation of unknown fields can be specified in the
    * validation schema using the `x-kubernetes-preserve-unknown-fields: true` extension. See
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
    * subresources specify what subresources the defined custom resource has. If present, this
    * field configures subresources for all versions. Top-level and per-version subresources are
    * mutually exclusive.
    */
  var subresources: js.UndefOr[Input[CustomResourceSubresources]] = js.undefined
  /**
    * validation describes the schema used for validation and pruning of the custom resource. If
    * present, this validation schema is used to validate all versions. Top-level and per-version
    * schemas are mutually exclusive.
    */
  var validation: js.UndefOr[Input[CustomResourceValidation]] = js.undefined
  /**
    * version is the API version of the defined custom resource. The custom resources are served
    * under `/apis/<group>/<version>/...`. Must match the name of the first item in the
    * `versions` list if `version` and `versions` are both specified. Optional if `versions` is
    * specified. Deprecated: use `versions` instead.
    */
  var version: js.UndefOr[Input[String]] = js.undefined
  /**
    * versions is the list of all API versions of the defined custom resource. Optional if
    * `version` is specified. The name of the first item in the `versions` list must match the
    * `version` field if `version` and `versions` are both specified. Version names are used to
    * compute the order in which served versions are listed in API discovery. If the version
    * string is "kube-like", it will sort above non "kube-like" version strings, which are
    * ordered lexicographically. "Kube-like" versions start with a "v", then are followed by a
    * number (the major version), then optionally the string "alpha" or "beta" and another number
    * (the minor version). These are sorted first by GA > beta > alpha (where GA is a version
    * with no suffix such as beta or alpha), and then by comparing major version, then minor
    * version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1,
    * v12alpha1, v11alpha2, foo1, foo10.
    */
  var versions: js.UndefOr[Input[js.Array[Input[CustomResourceDefinitionVersion]]]] = js.undefined
}

object CustomResourceDefinitionSpec {
  @scala.inline
  def apply(
    group: Input[String],
    names: Input[CustomResourceDefinitionNames],
    scope: Input[String],
    additionalPrinterColumns: Input[js.Array[Input[CustomResourceColumnDefinition]]] = null,
    conversion: Input[CustomResourceConversion] = null,
    preserveUnknownFields: Input[Boolean] = null,
    subresources: Input[CustomResourceSubresources] = null,
    validation: Input[CustomResourceValidation] = null,
    version: Input[String] = null,
    versions: Input[js.Array[Input[CustomResourceDefinitionVersion]]] = null
  ): CustomResourceDefinitionSpec = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    if (additionalPrinterColumns != null) __obj.updateDynamic("additionalPrinterColumns")(additionalPrinterColumns.asInstanceOf[js.Any])
    if (conversion != null) __obj.updateDynamic("conversion")(conversion.asInstanceOf[js.Any])
    if (preserveUnknownFields != null) __obj.updateDynamic("preserveUnknownFields")(preserveUnknownFields.asInstanceOf[js.Any])
    if (subresources != null) __obj.updateDynamic("subresources")(subresources.asInstanceOf[js.Any])
    if (validation != null) __obj.updateDynamic("validation")(validation.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (versions != null) __obj.updateDynamic("versions")(versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceDefinitionSpec]
  }
}


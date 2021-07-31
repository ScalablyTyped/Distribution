package typings.pulumiKubernetes.outputMod.apiextensions.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CustomResourceDefinitionSpec describes how a user wants their resource to appear
  */
trait CustomResourceDefinitionSpec extends StObject {
  
  /**
    * additionalPrinterColumns specifies additional columns returned in Table output. See https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for details. If present, this field configures columns for all versions. Top-level and per-version columns are mutually exclusive. If no top-level or per-version columns are specified, a single column displaying the age of the custom resource is used.
    */
  var additionalPrinterColumns: js.Array[CustomResourceColumnDefinition]
  
  /**
    * conversion defines conversion settings for the CRD.
    */
  var conversion: CustomResourceConversion
  
  /**
    * group is the API group of the defined custom resource. The custom resources are served under `/apis/<group>/...`. Must match the name of the CustomResourceDefinition (in the form `<names.plural>.<group>`).
    */
  var group: String
  
  /**
    * names specify the resource and kind names for the custom resource.
    */
  var names: CustomResourceDefinitionNames
  
  /**
    * preserveUnknownFields indicates that object fields which are not specified in the OpenAPI schema should be preserved when persisting to storage. apiVersion, kind, metadata and known fields inside metadata are always preserved. If false, schemas must be defined for all versions. Defaults to true in v1beta for backwards compatibility. Deprecated: will be required to be false in v1. Preservation of unknown fields can be specified in the validation schema using the `x-kubernetes-preserve-unknown-fields: true` extension. See https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions/#pruning-versus-preserving-unknown-fields for details.
    */
  var preserveUnknownFields: Boolean
  
  /**
    * scope indicates whether the defined custom resource is cluster- or namespace-scoped. Allowed values are `Cluster` and `Namespaced`. Default is `Namespaced`.
    */
  var scope: String
  
  /**
    * subresources specify what subresources the defined custom resource has. If present, this field configures subresources for all versions. Top-level and per-version subresources are mutually exclusive.
    */
  var subresources: CustomResourceSubresources
  
  /**
    * validation describes the schema used for validation and pruning of the custom resource. If present, this validation schema is used to validate all versions. Top-level and per-version schemas are mutually exclusive.
    */
  var validation: CustomResourceValidation
  
  /**
    * version is the API version of the defined custom resource. The custom resources are served under `/apis/<group>/<version>/...`. Must match the name of the first item in the `versions` list if `version` and `versions` are both specified. Optional if `versions` is specified. Deprecated: use `versions` instead.
    */
  var version: String
  
  /**
    * versions is the list of all API versions of the defined custom resource. Optional if `version` is specified. The name of the first item in the `versions` list must match the `version` field if `version` and `versions` are both specified. Version names are used to compute the order in which served versions are listed in API discovery. If the version string is "kube-like", it will sort above non "kube-like" version strings, which are ordered lexicographically. "Kube-like" versions start with a "v", then are followed by a number (the major version), then optionally the string "alpha" or "beta" and another number (the minor version). These are sorted first by GA > beta > alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
    */
  var versions: js.Array[CustomResourceDefinitionVersion]
}
object CustomResourceDefinitionSpec {
  
  @scala.inline
  def apply(
    additionalPrinterColumns: js.Array[CustomResourceColumnDefinition],
    conversion: CustomResourceConversion,
    group: String,
    names: CustomResourceDefinitionNames,
    preserveUnknownFields: Boolean,
    scope: String,
    subresources: CustomResourceSubresources,
    validation: CustomResourceValidation,
    version: String,
    versions: js.Array[CustomResourceDefinitionVersion]
  ): CustomResourceDefinitionSpec = {
    val __obj = js.Dynamic.literal(additionalPrinterColumns = additionalPrinterColumns.asInstanceOf[js.Any], conversion = conversion.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], preserveUnknownFields = preserveUnknownFields.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], subresources = subresources.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceDefinitionSpec]
  }
  
  @scala.inline
  implicit class CustomResourceDefinitionSpecMutableBuilder[Self <: CustomResourceDefinitionSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalPrinterColumns(value: js.Array[CustomResourceColumnDefinition]): Self = StObject.set(x, "additionalPrinterColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalPrinterColumnsVarargs(value: CustomResourceColumnDefinition*): Self = StObject.set(x, "additionalPrinterColumns", js.Array(value :_*))
    
    @scala.inline
    def setConversion(value: CustomResourceConversion): Self = StObject.set(x, "conversion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNames(value: CustomResourceDefinitionNames): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveUnknownFields(value: Boolean): Self = StObject.set(x, "preserveUnknownFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubresources(value: CustomResourceSubresources): Self = StObject.set(x, "subresources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidation(value: CustomResourceValidation): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersions(value: js.Array[CustomResourceDefinitionVersion]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsVarargs(value: CustomResourceDefinitionVersion*): Self = StObject.set(x, "versions", js.Array(value :_*))
  }
}

package typings.pulumiKubernetes.outputMod.apiextensions.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CustomResourceDefinitionVersion describes a version for CRD.
  */
@js.native
trait CustomResourceDefinitionVersion extends StObject {
  
  /**
    * additionalPrinterColumns specifies additional columns returned in Table output. See https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for details. Top-level and per-version columns are mutually exclusive. Per-version columns must not all be set to identical values (top-level columns should be used instead). If no top-level or per-version columns are specified, a single column displaying the age of the custom resource is used.
    */
  var additionalPrinterColumns: js.Array[CustomResourceColumnDefinition] = js.native
  
  /**
    * deprecated indicates this version of the custom resource API is deprecated. When set to true, API requests to this version receive a warning header in the server response. Defaults to false.
    */
  var deprecated: Boolean = js.native
  
  /**
    * deprecationWarning overrides the default warning returned to API clients. May only be set when `deprecated` is true. The default warning indicates this version is deprecated and recommends use of the newest served version of equal or greater stability, if one exists.
    */
  var deprecationWarning: String = js.native
  
  /**
    * name is the version name, e.g. “v1”, “v2beta1”, etc. The custom resources are served under this version at `/apis/<group>/<version>/...` if `served` is true.
    */
  var name: String = js.native
  
  /**
    * schema describes the schema used for validation and pruning of this version of the custom resource. Top-level and per-version schemas are mutually exclusive. Per-version schemas must not all be set to identical values (top-level validation schema should be used instead).
    */
  var schema: CustomResourceValidation = js.native
  
  /**
    * served is a flag enabling/disabling this version from being served via REST APIs
    */
  var served: Boolean = js.native
  
  /**
    * storage indicates this version should be used when persisting custom resources to storage. There must be exactly one version with storage=true.
    */
  var storage: Boolean = js.native
  
  /**
    * subresources specify what subresources this version of the defined custom resource have. Top-level and per-version subresources are mutually exclusive. Per-version subresources must not all be set to identical values (top-level subresources should be used instead).
    */
  var subresources: CustomResourceSubresources = js.native
}
object CustomResourceDefinitionVersion {
  
  @scala.inline
  def apply(
    additionalPrinterColumns: js.Array[CustomResourceColumnDefinition],
    deprecated: Boolean,
    deprecationWarning: String,
    name: String,
    schema: CustomResourceValidation,
    served: Boolean,
    storage: Boolean,
    subresources: CustomResourceSubresources
  ): CustomResourceDefinitionVersion = {
    val __obj = js.Dynamic.literal(additionalPrinterColumns = additionalPrinterColumns.asInstanceOf[js.Any], deprecated = deprecated.asInstanceOf[js.Any], deprecationWarning = deprecationWarning.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], served = served.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], subresources = subresources.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceDefinitionVersion]
  }
  
  @scala.inline
  implicit class CustomResourceDefinitionVersionMutableBuilder[Self <: CustomResourceDefinitionVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalPrinterColumns(value: js.Array[CustomResourceColumnDefinition]): Self = StObject.set(x, "additionalPrinterColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalPrinterColumnsVarargs(value: CustomResourceColumnDefinition*): Self = StObject.set(x, "additionalPrinterColumns", js.Array(value :_*))
    
    @scala.inline
    def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecationWarning(value: String): Self = StObject.set(x, "deprecationWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: CustomResourceValidation): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServed(value: Boolean): Self = StObject.set(x, "served", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorage(value: Boolean): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubresources(value: CustomResourceSubresources): Self = StObject.set(x, "subresources", value.asInstanceOf[js.Any])
  }
}

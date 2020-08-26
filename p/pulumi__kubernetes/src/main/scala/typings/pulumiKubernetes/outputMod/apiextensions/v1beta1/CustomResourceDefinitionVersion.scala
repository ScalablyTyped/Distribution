package typings.pulumiKubernetes.outputMod.apiextensions.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceDefinitionVersion describes a version for CRD.
  */
@js.native
trait CustomResourceDefinitionVersion extends js.Object {
  /**
    * additionalPrinterColumns specifies additional columns returned in Table output. See https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for details. Top-level and per-version columns are mutually exclusive. Per-version columns must not all be set to identical values (top-level columns should be used instead). If no top-level or per-version columns are specified, a single column displaying the age of the custom resource is used.
    */
  var additionalPrinterColumns: js.Array[CustomResourceColumnDefinition] = js.native
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
    name: String,
    schema: CustomResourceValidation,
    served: Boolean,
    storage: Boolean,
    subresources: CustomResourceSubresources
  ): CustomResourceDefinitionVersion = {
    val __obj = js.Dynamic.literal(additionalPrinterColumns = additionalPrinterColumns.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], served = served.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], subresources = subresources.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceDefinitionVersion]
  }
  @scala.inline
  implicit class CustomResourceDefinitionVersionOps[Self <: CustomResourceDefinitionVersion] (val x: Self) extends AnyVal {
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
    def setAdditionalPrinterColumnsVarargs(value: CustomResourceColumnDefinition*): Self = this.set("additionalPrinterColumns", js.Array(value :_*))
    @scala.inline
    def setAdditionalPrinterColumns(value: js.Array[CustomResourceColumnDefinition]): Self = this.set("additionalPrinterColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: CustomResourceValidation): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setServed(value: Boolean): Self = this.set("served", value.asInstanceOf[js.Any])
    @scala.inline
    def setStorage(value: Boolean): Self = this.set("storage", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubresources(value: CustomResourceSubresources): Self = this.set("subresources", value.asInstanceOf[js.Any])
  }
  
}


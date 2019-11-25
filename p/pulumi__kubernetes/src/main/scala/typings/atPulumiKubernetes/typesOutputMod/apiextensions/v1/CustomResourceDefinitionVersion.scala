package typings.atPulumiKubernetes.typesOutputMod.apiextensions.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceDefinitionVersion describes a version for CRD.
  */
trait CustomResourceDefinitionVersion extends js.Object {
  /**
    * additionalPrinterColumns specifies additional columns returned in Table output. See
    * https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables
    * for details. If no columns are specified, a single column displaying the age of the custom
    * resource is used.
    */
  val additionalPrinterColumns: js.Array[CustomResourceColumnDefinition]
  /**
    * name is the version name, e.g. “v1”, “v2beta1”, etc. The custom resources are
    * served under this version at `/apis/<group>/<version>/...` if `served` is true.
    */
  val name: String
  /**
    * schema describes the schema used for validation, pruning, and defaulting of this version of
    * the custom resource.
    */
  val schema: CustomResourceValidation
  /**
    * served is a flag enabling/disabling this version from being served via REST APIs
    */
  val served: Boolean
  /**
    * storage indicates this version should be used when persisting custom resources to storage.
    * There must be exactly one version with storage=true.
    */
  val storage: Boolean
  /**
    * subresources specify what subresources this version of the defined custom resource have.
    */
  val subresources: CustomResourceSubresources
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
}


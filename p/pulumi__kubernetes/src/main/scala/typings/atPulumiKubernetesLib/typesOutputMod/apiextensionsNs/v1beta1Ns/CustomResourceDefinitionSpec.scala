package typings
package atPulumiKubernetesLib.typesOutputMod.apiextensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceDefinitionSpec describes how a user wants their resource to appear
  */
trait CustomResourceDefinitionSpec extends js.Object {
  /**
    * AdditionalPrinterColumns are additional columns shown e.g. in kubectl next to the name.
    * Defaults to a created-at column. Optional, the global columns for all versions. Top-level
    * and per-version columns are mutually exclusive.
    */
  val additionalPrinterColumns: js.Array[CustomResourceColumnDefinition]
  /**
    * `conversion` defines conversion settings for the CRD.
    */
  val conversion: CustomResourceConversion
  /**
    * Group is the group this resource belongs in
    */
  val group: java.lang.String
  /**
    * Names are the names used to describe this custom resource
    */
  val names: CustomResourceDefinitionNames
  /**
    * Scope indicates whether this resource is cluster or namespace scoped.  Default is
    * namespaced
    */
  val scope: java.lang.String
  /**
    * Subresources describes the subresources for CustomResource Optional, the global
    * subresources for all versions. Top-level and per-version subresources are mutually
    * exclusive.
    */
  val subresources: CustomResourceSubresources
  /**
    * Validation describes the validation methods for CustomResources Optional, the global
    * validation schema for all versions. Top-level and per-version schemas are mutually
    * exclusive.
    */
  val validation: CustomResourceValidation
  /**
    * Version is the version this resource belongs in Should be always first item in Versions
    * field if provided. Optional, but at least one of Version or Versions must be set.
    * Deprecated: Please use `Versions`.
    */
  val version: java.lang.String
  /**
    * Versions is the list of all supported versions for this resource. If Version field is
    * provided, this field is optional. Validation: All versions must use the same validation
    * schema for now. i.e., top level Validation field is applied to all of these versions.
    * Order: The version name will be used to compute the order. If the version string is
    * "kube-like", it will sort above non "kube-like" version strings, which are ordered
    * lexicographically. "Kube-like" versions start with a "v", then are followed by a number
    * (the major version), then optionally the string "alpha" or "beta" and another number (the
    * minor version). These are sorted first by GA > beta > alpha (where GA is a version with no
    * suffix such as beta or alpha), and then by comparing major version, then minor version. An
    * example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1,
    * v11alpha2, foo1, foo10.
    */
  val versions: js.Array[CustomResourceDefinitionVersion]
}

object CustomResourceDefinitionSpec {
  @scala.inline
  def apply(
    additionalPrinterColumns: js.Array[CustomResourceColumnDefinition],
    conversion: CustomResourceConversion,
    group: java.lang.String,
    names: CustomResourceDefinitionNames,
    scope: java.lang.String,
    subresources: CustomResourceSubresources,
    validation: CustomResourceValidation,
    version: java.lang.String,
    versions: js.Array[CustomResourceDefinitionVersion]
  ): CustomResourceDefinitionSpec = {
    val __obj = js.Dynamic.literal(additionalPrinterColumns = additionalPrinterColumns, conversion = conversion, group = group, names = names, scope = scope, subresources = subresources, validation = validation, version = version, versions = versions)
  
    __obj.asInstanceOf[CustomResourceDefinitionSpec]
  }
}


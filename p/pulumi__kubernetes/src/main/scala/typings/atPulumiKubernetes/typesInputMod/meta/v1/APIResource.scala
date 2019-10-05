package typings.atPulumiKubernetes.typesInputMod.meta.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * APIResource specifies the name of a resource and whether it is namespaced.
  */
trait APIResource extends js.Object {
  /**
    * categories is a list of the grouped resources this resource belongs to (e.g. 'all')
    */
  var categories: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * group is the preferred group of the resource.  Empty implies the group of the containing
    * resource list. For subresources, this may have a different value, for example: Scale".
    */
  var group: js.UndefOr[Input[String]] = js.undefined
  /**
    * kind is the kind for the resource (e.g. 'Foo' is the kind for a resource 'foo')
    */
  var kind: Input[String]
  /**
    * name is the plural name of the resource.
    */
  var name: Input[String]
  /**
    * namespaced indicates if a resource is namespaced or not.
    */
  var namespaced: Input[Boolean]
  /**
    * shortNames is a list of suggested short names of the resource.
    */
  var shortNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * singularName is the singular name of the resource.  This allows clients to handle plural
    * and singular opaquely. The singularName is more correct for reporting status on a single
    * item and both singular and plural are allowed from the kubectl CLI interface.
    */
  var singularName: Input[String]
  /**
    * The hash value of the storage version, the version this resource is converted to when
    * written to the data store. Value must be treated as opaque by clients. Only equality
    * comparison on the value is valid. This is an alpha feature and may change or be removed in
    * the future. The field is populated by the apiserver only if the StorageVersionHash feature
    * gate is enabled. This field will remain optional even if it graduates.
    */
  var storageVersionHash: js.UndefOr[Input[String]] = js.undefined
  /**
    * verbs is a list of supported kube verbs (this includes get, list, watch, create, update,
    * patch, delete, deletecollection, and proxy)
    */
  var verbs: Input[js.Array[Input[String]]]
  /**
    * version is the preferred version of the resource.  Empty implies the version of the
    * containing resource list For subresources, this may have a different value, for example: v1
    * (while inside a v1beta1 version of the core resource's group)".
    */
  var version: js.UndefOr[Input[String]] = js.undefined
}

object APIResource {
  @scala.inline
  def apply(
    kind: Input[String],
    name: Input[String],
    namespaced: Input[Boolean],
    singularName: Input[String],
    verbs: Input[js.Array[Input[String]]],
    categories: Input[js.Array[Input[String]]] = null,
    group: Input[String] = null,
    shortNames: Input[js.Array[Input[String]]] = null,
    storageVersionHash: Input[String] = null,
    version: Input[String] = null
  ): APIResource = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespaced = namespaced.asInstanceOf[js.Any], singularName = singularName.asInstanceOf[js.Any], verbs = verbs.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (shortNames != null) __obj.updateDynamic("shortNames")(shortNames.asInstanceOf[js.Any])
    if (storageVersionHash != null) __obj.updateDynamic("storageVersionHash")(storageVersionHash.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIResource]
  }
}


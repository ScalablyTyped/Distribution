package typings.pulumiKubernetes.outputMod.meta.v1

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
  val categories: js.Array[String]
  /**
    * group is the preferred group of the resource.  Empty implies the group of the containing
    * resource list. For subresources, this may have a different value, for example: Scale".
    */
  val group: String
  /**
    * kind is the kind for the resource (e.g. 'Foo' is the kind for a resource 'foo')
    */
  val kind: String
  /**
    * name is the plural name of the resource.
    */
  val name: String
  /**
    * namespaced indicates if a resource is namespaced or not.
    */
  val namespaced: Boolean
  /**
    * shortNames is a list of suggested short names of the resource.
    */
  val shortNames: js.Array[String]
  /**
    * singularName is the singular name of the resource.  This allows clients to handle plural
    * and singular opaquely. The singularName is more correct for reporting status on a single
    * item and both singular and plural are allowed from the kubectl CLI interface.
    */
  val singularName: String
  /**
    * The hash value of the storage version, the version this resource is converted to when
    * written to the data store. Value must be treated as opaque by clients. Only equality
    * comparison on the value is valid. This is an alpha feature and may change or be removed in
    * the future. The field is populated by the apiserver only if the StorageVersionHash feature
    * gate is enabled. This field will remain optional even if it graduates.
    */
  val storageVersionHash: String
  /**
    * verbs is a list of supported kube verbs (this includes get, list, watch, create, update,
    * patch, delete, deletecollection, and proxy)
    */
  val verbs: js.Array[String]
  /**
    * version is the preferred version of the resource.  Empty implies the version of the
    * containing resource list For subresources, this may have a different value, for example: v1
    * (while inside a v1beta1 version of the core resource's group)".
    */
  val version: String
}

object APIResource {
  @scala.inline
  def apply(
    categories: js.Array[String],
    group: String,
    kind: String,
    name: String,
    namespaced: Boolean,
    shortNames: js.Array[String],
    singularName: String,
    storageVersionHash: String,
    verbs: js.Array[String],
    version: String
  ): APIResource = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespaced = namespaced.asInstanceOf[js.Any], shortNames = shortNames.asInstanceOf[js.Any], singularName = singularName.asInstanceOf[js.Any], storageVersionHash = storageVersionHash.asInstanceOf[js.Any], verbs = verbs.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIResource]
  }
}


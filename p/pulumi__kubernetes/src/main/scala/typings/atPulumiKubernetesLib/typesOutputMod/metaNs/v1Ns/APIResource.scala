package typings
package atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns

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
  val categories: js.Array[java.lang.String]
  /**
    * group is the preferred group of the resource.  Empty implies the group of the containing
    * resource list. For subresources, this may have a different value, for example: Scale".
    */
  val group: java.lang.String
  /**
    * kind is the kind for the resource (e.g. 'Foo' is the kind for a resource 'foo')
    */
  val kind: java.lang.String
  /**
    * name is the plural name of the resource.
    */
  val name: java.lang.String
  /**
    * namespaced indicates if a resource is namespaced or not.
    */
  val namespaced: scala.Boolean
  /**
    * shortNames is a list of suggested short names of the resource.
    */
  val shortNames: js.Array[java.lang.String]
  /**
    * singularName is the singular name of the resource.  This allows clients to handle plural
    * and singular opaquely. The singularName is more correct for reporting status on a single
    * item and both singular and plural are allowed from the kubectl CLI interface.
    */
  val singularName: java.lang.String
  /**
    * The hash value of the storage version, the version this resource is converted to when
    * written to the data store. Value must be treated as opaque by clients. Only equality
    * comparison on the value is valid. This is an alpha feature and may change or be removed in
    * the future. The field is populated by the apiserver only if the StorageVersionHash feature
    * gate is enabled. This field will remain optional even if it graduates.
    */
  val storageVersionHash: java.lang.String
  /**
    * verbs is a list of supported kube verbs (this includes get, list, watch, create, update,
    * patch, delete, deletecollection, and proxy)
    */
  val verbs: js.Array[java.lang.String]
  /**
    * version is the preferred version of the resource.  Empty implies the version of the
    * containing resource list For subresources, this may have a different value, for example: v1
    * (while inside a v1beta1 version of the core resource's group)".
    */
  val version: java.lang.String
}

object APIResource {
  @scala.inline
  def apply(
    categories: js.Array[java.lang.String],
    group: java.lang.String,
    kind: java.lang.String,
    name: java.lang.String,
    namespaced: scala.Boolean,
    shortNames: js.Array[java.lang.String],
    singularName: java.lang.String,
    storageVersionHash: java.lang.String,
    verbs: js.Array[java.lang.String],
    version: java.lang.String
  ): APIResource = {
    val __obj = js.Dynamic.literal(categories = categories, group = group, kind = kind, name = name, namespaced = namespaced, shortNames = shortNames, singularName = singularName, storageVersionHash = storageVersionHash, verbs = verbs, version = version)
  
    __obj.asInstanceOf[APIResource]
  }
}


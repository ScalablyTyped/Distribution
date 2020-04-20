package typings.pulumiKubernetes.outputMod.apiextensions.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceDefinitionNames indicates the names to serve this CustomResourceDefinition
  */
trait CustomResourceDefinitionNames extends js.Object {
  /**
    * categories is a list of grouped resources this custom resource belongs to (e.g. 'all').
    * This is published in API discovery documents, and used by clients to support invocations
    * like `kubectl get all`.
    */
  val categories: js.Array[String]
  /**
    * kind is the serialized kind of the resource. It is normally CamelCase and singular. Custom
    * resource instances will use this value as the `kind` attribute in API calls.
    */
  val kind: String
  /**
    * listKind is the serialized kind of the list for this resource. Defaults to "`kind`List".
    */
  val listKind: String
  /**
    * plural is the plural name of the resource to serve. The custom resources are served under
    * `/apis/<group>/<version>/.../<plural>`. Must match the name of the CustomResourceDefinition
    * (in the form `<names.plural>.<group>`). Must be all lowercase.
    */
  val plural: String
  /**
    * shortNames are short names for the resource, exposed in API discovery documents, and used
    * by clients to support invocations like `kubectl get <shortname>`. It must be all lowercase.
    */
  val shortNames: js.Array[String]
  /**
    * singular is the singular name of the resource. It must be all lowercase. Defaults to
    * lowercased `kind`.
    */
  val singular: String
}

object CustomResourceDefinitionNames {
  @scala.inline
  def apply(
    categories: js.Array[String],
    kind: String,
    listKind: String,
    plural: String,
    shortNames: js.Array[String],
    singular: String
  ): CustomResourceDefinitionNames = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], listKind = listKind.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], shortNames = shortNames.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceDefinitionNames]
  }
}


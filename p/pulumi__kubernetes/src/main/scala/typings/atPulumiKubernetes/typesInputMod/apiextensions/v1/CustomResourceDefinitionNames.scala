package typings.atPulumiKubernetes.typesInputMod.apiextensions.v1

import typings.atPulumiPulumi.outputMod.Input
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
  var categories: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * kind is the serialized kind of the resource. It is normally CamelCase and singular. Custom
    * resource instances will use this value as the `kind` attribute in API calls.
    */
  var kind: Input[String]
  /**
    * listKind is the serialized kind of the list for this resource. Defaults to "`kind`List".
    */
  var listKind: js.UndefOr[Input[String]] = js.undefined
  /**
    * plural is the plural name of the resource to serve. The custom resources are served under
    * `/apis/<group>/<version>/.../<plural>`. Must match the name of the CustomResourceDefinition
    * (in the form `<names.plural>.<group>`). Must be all lowercase.
    */
  var plural: Input[String]
  /**
    * shortNames are short names for the resource, exposed in API discovery documents, and used
    * by clients to support invocations like `kubectl get <shortname>`. It must be all lowercase.
    */
  var shortNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * singular is the singular name of the resource. It must be all lowercase. Defaults to
    * lowercased `kind`.
    */
  var singular: js.UndefOr[Input[String]] = js.undefined
}

object CustomResourceDefinitionNames {
  @scala.inline
  def apply(
    kind: Input[String],
    plural: Input[String],
    categories: Input[js.Array[Input[String]]] = null,
    listKind: Input[String] = null,
    shortNames: Input[js.Array[Input[String]]] = null,
    singular: Input[String] = null
  ): CustomResourceDefinitionNames = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (listKind != null) __obj.updateDynamic("listKind")(listKind.asInstanceOf[js.Any])
    if (shortNames != null) __obj.updateDynamic("shortNames")(shortNames.asInstanceOf[js.Any])
    if (singular != null) __obj.updateDynamic("singular")(singular.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceDefinitionNames]
  }
}


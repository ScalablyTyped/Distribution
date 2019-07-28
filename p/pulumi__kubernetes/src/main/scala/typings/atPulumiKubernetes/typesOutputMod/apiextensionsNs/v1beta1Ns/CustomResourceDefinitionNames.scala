package typings.atPulumiKubernetes.typesOutputMod.apiextensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceDefinitionNames indicates the names to serve this CustomResourceDefinition
  */
trait CustomResourceDefinitionNames extends js.Object {
  /**
    * Categories is a list of grouped resources custom resources belong to (e.g. 'all')
    */
  val categories: js.Array[String]
  /**
    * Kind is the serialized kind of the resource.  It is normally CamelCase and singular.
    */
  val kind: String
  /**
    * ListKind is the serialized kind of the list for this resource.  Defaults to <kind>List.
    */
  val listKind: String
  /**
    * Plural is the plural name of the resource to serve.  It must match the name of the
    * CustomResourceDefinition-registration too: plural.group and it must be all lowercase.
    */
  val plural: String
  /**
    * ShortNames are short names for the resource.  It must be all lowercase.
    */
  val shortNames: js.Array[String]
  /**
    * Singular is the singular name of the resource.  It must be all lowercase  Defaults to
    * lowercased <kind>
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
    val __obj = js.Dynamic.literal(categories = categories, kind = kind, listKind = listKind, plural = plural, shortNames = shortNames, singular = singular)
  
    __obj.asInstanceOf[CustomResourceDefinitionNames]
  }
}


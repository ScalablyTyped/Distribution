package typings.pulumiKubernetes.inputMod.apiextensions.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceDefinitionNames indicates the names to serve this CustomResourceDefinition
  */
@js.native
trait CustomResourceDefinitionNames extends js.Object {
  /**
    * categories is a list of grouped resources this custom resource belongs to (e.g. 'all'). This is published in API discovery documents, and used by clients to support invocations like `kubectl get all`.
    */
  var categories: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * kind is the serialized kind of the resource. It is normally CamelCase and singular. Custom resource instances will use this value as the `kind` attribute in API calls.
    */
  var kind: Input[String] = js.native
  /**
    * listKind is the serialized kind of the list for this resource. Defaults to "`kind`List".
    */
  var listKind: js.UndefOr[Input[String]] = js.native
  /**
    * plural is the plural name of the resource to serve. The custom resources are served under `/apis/<group>/<version>/.../<plural>`. Must match the name of the CustomResourceDefinition (in the form `<names.plural>.<group>`). Must be all lowercase.
    */
  var plural: Input[String] = js.native
  /**
    * shortNames are short names for the resource, exposed in API discovery documents, and used by clients to support invocations like `kubectl get <shortname>`. It must be all lowercase.
    */
  var shortNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * singular is the singular name of the resource. It must be all lowercase. Defaults to lowercased `kind`.
    */
  var singular: js.UndefOr[Input[String]] = js.native
}

object CustomResourceDefinitionNames {
  @scala.inline
  def apply(kind: Input[String], plural: Input[String]): CustomResourceDefinitionNames = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceDefinitionNames]
  }
  @scala.inline
  implicit class CustomResourceDefinitionNamesOps[Self <: CustomResourceDefinitionNames] (val x: Self) extends AnyVal {
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
    def setKind(value: Input[String]): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlural(value: Input[String]): Self = this.set("plural", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategoriesVarargs(value: Input[String]*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: Input[js.Array[Input[String]]]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    @scala.inline
    def setListKind(value: Input[String]): Self = this.set("listKind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListKind: Self = this.set("listKind", js.undefined)
    @scala.inline
    def setShortNamesVarargs(value: Input[String]*): Self = this.set("shortNames", js.Array(value :_*))
    @scala.inline
    def setShortNames(value: Input[js.Array[Input[String]]]): Self = this.set("shortNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortNames: Self = this.set("shortNames", js.undefined)
    @scala.inline
    def setSingular(value: Input[String]): Self = this.set("singular", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingular: Self = this.set("singular", js.undefined)
  }
  
}


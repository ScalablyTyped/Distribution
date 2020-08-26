package typings.pulumiPulumi.resourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomResourceOptions extends ResourceOptions {
  /**
    * The names of outputs for this resource that should be treated as secrets. This augments the list that
    * the resource provider and pulumi engine already determine based on inputs to your resource. It can be used
    * to mark certain ouputs as a secrets on a per resource basis.
    */
  var additionalSecretOutputs: js.UndefOr[js.Array[String]] = js.native
  /**
    * When set to true, deleteBeforeReplace indicates that this resource should be deleted before its replacement
    * is created when replacement is necessary.
    */
  var deleteBeforeReplace: js.UndefOr[Boolean] = js.native
  /**
    * When provided with a resource ID, import indicates that this resource's provider should import its state from
    * the cloud resource with the given ID. The inputs to the resource's constructor must align with the resource's
    * current state. Once a resource has been imported, the import property must be removed from the resource's
    * options.
    */
  var `import`: js.UndefOr[ID] = js.native
}

object CustomResourceOptions {
  @scala.inline
  def apply(): CustomResourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomResourceOptions]
  }
  @scala.inline
  implicit class CustomResourceOptionsOps[Self <: CustomResourceOptions] (val x: Self) extends AnyVal {
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
    def setAdditionalSecretOutputsVarargs(value: String*): Self = this.set("additionalSecretOutputs", js.Array(value :_*))
    @scala.inline
    def setAdditionalSecretOutputs(value: js.Array[String]): Self = this.set("additionalSecretOutputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalSecretOutputs: Self = this.set("additionalSecretOutputs", js.undefined)
    @scala.inline
    def setDeleteBeforeReplace(value: Boolean): Self = this.set("deleteBeforeReplace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteBeforeReplace: Self = this.set("deleteBeforeReplace", js.undefined)
    @scala.inline
    def setImport(value: ID): Self = this.set("import", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImport: Self = this.set("import", js.undefined)
  }
  
}


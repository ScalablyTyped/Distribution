package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatalogTableStorageDescriptorColumn extends js.Object {
  /**
    * Free-form text comment.
    */
  var comment: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the SerDe.
    */
  var name: Input[String] = js.native
  /**
    * The datatype of data in the Column.
    */
  var `type`: js.UndefOr[Input[String]] = js.native
}

object CatalogTableStorageDescriptorColumn {
  @scala.inline
  def apply(name: Input[String]): CatalogTableStorageDescriptorColumn = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatalogTableStorageDescriptorColumn]
  }
  @scala.inline
  implicit class CatalogTableStorageDescriptorColumnOps[Self <: CatalogTableStorageDescriptorColumn] (val x: Self) extends AnyVal {
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
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment(value: Input[String]): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}


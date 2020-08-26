package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Replacement extends js.Object {
  /**
    * The region of the artifact to delete.
    */
  var deletedRegion: Region = js.native
  /**
    * The content to insert at the location specified by the 'deletedRegion' property.
    */
  var insertedContent: js.UndefOr[ArtifactContent] = js.native
  /**
    * Key/value pairs that provide additional information about the replacement.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
}

object Replacement {
  @scala.inline
  def apply(deletedRegion: Region): Replacement = {
    val __obj = js.Dynamic.literal(deletedRegion = deletedRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Replacement]
  }
  @scala.inline
  implicit class ReplacementOps[Self <: Replacement] (val x: Self) extends AnyVal {
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
    def setDeletedRegion(value: Region): Self = this.set("deletedRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsertedContent(value: ArtifactContent): Self = this.set("insertedContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertedContent: Self = this.set("insertedContent", js.undefined)
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
  
}


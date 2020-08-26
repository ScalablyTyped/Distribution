package typings.reactNativeFirebase.mod.RNFirebase.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataChanges extends js.Object {
  var includeMetadataChanges: Boolean = js.native
}

object MetadataChanges {
  @scala.inline
  def apply(includeMetadataChanges: Boolean): MetadataChanges = {
    val __obj = js.Dynamic.literal(includeMetadataChanges = includeMetadataChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataChanges]
  }
  @scala.inline
  implicit class MetadataChangesOps[Self <: MetadataChanges] (val x: Self) extends AnyVal {
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
    def setIncludeMetadataChanges(value: Boolean): Self = this.set("includeMetadataChanges", value.asInstanceOf[js.Any])
  }
  
}


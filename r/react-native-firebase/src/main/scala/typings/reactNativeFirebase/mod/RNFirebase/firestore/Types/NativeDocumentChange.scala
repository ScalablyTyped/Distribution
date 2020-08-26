package typings.reactNativeFirebase.mod.RNFirebase.firestore.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeDocumentChange extends js.Object {
  var document: NativeDocumentSnapshot = js.native
  var newIndex: Double = js.native
  var oldIndex: Double = js.native
  var `type`: String = js.native
}

object NativeDocumentChange {
  @scala.inline
  def apply(document: NativeDocumentSnapshot, newIndex: Double, oldIndex: Double, `type`: String): NativeDocumentChange = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeDocumentChange]
  }
  @scala.inline
  implicit class NativeDocumentChangeOps[Self <: NativeDocumentChange] (val x: Self) extends AnyVal {
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
    def setDocument(value: NativeDocumentSnapshot): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewIndex(value: Double): Self = this.set("newIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldIndex(value: Double): Self = this.set("oldIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


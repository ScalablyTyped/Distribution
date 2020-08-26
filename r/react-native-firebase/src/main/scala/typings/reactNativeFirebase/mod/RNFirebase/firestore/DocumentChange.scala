package typings.reactNativeFirebase.mod.RNFirebase.firestore

import typings.reactNativeFirebase.reactNativeFirebaseStrings.added
import typings.reactNativeFirebase.reactNativeFirebaseStrings.modified
import typings.reactNativeFirebase.reactNativeFirebaseStrings.removed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentChange extends js.Object {
  val doc: DocumentSnapshot = js.native
  val newIndex: Double = js.native
  val oldIndex: Double = js.native
  val `type`: added | modified | removed = js.native
}

object DocumentChange {
  @scala.inline
  def apply(doc: DocumentSnapshot, newIndex: Double, oldIndex: Double, `type`: added | modified | removed): DocumentChange = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentChange]
  }
  @scala.inline
  implicit class DocumentChangeOps[Self <: DocumentChange] (val x: Self) extends AnyVal {
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
    def setDoc(value: DocumentSnapshot): Self = this.set("doc", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewIndex(value: Double): Self = this.set("newIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldIndex(value: Double): Self = this.set("oldIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: added | modified | removed): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


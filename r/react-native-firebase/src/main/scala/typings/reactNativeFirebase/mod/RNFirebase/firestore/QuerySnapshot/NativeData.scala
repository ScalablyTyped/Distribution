package typings.reactNativeFirebase.mod.RNFirebase.firestore.QuerySnapshot

import typings.reactNativeFirebase.mod.RNFirebase.firestore.Types.NativeDocumentChange
import typings.reactNativeFirebase.mod.RNFirebase.firestore.Types.NativeDocumentSnapshot
import typings.reactNativeFirebase.mod.RNFirebase.firestore.Types.SnapshotMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeData extends js.Object {
  var changes: js.Array[NativeDocumentChange] = js.native
  var documents: js.Array[NativeDocumentSnapshot] = js.native
  var metadata: SnapshotMetadata = js.native
}

object NativeData {
  @scala.inline
  def apply(
    changes: js.Array[NativeDocumentChange],
    documents: js.Array[NativeDocumentSnapshot],
    metadata: SnapshotMetadata
  ): NativeData = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], documents = documents.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeData]
  }
  @scala.inline
  implicit class NativeDataOps[Self <: NativeData] (val x: Self) extends AnyVal {
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
    def setChangesVarargs(value: NativeDocumentChange*): Self = this.set("changes", js.Array(value :_*))
    @scala.inline
    def setChanges(value: js.Array[NativeDocumentChange]): Self = this.set("changes", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocumentsVarargs(value: NativeDocumentSnapshot*): Self = this.set("documents", js.Array(value :_*))
    @scala.inline
    def setDocuments(value: js.Array[NativeDocumentSnapshot]): Self = this.set("documents", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: SnapshotMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
  }
  
}


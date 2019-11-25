package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.QuerySnapshot

import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.Types.NativeDocumentChange
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.Types.NativeDocumentSnapshot
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.Types.SnapshotMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeData extends js.Object {
  var changes: js.Array[NativeDocumentChange]
  var documents: js.Array[NativeDocumentSnapshot]
  var metadata: SnapshotMetadata
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
}


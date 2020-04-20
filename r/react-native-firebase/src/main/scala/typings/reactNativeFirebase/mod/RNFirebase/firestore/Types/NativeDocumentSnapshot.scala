package typings.reactNativeFirebase.mod.RNFirebase.firestore.Types

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeDocumentSnapshot extends js.Object {
  var data: StringDictionary[TypeMap]
  var metadata: SnapshotMetadata
  var path: String
}

object NativeDocumentSnapshot {
  @scala.inline
  def apply(data: StringDictionary[TypeMap], metadata: SnapshotMetadata, path: String): NativeDocumentSnapshot = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeDocumentSnapshot]
  }
}


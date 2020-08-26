package typings.reactNativeFirebase.mod.RNFirebase.firestore.Types

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeDocumentSnapshot extends js.Object {
  var data: StringDictionary[TypeMap] = js.native
  var metadata: SnapshotMetadata = js.native
  var path: String = js.native
}

object NativeDocumentSnapshot {
  @scala.inline
  def apply(data: StringDictionary[TypeMap], metadata: SnapshotMetadata, path: String): NativeDocumentSnapshot = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeDocumentSnapshot]
  }
  @scala.inline
  implicit class NativeDocumentSnapshotOps[Self <: NativeDocumentSnapshot] (val x: Self) extends AnyVal {
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
    def setData(value: StringDictionary[TypeMap]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: SnapshotMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
  }
  
}


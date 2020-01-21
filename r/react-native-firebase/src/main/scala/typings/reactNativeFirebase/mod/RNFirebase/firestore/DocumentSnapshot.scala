package typings.reactNativeFirebase.mod.RNFirebase.firestore

import typings.reactNativeFirebase.mod.RNFirebase.firestore.Types.SnapshotMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentSnapshot extends js.Object {
  val exists: Boolean = js.native
  val id: String = js.native
  val metadata: SnapshotMetadata = js.native
  val ref: DocumentReference = js.native
  def data(): js.Object | Unit = js.native
  def get(fieldPath: String): js.UndefOr[js.Any] = js.native
  def get(fieldPath: FieldPath): js.UndefOr[js.Any] = js.native
}


package typings.reactNativeFirebase.mod.RNFirebase.firestore

import typings.reactNativeFirebase.mod.RNFirebase.firestore.Types.SnapshotMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuerySnapshot_ extends js.Object {
  val docChanges: js.Array[DocumentChange]
  val docs: js.Array[DocumentSnapshot]
  val empty: Boolean
  val metadata: SnapshotMetadata
  val query: Query
  val size: Double
  def forEach(callback: js.Function1[/* snapshot */ DocumentSnapshot, _]): Unit
}

object QuerySnapshot_ {
  @scala.inline
  def apply(
    docChanges: js.Array[DocumentChange],
    docs: js.Array[DocumentSnapshot],
    empty: Boolean,
    forEach: js.Function1[/* snapshot */ DocumentSnapshot, _] => Unit,
    metadata: SnapshotMetadata,
    query: Query,
    size: Double
  ): QuerySnapshot_ = {
    val __obj = js.Dynamic.literal(docChanges = docChanges.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], forEach = js.Any.fromFunction1(forEach), metadata = metadata.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuerySnapshot_]
  }
}


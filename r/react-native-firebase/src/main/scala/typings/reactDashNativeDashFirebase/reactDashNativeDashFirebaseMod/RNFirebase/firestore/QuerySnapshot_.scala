package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore

import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.Types.SnapshotMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("QuerySnapshot")
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
    val __obj = js.Dynamic.literal(docChanges = docChanges, docs = docs, empty = empty, forEach = js.Any.fromFunction1(forEach), metadata = metadata, query = query, size = size)
  
    __obj.asInstanceOf[QuerySnapshot_]
  }
}


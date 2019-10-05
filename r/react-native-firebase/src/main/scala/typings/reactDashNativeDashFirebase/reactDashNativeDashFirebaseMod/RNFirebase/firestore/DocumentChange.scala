package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore

import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.added
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.modified
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.removed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentChange extends js.Object {
  val doc: DocumentSnapshot
  val newIndex: Double
  val oldIndex: Double
  val `type`: added | modified | removed
}

object DocumentChange {
  @scala.inline
  def apply(doc: DocumentSnapshot, newIndex: Double, oldIndex: Double, `type`: added | modified | removed): DocumentChange = {
    val __obj = js.Dynamic.literal(doc = doc, newIndex = newIndex, oldIndex = oldIndex)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentChange]
  }
}


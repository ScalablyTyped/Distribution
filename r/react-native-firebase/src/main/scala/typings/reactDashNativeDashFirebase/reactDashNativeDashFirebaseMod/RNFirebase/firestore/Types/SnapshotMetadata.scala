package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotMetadata extends js.Object {
  var fromCache: Boolean
  var hasPendingWrites: Boolean
}

object SnapshotMetadata {
  @scala.inline
  def apply(fromCache: Boolean, hasPendingWrites: Boolean): SnapshotMetadata = {
    val __obj = js.Dynamic.literal(fromCache = fromCache, hasPendingWrites = hasPendingWrites)
  
    __obj.asInstanceOf[SnapshotMetadata]
  }
}


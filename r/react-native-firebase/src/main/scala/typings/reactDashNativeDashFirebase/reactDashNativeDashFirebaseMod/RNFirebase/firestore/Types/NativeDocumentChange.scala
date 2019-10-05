package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeDocumentChange extends js.Object {
  var document: NativeDocumentSnapshot
  var newIndex: Double
  var oldIndex: Double
  var `type`: String
}

object NativeDocumentChange {
  @scala.inline
  def apply(document: NativeDocumentSnapshot, newIndex: Double, oldIndex: Double, `type`: String): NativeDocumentChange = {
    val __obj = js.Dynamic.literal(document = document, newIndex = newIndex, oldIndex = oldIndex)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NativeDocumentChange]
  }
}


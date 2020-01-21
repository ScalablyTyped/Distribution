package typings.reactNativeFirebase.mod.RNFirebase.firestore.Types

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
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeDocumentChange]
  }
}


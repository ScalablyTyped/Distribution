package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.Query

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldOrder extends js.Object {
  var direction: String
  var fieldPath: NativeFieldPath
}

object FieldOrder {
  @scala.inline
  def apply(direction: String, fieldPath: NativeFieldPath): FieldOrder = {
    val __obj = js.Dynamic.literal(direction = direction, fieldPath = fieldPath)
  
    __obj.asInstanceOf[FieldOrder]
  }
}


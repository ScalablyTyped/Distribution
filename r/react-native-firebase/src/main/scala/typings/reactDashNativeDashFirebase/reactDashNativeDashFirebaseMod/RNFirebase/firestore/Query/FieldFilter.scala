package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.Query

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldFilter extends js.Object {
  var fieldPath: NativeFieldPath
  var operator: String
  var value: js.Any
}

object FieldFilter {
  @scala.inline
  def apply(fieldPath: NativeFieldPath, operator: String, value: js.Any): FieldFilter = {
    val __obj = js.Dynamic.literal(fieldPath = fieldPath, operator = operator, value = value)
  
    __obj.asInstanceOf[FieldFilter]
  }
}


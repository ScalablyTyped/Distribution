package typings.reactNativeFirebase.mod.RNFirebase.firestore.Query

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
    val __obj = js.Dynamic.literal(fieldPath = fieldPath.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldFilter]
  }
}


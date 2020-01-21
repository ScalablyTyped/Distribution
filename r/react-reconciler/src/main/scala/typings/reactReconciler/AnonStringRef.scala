package typings.reactReconciler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStringRef extends js.Object {
  var _stringRef: js.UndefOr[String | Null] = js.undefined
}

object AnonStringRef {
  @scala.inline
  def apply(_stringRef: String = null): AnonStringRef = {
    val __obj = js.Dynamic.literal()
    if (_stringRef != null) __obj.updateDynamic("_stringRef")(_stringRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStringRef]
  }
}


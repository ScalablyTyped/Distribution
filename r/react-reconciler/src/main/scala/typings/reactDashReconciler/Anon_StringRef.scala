package typings.reactDashReconciler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StringRef extends js.Object {
  var _stringRef: js.UndefOr[String | Null] = js.undefined
}

object Anon_StringRef {
  @scala.inline
  def apply(_stringRef: String = null): Anon_StringRef = {
    val __obj = js.Dynamic.literal()
    if (_stringRef != null) __obj.updateDynamic("_stringRef")(_stringRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_StringRef]
  }
}


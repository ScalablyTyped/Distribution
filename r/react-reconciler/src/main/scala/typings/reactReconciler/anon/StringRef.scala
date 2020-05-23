package typings.reactReconciler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringRef extends js.Object {
  var _stringRef: js.UndefOr[String | Null] = js.undefined
}

object StringRef {
  @scala.inline
  def apply(_stringRef: js.UndefOr[Null | String] = js.undefined): StringRef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_stringRef)) __obj.updateDynamic("_stringRef")(_stringRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringRef]
  }
}


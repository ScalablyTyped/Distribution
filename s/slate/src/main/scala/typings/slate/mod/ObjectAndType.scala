package typings.slate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectAndType extends js.Object {
  var `object`: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ObjectAndType {
  @scala.inline
  def apply(`object`: String = null, `type`: String = null): ObjectAndType = {
    val __obj = js.Dynamic.literal()
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectAndType]
  }
}


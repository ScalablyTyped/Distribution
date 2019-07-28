package typings.slate.slateMod

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
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ObjectAndType]
  }
}


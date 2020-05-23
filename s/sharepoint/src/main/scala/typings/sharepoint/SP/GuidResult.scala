package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GuidResult extends js.Object {
  def get_value(): Guid
}

object GuidResult {
  @scala.inline
  def apply(get_value: () => Guid): GuidResult = {
    val __obj = js.Dynamic.literal(get_value = js.Any.fromFunction0(get_value))
    __obj.asInstanceOf[GuidResult]
  }
}


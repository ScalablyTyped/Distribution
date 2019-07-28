package typings.snabbdom

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delayed extends js.Object {
  var delayed: js.UndefOr[Record[String, String]] = js.undefined
  var remove: js.UndefOr[Record[String, String]] = js.undefined
}

object Anon_Delayed {
  @scala.inline
  def apply(delayed: Record[String, String] = null, remove: Record[String, String] = null): Anon_Delayed = {
    val __obj = js.Dynamic.literal()
    if (delayed != null) __obj.updateDynamic("delayed")(delayed)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    __obj.asInstanceOf[Anon_Delayed]
  }
}


package typings
package snabbdomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delayed extends js.Object {
  var delayed: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  var remove: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
}

object Anon_Delayed {
  @scala.inline
  def apply(
    delayed: stdLib.Record[java.lang.String, java.lang.String] = null,
    remove: stdLib.Record[java.lang.String, java.lang.String] = null
  ): Anon_Delayed = {
    val __obj = js.Dynamic.literal()
    if (delayed != null) __obj.updateDynamic("delayed")(delayed)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    __obj.asInstanceOf[Anon_Delayed]
  }
}


package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End extends js.Object {
  var end: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[String] = js.undefined
}

object Anon_End {
  @scala.inline
  def apply(end: String = null, start: String = null): Anon_End = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Anon_End]
  }
}


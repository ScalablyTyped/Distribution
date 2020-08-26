package typings.reactAdaptiveHooks.anon

import typings.reactAdaptiveHooks.reactAdaptiveHooksBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Unsupported extends js.Object {
  var unsupported: `true` = js.native
}

object Unsupported {
  @scala.inline
  def apply(unsupported: `true`): Unsupported = {
    val __obj = js.Dynamic.literal(unsupported = unsupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[Unsupported]
  }
  @scala.inline
  implicit class UnsupportedOps[Self <: Unsupported] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUnsupported(value: `true`): Self = this.set("unsupported", value.asInstanceOf[js.Any])
  }
  
}


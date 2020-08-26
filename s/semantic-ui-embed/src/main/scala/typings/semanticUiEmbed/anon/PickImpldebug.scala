package typings.semanticUiEmbed.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.EmbedSettings._Impl, 'debug'> */
@js.native
trait PickImpldebug extends js.Object {
  var debug: Boolean = js.native
}

object PickImpldebug {
  @scala.inline
  def apply(debug: Boolean): PickImpldebug = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldebug]
  }
  @scala.inline
  implicit class PickImpldebugOps[Self <: PickImpldebug] (val x: Self) extends AnyVal {
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
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
  }
  
}


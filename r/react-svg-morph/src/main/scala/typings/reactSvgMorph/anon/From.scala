package typings.reactSvgMorph.anon

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait From extends js.Object {
  var from: ReactElement = js.native
  var to: ReactElement = js.native
}

object From {
  @scala.inline
  def apply(from: ReactElement, to: ReactElement): From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
  @scala.inline
  implicit class FromOps[Self <: From] (val x: Self) extends AnyVal {
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
    def setFrom(value: ReactElement): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: ReactElement): Self = this.set("to", value.asInstanceOf[js.Any])
  }
  
}


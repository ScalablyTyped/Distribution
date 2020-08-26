package typings.saxes.anon

import typings.saxes.saxesBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Xmlns extends js.Object {
  var xmlns: `true` = js.native
}

object Xmlns {
  @scala.inline
  def apply(xmlns: `true`): Xmlns = {
    val __obj = js.Dynamic.literal(xmlns = xmlns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xmlns]
  }
  @scala.inline
  implicit class XmlnsOps[Self <: Xmlns] (val x: Self) extends AnyVal {
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
    def setXmlns(value: `true`): Self = this.set("xmlns", value.asInstanceOf[js.Any])
  }
  
}


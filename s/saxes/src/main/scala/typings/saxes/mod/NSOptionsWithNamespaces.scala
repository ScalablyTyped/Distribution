package typings.saxes.mod

import typings.saxes.saxesBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NSOptionsWithNamespaces extends NSOptions {
  @JSName("xmlns")
  var xmlns_NSOptionsWithNamespaces: `true` = js.native
}

object NSOptionsWithNamespaces {
  @scala.inline
  def apply(xmlns: `true`): NSOptionsWithNamespaces = {
    val __obj = js.Dynamic.literal(xmlns = xmlns.asInstanceOf[js.Any])
    __obj.asInstanceOf[NSOptionsWithNamespaces]
  }
  @scala.inline
  implicit class NSOptionsWithNamespacesOps[Self <: NSOptionsWithNamespaces] (val x: Self) extends AnyVal {
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


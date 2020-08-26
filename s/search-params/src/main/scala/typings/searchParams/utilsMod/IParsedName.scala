package typings.searchParams.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IParsedName extends js.Object {
  var hasBrackets: Boolean = js.native
  var name: String = js.native
}

object IParsedName {
  @scala.inline
  def apply(hasBrackets: Boolean, name: String): IParsedName = {
    val __obj = js.Dynamic.literal(hasBrackets = hasBrackets.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IParsedName]
  }
  @scala.inline
  implicit class IParsedNameOps[Self <: IParsedName] (val x: Self) extends AnyVal {
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
    def setHasBrackets(value: Boolean): Self = this.set("hasBrackets", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}


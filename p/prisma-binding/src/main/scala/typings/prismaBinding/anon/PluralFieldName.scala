package typings.prismaBinding.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluralFieldName extends js.Object {
  var pluralFieldName: js.Any = js.native
  var `type`: js.Any = js.native
  var where: String = js.native
}

object PluralFieldName {
  @scala.inline
  def apply(pluralFieldName: js.Any, `type`: js.Any, where: String): PluralFieldName = {
    val __obj = js.Dynamic.literal(pluralFieldName = pluralFieldName.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralFieldName]
  }
  @scala.inline
  implicit class PluralFieldNameOps[Self <: PluralFieldName] (val x: Self) extends AnyVal {
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
    def setPluralFieldName(value: js.Any): Self = this.set("pluralFieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhere(value: String): Self = this.set("where", value.asInstanceOf[js.Any])
  }
  
}


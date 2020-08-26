package typings.storybookAddonInfo.mod

import typings.storybookAddonInfo.anon.DefaultValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableComponentOptionProps extends js.Object {
  var propDefinitions: js.Array[DefaultValue] = js.native
}

object TableComponentOptionProps {
  @scala.inline
  def apply(propDefinitions: js.Array[DefaultValue]): TableComponentOptionProps = {
    val __obj = js.Dynamic.literal(propDefinitions = propDefinitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableComponentOptionProps]
  }
  @scala.inline
  implicit class TableComponentOptionPropsOps[Self <: TableComponentOptionProps] (val x: Self) extends AnyVal {
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
    def setPropDefinitionsVarargs(value: DefaultValue*): Self = this.set("propDefinitions", js.Array(value :_*))
    @scala.inline
    def setPropDefinitions(value: js.Array[DefaultValue]): Self = this.set("propDefinitions", value.asInstanceOf[js.Any])
  }
  
}


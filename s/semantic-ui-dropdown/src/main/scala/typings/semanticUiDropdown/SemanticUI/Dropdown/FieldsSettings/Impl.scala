package typings.semanticUiDropdown.SemanticUI.Dropdown.FieldsSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * displayed dropdown text
    *
    * @default 'name'
    */
  var name: String = js.native
  /**
    * grouping for api results
    *
    * @default 'results'
    */
  var remoteValues: String = js.native
  /**
    * actual dropdown value
    *
    * @default 'value'
    */
  var value: String = js.native
  /**
    * grouping for all dropdown values
    *
    * @default 'values'
    */
  var values: String = js.native
}

object Impl {
  @scala.inline
  def apply(name: String, remoteValues: String, value: String, values: String): Impl = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], remoteValues = remoteValues.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteValues(value: String): Self = this.set("remoteValues", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setValues(value: String): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}


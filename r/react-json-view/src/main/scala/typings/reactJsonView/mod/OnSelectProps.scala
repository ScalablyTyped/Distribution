package typings.reactJsonView.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnSelectProps extends js.Object {
  /**
    * The name of the currently selected entry.
    */
  var name: String | Null = js.native
  /**
    * List of keys representing the scopes above the selected entry.
    */
  var namespace: js.Array[String | Null] = js.native
  /**
    * The type of the value. For "number" type, it will be replaced with the more
    * accurate types: "float", "integer", or "nan".
    */
  var `type`: String = js.native
  /**
    * The value of the currently selected entry.
    */
  var value: js.Object | String | Double | Boolean | Null = js.native
}

object OnSelectProps {
  @scala.inline
  def apply(namespace: js.Array[String | Null], `type`: String): OnSelectProps = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSelectProps]
  }
  @scala.inline
  implicit class OnSelectPropsOps[Self <: OnSelectProps] (val x: Self) extends AnyVal {
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
    def setNamespaceVarargs(value: (String | Null)*): Self = this.set("namespace", js.Array(value :_*))
    @scala.inline
    def setNamespace(value: js.Array[String | Null]): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    @scala.inline
    def setValue(value: js.Object | String | Double | Boolean): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}


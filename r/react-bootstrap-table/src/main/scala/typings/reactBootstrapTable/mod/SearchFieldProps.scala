package typings.reactBootstrapTable.mod

import typings.react.mod.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchFieldProps extends js.Object {
  /**
    * Custom css class name
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Default value for the search field
    */
  var defaultValue: js.UndefOr[String] = js.native
  /**
    * callback funciton to call when a key is released
    */
  var onKeyUp: js.UndefOr[js.Function1[/* e */ KeyboardEvent[_], Unit]] = js.native
  /**
    * Placeholder text for the search field
    */
  var placeholder: js.UndefOr[String] = js.native
}

object SearchFieldProps {
  @scala.inline
  def apply(): SearchFieldProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchFieldProps]
  }
  @scala.inline
  implicit class SearchFieldPropsOps[Self <: SearchFieldProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setOnKeyUp(value: /* e */ KeyboardEvent[_] => Unit): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
  }
  
}


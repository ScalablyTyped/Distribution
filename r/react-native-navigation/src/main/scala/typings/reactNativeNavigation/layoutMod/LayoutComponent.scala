package typings.reactNativeNavigation.layoutMod

import typings.reactNativeNavigation.optionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutComponent[P] extends js.Object {
  /**
    * Component reference id, Auto generated if empty
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Name of your component
    */
  var name: String | Double = js.native
  /**
    * Styling options
    */
  var options: js.UndefOr[Options] = js.native
  /**
    * Properties to pass down to the component
    */
  var passProps: js.UndefOr[P] = js.native
}

object LayoutComponent {
  @scala.inline
  def apply[P](name: String | Double): LayoutComponent[P] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutComponent[P]]
  }
  @scala.inline
  implicit class LayoutComponentOps[Self <: LayoutComponent[_], P] (val x: Self with LayoutComponent[P]) extends AnyVal {
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
    def setName(value: String | Double): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPassProps(value: P): Self = this.set("passProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassProps: Self = this.set("passProps", js.undefined)
  }
  
}


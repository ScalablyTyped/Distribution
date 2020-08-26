package typings.reactNativeNavigation.anon

import typings.reactNativeNavigation.reactNativeNavigationStrings.center
import typings.reactNativeNavigation.reactNativeNavigationStrings.fill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alignment extends js.Object {
  /**
    * Set component alignment
    */
  var alignment: js.UndefOr[center | fill] = js.native
  /**
    * Component reference id, Auto generated if empty
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Name of your component
    */
  var name: String = js.native
  /**
    * Properties to pass down to the component
    */
  var passProps: js.UndefOr[js.Object] = js.native
}

object Alignment {
  @scala.inline
  def apply(name: String): Alignment = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alignment]
  }
  @scala.inline
  implicit class AlignmentOps[Self <: Alignment] (val x: Self) extends AnyVal {
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
    def setAlignment(value: center | fill): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setPassProps(value: js.Object): Self = this.set("passProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassProps: Self = this.set("passProps", js.undefined)
  }
  
}


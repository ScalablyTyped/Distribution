package typings.reactNativeElements.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchBarDefault extends SearchBarBase {
  /**
    * Change theme to light theme
    *
    * @default false
    */
  var lightTheme: js.UndefOr[Boolean] = js.native
  /**
    * Change TextInput styling to rounded corners
    *
    * @default false
    */
  var round: js.UndefOr[Boolean] = js.native
}

object SearchBarDefault {
  @scala.inline
  def apply(): SearchBarDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBarDefault]
  }
  @scala.inline
  implicit class SearchBarDefaultOps[Self <: SearchBarDefault] (val x: Self) extends AnyVal {
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
    def setLightTheme(value: Boolean): Self = this.set("lightTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLightTheme: Self = this.set("lightTheme", js.undefined)
    @scala.inline
    def setRound(value: Boolean): Self = this.set("round", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
  }
  
}


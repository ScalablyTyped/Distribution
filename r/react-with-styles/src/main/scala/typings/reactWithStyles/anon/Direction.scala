package typings.reactWithStyles.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Direction extends js.Object {
  var direction: js.UndefOr[js.Any] = js.native
  var stylesInterface: js.Any = js.native
  var stylesTheme: js.Any = js.native
}

object Direction {
  @scala.inline
  def apply(stylesInterface: js.Any, stylesTheme: js.Any): Direction = {
    val __obj = js.Dynamic.literal(stylesInterface = stylesInterface.asInstanceOf[js.Any], stylesTheme = stylesTheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
  @scala.inline
  implicit class DirectionOps[Self <: Direction] (val x: Self) extends AnyVal {
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
    def setStylesInterface(value: js.Any): Self = this.set("stylesInterface", value.asInstanceOf[js.Any])
    @scala.inline
    def setStylesTheme(value: js.Any): Self = this.set("stylesTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(value: js.Any): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
  }
  
}


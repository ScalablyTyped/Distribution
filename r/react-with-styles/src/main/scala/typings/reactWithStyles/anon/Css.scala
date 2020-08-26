package typings.reactWithStyles.anon

import typings.reactWithStyles.mod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Css[TStyles /* <: Styles */] extends js.Object {
  var css: js.Function = js.native
  var styles: TStyles = js.native
}

object Css {
  @scala.inline
  def apply[/* <: typings.reactWithStyles.mod.Styles */ TStyles](css: js.Function, styles: TStyles): Css[TStyles] = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Css[TStyles]]
  }
  @scala.inline
  implicit class CssOps[Self <: Css[_], /* <: typings.reactWithStyles.mod.Styles */ TStyles] (val x: Self with Css[TStyles]) extends AnyVal {
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
    def setCss(value: js.Function): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyles(value: TStyles): Self = this.set("styles", value.asInstanceOf[js.Any])
  }
  
}


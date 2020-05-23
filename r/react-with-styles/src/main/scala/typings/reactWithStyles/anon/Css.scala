package typings.reactWithStyles.anon

import typings.reactWithStyles.mod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Css[TStyles /* <: Styles */] extends js.Object {
  var css: js.Function
  var styles: TStyles
}

object Css {
  @scala.inline
  def apply[TStyles](css: js.Function, styles: TStyles): Css[TStyles] = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Css[TStyles]]
  }
}


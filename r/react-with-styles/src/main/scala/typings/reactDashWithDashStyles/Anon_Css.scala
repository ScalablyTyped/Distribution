package typings.reactDashWithDashStyles

import typings.reactDashWithDashStyles.reactDashWithDashStylesMod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Css[TStyles /* <: Styles */] extends js.Object {
  var css: js.Function
  var styles: TStyles
}

object Anon_Css {
  @scala.inline
  def apply[TStyles /* <: Styles */](css: js.Function, styles: TStyles): Anon_Css[TStyles] = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Css[TStyles]]
  }
}


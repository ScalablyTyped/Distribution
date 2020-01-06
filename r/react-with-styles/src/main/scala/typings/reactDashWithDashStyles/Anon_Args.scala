package typings.reactDashWithDashStyles

import typings.reactDashWithDashStyles.reactDashWithDashStylesMod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args[TStyles /* <: Styles */] extends js.Object {
  def stylesFn(args: js.Any*): TStyles
}

object Anon_Args {
  @scala.inline
  def apply[TStyles /* <: Styles */](stylesFn: /* repeated */ js.Any => TStyles): Anon_Args[TStyles] = {
    val __obj = js.Dynamic.literal(stylesFn = js.Any.fromFunction1(stylesFn))
  
    __obj.asInstanceOf[Anon_Args[TStyles]]
  }
}


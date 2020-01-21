package typings.reactWithStyles

import typings.reactWithStyles.mod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgs[TStyles /* <: Styles */] extends js.Object {
  def stylesFn(args: js.Any*): TStyles
}

object AnonArgs {
  @scala.inline
  def apply[TStyles /* <: Styles */](stylesFn: /* repeated */ js.Any => TStyles): AnonArgs[TStyles] = {
    val __obj = js.Dynamic.literal(stylesFn = js.Any.fromFunction1(stylesFn))
  
    __obj.asInstanceOf[AnonArgs[TStyles]]
  }
}


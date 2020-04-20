package typings.reactWithStyles

import typings.reactWithStyles.mod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStylesFn[TStyles /* <: Styles */] extends js.Object {
  def stylesFn(args: js.Any*): TStyles
}

object AnonStylesFn {
  @scala.inline
  def apply[TStyles /* <: Styles */](stylesFn: /* repeated */ js.Any => TStyles): AnonStylesFn[TStyles] = {
    val __obj = js.Dynamic.literal(stylesFn = js.Any.fromFunction1(stylesFn))
    __obj.asInstanceOf[AnonStylesFn[TStyles]]
  }
}


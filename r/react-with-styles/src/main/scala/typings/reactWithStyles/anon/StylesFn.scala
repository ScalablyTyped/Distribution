package typings.reactWithStyles.anon

import typings.reactWithStyles.mod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StylesFn[TStyles /* <: Styles */] extends js.Object {
  def stylesFn(args: js.Any*): TStyles
}

object StylesFn {
  @scala.inline
  def apply[/* <: typings.reactWithStyles.mod.Styles */ TStyles](stylesFn: /* repeated */ js.Any => TStyles): StylesFn[TStyles] = {
    val __obj = js.Dynamic.literal(stylesFn = js.Any.fromFunction1(stylesFn))
    __obj.asInstanceOf[StylesFn[TStyles]]
  }
}


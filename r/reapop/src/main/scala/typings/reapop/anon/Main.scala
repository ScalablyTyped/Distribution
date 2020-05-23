package typings.reapop.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Main extends js.Object {
  var main: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[js.Function1[/* position */ String, String]] = js.undefined
}

object Main {
  @scala.inline
  def apply(main: String = null, position: /* position */ String => String = null): Main = {
    val __obj = js.Dynamic.literal()
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(js.Any.fromFunction1(position))
    __obj.asInstanceOf[Main]
  }
}


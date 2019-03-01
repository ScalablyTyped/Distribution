package typings
package reapopLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Main extends js.Object {
  var main: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[js.Function1[/* position */ java.lang.String, java.lang.String]] = js.undefined
}

object Anon_Main {
  @scala.inline
  def apply(
    main: java.lang.String = null,
    position: js.Function1[/* position */ java.lang.String, java.lang.String] = null
  ): Anon_Main = {
    val __obj = js.Dynamic.literal()
    if (main != null) __obj.updateDynamic("main")(main)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Anon_Main]
  }
}


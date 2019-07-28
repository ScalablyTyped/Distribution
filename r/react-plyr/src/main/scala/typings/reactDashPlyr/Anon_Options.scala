package typings.reactDashPlyr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options extends js.Object {
  var options: js.UndefOr[js.Array[Double]] = js.undefined
  var selected: js.UndefOr[Double] = js.undefined
}

object Anon_Options {
  @scala.inline
  def apply(options: js.Array[Double] = null, selected: Int | Double = null): Anon_Options = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options)
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Options]
  }
}


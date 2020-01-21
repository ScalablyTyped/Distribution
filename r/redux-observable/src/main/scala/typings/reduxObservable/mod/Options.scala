package typings.reduxObservable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[D] extends js.Object {
  var dependencies: js.UndefOr[D] = js.undefined
}

object Options {
  @scala.inline
  def apply[D](dependencies: D = null): Options[D] = {
    val __obj = js.Dynamic.literal()
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[D]]
  }
}


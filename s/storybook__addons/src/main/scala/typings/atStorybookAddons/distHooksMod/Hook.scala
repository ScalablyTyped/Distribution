package typings.atStorybookAddons.distHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hook extends js.Object {
  var deps: js.UndefOr[js.Array[_]] = js.undefined
  var memoizedState: js.UndefOr[js.Any] = js.undefined
  var name: String
}

object Hook {
  @scala.inline
  def apply(name: String, deps: js.Array[_] = null, memoizedState: js.Any = null): Hook = {
    val __obj = js.Dynamic.literal(name = name)
    if (deps != null) __obj.updateDynamic("deps")(deps)
    if (memoizedState != null) __obj.updateDynamic("memoizedState")(memoizedState)
    __obj.asInstanceOf[Hook]
  }
}


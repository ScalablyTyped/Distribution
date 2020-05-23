package typings.requirejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequireShim extends js.Object {
  /**
    * List of dependencies.
    **/
  var deps: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Name the module will be exported as.
    **/
  var exports: js.UndefOr[String] = js.undefined
  /**
    * Initialize function with all dependcies passed in,
    * if the function returns a value then that value is used
    * as the module export value instead of the object
    * found via the 'exports' string.
    * @param dependencies
    * @return
    **/
  var init: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object RequireShim {
  @scala.inline
  def apply(deps: js.Array[String] = null, exports: String = null, init: /* repeated */ js.Any => _ = null): RequireShim = {
    val __obj = js.Dynamic.literal()
    if (deps != null) __obj.updateDynamic("deps")(deps.asInstanceOf[js.Any])
    if (exports != null) __obj.updateDynamic("exports")(exports.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    __obj.asInstanceOf[RequireShim]
  }
}


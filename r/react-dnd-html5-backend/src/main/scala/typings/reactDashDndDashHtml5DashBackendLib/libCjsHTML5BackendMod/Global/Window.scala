package typings
package reactDashDndDashHtml5DashBackendLib.libCjsHTML5BackendMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var __isReactDndBackendSetUp: js.UndefOr[scala.Boolean] = js.undefined
}

object Window {
  @scala.inline
  def apply(__isReactDndBackendSetUp: js.UndefOr[scala.Boolean] = js.undefined): Window = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(__isReactDndBackendSetUp)) __obj.updateDynamic("__isReactDndBackendSetUp")(__isReactDndBackendSetUp)
    __obj.asInstanceOf[Window]
  }
}


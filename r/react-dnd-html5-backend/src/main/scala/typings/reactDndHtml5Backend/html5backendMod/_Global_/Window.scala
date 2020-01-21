package typings.reactDndHtml5Backend.html5backendMod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var __isReactDndBackendSetUp: js.UndefOr[Boolean] = js.undefined
}

object Window {
  @scala.inline
  def apply(__isReactDndBackendSetUp: js.UndefOr[Boolean] = js.undefined): Window = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(__isReactDndBackendSetUp)) __obj.updateDynamic("__isReactDndBackendSetUp")(__isReactDndBackendSetUp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}


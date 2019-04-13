package typings
package reactDashTestingDashLibraryLib.reactDashTestingDashLibraryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderOptions[Q /* <: Queries */] extends js.Object {
  var baseElement: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var container: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var hydrate: js.UndefOr[scala.Boolean] = js.undefined
  var queries: js.UndefOr[Q] = js.undefined
  var wrapper: js.UndefOr[reactLib.reactMod.ComponentType[js.Object]] = js.undefined
}

object RenderOptions {
  @scala.inline
  def apply[Q /* <: Queries */](
    baseElement: stdLib.HTMLElement = null,
    container: stdLib.HTMLElement = null,
    hydrate: js.UndefOr[scala.Boolean] = js.undefined,
    queries: Q = null,
    wrapper: reactLib.reactMod.ComponentType[js.Object] = null
  ): RenderOptions[Q] = {
    val __obj = js.Dynamic.literal()
    if (baseElement != null) __obj.updateDynamic("baseElement")(baseElement)
    if (container != null) __obj.updateDynamic("container")(container)
    if (!js.isUndefined(hydrate)) __obj.updateDynamic("hydrate")(hydrate)
    if (queries != null) __obj.updateDynamic("queries")(queries.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderOptions[Q]]
  }
}


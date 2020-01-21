package typings.reactOverlays.waitForContainerMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitForContainerProps extends js.Object {
  /**
    * "offsetParent" of the component
    */
  var container: js.UndefOr[ReactNode | js.Function] = js.undefined
  var onContainerResolved: js.UndefOr[js.Function] = js.undefined
}

object WaitForContainerProps {
  @scala.inline
  def apply(container: ReactNode | js.Function = null, onContainerResolved: js.Function = null): WaitForContainerProps = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (onContainerResolved != null) __obj.updateDynamic("onContainerResolved")(onContainerResolved.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitForContainerProps]
  }
}


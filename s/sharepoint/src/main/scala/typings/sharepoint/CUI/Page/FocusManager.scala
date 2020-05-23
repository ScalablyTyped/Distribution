package typings.sharepoint.CUI.Page

import typings.sharepoint.CUI.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusManager
  extends CommandDispatcher
     with ICommandHandler {
  def getFocusedComponents(): js.Array[Component]
  def releaseAllFoci(): Boolean
  def releaseFocusFromComponent(component: Component): js.Any
  def requestFocusForComponent(component: Component): js.Any
}

object FocusManager {
  @scala.inline
  def apply(
    canHandleCommand: String => Boolean,
    executeCommand: (String, js.Any) => js.Any,
    getFocusedComponents: () => js.Array[Component],
    handleCommand: (String, js.Any, Double) => Boolean,
    releaseAllFoci: () => Boolean,
    releaseFocusFromComponent: Component => js.Any,
    requestFocusForComponent: Component => js.Any
  ): FocusManager = {
    val __obj = js.Dynamic.literal(canHandleCommand = js.Any.fromFunction1(canHandleCommand), executeCommand = js.Any.fromFunction2(executeCommand), getFocusedComponents = js.Any.fromFunction0(getFocusedComponents), handleCommand = js.Any.fromFunction3(handleCommand), releaseAllFoci = js.Any.fromFunction0(releaseAllFoci), releaseFocusFromComponent = js.Any.fromFunction1(releaseFocusFromComponent), requestFocusForComponent = js.Any.fromFunction1(requestFocusForComponent))
    __obj.asInstanceOf[FocusManager]
  }
}


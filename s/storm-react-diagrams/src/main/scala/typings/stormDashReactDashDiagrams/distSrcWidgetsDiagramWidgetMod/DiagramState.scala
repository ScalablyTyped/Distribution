package typings.stormDashReactDashDiagrams.distSrcWidgetsDiagramWidgetMod

import typings.stormDashReactDashDiagrams.distSrcActionsBaseActionMod.BaseAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramState extends js.Object {
  var action: BaseAction | Null
  var diagramEngineListener: js.Any
  var document: js.Any
  var renderedNodes: Boolean
  var wasMoved: Boolean
  var windowListener: js.Any
}

object DiagramState {
  @scala.inline
  def apply(
    diagramEngineListener: js.Any,
    document: js.Any,
    renderedNodes: Boolean,
    wasMoved: Boolean,
    windowListener: js.Any,
    action: BaseAction = null
  ): DiagramState = {
    val __obj = js.Dynamic.literal(diagramEngineListener = diagramEngineListener, document = document, renderedNodes = renderedNodes, wasMoved = wasMoved, windowListener = windowListener)
    if (action != null) __obj.updateDynamic("action")(action)
    __obj.asInstanceOf[DiagramState]
  }
}


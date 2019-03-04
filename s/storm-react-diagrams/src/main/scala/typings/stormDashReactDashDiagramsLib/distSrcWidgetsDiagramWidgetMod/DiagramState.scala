package typings
package stormDashReactDashDiagramsLib.distSrcWidgetsDiagramWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramState extends js.Object {
  var action: stormDashReactDashDiagramsLib.distSrcActionsBaseActionMod.BaseAction | scala.Null
  var diagramEngineListener: js.Any
  var document: js.Any
  var renderedNodes: scala.Boolean
  var wasMoved: scala.Boolean
  var windowListener: js.Any
}

object DiagramState {
  @scala.inline
  def apply(
    diagramEngineListener: js.Any,
    document: js.Any,
    renderedNodes: scala.Boolean,
    wasMoved: scala.Boolean,
    windowListener: js.Any,
    action: stormDashReactDashDiagramsLib.distSrcActionsBaseActionMod.BaseAction = null
  ): DiagramState = {
    val __obj = js.Dynamic.literal(diagramEngineListener = diagramEngineListener, document = document, renderedNodes = renderedNodes, wasMoved = wasMoved, windowListener = windowListener)
    if (action != null) __obj.updateDynamic("action")(action)
    __obj.asInstanceOf[DiagramState]
  }
}


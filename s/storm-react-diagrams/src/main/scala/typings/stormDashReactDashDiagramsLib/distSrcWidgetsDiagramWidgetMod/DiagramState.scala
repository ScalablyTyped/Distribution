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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("diagramEngineListener")(diagramEngineListener)
    __obj.updateDynamic("document")(document)
    __obj.updateDynamic("renderedNodes")(renderedNodes)
    __obj.updateDynamic("wasMoved")(wasMoved)
    __obj.updateDynamic("windowListener")(windowListener)
    if (action != null) __obj.updateDynamic("action")(action)
    __obj.asInstanceOf[DiagramState]
  }
}


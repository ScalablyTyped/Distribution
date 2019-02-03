package typings
package stormDashReactDashDiagramsLib.distSrcDefaultsWidgetsDefaultLinkWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/defaults/widgets/DefaultLinkWidget", "DefaultLinkWidget")
@js.native
class DefaultLinkWidget protected ()
  extends stormDashReactDashDiagramsLib.distSrcWidgetsBaseWidgetMod.BaseWidget[DefaultLinkProps, DefaultLinkState] {
  def this(props: DefaultLinkProps) = this()
  var pathFinding: stormDashReactDashDiagramsLib.distSrcRoutingPathFindingMod.default = js.native
  var refLabels: org.scalablytyped.runtime.StringDictionary[reactLib.HTMLElement] = js.native
  var refPaths: js.Array[reactLib.SVGPathElement] = js.native
  def addPointToLink(event: reactLib.MouseEvent, index: scala.Double): scala.Unit = js.native
  def calculateAllLabelPosition(): scala.Unit = js.native
  def calculateLabelPosition(label: js.Any, index: scala.Double): scala.Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MDefaultLinkWidget(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDefaultLinkWidget(): scala.Unit = js.native
  def findPathAndRelativePositionToRenderLabel(index: scala.Double): stormDashReactDashDiagramsLib.Anon_Path = js.native
  def generateLabel(label: stormDashReactDashDiagramsLib.distSrcModelsLabelModelMod.LabelModel): reactLib.reactMod.Global.JSXNs.Element = js.native
  def generateLink(path: java.lang.String, extraProps: js.Any, id: java.lang.String): reactLib.reactMod.Global.JSXNs.Element = js.native
  def generateLink(path: java.lang.String, extraProps: js.Any, id: scala.Double): reactLib.reactMod.Global.JSXNs.Element = js.native
  def generatePoint(pointIndex: scala.Double): reactLib.reactMod.Global.JSXNs.Element = js.native
  /**
    * Smart routing is only applicable when all conditions below are true:
    * - smart routing is set to true on the engine
    * - current link is between two nodes (not between a node and an empty point)
    * - no custom points exist along the line
    */
  def isSmartRoutingApplicable(): scala.Boolean = js.native
}

/* static members */
@JSImport("storm-react-diagrams/dist/src/defaults/widgets/DefaultLinkWidget", "DefaultLinkWidget")
@js.native
object DefaultLinkWidget extends js.Object {
  var defaultProps: stormDashReactDashDiagramsLib.distSrcDefaultsWidgetsDefaultLinkWidgetMod.DefaultLinkProps = js.native
}


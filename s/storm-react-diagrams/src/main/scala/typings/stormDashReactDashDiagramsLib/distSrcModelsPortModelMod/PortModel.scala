package typings
package stormDashReactDashDiagramsLib.distSrcModelsPortModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/models/PortModel", "PortModel")
@js.native
class PortModel protected ()
  extends stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModel[
      stormDashReactDashDiagramsLib.distSrcModelsNodeModelMod.NodeModel, 
      stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModelListener
    ] {
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, `type`: java.lang.String) = this()
  def this(name: java.lang.String, `type`: java.lang.String, id: java.lang.String) = this()
  def this(name: java.lang.String, `type`: java.lang.String, id: java.lang.String, maximumLinks: scala.Double) = this()
  var height: scala.Double = js.native
  var links: ScalablyTyped.runtime.StringDictionary[
    stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModel[stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModelListener]
  ] = js.native
  var maximumLinks: scala.Double = js.native
  var name: java.lang.String = js.native
  var width: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  def addLink(
    link: stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModel[stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModelListener]
  ): scala.Unit = js.native
  def canLinkToPort(port: PortModel): scala.Boolean = js.native
  def createLinkModel(): stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModel[stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModelListener] | scala.Null = js.native
  def doClone(lookupTable: js.Object, clone: js.Any): scala.Unit = js.native
  def getLinks(): ScalablyTyped.runtime.StringDictionary[
    stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModel[stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModelListener]
  ] = js.native
  def getMaximumLinks(): scala.Double = js.native
  def getName(): java.lang.String = js.native
  def getNode(): stormDashReactDashDiagramsLib.distSrcModelsNodeModelMod.NodeModel = js.native
  def removeLink(
    link: stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModel[stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModelListener]
  ): scala.Unit = js.native
  def setMaximumLinks(maximumLinks: scala.Double): scala.Unit = js.native
  def updateCoords(hasXYWidthHeight: stormDashReactDashDiagramsLib.Anon_YX): scala.Unit = js.native
}


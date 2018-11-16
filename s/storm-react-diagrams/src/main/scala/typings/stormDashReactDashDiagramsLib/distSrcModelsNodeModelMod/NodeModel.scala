package typings
package stormDashReactDashDiagramsLib.distSrcModelsNodeModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/models/NodeModel", "NodeModel")
@js.native
class NodeModel ()
  extends stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModel[
      stormDashReactDashDiagramsLib.distSrcModelsDiagramModelMod.DiagramModel, 
      stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModelListener
    ] {
  def this(nodeType: java.lang.String) = this()
  def this(nodeType: java.lang.String, id: java.lang.String) = this()
  var extras: js.Any = js.native
  var height: scala.Double = js.native
  var ports: ScalablyTyped.runtime.StringDictionary[stormDashReactDashDiagramsLib.distSrcModelsPortModelMod.PortModel] = js.native
  var width: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  def addPort[T /* <: stormDashReactDashDiagramsLib.distSrcModelsPortModelMod.PortModel */](port: T): T = js.native
  def doClone(lookupTable: js.Object, clone: js.Any): scala.Unit = js.native
  def getPort(name: java.lang.String): stormDashReactDashDiagramsLib.distSrcModelsPortModelMod.PortModel | scala.Null = js.native
  def getPortFromID(id: js.Any): stormDashReactDashDiagramsLib.distSrcModelsPortModelMod.PortModel | scala.Null = js.native
  def getPorts(): ScalablyTyped.runtime.StringDictionary[stormDashReactDashDiagramsLib.distSrcModelsPortModelMod.PortModel] = js.native
  def removePort(port: stormDashReactDashDiagramsLib.distSrcModelsPortModelMod.PortModel): scala.Unit = js.native
  def setPosition(x: js.Any, y: js.Any): scala.Unit = js.native
  def updateDimensions(hasWidthHeight: stormDashReactDashDiagramsLib.Anon_Height): scala.Unit = js.native
}


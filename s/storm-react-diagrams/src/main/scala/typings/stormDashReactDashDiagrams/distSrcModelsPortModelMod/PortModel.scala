package typings.stormDashReactDashDiagrams.distSrcModelsPortModelMod

import org.scalablytyped.runtime.StringDictionary
import typings.stormDashReactDashDiagrams.Anon_Height
import typings.stormDashReactDashDiagrams.distSrcModelsBaseModelMod.BaseModel
import typings.stormDashReactDashDiagrams.distSrcModelsBaseModelMod.BaseModelListener
import typings.stormDashReactDashDiagrams.distSrcModelsLinkModelMod.LinkModel
import typings.stormDashReactDashDiagrams.distSrcModelsLinkModelMod.LinkModelListener
import typings.stormDashReactDashDiagrams.distSrcModelsNodeModelMod.NodeModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/models/PortModel", "PortModel")
@js.native
class PortModel protected () extends BaseModel[NodeModel, BaseModelListener] {
  def this(name: String) = this()
  def this(name: String, `type`: String) = this()
  def this(name: String, `type`: String, id: String) = this()
  def this(name: String, `type`: String, id: String, maximumLinks: Double) = this()
  var height: Double = js.native
  var links: StringDictionary[LinkModel[LinkModelListener]] = js.native
  var maximumLinks: Double = js.native
  var name: String = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def addLink(link: LinkModel[LinkModelListener]): Unit = js.native
  def canLinkToPort(port: PortModel): Boolean = js.native
  def createLinkModel(): LinkModel[LinkModelListener] | Null = js.native
  def doClone(lookupTable: js.Object, clone: js.Any): Unit = js.native
  def getLinks(): StringDictionary[LinkModel[LinkModelListener]] = js.native
  def getMaximumLinks(): Double = js.native
  def getName(): String = js.native
  def getNode(): NodeModel = js.native
  def removeLink(link: LinkModel[LinkModelListener]): Unit = js.native
  def setMaximumLinks(maximumLinks: Double): Unit = js.native
  def updateCoords(hasXYWidthHeight: Anon_Height): Unit = js.native
}


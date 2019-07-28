package typings.stormDashReactDashDiagrams.distSrcDefaultsModelsDefaultNodeModelMod

import org.scalablytyped.runtime.StringDictionary
import typings.stormDashReactDashDiagrams.distSrcDefaultsModelsDefaultPortModelMod.DefaultPortModel
import typings.stormDashReactDashDiagrams.distSrcModelsNodeModelMod.NodeModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/defaults/models/DefaultNodeModel", "DefaultNodeModel")
@js.native
class DefaultNodeModel () extends NodeModel {
  def this(name: String) = this()
  def this(name: String, color: String) = this()
  var color: String = js.native
  var name: String = js.native
  @JSName("ports")
  var ports_DefaultNodeModel: StringDictionary[DefaultPortModel] = js.native
  def addInPort(label: String): DefaultPortModel = js.native
  def addOutPort(label: String): DefaultPortModel = js.native
  def getInPorts(): js.Array[DefaultPortModel] = js.native
  def getOutPorts(): js.Array[DefaultPortModel] = js.native
}


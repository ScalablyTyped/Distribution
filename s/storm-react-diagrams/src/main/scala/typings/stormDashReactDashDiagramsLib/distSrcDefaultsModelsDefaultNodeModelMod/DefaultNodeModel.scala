package typings
package stormDashReactDashDiagramsLib.distSrcDefaultsModelsDefaultNodeModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/defaults/models/DefaultNodeModel", "DefaultNodeModel")
@js.native
class DefaultNodeModel ()
  extends stormDashReactDashDiagramsLib.distSrcModelsNodeModelMod.NodeModel {
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, color: java.lang.String) = this()
  var color: java.lang.String = js.native
  var name: java.lang.String = js.native
  @JSName("ports")
  var ports_DefaultNodeModel: org.scalablytyped.runtime.StringDictionary[
    stormDashReactDashDiagramsLib.distSrcDefaultsModelsDefaultPortModelMod.DefaultPortModel
  ] = js.native
  def addInPort(label: java.lang.String): stormDashReactDashDiagramsLib.distSrcDefaultsModelsDefaultPortModelMod.DefaultPortModel = js.native
  def addOutPort(label: java.lang.String): stormDashReactDashDiagramsLib.distSrcDefaultsModelsDefaultPortModelMod.DefaultPortModel = js.native
  def getInPorts(): js.Array[
    stormDashReactDashDiagramsLib.distSrcDefaultsModelsDefaultPortModelMod.DefaultPortModel
  ] = js.native
  def getOutPorts(): js.Array[
    stormDashReactDashDiagramsLib.distSrcDefaultsModelsDefaultPortModelMod.DefaultPortModel
  ] = js.native
}


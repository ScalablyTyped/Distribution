package typings
package stormDashReactDashDiagramsLib.distSrcDefaultsModelsDefaultPortModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/defaults/models/DefaultPortModel", "DefaultPortModel")
@js.native
class DefaultPortModel protected ()
  extends stormDashReactDashDiagramsLib.distSrcModelsPortModelMod.PortModel {
  def this(isInput: scala.Boolean, name: java.lang.String) = this()
  def this(isInput: scala.Boolean, name: java.lang.String, label: java.lang.String) = this()
  def this(isInput: scala.Boolean, name: java.lang.String, label: java.lang.String, id: java.lang.String) = this()
  var in: scala.Boolean = js.native
  var label: java.lang.String = js.native
  @JSName("links")
  var links_DefaultPortModel: ScalablyTyped.runtime.StringDictionary[
    stormDashReactDashDiagramsLib.distSrcDefaultsModelsDefaultLinkModelMod.DefaultLinkModel
  ] = js.native
  def link(port: stormDashReactDashDiagramsLib.distSrcModelsPortModelMod.PortModel): stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModel[stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModelListener] = js.native
}


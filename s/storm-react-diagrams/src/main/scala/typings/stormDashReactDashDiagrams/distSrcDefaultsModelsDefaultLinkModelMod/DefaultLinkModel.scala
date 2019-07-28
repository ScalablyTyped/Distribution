package typings.stormDashReactDashDiagrams.distSrcDefaultsModelsDefaultLinkModelMod

import typings.stormDashReactDashDiagrams.distSrcModelsLinkModelMod.LinkModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/defaults/models/DefaultLinkModel", "DefaultLinkModel")
@js.native
class DefaultLinkModel () extends LinkModel[DefaultLinkModelListener] {
  def this(`type`: String) = this()
  var color: String = js.native
  var curvyness: Double = js.native
  var width: Double = js.native
  def addLabel(label: String): Unit = js.native
  def setColor(color: String): Unit = js.native
  def setWidth(width: Double): Unit = js.native
}


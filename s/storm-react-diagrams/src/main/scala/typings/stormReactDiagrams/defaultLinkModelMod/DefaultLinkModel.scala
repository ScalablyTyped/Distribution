package typings.stormReactDiagrams.defaultLinkModelMod

import typings.stormReactDiagrams.linkModelMod.LinkModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("storm-react-diagrams/dist/src/defaults/models/DefaultLinkModel", "DefaultLinkModel")
@js.native
class DefaultLinkModel () extends LinkModel[DefaultLinkModelListener] {
  def this(`type`: String) = this()
  
  def addLabel(label: String): Unit = js.native
  
  var color: String = js.native
  
  var curvyness: Double = js.native
  
  def setColor(color: String): Unit = js.native
  
  def setWidth(width: Double): Unit = js.native
  
  var width: Double = js.native
}

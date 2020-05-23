package typings.stormReactDiagrams

import typings.stormReactDiagrams.anon.X
import typings.stormReactDiagrams.baseModelMod.BaseModel
import typings.stormReactDiagrams.baseModelMod.BaseModelListener
import typings.stormReactDiagrams.linkModelMod.LinkModel
import typings.stormReactDiagrams.linkModelMod.LinkModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/models/PointModel", JSImport.Namespace)
@js.native
object pointModelMod extends js.Object {
  @js.native
  class PointModel protected () extends BaseModel[LinkModel[LinkModelListener], BaseModelListener] {
    def this(link: LinkModel[LinkModelListener], points: X) = this()
    var x: Double = js.native
    var y: Double = js.native
    def getLink(): LinkModel[LinkModelListener] = js.native
    def getX(): Double = js.native
    def getY(): Double = js.native
    def isConnectedToPort(): Boolean = js.native
    def updateLocation(points: X): Unit = js.native
  }
  
}


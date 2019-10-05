package typings.stormDashReactDashDiagrams

import typings.stormDashReactDashDiagrams.distSrcModelsBaseModelMod.BaseModel
import typings.stormDashReactDashDiagrams.distSrcModelsBaseModelMod.BaseModelListener
import typings.stormDashReactDashDiagrams.distSrcModelsLinkModelMod.LinkModel
import typings.stormDashReactDashDiagrams.distSrcModelsLinkModelMod.LinkModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/models/PointModel", JSImport.Namespace)
@js.native
object distSrcModelsPointModelMod extends js.Object {
  @js.native
  class PointModel protected () extends BaseModel[LinkModel[LinkModelListener], BaseModelListener] {
    def this(link: LinkModel[LinkModelListener], points: Anon_X) = this()
    var x: Double = js.native
    var y: Double = js.native
    def getLink(): LinkModel[LinkModelListener] = js.native
    def getX(): Double = js.native
    def getY(): Double = js.native
    def isConnectedToPort(): Boolean = js.native
    def updateLocation(points: Anon_X): Unit = js.native
  }
  
}


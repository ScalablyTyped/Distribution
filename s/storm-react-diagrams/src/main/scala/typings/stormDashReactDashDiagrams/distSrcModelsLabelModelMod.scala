package typings.stormDashReactDashDiagrams

import typings.stormDashReactDashDiagrams.distSrcModelsBaseModelMod.BaseModel
import typings.stormDashReactDashDiagrams.distSrcModelsBaseModelMod.BaseModelListener
import typings.stormDashReactDashDiagrams.distSrcModelsLinkModelMod.LinkModel
import typings.stormDashReactDashDiagrams.distSrcModelsLinkModelMod.LinkModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/models/LabelModel", JSImport.Namespace)
@js.native
object distSrcModelsLabelModelMod extends js.Object {
  @js.native
  class LabelModel () extends BaseModel[LinkModel[LinkModelListener], BaseModelListener] {
    def this(`type`: String) = this()
    def this(`type`: String, id: String) = this()
    var offsetX: Double = js.native
    var offsetY: Double = js.native
  }
  
}


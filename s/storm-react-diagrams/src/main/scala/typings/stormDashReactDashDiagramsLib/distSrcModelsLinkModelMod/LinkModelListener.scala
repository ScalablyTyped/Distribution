package typings
package stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkModelListener
  extends stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModelListener {
  var sourcePortChanged: js.UndefOr[
    js.Function1[
      /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[LinkModel[LinkModelListener]] with stormDashReactDashDiagramsLib.Anon_Port, 
      scala.Unit
    ]
  ] = js.undefined
  var targetPortChanged: js.UndefOr[
    js.Function1[
      /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[LinkModel[LinkModelListener]] with stormDashReactDashDiagramsLib.Anon_Port, 
      scala.Unit
    ]
  ] = js.undefined
}


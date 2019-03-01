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

object LinkModelListener {
  @scala.inline
  def apply(
    entityRemoved: js.Function1[
      /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[
        stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModel[
          stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEntity[stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseListener[_]], 
          stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModelListener
        ]
      ], 
      scala.Unit
    ] = null,
    lockChanged: js.Function1[
      /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[js.Any] with stormDashReactDashDiagramsLib.Anon_Locked, 
      scala.Unit
    ] = null,
    selectionChanged: js.Function1[
      /* event */ (stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[
        stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModel[
          stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEntity[stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseListener[_]], 
          stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModelListener
        ]
      ]) with stormDashReactDashDiagramsLib.Anon_IsSelected, 
      scala.Unit
    ] = null,
    sourcePortChanged: js.Function1[
      /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[LinkModel[LinkModelListener]] with stormDashReactDashDiagramsLib.Anon_Port, 
      scala.Unit
    ] = null,
    targetPortChanged: js.Function1[
      /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[LinkModel[LinkModelListener]] with stormDashReactDashDiagramsLib.Anon_Port, 
      scala.Unit
    ] = null
  ): LinkModelListener = {
    val __obj = js.Dynamic.literal()
    if (entityRemoved != null) __obj.updateDynamic("entityRemoved")(entityRemoved)
    if (lockChanged != null) __obj.updateDynamic("lockChanged")(lockChanged)
    if (selectionChanged != null) __obj.updateDynamic("selectionChanged")(selectionChanged)
    if (sourcePortChanged != null) __obj.updateDynamic("sourcePortChanged")(sourcePortChanged)
    if (targetPortChanged != null) __obj.updateDynamic("targetPortChanged")(targetPortChanged)
    __obj.asInstanceOf[LinkModelListener]
  }
}


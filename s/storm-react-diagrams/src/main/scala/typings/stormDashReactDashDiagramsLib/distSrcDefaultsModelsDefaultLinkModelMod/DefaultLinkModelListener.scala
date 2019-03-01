package typings
package stormDashReactDashDiagramsLib.distSrcDefaultsModelsDefaultLinkModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultLinkModelListener
  extends stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModelListener {
  var colorChanged: js.UndefOr[
    js.Function1[
      /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[DefaultLinkModel] with stormDashReactDashDiagramsLib.Anon_Color, 
      scala.Unit
    ]
  ] = js.undefined
  var widthChanged: js.UndefOr[
    js.Function1[
      /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[DefaultLinkModel] with stormDashReactDashDiagramsLib.Anon_0, 
      scala.Unit
    ]
  ] = js.undefined
}

object DefaultLinkModelListener {
  @scala.inline
  def apply(
    colorChanged: js.Function1[
      /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[DefaultLinkModel] with stormDashReactDashDiagramsLib.Anon_Color, 
      scala.Unit
    ] = null,
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
      /* event */ (stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[
        stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModel[stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModelListener]
      ]) with stormDashReactDashDiagramsLib.Anon_Port, 
      scala.Unit
    ] = null,
    targetPortChanged: js.Function1[
      /* event */ (stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[
        stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModel[stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModelListener]
      ]) with stormDashReactDashDiagramsLib.Anon_Port, 
      scala.Unit
    ] = null,
    widthChanged: js.Function1[
      /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[DefaultLinkModel] with stormDashReactDashDiagramsLib.Anon_0, 
      scala.Unit
    ] = null
  ): DefaultLinkModelListener = {
    val __obj = js.Dynamic.literal()
    if (colorChanged != null) __obj.updateDynamic("colorChanged")(colorChanged)
    if (entityRemoved != null) __obj.updateDynamic("entityRemoved")(entityRemoved)
    if (lockChanged != null) __obj.updateDynamic("lockChanged")(lockChanged)
    if (selectionChanged != null) __obj.updateDynamic("selectionChanged")(selectionChanged)
    if (sourcePortChanged != null) __obj.updateDynamic("sourcePortChanged")(sourcePortChanged)
    if (targetPortChanged != null) __obj.updateDynamic("targetPortChanged")(targetPortChanged)
    if (widthChanged != null) __obj.updateDynamic("widthChanged")(widthChanged)
    __obj.asInstanceOf[DefaultLinkModelListener]
  }
}


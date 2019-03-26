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
    colorChanged: /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[DefaultLinkModel] with stormDashReactDashDiagramsLib.Anon_Color => scala.Unit = null,
    entityRemoved: /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[
      stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModel[
        stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEntity[stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseListener[_]], 
        DefaultLinkModelListener
      ]
    ] => scala.Unit = null,
    lockChanged: /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[js.Any] with stormDashReactDashDiagramsLib.Anon_Locked => scala.Unit = null,
    selectionChanged: /* event */ (stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[
      stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModel[
        stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEntity[stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseListener[_]], 
        DefaultLinkModelListener
      ]
    ]) with stormDashReactDashDiagramsLib.Anon_IsSelected => scala.Unit = null,
    sourcePortChanged: /* event */ (stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[
      stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModel[DefaultLinkModelListener]
    ]) with stormDashReactDashDiagramsLib.Anon_Port => scala.Unit = null,
    targetPortChanged: /* event */ (stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[
      stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModel[DefaultLinkModelListener]
    ]) with stormDashReactDashDiagramsLib.Anon_Port => scala.Unit = null,
    widthChanged: /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[DefaultLinkModel] with stormDashReactDashDiagramsLib.Anon_0 => scala.Unit = null
  ): DefaultLinkModelListener = {
    val __obj = js.Dynamic.literal()
    if (colorChanged != null) __obj.updateDynamic("colorChanged")(js.Any.fromFunction1(colorChanged))
    if (entityRemoved != null) __obj.updateDynamic("entityRemoved")(js.Any.fromFunction1(entityRemoved))
    if (lockChanged != null) __obj.updateDynamic("lockChanged")(js.Any.fromFunction1(lockChanged))
    if (selectionChanged != null) __obj.updateDynamic("selectionChanged")(js.Any.fromFunction1(selectionChanged))
    if (sourcePortChanged != null) __obj.updateDynamic("sourcePortChanged")(js.Any.fromFunction1(sourcePortChanged))
    if (targetPortChanged != null) __obj.updateDynamic("targetPortChanged")(js.Any.fromFunction1(targetPortChanged))
    if (widthChanged != null) __obj.updateDynamic("widthChanged")(js.Any.fromFunction1(widthChanged))
    __obj.asInstanceOf[DefaultLinkModelListener]
  }
}


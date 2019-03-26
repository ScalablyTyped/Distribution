package typings
package stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkModelListener
  extends stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModelListener {
  var sourcePortChanged: js.UndefOr[
    js.Function1[
      /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[LinkModel[this.type]] with stormDashReactDashDiagramsLib.Anon_Port, 
      scala.Unit
    ]
  ] = js.undefined
  var targetPortChanged: js.UndefOr[
    js.Function1[
      /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[LinkModel[this.type]] with stormDashReactDashDiagramsLib.Anon_Port, 
      scala.Unit
    ]
  ] = js.undefined
}

object LinkModelListener {
  @scala.inline
  def apply(
    entityRemoved: /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[
      stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModel[
        stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEntity[stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseListener[_]], 
        LinkModelListener
      ]
    ] => scala.Unit = null,
    lockChanged: /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[js.Any] with stormDashReactDashDiagramsLib.Anon_Locked => scala.Unit = null,
    selectionChanged: /* event */ (stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[
      stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModel[
        stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEntity[stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseListener[_]], 
        LinkModelListener
      ]
    ]) with stormDashReactDashDiagramsLib.Anon_IsSelected => scala.Unit = null,
    sourcePortChanged: /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[LinkModel[LinkModelListener]] with stormDashReactDashDiagramsLib.Anon_Port => scala.Unit = null,
    targetPortChanged: /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[LinkModel[LinkModelListener]] with stormDashReactDashDiagramsLib.Anon_Port => scala.Unit = null
  ): LinkModelListener = {
    val __obj = js.Dynamic.literal()
    if (entityRemoved != null) __obj.updateDynamic("entityRemoved")(js.Any.fromFunction1(entityRemoved))
    if (lockChanged != null) __obj.updateDynamic("lockChanged")(js.Any.fromFunction1(lockChanged))
    if (selectionChanged != null) __obj.updateDynamic("selectionChanged")(js.Any.fromFunction1(selectionChanged))
    if (sourcePortChanged != null) __obj.updateDynamic("sourcePortChanged")(js.Any.fromFunction1(sourcePortChanged))
    if (targetPortChanged != null) __obj.updateDynamic("targetPortChanged")(js.Any.fromFunction1(targetPortChanged))
    __obj.asInstanceOf[LinkModelListener]
  }
}


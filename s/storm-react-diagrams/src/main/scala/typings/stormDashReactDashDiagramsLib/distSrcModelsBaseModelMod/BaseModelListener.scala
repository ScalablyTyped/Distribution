package typings
package stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseModelListener
  extends stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseListener[js.Any] {
  var entityRemoved: js.UndefOr[
    js.Function1[
      /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[
        BaseModel[
          stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEntity[stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseListener[_]], 
          this.type
        ]
      ], 
      scala.Unit
    ]
  ] = js.undefined
  var selectionChanged: js.UndefOr[
    js.Function1[
      /* event */ (stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[
        BaseModel[
          stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEntity[stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseListener[_]], 
          this.type
        ]
      ]) with stormDashReactDashDiagramsLib.Anon_IsSelected, 
      scala.Unit
    ]
  ] = js.undefined
}

object BaseModelListener {
  @scala.inline
  def apply(
    entityRemoved: /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[
      BaseModel[
        stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEntity[stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseListener[_]], 
        BaseModelListener
      ]
    ] => scala.Unit = null,
    lockChanged: /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[js.Any] with stormDashReactDashDiagramsLib.Anon_Locked => scala.Unit = null,
    selectionChanged: /* event */ (stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[
      BaseModel[
        stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEntity[stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseListener[_]], 
        BaseModelListener
      ]
    ]) with stormDashReactDashDiagramsLib.Anon_IsSelected => scala.Unit = null
  ): BaseModelListener = {
    val __obj = js.Dynamic.literal()
    if (entityRemoved != null) __obj.updateDynamic("entityRemoved")(js.Any.fromFunction1(entityRemoved))
    if (lockChanged != null) __obj.updateDynamic("lockChanged")(js.Any.fromFunction1(lockChanged))
    if (selectionChanged != null) __obj.updateDynamic("selectionChanged")(js.Any.fromFunction1(selectionChanged))
    __obj.asInstanceOf[BaseModelListener]
  }
}


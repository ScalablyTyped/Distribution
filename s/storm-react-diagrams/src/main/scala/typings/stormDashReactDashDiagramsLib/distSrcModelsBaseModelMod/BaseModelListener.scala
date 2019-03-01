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
          BaseModelListener
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
          BaseModelListener
        ]
      ]) with stormDashReactDashDiagramsLib.Anon_IsSelected, 
      scala.Unit
    ]
  ] = js.undefined
}

object BaseModelListener {
  @scala.inline
  def apply(
    entityRemoved: js.Function1[
      /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[
        BaseModel[
          stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEntity[stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseListener[_]], 
          BaseModelListener
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
        BaseModel[
          stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEntity[stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseListener[_]], 
          BaseModelListener
        ]
      ]) with stormDashReactDashDiagramsLib.Anon_IsSelected, 
      scala.Unit
    ] = null
  ): BaseModelListener = {
    val __obj = js.Dynamic.literal()
    if (entityRemoved != null) __obj.updateDynamic("entityRemoved")(entityRemoved)
    if (lockChanged != null) __obj.updateDynamic("lockChanged")(lockChanged)
    if (selectionChanged != null) __obj.updateDynamic("selectionChanged")(selectionChanged)
    __obj.asInstanceOf[BaseModelListener]
  }
}


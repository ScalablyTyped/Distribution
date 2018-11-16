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


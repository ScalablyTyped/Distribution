package typings.stormDashReactDashDiagrams.distSrcModelsBaseModelMod

import typings.stormDashReactDashDiagrams.Anon_IsSelected
import typings.stormDashReactDashDiagrams.Anon_Locked
import typings.stormDashReactDashDiagrams.distSrcBaseEntityMod.BaseEntity
import typings.stormDashReactDashDiagrams.distSrcBaseEntityMod.BaseEvent
import typings.stormDashReactDashDiagrams.distSrcBaseEntityMod.BaseListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseModelListener
  extends BaseListener[js.Any] {
  var entityRemoved: js.UndefOr[
    js.Function1[/* event */ BaseEvent[BaseModel[BaseEntity[BaseListener[_]], this.type]], Unit]
  ] = js.undefined
  var selectionChanged: js.UndefOr[
    js.Function1[
      /* event */ (BaseEvent[BaseModel[BaseEntity[BaseListener[_]], this.type]]) with Anon_IsSelected, 
      Unit
    ]
  ] = js.undefined
}

object BaseModelListener {
  @scala.inline
  def apply(
    entityRemoved: /* event */ BaseEvent[BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]] => Unit = null,
    lockChanged: /* event */ BaseEvent[js.Any] with Anon_Locked => Unit = null,
    selectionChanged: /* event */ (BaseEvent[BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]]) with Anon_IsSelected => Unit = null
  ): BaseModelListener = {
    val __obj = js.Dynamic.literal()
    if (entityRemoved != null) __obj.updateDynamic("entityRemoved")(js.Any.fromFunction1(entityRemoved))
    if (lockChanged != null) __obj.updateDynamic("lockChanged")(js.Any.fromFunction1(lockChanged))
    if (selectionChanged != null) __obj.updateDynamic("selectionChanged")(js.Any.fromFunction1(selectionChanged))
    __obj.asInstanceOf[BaseModelListener]
  }
}


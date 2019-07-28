package typings.stormDashReactDashDiagrams.distSrcModelsLinkModelMod

import typings.stormDashReactDashDiagrams.Anon_IsSelected
import typings.stormDashReactDashDiagrams.Anon_Locked
import typings.stormDashReactDashDiagrams.Anon_Port
import typings.stormDashReactDashDiagrams.distSrcBaseEntityMod.BaseEntity
import typings.stormDashReactDashDiagrams.distSrcBaseEntityMod.BaseEvent
import typings.stormDashReactDashDiagrams.distSrcBaseEntityMod.BaseListener
import typings.stormDashReactDashDiagrams.distSrcModelsBaseModelMod.BaseModel
import typings.stormDashReactDashDiagrams.distSrcModelsBaseModelMod.BaseModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkModelListener extends BaseModelListener {
  var sourcePortChanged: js.UndefOr[js.Function1[/* event */ BaseEvent[LinkModel[this.type]] with Anon_Port, Unit]] = js.undefined
  var targetPortChanged: js.UndefOr[js.Function1[/* event */ BaseEvent[LinkModel[this.type]] with Anon_Port, Unit]] = js.undefined
}

object LinkModelListener {
  @scala.inline
  def apply(
    entityRemoved: /* event */ BaseEvent[BaseModel[BaseEntity[BaseListener[_]], LinkModelListener]] => Unit = null,
    lockChanged: /* event */ BaseEvent[js.Any] with Anon_Locked => Unit = null,
    selectionChanged: /* event */ (BaseEvent[BaseModel[BaseEntity[BaseListener[_]], LinkModelListener]]) with Anon_IsSelected => Unit = null,
    sourcePortChanged: /* event */ BaseEvent[LinkModel[LinkModelListener]] with Anon_Port => Unit = null,
    targetPortChanged: /* event */ BaseEvent[LinkModel[LinkModelListener]] with Anon_Port => Unit = null
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


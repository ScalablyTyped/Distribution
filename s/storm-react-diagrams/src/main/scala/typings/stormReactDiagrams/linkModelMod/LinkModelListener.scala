package typings.stormReactDiagrams.linkModelMod

import typings.stormReactDiagrams.AnonLocked
import typings.stormReactDiagrams.BaseEventBaseModelBaseEnt
import typings.stormReactDiagrams.BaseEventLinkModelLinkMod
import typings.stormReactDiagrams.baseEntityMod.BaseEntity
import typings.stormReactDiagrams.baseEntityMod.BaseEvent
import typings.stormReactDiagrams.baseEntityMod.BaseListener
import typings.stormReactDiagrams.baseModelMod.BaseModel
import typings.stormReactDiagrams.baseModelMod.BaseModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkModelListener extends BaseModelListener {
  var sourcePortChanged: js.UndefOr[js.Function1[/* event */ BaseEventLinkModelLinkMod, Unit]] = js.undefined
  var targetPortChanged: js.UndefOr[js.Function1[/* event */ BaseEventLinkModelLinkMod, Unit]] = js.undefined
}

object LinkModelListener {
  @scala.inline
  def apply(
    entityRemoved: /* event */ BaseEvent[BaseModel[BaseEntity[BaseListener[_]], LinkModelListener]] => Unit = null,
    lockChanged: /* event */ BaseEvent[js.Any] with AnonLocked => Unit = null,
    selectionChanged: /* event */ BaseEventBaseModelBaseEnt => Unit = null,
    sourcePortChanged: /* event */ BaseEventLinkModelLinkMod => Unit = null,
    targetPortChanged: /* event */ BaseEventLinkModelLinkMod => Unit = null
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


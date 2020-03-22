package typings.stormReactDiagrams.baseModelMod

import typings.stormReactDiagrams.AnonLocked
import typings.stormReactDiagrams.BaseEventBaseModelBaseEnt
import typings.stormReactDiagrams.baseEntityMod.BaseEntity
import typings.stormReactDiagrams.baseEntityMod.BaseEvent
import typings.stormReactDiagrams.baseEntityMod.BaseListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseModelListener
  extends BaseListener[js.Any] {
  var entityRemoved: js.UndefOr[
    js.Function1[/* event */ BaseEvent[BaseModel[BaseEntity[BaseListener[_]], this.type]], Unit]
  ] = js.undefined
  var selectionChanged: js.UndefOr[js.Function1[/* event */ BaseEventBaseModelBaseEnt, Unit]] = js.undefined
}

object BaseModelListener {
  @scala.inline
  def apply(
    entityRemoved: /* event */ BaseEvent[BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]] => Unit = null,
    lockChanged: /* event */ BaseEvent[js.Any] with AnonLocked => Unit = null,
    selectionChanged: /* event */ BaseEventBaseModelBaseEnt => Unit = null
  ): BaseModelListener = {
    val __obj = js.Dynamic.literal()
    if (entityRemoved != null) __obj.updateDynamic("entityRemoved")(js.Any.fromFunction1(entityRemoved))
    if (lockChanged != null) __obj.updateDynamic("lockChanged")(js.Any.fromFunction1(lockChanged))
    if (selectionChanged != null) __obj.updateDynamic("selectionChanged")(js.Any.fromFunction1(selectionChanged))
    __obj.asInstanceOf[BaseModelListener]
  }
}


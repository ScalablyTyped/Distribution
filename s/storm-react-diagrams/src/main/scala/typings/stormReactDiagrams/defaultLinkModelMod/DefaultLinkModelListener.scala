package typings.stormReactDiagrams.defaultLinkModelMod

import typings.stormReactDiagrams.Anon0
import typings.stormReactDiagrams.AnonColor
import typings.stormReactDiagrams.AnonIsSelected
import typings.stormReactDiagrams.AnonLocked
import typings.stormReactDiagrams.AnonPort
import typings.stormReactDiagrams.baseEntityMod.BaseEntity
import typings.stormReactDiagrams.baseEntityMod.BaseEvent
import typings.stormReactDiagrams.baseEntityMod.BaseListener
import typings.stormReactDiagrams.baseModelMod.BaseModel
import typings.stormReactDiagrams.linkModelMod.LinkModel
import typings.stormReactDiagrams.linkModelMod.LinkModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultLinkModelListener extends LinkModelListener {
  var colorChanged: js.UndefOr[js.Function1[/* event */ BaseEvent[DefaultLinkModel] with AnonColor, Unit]] = js.undefined
  var widthChanged: js.UndefOr[js.Function1[/* event */ BaseEvent[DefaultLinkModel] with Anon0, Unit]] = js.undefined
}

object DefaultLinkModelListener {
  @scala.inline
  def apply(
    colorChanged: /* event */ BaseEvent[DefaultLinkModel] with AnonColor => Unit = null,
    entityRemoved: /* event */ BaseEvent[BaseModel[BaseEntity[BaseListener[_]], DefaultLinkModelListener]] => Unit = null,
    lockChanged: /* event */ BaseEvent[js.Any] with AnonLocked => Unit = null,
    selectionChanged: /* event */ (BaseEvent[BaseModel[BaseEntity[BaseListener[_]], DefaultLinkModelListener]]) with AnonIsSelected => Unit = null,
    sourcePortChanged: /* event */ BaseEvent[LinkModel[DefaultLinkModelListener]] with AnonPort => Unit = null,
    targetPortChanged: /* event */ BaseEvent[LinkModel[DefaultLinkModelListener]] with AnonPort => Unit = null,
    widthChanged: /* event */ BaseEvent[DefaultLinkModel] with Anon0 => Unit = null
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


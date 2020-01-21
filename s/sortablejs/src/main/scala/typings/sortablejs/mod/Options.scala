package typings.sortablejs.mod

import typings.sortablejs.AnonGet
import typings.sortablejs.AnonX
import typings.sortablejs.pluginsMod.AutoScrollOptions
import typings.sortablejs.pluginsMod.MultiDragOptions
import typings.sortablejs.pluginsMod.OnSpillOptions
import typings.sortablejs.pluginsMod.SwapOptions
import typings.sortablejs.sortablejsNumbers.`-1`
import typings.sortablejs.sortablejsNumbers.`1`
import typings.sortablejs.sortablejsStrings.continue
import typings.std.DataTransfer
import typings.std.Event_
import typings.std.HTMLElement
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends SortableOptions
     with AutoScrollOptions
     with MultiDragOptions
     with OnSpillOptions
     with SwapOptions

object Options {
  @scala.inline
  def apply(
    animation: Int | Double = null,
    bubbleScroll: js.UndefOr[Boolean] = js.undefined,
    chosenClass: String = null,
    dataIdAttr: String = null,
    delay: Int | Double = null,
    delayOnTouchOnly: js.UndefOr[Boolean] = js.undefined,
    direction: (js.Function3[/* evt */ SortableEvent, /* target */ HTMLElement, /* dragEl */ HTMLElement, Direction]) | Direction = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dragClass: String = null,
    draggable: String = null,
    dragoverBubble: js.UndefOr[Boolean] = js.undefined,
    dropBubble: js.UndefOr[Boolean] = js.undefined,
    easing: String = null,
    emptyInsertThreshold: Int | Double = null,
    fallbackClass: String = null,
    fallbackOffset: AnonX = null,
    fallbackOnBody: js.UndefOr[Boolean] = js.undefined,
    fallbackTolerance: Int | Double = null,
    filter: String | (js.ThisFunction3[
      /* this */ Sortable, 
      /* event */ Event_ | TouchEvent, 
      /* target */ HTMLElement, 
      /* sortable */ Sortable, 
      Boolean
    ]) = null,
    forceFallback: js.UndefOr[Boolean] = js.undefined,
    ghostClass: String = null,
    group: String | GroupOptions = null,
    handle: String = null,
    ignore: String = null,
    invertSwap: js.UndefOr[Boolean] = js.undefined,
    invertedSwapThreshold: Int | Double = null,
    multiDrag: js.UndefOr[Boolean] = js.undefined,
    multiDragKey: js.UndefOr[scala.Nothing] = js.undefined,
    onAdd: /* event */ SortableEvent => Unit = null,
    onChange: /* evt */ SortableEvent => Unit = null,
    onChoose: /* event */ SortableEvent => Unit = null,
    onClone: /* event */ SortableEvent => Unit = null,
    onDeselect: /* event */ SortableEvent => Unit = null,
    onEnd: /* event */ SortableEvent => Unit = null,
    onFilter: /* event */ SortableEvent => Unit = null,
    onMove: (/* evt */ MoveEvent, /* originalEvent */ Event_) => Boolean | `-1` | `1` = null,
    onRemove: /* event */ SortableEvent => Unit = null,
    onSelect: /* event */ SortableEvent => Unit = null,
    onSort: /* event */ SortableEvent => Unit = null,
    onSpill: /* evt */ SortableEvent => Unit = null,
    onStart: /* event */ SortableEvent => Unit = null,
    onUnchoose: /* event */ SortableEvent => Unit = null,
    onUpdate: /* event */ SortableEvent => Unit = null,
    preventOnFilter: js.UndefOr[Boolean] = js.undefined,
    removeCloneOnHide: js.UndefOr[Boolean] = js.undefined,
    removeOnSpill: js.UndefOr[Boolean] = js.undefined,
    revertOnSpill: js.UndefOr[Boolean] = js.undefined,
    scroll: Boolean | HTMLElement = null,
    scrollFn: js.ThisFunction5[
      /* this */ ^, 
      /* offsetX */ Double, 
      /* offsetY */ Double, 
      /* originalEvent */ Event_, 
      /* touchEvt */ TouchEvent, 
      /* hoverTargetEl */ HTMLElement, 
      continue | Unit
    ] = null,
    scrollSensitivity: Int | Double = null,
    scrollSpeed: Int | Double = null,
    selectedClass: String = null,
    setData: (/* dataTransfer */ DataTransfer, /* draggedElement */ HTMLElement) => Unit = null,
    sort: js.UndefOr[Boolean] = js.undefined,
    store: AnonGet = null,
    swap: js.UndefOr[Boolean] = js.undefined,
    swapClass: String = null,
    swapThreshold: Int | Double = null,
    touchStartThreshold: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbleScroll)) __obj.updateDynamic("bubbleScroll")(bubbleScroll.asInstanceOf[js.Any])
    if (chosenClass != null) __obj.updateDynamic("chosenClass")(chosenClass.asInstanceOf[js.Any])
    if (dataIdAttr != null) __obj.updateDynamic("dataIdAttr")(dataIdAttr.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(delayOnTouchOnly)) __obj.updateDynamic("delayOnTouchOnly")(delayOnTouchOnly.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (dragClass != null) __obj.updateDynamic("dragClass")(dragClass.asInstanceOf[js.Any])
    if (draggable != null) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (!js.isUndefined(dragoverBubble)) __obj.updateDynamic("dragoverBubble")(dragoverBubble.asInstanceOf[js.Any])
    if (!js.isUndefined(dropBubble)) __obj.updateDynamic("dropBubble")(dropBubble.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (emptyInsertThreshold != null) __obj.updateDynamic("emptyInsertThreshold")(emptyInsertThreshold.asInstanceOf[js.Any])
    if (fallbackClass != null) __obj.updateDynamic("fallbackClass")(fallbackClass.asInstanceOf[js.Any])
    if (fallbackOffset != null) __obj.updateDynamic("fallbackOffset")(fallbackOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(fallbackOnBody)) __obj.updateDynamic("fallbackOnBody")(fallbackOnBody.asInstanceOf[js.Any])
    if (fallbackTolerance != null) __obj.updateDynamic("fallbackTolerance")(fallbackTolerance.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(forceFallback)) __obj.updateDynamic("forceFallback")(forceFallback.asInstanceOf[js.Any])
    if (ghostClass != null) __obj.updateDynamic("ghostClass")(ghostClass.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(invertSwap)) __obj.updateDynamic("invertSwap")(invertSwap.asInstanceOf[js.Any])
    if (invertedSwapThreshold != null) __obj.updateDynamic("invertedSwapThreshold")(invertedSwapThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(multiDrag)) __obj.updateDynamic("multiDrag")(multiDrag.asInstanceOf[js.Any])
    if (!js.isUndefined(multiDragKey)) __obj.updateDynamic("multiDragKey")(multiDragKey.asInstanceOf[js.Any])
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction1(onAdd))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChoose != null) __obj.updateDynamic("onChoose")(js.Any.fromFunction1(onChoose))
    if (onClone != null) __obj.updateDynamic("onClone")(js.Any.fromFunction1(onClone))
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(js.Any.fromFunction1(onDeselect))
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction1(onEnd))
    if (onFilter != null) __obj.updateDynamic("onFilter")(js.Any.fromFunction1(onFilter))
    if (onMove != null) __obj.updateDynamic("onMove")(js.Any.fromFunction2(onMove))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1(onRemove))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onSort != null) __obj.updateDynamic("onSort")(js.Any.fromFunction1(onSort))
    if (onSpill != null) __obj.updateDynamic("onSpill")(js.Any.fromFunction1(onSpill))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction1(onStart))
    if (onUnchoose != null) __obj.updateDynamic("onUnchoose")(js.Any.fromFunction1(onUnchoose))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1(onUpdate))
    if (!js.isUndefined(preventOnFilter)) __obj.updateDynamic("preventOnFilter")(preventOnFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(removeCloneOnHide)) __obj.updateDynamic("removeCloneOnHide")(removeCloneOnHide.asInstanceOf[js.Any])
    if (!js.isUndefined(removeOnSpill)) __obj.updateDynamic("removeOnSpill")(removeOnSpill.asInstanceOf[js.Any])
    if (!js.isUndefined(revertOnSpill)) __obj.updateDynamic("revertOnSpill")(revertOnSpill.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (scrollFn != null) __obj.updateDynamic("scrollFn")(scrollFn.asInstanceOf[js.Any])
    if (scrollSensitivity != null) __obj.updateDynamic("scrollSensitivity")(scrollSensitivity.asInstanceOf[js.Any])
    if (scrollSpeed != null) __obj.updateDynamic("scrollSpeed")(scrollSpeed.asInstanceOf[js.Any])
    if (selectedClass != null) __obj.updateDynamic("selectedClass")(selectedClass.asInstanceOf[js.Any])
    if (setData != null) __obj.updateDynamic("setData")(js.Any.fromFunction2(setData))
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (!js.isUndefined(swap)) __obj.updateDynamic("swap")(swap.asInstanceOf[js.Any])
    if (swapClass != null) __obj.updateDynamic("swapClass")(swapClass.asInstanceOf[js.Any])
    if (swapThreshold != null) __obj.updateDynamic("swapThreshold")(swapThreshold.asInstanceOf[js.Any])
    if (touchStartThreshold != null) __obj.updateDynamic("touchStartThreshold")(touchStartThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


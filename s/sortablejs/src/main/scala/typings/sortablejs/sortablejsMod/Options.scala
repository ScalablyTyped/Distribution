package typings.sortablejs.sortablejsMod

import typings.sortablejs.Anon_Get
import typings.sortablejs.Anon_X
import typings.sortablejs.sortablejsNumbers.`-1`
import typings.sortablejs.sortablejsNumbers.`1`
import typings.sortablejs.sortablejsNumbers.`false`
import typings.std.DataTransfer
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * ms, animation speed moving items when sorting, `0` — without animation
    */
  var animation: js.UndefOr[Double] = js.undefined
  /**
    * Class name for the chosen item
    */
  var chosenClass: js.UndefOr[String] = js.undefined
  var dataIdAttr: js.UndefOr[String] = js.undefined
  /**
    * time in milliseconds to define when the sorting should start
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * Disables the sortable if set to true.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Class name for the dragging item
    */
  var dragClass: js.UndefOr[String] = js.undefined
  /**
    * Specifies which items inside the element should be draggable
    */
  var draggable: js.UndefOr[String] = js.undefined
  var dragoverBubble: js.UndefOr[Boolean] = js.undefined
  var dropBubble: js.UndefOr[Boolean] = js.undefined
  /**
    * Class name for the cloned DOM Element when using forceFallback
    */
  var fallbackClass: js.UndefOr[String] = js.undefined
  var fallbackOffset: js.UndefOr[Anon_X] = js.undefined
  /**
    * Appends the cloned DOM Element into the Document's Body
    */
  var fallbackOnBody: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify in pixels how far the mouse should move before it's considered as a drag.
    */
  var fallbackTolerance: js.UndefOr[Double] = js.undefined
  /**
    * Selectors that do not lead to dragging (String or Function)
    */
  var filter: js.UndefOr[
    String | (js.ThisFunction3[
      /* this */ Sortable, 
      /* event */ Event | TouchEvent, 
      /* target */ HTMLElement, 
      /* sortable */ Sortable, 
      Boolean
    ])
  ] = js.undefined
  /**
    * ignore the HTML5 DnD behaviour and force the fallback to kick in
    */
  var forceFallback: js.UndefOr[Boolean] = js.undefined
  /**
    * Class name for the drop placeholder
    */
  var ghostClass: js.UndefOr[String] = js.undefined
  /**
    * To drag elements from one list into another, both lists must have the same group value.
    * You can also define whether lists can give away, give and keep a copy (clone), and receive elements.
    */
  var group: js.UndefOr[String | GroupOptions] = js.undefined
  /**
    * Drag handle selector within list items
    */
  var handle: js.UndefOr[String] = js.undefined
  var ignore: js.UndefOr[String] = js.undefined
  /**
    * Element is dropped into the list from another list
    */
  var onAdd: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
  /**
    * Element is chosen
    */
  var onChoose: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
  /**
    * Created a clone of an element
    */
  var onClone: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
  /**
    * Element dragging ended
    */
  var onEnd: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
  /**
    * Attempt to drag a filtered element
    */
  var onFilter: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
  /**
    * Event when you move an item in the list or between lists
    * return false; for cancel
    * return -1; insert before target
    * return 1; insert after target
    */
  var onMove: js.UndefOr[
    js.Function2[/* event */ MoveEvent, /* originalEvent */ MouseEvent, `false` | `-1` | `1`]
  ] = js.undefined
  /**
    * Element is removed from the list into another list
    */
  var onRemove: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
  /**
    * Called by any change to the list (add / update / remove)
    */
  var onSort: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
  /**
    * Element dragging started
    */
  var onStart: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
  /**
    * Element is unchosen
    */
  var onUnchoose: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
  /**
    * Changed sorting within list
    */
  var onUpdate: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.undefined
  /**
    * Call `event.preventDefault()` when triggered `filter`
    */
  var preventOnFilter: js.UndefOr[Boolean] = js.undefined
  var scroll: js.UndefOr[Boolean] = js.undefined
  /**
    * if you have custom scrollbar scrollFn may be used for autoscrolling
    */
  var scrollFn: js.UndefOr[
    js.ThisFunction3[
      /* this */ Sortable, 
      /* offsetX */ Double, 
      /* offsetY */ Double, 
      /* event */ MouseEvent, 
      Unit
    ]
  ] = js.undefined
  /**
    * px, how near the mouse must be to an edge to start scrolling.
    */
  var scrollSensitivity: js.UndefOr[Double] = js.undefined
  /**
    * px
    */
  var scrollSpeed: js.UndefOr[Double] = js.undefined
  var setData: js.UndefOr[
    js.Function2[/* dataTransfer */ DataTransfer, /* draggedElement */ HTMLElement, Unit]
  ] = js.undefined
  /**
    * sorting inside list
    */
  var sort: js.UndefOr[Boolean] = js.undefined
  var store: js.UndefOr[Anon_Get] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    animation: Int | Double = null,
    chosenClass: String = null,
    dataIdAttr: String = null,
    delay: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dragClass: String = null,
    draggable: String = null,
    dragoverBubble: js.UndefOr[Boolean] = js.undefined,
    dropBubble: js.UndefOr[Boolean] = js.undefined,
    fallbackClass: String = null,
    fallbackOffset: Anon_X = null,
    fallbackOnBody: js.UndefOr[Boolean] = js.undefined,
    fallbackTolerance: Int | Double = null,
    filter: String | (js.ThisFunction3[
      /* this */ Sortable, 
      /* event */ Event | TouchEvent, 
      /* target */ HTMLElement, 
      /* sortable */ Sortable, 
      Boolean
    ]) = null,
    forceFallback: js.UndefOr[Boolean] = js.undefined,
    ghostClass: String = null,
    group: String | GroupOptions = null,
    handle: String = null,
    ignore: String = null,
    onAdd: /* event */ SortableEvent => Unit = null,
    onChoose: /* event */ SortableEvent => Unit = null,
    onClone: /* event */ SortableEvent => Unit = null,
    onEnd: /* event */ SortableEvent => Unit = null,
    onFilter: /* event */ SortableEvent => Unit = null,
    onMove: (/* event */ MoveEvent, /* originalEvent */ MouseEvent) => `false` | `-1` | `1` = null,
    onRemove: /* event */ SortableEvent => Unit = null,
    onSort: /* event */ SortableEvent => Unit = null,
    onStart: /* event */ SortableEvent => Unit = null,
    onUnchoose: /* event */ SortableEvent => Unit = null,
    onUpdate: /* event */ SortableEvent => Unit = null,
    preventOnFilter: js.UndefOr[Boolean] = js.undefined,
    scroll: js.UndefOr[Boolean] = js.undefined,
    scrollFn: js.ThisFunction3[
      /* this */ Sortable, 
      /* offsetX */ Double, 
      /* offsetY */ Double, 
      /* event */ MouseEvent, 
      Unit
    ] = null,
    scrollSensitivity: Int | Double = null,
    scrollSpeed: Int | Double = null,
    setData: (/* dataTransfer */ DataTransfer, /* draggedElement */ HTMLElement) => Unit = null,
    sort: js.UndefOr[Boolean] = js.undefined,
    store: Anon_Get = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (chosenClass != null) __obj.updateDynamic("chosenClass")(chosenClass)
    if (dataIdAttr != null) __obj.updateDynamic("dataIdAttr")(dataIdAttr)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (dragClass != null) __obj.updateDynamic("dragClass")(dragClass)
    if (draggable != null) __obj.updateDynamic("draggable")(draggable)
    if (!js.isUndefined(dragoverBubble)) __obj.updateDynamic("dragoverBubble")(dragoverBubble)
    if (!js.isUndefined(dropBubble)) __obj.updateDynamic("dropBubble")(dropBubble)
    if (fallbackClass != null) __obj.updateDynamic("fallbackClass")(fallbackClass)
    if (fallbackOffset != null) __obj.updateDynamic("fallbackOffset")(fallbackOffset)
    if (!js.isUndefined(fallbackOnBody)) __obj.updateDynamic("fallbackOnBody")(fallbackOnBody)
    if (fallbackTolerance != null) __obj.updateDynamic("fallbackTolerance")(fallbackTolerance.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(forceFallback)) __obj.updateDynamic("forceFallback")(forceFallback)
    if (ghostClass != null) __obj.updateDynamic("ghostClass")(ghostClass)
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore)
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction1(onAdd))
    if (onChoose != null) __obj.updateDynamic("onChoose")(js.Any.fromFunction1(onChoose))
    if (onClone != null) __obj.updateDynamic("onClone")(js.Any.fromFunction1(onClone))
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction1(onEnd))
    if (onFilter != null) __obj.updateDynamic("onFilter")(js.Any.fromFunction1(onFilter))
    if (onMove != null) __obj.updateDynamic("onMove")(js.Any.fromFunction2(onMove))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1(onRemove))
    if (onSort != null) __obj.updateDynamic("onSort")(js.Any.fromFunction1(onSort))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction1(onStart))
    if (onUnchoose != null) __obj.updateDynamic("onUnchoose")(js.Any.fromFunction1(onUnchoose))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1(onUpdate))
    if (!js.isUndefined(preventOnFilter)) __obj.updateDynamic("preventOnFilter")(preventOnFilter)
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll)
    if (scrollFn != null) __obj.updateDynamic("scrollFn")(scrollFn)
    if (scrollSensitivity != null) __obj.updateDynamic("scrollSensitivity")(scrollSensitivity.asInstanceOf[js.Any])
    if (scrollSpeed != null) __obj.updateDynamic("scrollSpeed")(scrollSpeed.asInstanceOf[js.Any])
    if (setData != null) __obj.updateDynamic("setData")(js.Any.fromFunction2(setData))
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort)
    if (store != null) __obj.updateDynamic("store")(store)
    __obj.asInstanceOf[Options]
  }
}


package typings
package sortablejsLib.sortablejsMod.SortableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * ms, animation speed moving items when sorting, `0` — without animation
    */
  var animation: js.UndefOr[scala.Double] = js.undefined
  /**
    * Class name for the chosen item
    */
  var chosenClass: js.UndefOr[java.lang.String] = js.undefined
  var dataIdAttr: js.UndefOr[java.lang.String] = js.undefined
  /**
    * time in milliseconds to define when the sorting should start
    */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
    * Disables the sortable if set to true.
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Class name for the dragging item
    */
  var dragClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies which items inside the element should be draggable
    */
  var draggable: js.UndefOr[java.lang.String] = js.undefined
  var dragoverBubble: js.UndefOr[scala.Boolean] = js.undefined
  var dropBubble: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Class name for the cloned DOM Element when using forceFallback
    */
  var fallbackClass: js.UndefOr[java.lang.String] = js.undefined
  var fallbackOffset: js.UndefOr[sortablejsLib.Anon_X] = js.undefined
  /**
    * Appends the cloned DOM Element into the Document's Body
    */
  var fallbackOnBody: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify in pixels how far the mouse should move before it's considered as a drag.
    */
  var fallbackTolerance: js.UndefOr[scala.Double] = js.undefined
  /**
    * Selectors that do not lead to dragging (String or Function)
    */
  var filter: js.UndefOr[
    java.lang.String | (js.ThisFunction3[
      /* this */ sortablejsLib.sortablejsMod.Sortable, 
      /* event */ stdLib.Event | stdLib.TouchEvent, 
      /* target */ stdLib.HTMLElement, 
      /* sortable */ sortablejsLib.sortablejsMod.Sortable, 
      scala.Boolean
    ])
  ] = js.undefined
  /**
    * ignore the HTML5 DnD behaviour and force the fallback to kick in
    */
  var forceFallback: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Class name for the drop placeholder
    */
  var ghostClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * To drag elements from one list into another, both lists must have the same group value.
    * You can also define whether lists can give away, give and keep a copy (clone), and receive elements.
    */
  var group: js.UndefOr[java.lang.String | GroupOptions] = js.undefined
  /**
    * Drag handle selector within list items
    */
  var handle: js.UndefOr[java.lang.String] = js.undefined
  var ignore: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Element is dropped into the list from another list
    */
  var onAdd: js.UndefOr[js.Function1[/* event */ SortableEvent, scala.Unit]] = js.undefined
  /**
    * Element is chosen
    */
  var onChoose: js.UndefOr[js.Function1[/* event */ SortableEvent, scala.Unit]] = js.undefined
  /**
    * Created a clone of an element
    */
  var onClone: js.UndefOr[js.Function1[/* event */ SortableEvent, scala.Unit]] = js.undefined
  /**
    * Element dragging ended
    */
  var onEnd: js.UndefOr[js.Function1[/* event */ SortableEvent, scala.Unit]] = js.undefined
  /**
    * Attempt to drag a filtered element
    */
  var onFilter: js.UndefOr[js.Function1[/* event */ SortableEvent, scala.Unit]] = js.undefined
  /**
    * Event when you move an item in the list or between lists
    */
  var onMove: js.UndefOr[js.Function1[/* event */ MoveEvent, scala.Boolean]] = js.undefined
  /**
    * Element is removed from the list into another list
    */
  var onRemove: js.UndefOr[js.Function1[/* event */ SortableEvent, scala.Unit]] = js.undefined
  /**
    * Called by any change to the list (add / update / remove)
    */
  var onSort: js.UndefOr[js.Function1[/* event */ SortableEvent, scala.Unit]] = js.undefined
  /**
    * Element dragging started
    */
  var onStart: js.UndefOr[js.Function1[/* event */ SortableEvent, scala.Unit]] = js.undefined
  /**
    * Element is unchosen
    */
  var onUnchoose: js.UndefOr[js.Function1[/* event */ SortableEvent, scala.Unit]] = js.undefined
  /**
    * Changed sorting within list
    */
  var onUpdate: js.UndefOr[js.Function1[/* event */ SortableEvent, scala.Unit]] = js.undefined
  /**
    * Call `event.preventDefault()` when triggered `filter`
    */
  var preventOnFilter: js.UndefOr[scala.Boolean] = js.undefined
  var scroll: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * if you have custom scrollbar scrollFn may be used for autoscrolling
    */
  var scrollFn: js.UndefOr[
    js.ThisFunction3[
      /* this */ sortablejsLib.sortablejsMod.Sortable, 
      /* offsetX */ scala.Double, 
      /* offsetY */ scala.Double, 
      /* event */ stdLib.MouseEvent, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * px, how near the mouse must be to an edge to start scrolling.
    */
  var scrollSensitivity: js.UndefOr[scala.Double] = js.undefined
  /**
    * px
    */
  var scrollSpeed: js.UndefOr[scala.Double] = js.undefined
  var setData: js.UndefOr[
    js.Function2[
      /* dataTransfer */ stdLib.DataTransfer, 
      /* draggedElement */ stdLib.HTMLElement, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * sorting inside list
    */
  var sort: js.UndefOr[scala.Boolean] = js.undefined
  var store: js.UndefOr[sortablejsLib.Anon_Get] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    animation: scala.Int | scala.Double = null,
    chosenClass: java.lang.String = null,
    dataIdAttr: java.lang.String = null,
    delay: scala.Int | scala.Double = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    dragClass: java.lang.String = null,
    draggable: java.lang.String = null,
    dragoverBubble: js.UndefOr[scala.Boolean] = js.undefined,
    dropBubble: js.UndefOr[scala.Boolean] = js.undefined,
    fallbackClass: java.lang.String = null,
    fallbackOffset: sortablejsLib.Anon_X = null,
    fallbackOnBody: js.UndefOr[scala.Boolean] = js.undefined,
    fallbackTolerance: scala.Int | scala.Double = null,
    filter: java.lang.String | (js.ThisFunction3[
      /* this */ sortablejsLib.sortablejsMod.Sortable, 
      /* event */ stdLib.Event | stdLib.TouchEvent, 
      /* target */ stdLib.HTMLElement, 
      /* sortable */ sortablejsLib.sortablejsMod.Sortable, 
      scala.Boolean
    ]) = null,
    forceFallback: js.UndefOr[scala.Boolean] = js.undefined,
    ghostClass: java.lang.String = null,
    group: java.lang.String | GroupOptions = null,
    handle: java.lang.String = null,
    ignore: java.lang.String = null,
    onAdd: /* event */ SortableEvent => scala.Unit = null,
    onChoose: /* event */ SortableEvent => scala.Unit = null,
    onClone: /* event */ SortableEvent => scala.Unit = null,
    onEnd: /* event */ SortableEvent => scala.Unit = null,
    onFilter: /* event */ SortableEvent => scala.Unit = null,
    onMove: /* event */ MoveEvent => scala.Boolean = null,
    onRemove: /* event */ SortableEvent => scala.Unit = null,
    onSort: /* event */ SortableEvent => scala.Unit = null,
    onStart: /* event */ SortableEvent => scala.Unit = null,
    onUnchoose: /* event */ SortableEvent => scala.Unit = null,
    onUpdate: /* event */ SortableEvent => scala.Unit = null,
    preventOnFilter: js.UndefOr[scala.Boolean] = js.undefined,
    scroll: js.UndefOr[scala.Boolean] = js.undefined,
    scrollFn: js.ThisFunction3[
      /* this */ sortablejsLib.sortablejsMod.Sortable, 
      /* offsetX */ scala.Double, 
      /* offsetY */ scala.Double, 
      /* event */ stdLib.MouseEvent, 
      scala.Unit
    ] = null,
    scrollSensitivity: scala.Int | scala.Double = null,
    scrollSpeed: scala.Int | scala.Double = null,
    setData: (/* dataTransfer */ stdLib.DataTransfer, /* draggedElement */ stdLib.HTMLElement) => scala.Unit = null,
    sort: js.UndefOr[scala.Boolean] = js.undefined,
    store: sortablejsLib.Anon_Get = null
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
    if (onMove != null) __obj.updateDynamic("onMove")(js.Any.fromFunction1(onMove))
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


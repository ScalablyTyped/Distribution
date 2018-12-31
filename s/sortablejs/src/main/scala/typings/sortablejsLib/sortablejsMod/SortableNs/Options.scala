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
  var fallbackOffset: js.UndefOr[sortablejsLib.Anon_Y] = js.undefined
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
  var store: js.UndefOr[sortablejsLib.Anon_SetSortable] = js.undefined
}


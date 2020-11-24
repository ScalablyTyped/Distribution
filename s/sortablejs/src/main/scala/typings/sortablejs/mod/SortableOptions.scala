package typings.sortablejs.mod

import typings.sortablejs.anon.Get
import typings.sortablejs.anon.X
import typings.sortablejs.sortablejsNumbers.`-1`
import typings.sortablejs.sortablejsNumbers.`1`
import typings.std.DataTransfer
import typings.std.Event
import typings.std.HTMLElement
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortableOptions extends js.Object {
  
  /**
    * ms, animation speed moving items when sorting, `0` — without animation
    */
  var animation: js.UndefOr[Double] = js.native
  
  /**
    * Class name for the chosen item
    */
  var chosenClass: js.UndefOr[String] = js.native
  
  var dataIdAttr: js.UndefOr[String] = js.native
  
  /**
    * time in milliseconds to define when the sorting should start
    */
  var delay: js.UndefOr[Double] = js.native
  
  /**
    * Only delay if user is using touch
    */
  var delayOnTouchOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Direction of Sortable
    * (will be detected automatically if not given)
    */
  var direction: js.UndefOr[
    (js.Function3[/* evt */ SortableEvent, /* target */ HTMLElement, /* dragEl */ HTMLElement, Direction]) | Direction
  ] = js.native
  
  /**
    * Disables the sortable if set to true.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Class name for the dragging item
    */
  var dragClass: js.UndefOr[String] = js.native
  
  /**
    * Specifies which items inside the element should be draggable
    */
  var draggable: js.UndefOr[String] = js.native
  
  var dragoverBubble: js.UndefOr[Boolean] = js.native
  
  var dropBubble: js.UndefOr[Boolean] = js.native
  
  /**
    * Easing for animation. Defaults to null.
    *
    * See https://easings.net/ for examples.
    *
    * For other possible values, see
    * https://www.w3schools.com/cssref/css3_pr_animation-timing-function.asp
    *
    * @example
    *
    * // CSS functions
    * | 'steps(int, start | end)'
    * | 'cubic-bezier(n, n, n, n)'
    *
    * // CSS values
    * | 'linear'
    * | 'ease'
    * | 'ease-in'
    * | 'ease-out'
    * | 'ease-in-out'
    * | 'step-start'
    * | 'step-end'
    * | 'initial'
    * | 'inherit'
    */
  var easing: js.UndefOr[String] = js.native
  
  /**
    * distance mouse must be from empty sortable
    * to insert drag element into it
    */
  var emptyInsertThreshold: js.UndefOr[Double] = js.native
  
  /**
    * Class name for the cloned DOM Element when using forceFallback
    */
  var fallbackClass: js.UndefOr[String] = js.native
  
  var fallbackOffset: js.UndefOr[X] = js.native
  
  /**
    * Appends the cloned DOM Element into the Document's Body
    */
  var fallbackOnBody: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify in pixels how far the mouse should move before it's considered as a drag.
    */
  var fallbackTolerance: js.UndefOr[Double] = js.native
  
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
  ] = js.native
  
  /**
    * ignore the HTML5 DnD behaviour and force the fallback to kick in
    */
  var forceFallback: js.UndefOr[Boolean] = js.native
  
  /**
    * Class name for the drop placeholder
    */
  var ghostClass: js.UndefOr[String] = js.native
  
  /**
    * To drag elements from one list into another, both lists must have the same group value.
    * You can also define whether lists can give away, give and keep a copy (clone), and receive elements.
    */
  var group: js.UndefOr[String | GroupOptions] = js.native
  
  /**
    * Drag handle selector within list items
    */
  var handle: js.UndefOr[String] = js.native
  
  var ignore: js.UndefOr[String] = js.native
  
  /**
    * Will always use inverted swap zone if set to true
    */
  var invertSwap: js.UndefOr[Boolean] = js.native
  
  /**
    * Threshold of the inverted swap zone
    * (will be set to `swapThreshold` value by default)
    */
  var invertedSwapThreshold: js.UndefOr[Double] = js.native
  
  /**
    * Element is dropped into the list from another list
    */
  var onAdd: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  
  /**
    * Called when dragging element changes position
    */
  var onChange: js.UndefOr[js.Function1[/* evt */ SortableEvent, Unit]] = js.native
  
  /**
    * Element is chosen
    */
  var onChoose: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  
  /**
    * Created a clone of an element
    */
  var onClone: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  
  /**
    * Element dragging ended
    */
  var onEnd: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  
  /**
    * Attempt to drag a filtered element
    */
  var onFilter: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  
  /**
    * Event when you move an item in the list or between lists
    */
  var onMove: js.UndefOr[
    js.Function2[/* evt */ MoveEvent, /* originalEvent */ Event, Boolean | `-1` | `1` | Unit]
  ] = js.native
  
  /**
    * Element is removed from the list into another list
    */
  var onRemove: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  
  /**
    * Called by any change to the list (add / update / remove)
    */
  var onSort: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  
  /**
    * Element dragging started
    */
  var onStart: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  
  /**
    * Element is unchosen
    */
  var onUnchoose: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  
  /**
    * Changed sorting within list
    */
  var onUpdate: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  
  /**
    * Call `event.preventDefault()` when triggered `filter`
    */
  var preventOnFilter: js.UndefOr[Boolean] = js.native
  
  /**
    * Remove the clone element when it is not showing,
    * rather than just hiding it
    */
  var removeCloneOnHide: js.UndefOr[Boolean] = js.native
  
  var setData: js.UndefOr[
    js.Function2[/* dataTransfer */ DataTransfer, /* draggedElement */ HTMLElement, Unit]
  ] = js.native
  
  /**
    * sorting inside list
    */
  var sort: js.UndefOr[Boolean] = js.native
  
  var store: js.UndefOr[Get] = js.native
  
  /**
    * Threshold of the swap zone.
    * Defaults to `1`
    */
  var swapThreshold: js.UndefOr[Double] = js.native
  
  /**
    * How many *pixels* the point should move before cancelling a delayed drag event
    */
  var touchStartThreshold: js.UndefOr[Double] = js.native
}
object SortableOptions {
  
  @scala.inline
  def apply(): SortableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortableOptions]
  }
  
  @scala.inline
  implicit class SortableOptionsOps[Self <: SortableOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnimation(value: Double): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setChosenClass(value: String): Self = this.set("chosenClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChosenClass: Self = this.set("chosenClass", js.undefined)
    
    @scala.inline
    def setDataIdAttr(value: String): Self = this.set("dataIdAttr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataIdAttr: Self = this.set("dataIdAttr", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDelayOnTouchOnly(value: Boolean): Self = this.set("delayOnTouchOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayOnTouchOnly: Self = this.set("delayOnTouchOnly", js.undefined)
    
    @scala.inline
    def setDirectionFunction3(value: (/* evt */ SortableEvent, /* target */ HTMLElement, /* dragEl */ HTMLElement) => Direction): Self = this.set("direction", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDirection(
      value: (js.Function3[/* evt */ SortableEvent, /* target */ HTMLElement, /* dragEl */ HTMLElement, Direction]) | Direction
    ): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDragClass(value: String): Self = this.set("dragClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragClass: Self = this.set("dragClass", js.undefined)
    
    @scala.inline
    def setDraggable(value: String): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    
    @scala.inline
    def setDragoverBubble(value: Boolean): Self = this.set("dragoverBubble", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragoverBubble: Self = this.set("dragoverBubble", js.undefined)
    
    @scala.inline
    def setDropBubble(value: Boolean): Self = this.set("dropBubble", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropBubble: Self = this.set("dropBubble", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setEmptyInsertThreshold(value: Double): Self = this.set("emptyInsertThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyInsertThreshold: Self = this.set("emptyInsertThreshold", js.undefined)
    
    @scala.inline
    def setFallbackClass(value: String): Self = this.set("fallbackClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackClass: Self = this.set("fallbackClass", js.undefined)
    
    @scala.inline
    def setFallbackOffset(value: X): Self = this.set("fallbackOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackOffset: Self = this.set("fallbackOffset", js.undefined)
    
    @scala.inline
    def setFallbackOnBody(value: Boolean): Self = this.set("fallbackOnBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackOnBody: Self = this.set("fallbackOnBody", js.undefined)
    
    @scala.inline
    def setFallbackTolerance(value: Double): Self = this.set("fallbackTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackTolerance: Self = this.set("fallbackTolerance", js.undefined)
    
    @scala.inline
    def setFilter(
      value: String | (js.ThisFunction3[
          /* this */ Sortable, 
          /* event */ Event | TouchEvent, 
          /* target */ HTMLElement, 
          /* sortable */ Sortable, 
          Boolean
        ])
    ): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setForceFallback(value: Boolean): Self = this.set("forceFallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceFallback: Self = this.set("forceFallback", js.undefined)
    
    @scala.inline
    def setGhostClass(value: String): Self = this.set("ghostClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGhostClass: Self = this.set("ghostClass", js.undefined)
    
    @scala.inline
    def setGroup(value: String | GroupOptions): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setHandle(value: String): Self = this.set("handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandle: Self = this.set("handle", js.undefined)
    
    @scala.inline
    def setIgnore(value: String): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    
    @scala.inline
    def setInvertSwap(value: Boolean): Self = this.set("invertSwap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvertSwap: Self = this.set("invertSwap", js.undefined)
    
    @scala.inline
    def setInvertedSwapThreshold(value: Double): Self = this.set("invertedSwapThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvertedSwapThreshold: Self = this.set("invertedSwapThreshold", js.undefined)
    
    @scala.inline
    def setOnAdd(value: /* event */ SortableEvent => Unit): Self = this.set("onAdd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAdd: Self = this.set("onAdd", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* evt */ SortableEvent => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnChoose(value: /* event */ SortableEvent => Unit): Self = this.set("onChoose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChoose: Self = this.set("onChoose", js.undefined)
    
    @scala.inline
    def setOnClone(value: /* event */ SortableEvent => Unit): Self = this.set("onClone", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClone: Self = this.set("onClone", js.undefined)
    
    @scala.inline
    def setOnEnd(value: /* event */ SortableEvent => Unit): Self = this.set("onEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEnd: Self = this.set("onEnd", js.undefined)
    
    @scala.inline
    def setOnFilter(value: /* event */ SortableEvent => Unit): Self = this.set("onFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFilter: Self = this.set("onFilter", js.undefined)
    
    @scala.inline
    def setOnMove(value: (/* evt */ MoveEvent, /* originalEvent */ Event) => Boolean | `-1` | `1` | Unit): Self = this.set("onMove", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMove: Self = this.set("onMove", js.undefined)
    
    @scala.inline
    def setOnRemove(value: /* event */ SortableEvent => Unit): Self = this.set("onRemove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRemove: Self = this.set("onRemove", js.undefined)
    
    @scala.inline
    def setOnSort(value: /* event */ SortableEvent => Unit): Self = this.set("onSort", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSort: Self = this.set("onSort", js.undefined)
    
    @scala.inline
    def setOnStart(value: /* event */ SortableEvent => Unit): Self = this.set("onStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
    
    @scala.inline
    def setOnUnchoose(value: /* event */ SortableEvent => Unit): Self = this.set("onUnchoose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUnchoose: Self = this.set("onUnchoose", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: /* event */ SortableEvent => Unit): Self = this.set("onUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
    
    @scala.inline
    def setPreventOnFilter(value: Boolean): Self = this.set("preventOnFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventOnFilter: Self = this.set("preventOnFilter", js.undefined)
    
    @scala.inline
    def setRemoveCloneOnHide(value: Boolean): Self = this.set("removeCloneOnHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveCloneOnHide: Self = this.set("removeCloneOnHide", js.undefined)
    
    @scala.inline
    def setSetData(value: (/* dataTransfer */ DataTransfer, /* draggedElement */ HTMLElement) => Unit): Self = this.set("setData", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetData: Self = this.set("setData", js.undefined)
    
    @scala.inline
    def setSort(value: Boolean): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setStore(value: Get): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    
    @scala.inline
    def setSwapThreshold(value: Double): Self = this.set("swapThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwapThreshold: Self = this.set("swapThreshold", js.undefined)
    
    @scala.inline
    def setTouchStartThreshold(value: Double): Self = this.set("touchStartThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchStartThreshold: Self = this.set("touchStartThreshold", js.undefined)
  }
}

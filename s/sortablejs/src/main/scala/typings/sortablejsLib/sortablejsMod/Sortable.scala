package typings
package sortablejsLib.sortablejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sortable extends js.Object {
  var el: stdLib.HTMLElement = js.native
  var options: sortablejsLib.sortablejsMod.SortableNs.Options = js.native
  /**
    * For each element in the set, get the first element that matches the selector by testing the element itself and traversing up through its ancestors in the DOM tree.
    * @param element an HTMLElement or selector string.
    * @param selector default: `options.draggable`
    */
  def closest(element: stdLib.HTMLElement): stdLib.HTMLElement | scala.Null = js.native
  def closest(element: stdLib.HTMLElement, selector: java.lang.String): stdLib.HTMLElement | scala.Null = js.native
  /**
    * Removes the sortable functionality completely.
    */
  def destroy(): scala.Unit = js.native
  @JSName("option")
  def option_animation(name: sortablejsLib.sortablejsLibStrings.animation): scala.Double = js.native
  /**
    * Options getter/setter
    * @param name a Sortable.Options property.
    * @param value a value.
    */
  @JSName("option")
  def option_animation(name: sortablejsLib.sortablejsLibStrings.animation, value: scala.Double): scala.Unit = js.native
  @JSName("option")
  def option_chosenClass(name: sortablejsLib.sortablejsLibStrings.chosenClass): java.lang.String = js.native
  /**
    * Options getter/setter
    * @param name a Sortable.Options property.
    * @param value a value.
    */
  @JSName("option")
  def option_chosenClass(name: sortablejsLib.sortablejsLibStrings.chosenClass, value: java.lang.String): scala.Unit = js.native
  @JSName("option")
  def option_dataIdAttr(name: sortablejsLib.sortablejsLibStrings.dataIdAttr): java.lang.String = js.native
  /**
    * Options getter/setter
    * @param name a Sortable.Options property.
    * @param value a value.
    */
  @JSName("option")
  def option_dataIdAttr(name: sortablejsLib.sortablejsLibStrings.dataIdAttr, value: java.lang.String): scala.Unit = js.native
  @JSName("option")
  def option_delay(name: sortablejsLib.sortablejsLibStrings.delay): scala.Double = js.native
  /**
    * Options getter/setter
    * @param name a Sortable.Options property.
    * @param value a value.
    */
  @JSName("option")
  def option_delay(name: sortablejsLib.sortablejsLibStrings.delay, value: scala.Double): scala.Unit = js.native
  @JSName("option")
  def option_disabled(name: sortablejsLib.sortablejsLibStrings.disabled): scala.Boolean = js.native
  /**
    * Options getter/setter
    * @param name a Sortable.Options property.
    * @param value a value.
    */
  @JSName("option")
  def option_disabled(name: sortablejsLib.sortablejsLibStrings.disabled, value: scala.Boolean): scala.Unit = js.native
  @JSName("option")
  def option_dragClass(name: sortablejsLib.sortablejsLibStrings.dragClass): java.lang.String = js.native
  /**
    * Options getter/setter
    * @param name a Sortable.Options property.
    * @param value a value.
    */
  @JSName("option")
  def option_dragClass(name: sortablejsLib.sortablejsLibStrings.dragClass, value: java.lang.String): scala.Unit = js.native
  @JSName("option")
  def option_draggable(name: sortablejsLib.sortablejsLibStrings.draggable): java.lang.String = js.native
  /**
    * Options getter/setter
    * @param name a Sortable.Options property.
    * @param value a value.
    */
  @JSName("option")
  def option_draggable(name: sortablejsLib.sortablejsLibStrings.draggable, value: java.lang.String): scala.Unit = js.native
  @JSName("option")
  def option_dragoverBubble(name: sortablejsLib.sortablejsLibStrings.dragoverBubble): scala.Boolean = js.native
  /**
    * Options getter/setter
    * @param name a Sortable.Options property.
    * @param value a value.
    */
  @JSName("option")
  def option_dragoverBubble(name: sortablejsLib.sortablejsLibStrings.dragoverBubble, value: scala.Boolean): scala.Unit = js.native
  @JSName("option")
  def option_dropBubble(name: sortablejsLib.sortablejsLibStrings.dropBubble): scala.Boolean = js.native
  /**
    * Options getter/setter
    * @param name a Sortable.Options property.
    * @param value a value.
    */
  @JSName("option")
  def option_dropBubble(name: sortablejsLib.sortablejsLibStrings.dropBubble, value: scala.Boolean): scala.Unit = js.native
  @JSName("option")
  def option_fallbackClass(name: sortablejsLib.sortablejsLibStrings.fallbackClass): java.lang.String = js.native
  /**
    * Options getter/setter
    * @param name a Sortable.Options property.
    * @param value a value.
    */
  @JSName("option")
  def option_fallbackClass(name: sortablejsLib.sortablejsLibStrings.fallbackClass, value: java.lang.String): scala.Unit = js.native
  @JSName("option")
  def option_fallbackOffset(name: sortablejsLib.sortablejsLibStrings.fallbackOffset): sortablejsLib.Anon_Y = js.native
  /**
    * Options getter/setter
    * @param name a Sortable.Options property.
    * @param value a value.
    */
  @JSName("option")
  def option_fallbackOffset(name: sortablejsLib.sortablejsLibStrings.fallbackOffset, value: sortablejsLib.Anon_Y): scala.Unit = js.native
  @JSName("option")
  def option_fallbackOnBody(name: sortablejsLib.sortablejsLibStrings.fallbackOnBody): scala.Boolean = js.native
  /**
    * Options getter/setter
    * @param name a Sortable.Options property.
    * @param value a value.
    */
  @JSName("option")
  def option_fallbackOnBody(name: sortablejsLib.sortablejsLibStrings.fallbackOnBody, value: scala.Boolean): scala.Unit = js.native
  @JSName("option")
  def option_fallbackTolerance(name: sortablejsLib.sortablejsLibStrings.fallbackTolerance): scala.Double = js.native
  /**
    * Options getter/setter
    * @param name a Sortable.Options property.
    * @param value a value.
    */
  @JSName("option")
  def option_fallbackTolerance(name: sortablejsLib.sortablejsLibStrings.fallbackTolerance, value: scala.Double): scala.Unit = js.native
  @JSName("option")
  def option_filter(name: sortablejsLib.sortablejsLibStrings.filter): java.lang.String | (js.ThisFunction3[
    /* this */ this.type, 
    /* event */ stdLib.Event | stdLib.TouchEvent, 
    /* target */ stdLib.HTMLElement, 
    /* sortable */ this.type, 
    scala.Boolean
  ]) = js.native
  /**
    * Options getter/setter
    * @param name a Sortable.Options property.
    * @param value a value.
    */
  @JSName("option")
  def option_filter(name: sortablejsLib.sortablejsLibStrings.filter, value: java.lang.String): scala.Unit = js.native
  @JSName("option")
  def option_filter(
    name: sortablejsLib.sortablejsLibStrings.filter,
    value: js.ThisFunction3[
      /* this */ this.type, 
      /* event */ stdLib.Event | stdLib.TouchEvent, 
      /* target */ stdLib.HTMLElement, 
      /* sortable */ this.type, 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  @JSName("option")
  def option_forceFallback(name: sortablejsLib.sortablejsLibStrings.forceFallback): scala.Boolean = js.native
  /**
    * Options getter/setter
    * @param name a Sortable.Options property.
    * @param value a value.
    */
  @JSName("option")
  def option_forceFallback(name: sortablejsLib.sortablejsLibStrings.forceFallback, value: scala.Boolean): scala.Unit = js.native
  @JSName("option")
  def option_ghostClass(name: sortablejsLib.sortablejsLibStrings.ghostClass): java.lang.String = js.native
  /**
    * Options getter/setter
    * @param name a Sortable.Options property.
    * @param value a value.
    */
  @JSName("option")
  def option_ghostClass(name: sortablejsLib.sortablejsLibStrings.ghostClass, value: java.lang.String): scala.Unit = js.native
  @JSName("option")
  def option_group(name: sortablejsLib.sortablejsLibStrings.group): java.lang.String | sortablejsLib.sortablejsMod.SortableNs.GroupOptions = js.native
  /**
    * Options getter/setter
    * @param name a Sortable.Options property.
    * @param value a value.
    */
  @JSName("option")
  def option_group(name: sortablejsLib.sortablejsLibStrings.group, value: java.lang.String): scala.Unit = js.native
  @JSName("option")
  def option_group(
    name: sortablejsLib.sortablejsLibStrings.group,
    value: sortablejsLib.sortablejsMod.SortableNs.GroupOptions
  ): scala.Unit = js.native
  @JSName("option")
  def option_handle(name: sortablejsLib.sortablejsLibStrings.handle): java.lang.String = js.native
  /**
    * Options getter/setter
    * @param name a Sortable.Options property.
    * @param value a value.
    */
  @JSName("option")
  def option_handle(name: sortablejsLib.sortablejsLibStrings.handle, value: java.lang.String): scala.Unit = js.native
  @JSName("option")
  def option_ignore(name: sortablejsLib.sortablejsLibStrings.ignore): java.lang.String = js.native
  /**
    * Options getter/setter
    * @param name a Sortable.Options property.
    * @param value a value.
    */
  @JSName("option")
  def option_ignore(name: sortablejsLib.sortablejsLibStrings.ignore, value: java.lang.String): scala.Unit = js.native
  @JSName("option")
  def option_preventOnFilter(name: sortablejsLib.sortablejsLibStrings.preventOnFilter): scala.Boolean = js.native
  /**
    * Options getter/setter
    * @param name a Sortable.Options property.
    * @param value a value.
    */
  @JSName("option")
  def option_preventOnFilter(name: sortablejsLib.sortablejsLibStrings.preventOnFilter, value: scala.Boolean): scala.Unit = js.native
  @JSName("option")
  def option_scroll(name: sortablejsLib.sortablejsLibStrings.scroll): scala.Boolean = js.native
  /**
    * Options getter/setter
    * @param name a Sortable.Options property.
    * @param value a value.
    */
  @JSName("option")
  def option_scroll(name: sortablejsLib.sortablejsLibStrings.scroll, value: scala.Boolean): scala.Unit = js.native
  @JSName("option")
  def option_scrollSensitivity(name: sortablejsLib.sortablejsLibStrings.scrollSensitivity): scala.Double = js.native
  /**
    * Options getter/setter
    * @param name a Sortable.Options property.
    * @param value a value.
    */
  @JSName("option")
  def option_scrollSensitivity(name: sortablejsLib.sortablejsLibStrings.scrollSensitivity, value: scala.Double): scala.Unit = js.native
  @JSName("option")
  def option_scrollSpeed(name: sortablejsLib.sortablejsLibStrings.scrollSpeed): scala.Double = js.native
  /**
    * Options getter/setter
    * @param name a Sortable.Options property.
    * @param value a value.
    */
  @JSName("option")
  def option_scrollSpeed(name: sortablejsLib.sortablejsLibStrings.scrollSpeed, value: scala.Double): scala.Unit = js.native
  @JSName("option")
  def option_sort(name: sortablejsLib.sortablejsLibStrings.sort): scala.Boolean = js.native
  /**
    * Options getter/setter
    * @param name a Sortable.Options property.
    * @param value a value.
    */
  @JSName("option")
  def option_sort(name: sortablejsLib.sortablejsLibStrings.sort, value: scala.Boolean): scala.Unit = js.native
  @JSName("option")
  def option_store(name: sortablejsLib.sortablejsLibStrings.store): sortablejsLib.Anon_Set = js.native
  /**
    * Options getter/setter
    * @param name a Sortable.Options property.
    * @param value a value.
    */
  @JSName("option")
  def option_store(name: sortablejsLib.sortablejsLibStrings.store, value: sortablejsLib.Anon_Set): scala.Unit = js.native
  /**
    * Saving and restoring of the sort.
    */
  def save(): scala.Unit = js.native
  /**
    * Sorts the elements according to the array.
    * @param order an array of strings to sort.
    */
  def sort(order: js.Array[java.lang.String]): scala.Unit = js.native
  /**
    * Serializes the sortable's item data-id's (dataIdAttr option) into an array of string.
    */
  def toArray(): js.Array[java.lang.String] = js.native
}


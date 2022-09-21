package typings.simonwepSelectionJs.mod

import typings.simonwepSelectionJs.simonwepSelectionJsStrings.beforestart
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.move
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.start
import typings.simonwepSelectionJs.simonwepSelectionJsStrings.stop
import typings.std.Element
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectionArea
  extends StObject
     with EventTarget[SelectionEvents] {
  
  /* private */ val _area: Any = js.native
  
  /* private */ var _areaLocation: Any = js.native
  
  /* private */ val _areaRect: Any = js.native
  
  def _bindStartEvents(): Unit = js.native
  def _bindStartEvents(activate: Boolean): Unit = js.native
  
  /* private */ val _clippingElement: Any = js.native
  
  def _delayedTapMove(evt: MouseEvent): Unit = js.native
  def _delayedTapMove(evt: TouchEvent): Unit = js.native
  
  def _emitEvent(
    name: /* keyof @simonwep/selection-js.@simonwep/selection-js.SelectionEvents */ beforestart | start | move | stop
  ): Any = js.native
  def _emitEvent(
    name: /* keyof @simonwep/selection-js.@simonwep/selection-js.SelectionEvents */ beforestart | start | move | stop,
    evt: MouseEvent
  ): Any = js.native
  def _emitEvent(
    name: /* keyof @simonwep/selection-js.@simonwep/selection-js.SelectionEvents */ beforestart | start | move | stop,
    evt: TouchEvent
  ): Any = js.native
  
  def _manualScroll(evt: ScrollEvent): Unit = js.native
  
  def _onScroll(): Unit = js.native
  
  def _onSingleTap(evt: MouseEvent): Unit = js.native
  def _onSingleTap(evt: TouchEvent): Unit = js.native
  
  def _onTapMove(evt: MouseEvent): Unit = js.native
  def _onTapMove(evt: TouchEvent): Unit = js.native
  
  def _onTapStart(evt: MouseEvent): Unit = js.native
  def _onTapStart(evt: MouseEvent, silent: Boolean): Unit = js.native
  def _onTapStart(evt: TouchEvent): Unit = js.native
  def _onTapStart(evt: TouchEvent, silent: Boolean): Unit = js.native
  
  def _onTapStop(evt: Null, silent: Boolean): Unit = js.native
  def _onTapStop(evt: MouseEvent, silent: Boolean): Unit = js.native
  def _onTapStop(evt: TouchEvent, silent: Boolean): Unit = js.native
  
  /* private */ val _options: Any = js.native
  
  def _prepareSelectionArea(): Unit = js.native
  
  def _recalculateSelectionAreaRect(): Unit = js.native
  
  def _redrawSelectionArea(): Unit = js.native
  
  /* private */ var _scrollAvailable: Any = js.native
  
  /* private */ var _scrollDelta: Any = js.native
  
  /* private */ var _scrollSpeed: Any = js.native
  
  /* private */ var _selectables: Any = js.native
  
  /* private */ var _selection: Any = js.native
  
  /* private */ var _singleClick: Any = js.native
  
  /* private */ var _targetElement: Any = js.native
  
  /* private */ var _targetRect: Any = js.native
  
  def _updateElementSelection(): Unit = js.native
  
  /**
    * Cancel the current selection process.
    * @param keepEvent {boolean} true to fire the onStop listener after cancel.
    */
  /**
    * Cancel the current selection process.
    * @param keepEvent {boolean} true to fire the onStop listener after cancel.
    */
  def cancel(): Unit = js.native
  def cancel(keepEvent: Boolean): Unit = js.native
  
  /**
    * Clear the elements which where saved by 'keepSelection()'.
    * @param store If the store should also get cleared
    */
  /**
    * Clear the elements which where saved by 'keepSelection()'.
    * @param store If the store should also get cleared
    */
  def clearSelection(): Unit = js.native
  def clearSelection(store: Boolean): Unit = js.native
  
  /**
    * Removes an particular element from the selection.
    * @param el - Element to remove.
    * @param quiet - If this should not trigger the move event
    * @returns boolean - true if the element was successfully removed
    */
  /**
    * Removes an particular element from the selection.
    * @param el - Element to remove.
    * @param quiet - If this should not trigger the move event
    * @returns boolean - true if the element was successfully removed
    */
  def deselect(el: Element): Boolean = js.native
  def deselect(el: Element, quiet: Boolean): Boolean = js.native
  
  /**
    * Unbinds all events and removes the area-element.
    */
  /**
    * Unbinds all events and removes the area-element.
    */
  def destroy(): Unit = js.native
  
  /**
    * Disable the selection functinality.
    */
  def disable(): Unit = js.native
  
  /**
    * Disable the selection functinality.
    */
  def enable(): Unit = js.native
  def enable(activate: Boolean): Unit = js.native
  
  /**
    * @returns {Array} Selected elements
    */
  /**
    * @returns {Array} Selected elements
    */
  def getSelection(): js.Array[Element] = js.native
  
  /**
    * @returns {HTMLElement} The selection area element
    */
  /**
    * @returns {HTMLElement} The selection area element
    */
  def getSelectionArea(): HTMLElement = js.native
  
  /**
    * Saves the current selection for the next selecion.
    * Allows multiple selections.
    */
  /**
    * Saves the current selection for the next selecion.
    * Allows multiple selections.
    */
  def keepSelection(): Unit = js.native
  
  /**
    * Can be used if during a selection elements have been added.
    * Will update everything which can be selected.
    */
  /**
    * Can be used if during a selection elements have been added.
    * Will update everything which can be selected.
    */
  def resolveSelectables(): Unit = js.native
  
  /**
    * Adds elements to the selection
    * @param query - CSS Query, can be an array of queries
    * @param quiet - If this should not trigger the move event
    */
  /**
    * Adds elements to the selection
    * @param query - CSS Query, can be an array of queries
    * @param quiet - If this should not trigger the move event
    */
  def select(query: SelectAllSelectors): js.Array[Element] = js.native
  def select(query: SelectAllSelectors, quiet: Boolean): js.Array[Element] = js.native
  
  /**
    * Manually triggers the start of a selection
    * @param evt A MouseEvent / TouchEvent -like object
    * @param silent If beforestart should be fired,
    */
  /**
    * Manually triggers the start of a selection
    * @param evt A MouseEvent / TouchEvent -like object
    * @param silent If beforestart should be fired,
    */
  def trigger(evt: MouseEvent): Unit = js.native
  def trigger(evt: MouseEvent, silent: Boolean): Unit = js.native
  def trigger(evt: TouchEvent): Unit = js.native
  def trigger(evt: TouchEvent, silent: Boolean): Unit = js.native
}

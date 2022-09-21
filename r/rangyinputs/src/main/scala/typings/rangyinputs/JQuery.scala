package typings.rangyinputs

import typings.rangyinputs.RangyInputs.Selection
import typings.rangyinputs.rangyinputsStrings.collapseToEnd
import typings.rangyinputs.rangyinputsStrings.collapseToStart
import typings.rangyinputs.rangyinputsStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  /** Collapses the selection to an insertion point (caret) either at the start of the current selection if toStart is true or the end of the current selection otherwise. */
  def collapseSelection(): JQuery = js.native
  def collapseSelection(toStart: Boolean): JQuery = js.native
  
  /** Deletes the currently selected text within the text input or textarea element and places the caret at the position where the deleted text had been. */
  def deleteSelectedText(): JQuery = js.native
  
  /** Deletes the text within the text input or textarea element between the specified start and end character indices and optionally places the caret at the position where the deleted text had been if moveSelection is true. */
  def deleteText(start: Double, end: Double): JQuery = js.native
  def deleteText(start: Double, end: Double, moveSelection: Boolean): JQuery = js.native
  
  /** Deletes the currently selected text within the text input or textarea element, places the caret at the position where the deleted text had been and returns the text that was deleted. */
  def extractSelectedText(): String = js.native
  
  /** Note that in IE the textarea or text input must have the focus before calling this method. You can ensure this by calling the focus() method of the element (or its jQuery object). */
  def getSelection(): Selection = js.native
  
  /**
    * Inserts the specified text at the specified character position within the text input or textarea element and optionally updates the selection depending on the value of selectionBehaviour. Possible values are:
    *
    * - "select": Selects the inserted text
    * - "collapseToStart": Collapses the selection to a caret at the start of the inserted text
    * - "collapseToEnd": Collapses the selection to a caret at the end of the inserted text
    *
    * If no value is supplied for selectionBehaviour, the selection is not changed and left at the mercy of the browser (placing the caret at the start is not uncommon when the textarea's value is changed).
    */
  def insertText(text: String, pos: Double): JQuery = js.native
  def insertText(text: String, pos: Double, selectionBehaviour: select | collapseToStart | collapseToEnd): JQuery = js.native
  
  /**
    * Replaces the currently selected text in the text input or textarea element with the specified text and optionally updates the selection depending on the value of selectionBehaviour. Possible values are:
    *
    * - "select": Selects the inserted text
    * - "collapseToStart": Collapses the selection to a caret at the start of the inserted text
    * - "collapseToEnd": Collapses the selection to a caret at the end of the inserted text
    *
    * If no value is supplied for selectionBehaviour, "collapseToEnd" is assumed.
    */
  def replaceSelectedText(text: String): JQuery = js.native
  def replaceSelectedText(text: String, selectionBehaviour: select | collapseToStart | collapseToEnd): JQuery = js.native
  
  /** Selects the text within the text input or textarea element between the specified start and end character indices. */
  def setSelection(start: Double): JQuery = js.native
  def setSelection(start: Double, end: Double): JQuery = js.native
  
  /**
    * Surrounds the currently selected text in the text input or textarea element with the specified pieces of text and optionally updates the selection depending on the value of selectionBehaviour. Possible values are:
    *
    * - "select": Selects the inserted text
    * - "collapseToStart": Collapses the selection to a caret at the start of the inserted text
    * - "collapseToEnd": Collapses the selection to a caret at the end of the inserted text
    *
    * If no value is supplied for selectionBehaviour, "select" is assumed.
    */
  def surroundSelectedText(textBefore: String, textAfter: String): JQuery = js.native
  def surroundSelectedText(
    textBefore: String,
    textAfter: String,
    selectionBehaviour: select | collapseToStart | collapseToEnd
  ): JQuery = js.native
}

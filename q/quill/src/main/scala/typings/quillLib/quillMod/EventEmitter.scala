package typings
package quillLib.quillMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventEmitter extends js.Object {
  @JSName("off")
  def off_editorchange(eventName: quillLib.quillLibStrings.`editor-change`, handler: EditorChangeHandler): EventEmitter = js.native
  @JSName("off")
  def off_selectionchange(eventName: quillLib.quillLibStrings.`selection-change`, handler: SelectionChangeHandler): EventEmitter = js.native
  @JSName("off")
  def off_textchange(eventName: quillLib.quillLibStrings.`text-change`, handler: TextChangeHandler): EventEmitter = js.native
  @JSName("on")
  def on_editorchange(eventName: quillLib.quillLibStrings.`editor-change`, handler: EditorChangeHandler): EventEmitter = js.native
  @JSName("on")
  def on_selectionchange(eventName: quillLib.quillLibStrings.`selection-change`, handler: SelectionChangeHandler): EventEmitter = js.native
  @JSName("on")
  def on_textchange(eventName: quillLib.quillLibStrings.`text-change`, handler: TextChangeHandler): EventEmitter = js.native
  @JSName("once")
  def once_editorchange(eventName: quillLib.quillLibStrings.`editor-change`, handler: EditorChangeHandler): EventEmitter = js.native
  @JSName("once")
  def once_selectionchange(eventName: quillLib.quillLibStrings.`selection-change`, handler: SelectionChangeHandler): EventEmitter = js.native
  @JSName("once")
  def once_textchange(eventName: quillLib.quillLibStrings.`text-change`, handler: TextChangeHandler): EventEmitter = js.native
}


package typings
package quillLib.quillMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventEmitter extends js.Object {
  @JSName("off")
  def `off_editor-change`(eventName: quillLib.quillLibStrings.`editor-change`, handler: EditorChangeHandler): EventEmitter = js.native
  @JSName("off")
  def `off_selection-change`(eventName: quillLib.quillLibStrings.`selection-change`, handler: SelectionChangeHandler): EventEmitter = js.native
  @JSName("off")
  def `off_text-change`(eventName: quillLib.quillLibStrings.`text-change`, handler: TextChangeHandler): EventEmitter = js.native
  @JSName("on")
  def `on_editor-change`(eventName: quillLib.quillLibStrings.`editor-change`, handler: EditorChangeHandler): EventEmitter = js.native
  @JSName("on")
  def `on_selection-change`(eventName: quillLib.quillLibStrings.`selection-change`, handler: SelectionChangeHandler): EventEmitter = js.native
  @JSName("on")
  def `on_text-change`(eventName: quillLib.quillLibStrings.`text-change`, handler: TextChangeHandler): EventEmitter = js.native
  @JSName("once")
  def `once_editor-change`(eventName: quillLib.quillLibStrings.`editor-change`, handler: EditorChangeHandler): EventEmitter = js.native
  @JSName("once")
  def `once_selection-change`(eventName: quillLib.quillLibStrings.`selection-change`, handler: SelectionChangeHandler): EventEmitter = js.native
  @JSName("once")
  def `once_text-change`(eventName: quillLib.quillLibStrings.`text-change`, handler: TextChangeHandler): EventEmitter = js.native
}


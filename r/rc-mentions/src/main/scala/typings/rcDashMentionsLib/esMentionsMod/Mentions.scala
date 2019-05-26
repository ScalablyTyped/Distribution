package typings
package rcDashMentionsLib.esMentionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mentions
  extends reactLib.reactMod.Component[MentionsProps, MentionsState, js.Any] {
  var focusId: js.UndefOr[scala.Double] = js.native
  var measure: js.UndefOr[stdLib.HTMLDivElement] = js.native
  var onChange: reactLib.reactMod.ChangeEventHandler[stdLib.HTMLTextAreaElement] = js.native
  var onInputBlur: reactLib.reactMod.FocusEventHandler[stdLib.HTMLTextAreaElement] = js.native
  var onInputFocus: reactLib.reactMod.FocusEventHandler[stdLib.HTMLTextAreaElement] = js.native
  var onKeyDown: reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLTextAreaElement] = js.native
  /**
    * When to start measure:
    * 1. When user press `prefix`
    * 2. When measureText !== prevMeasureText
    *  - If measure hit
    *  - If measuring
    *
    * When to stop measure:
    * 1. Selection is out of range
    * 2. Contains `space`
    * 3. ESC or select one
    */
  var onKeyUp: reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLTextAreaElement] = js.native
  var textarea: js.UndefOr[stdLib.HTMLTextAreaElement] = js.native
  def blur(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MMentions(): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def getOptions(): js.Array[rcDashMentionsLib.esOptionMod.OptionProps] = js.native
  def getOptions(measureText: java.lang.String): js.Array[rcDashMentionsLib.esOptionMod.OptionProps] = js.native
  def onBlur(event: reactLib.reactMod.FocusEvent[stdLib.HTMLTextAreaElement]): scala.Unit = js.native
  def onDropdownFocus(): scala.Unit = js.native
  def onFocus(): scala.Unit = js.native
  def onFocus(event: reactLib.reactMod.FocusEvent[stdLib.HTMLTextAreaElement]): scala.Unit = js.native
  def selectOption(option: rcDashMentionsLib.esOptionMod.OptionProps): scala.Unit = js.native
  def setActiveIndex(activeIndex: scala.Double): scala.Unit = js.native
  def setMeasureRef(element: stdLib.HTMLDivElement): scala.Unit = js.native
  def setTextAreaRef(element: stdLib.HTMLTextAreaElement): scala.Unit = js.native
  def startMeasure(measureText: java.lang.String, measurePrefix: java.lang.String, measureLocation: scala.Double): scala.Unit = js.native
  def stopMeasure(): scala.Unit = js.native
  def stopMeasure(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def triggerChange(value: java.lang.String): scala.Unit = js.native
}


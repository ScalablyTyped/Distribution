package typings.slateDashReact.slateDashReactMod

import typings.react.Element
import typings.react.Event
import typings.react.reactMod.SyntheticEvent
import typings.slate.slateMod.Node
import typings.slate.slateMod.Range
import typings.slateDashReact.Anon_Node
import typings.std.Selection
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate-react", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def cloneFragment(event: SyntheticEvent[Element, Event], editor: typings.slate.slateMod.Editor): Unit = js.native
  def cloneFragment(
    event: SyntheticEvent[Element, Event],
    editor: typings.slate.slateMod.Editor,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def cloneFragment(event: typings.std.Event, editor: typings.slate.slateMod.Editor): Unit = js.native
  def cloneFragment(event: typings.std.Event, editor: typings.slate.slateMod.Editor, callback: js.Function0[Unit]): Unit = js.native
  def findDOMNode(node: Node): typings.std.Element = js.native
  def findDOMNode(node: Node, win: Window): typings.std.Element = js.native
  def findDOMRange(range: Range): Range = js.native
  def findDOMRange(range: Range, win: Window): Range = js.native
  def findNode(element: typings.std.Element, editor: typings.slate.slateMod.Editor): Node = js.native
  def findRange(selection: Range, editor: typings.slate.slateMod.Editor): Range = js.native
  def findRange(selection: Selection, editor: typings.slate.slateMod.Editor): Range = js.native
  def getEventRange(event: SyntheticEvent[Element, Event], editor: typings.slate.slateMod.Editor): Range = js.native
  def getEventRange(event: typings.std.Event, editor: typings.slate.slateMod.Editor): Range = js.native
  def getEventTransfer(event: SyntheticEvent[Element, Event]): Anon_Node = js.native
  def getEventTransfer(event: typings.std.Event): Anon_Node = js.native
  def setEventTransfer(event: SyntheticEvent[Element, Event], `type`: SlateType, data: js.Any): Unit = js.native
  def setEventTransfer(event: typings.std.Event, `type`: SlateType, data: js.Any): Unit = js.native
}


package typings.slateDashReact.slateDashReactMod

import typings.immutable.immutableMod.List
import typings.react.Element
import typings.react.Event
import typings.react.reactMod.SyntheticEvent
import typings.slate.slateMod.Node
import typings.slate.slateMod.Point
import typings.slate.slateMod.RangeType
import typings.slate.slateMod.RangeTypeJSON
import typings.slate.slateMod.RangeTypeProperties
import typings.slateDashReact.Anon_Node
import typings.slateDashReact.Anon_NodeType
import typings.std.Range
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
  def findDOMNode(node: String): typings.std.Element = js.native
  def findDOMNode(node: String, win: Window): typings.std.Element = js.native
  def findDOMNode(node: Node): typings.std.Element = js.native
  def findDOMNode(node: Node, win: Window): typings.std.Element = js.native
  def findDOMPoint(point: Point): Anon_Node | Null = js.native
  def findDOMPoint(point: Point, win: Window): Anon_Node | Null = js.native
  def findDOMRange(range: RangeType): Range | Null = js.native
  def findDOMRange(range: RangeTypeJSON): Range | Null = js.native
  def findDOMRange(range: RangeTypeJSON, win: Window): Range | Null = js.native
  def findDOMRange(range: RangeTypeProperties): Range | Null = js.native
  def findDOMRange(range: RangeTypeProperties, win: Window): Range | Null = js.native
  def findDOMRange(range: RangeType, win: Window): Range | Null = js.native
  def findNode(element: typings.std.Element, editor: typings.slate.slateMod.Editor): Node = js.native
  def findPath(element: typings.std.Element, editor: typings.slate.slateMod.Editor): List[Double] | Null = js.native
  def findPoint(nativeNode: typings.std.Element, nativeOffset: Double, editor: typings.slate.slateMod.Editor): Point | Null = js.native
  def findRange(domRange: Range, editor: typings.slate.slateMod.Editor): typings.slate.slateMod.Range | Null = js.native
  def findRange(domRange: Selection, editor: typings.slate.slateMod.Editor): typings.slate.slateMod.Range | Null = js.native
  def getEventRange(event: SyntheticEvent[Element, Event], editor: typings.slate.slateMod.Editor): typings.slate.slateMod.Range | Null = js.native
  def getEventRange(event: typings.std.Event, editor: typings.slate.slateMod.Editor): typings.slate.slateMod.Range | Null = js.native
  def getEventTransfer(event: SyntheticEvent[Element, Event]): Anon_NodeType = js.native
  def getEventTransfer(event: typings.std.Event): Anon_NodeType = js.native
  def setEventTransfer(event: SyntheticEvent[Element, Event], `type`: SlateType, data: js.Any): Unit = js.native
  def setEventTransfer(event: typings.std.Event, `type`: SlateType, data: js.Any): Unit = js.native
}


package typings
package slateDashReactLib.slateDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate-react", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def cloneFragment(
    event: reactLib.reactMod.SyntheticEvent[reactLib.Element, reactLib.Event],
    editor: slateLib.slateMod.Editor
  ): scala.Unit = js.native
  def cloneFragment(
    event: reactLib.reactMod.SyntheticEvent[reactLib.Element, reactLib.Event],
    editor: slateLib.slateMod.Editor,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def cloneFragment(event: stdLib.Event, editor: slateLib.slateMod.Editor): scala.Unit = js.native
  def cloneFragment(event: stdLib.Event, editor: slateLib.slateMod.Editor, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def findDOMNode(node: slateLib.slateMod.Node): stdLib.Element = js.native
  def findDOMNode(node: slateLib.slateMod.Node, win: stdLib.Window): stdLib.Element = js.native
  def findDOMRange(range: slateLib.slateMod.Range): slateLib.slateMod.Range = js.native
  def findDOMRange(range: slateLib.slateMod.Range, win: stdLib.Window): slateLib.slateMod.Range = js.native
  def findNode(element: stdLib.Element, editor: slateLib.slateMod.Editor): slateLib.slateMod.Node = js.native
  def findRange(selection: slateLib.slateMod.Range, editor: slateLib.slateMod.Editor): slateLib.slateMod.Range = js.native
  def findRange(selection: stdLib.Selection, editor: slateLib.slateMod.Editor): slateLib.slateMod.Range = js.native
  def getEventRange(
    event: reactLib.reactMod.SyntheticEvent[reactLib.Element, reactLib.Event],
    editor: slateLib.slateMod.Editor
  ): slateLib.slateMod.Range = js.native
  def getEventRange(event: stdLib.Event, editor: slateLib.slateMod.Editor): slateLib.slateMod.Range = js.native
  def getEventTransfer(event: reactLib.reactMod.SyntheticEvent[reactLib.Element, reactLib.Event]): slateDashReactLib.Anon_NodeType = js.native
  def getEventTransfer(event: stdLib.Event): slateDashReactLib.Anon_NodeType = js.native
  def setEventTransfer(
    event: reactLib.reactMod.SyntheticEvent[reactLib.Element, reactLib.Event],
    `type`: SlateType,
    data: js.Any
  ): scala.Unit = js.native
  def setEventTransfer(event: stdLib.Event, `type`: SlateType, data: js.Any): scala.Unit = js.native
}


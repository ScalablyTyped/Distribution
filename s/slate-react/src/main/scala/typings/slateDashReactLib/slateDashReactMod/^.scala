package typings
package slateDashReactLib.slateDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate-react", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def cloneFragment(event: stdLib.Event, value: slateLib.slateMod.Value): scala.Unit = js.native
  def cloneFragment(
    event: stdLib.Event,
    value: slateLib.slateMod.Value,
    fragment: slateLib.slateMod.Document[org.scalablytyped.runtime.StringDictionary[_]]
  ): scala.Unit = js.native
  def cloneFragment(
    event: stdLib.Event,
    value: slateLib.slateMod.Value,
    fragment: slateLib.slateMod.Document[org.scalablytyped.runtime.StringDictionary[_]],
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def findDOMNode(node: slateLib.slateMod.Node): stdLib.Element = js.native
  def findDOMNode(node: slateLib.slateMod.Node, win: stdLib.Window): stdLib.Element = js.native
  def findDOMRange(range: slateLib.slateMod.Range): slateLib.slateMod.Range = js.native
  def findDOMRange(range: slateLib.slateMod.Range, win: stdLib.Window): slateLib.slateMod.Range = js.native
  def findNode(element: stdLib.Element, value: slateLib.slateMod.Value): slateLib.slateMod.Node = js.native
  def findRange(selection: stdLib.Selection, value: slateLib.slateMod.Value): slateLib.slateMod.Range = js.native
  def getEventRange(event: stdLib.Event, value: slateLib.slateMod.Value): slateLib.slateMod.Range = js.native
  def getEventTransfer(event: stdLib.Event): slateDashReactLib.Anon_Node = js.native
  def setEventTransfer(event: stdLib.Event, `type`: SlateType, data: js.Any): scala.Unit = js.native
}


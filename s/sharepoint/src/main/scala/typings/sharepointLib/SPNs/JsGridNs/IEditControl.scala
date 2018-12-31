package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IEditControl extends js.Object {
  var Focus: js.UndefOr[
    js.Function1[/* eventInfo */ microsoftDashAjaxLib.SysNs.UINs.DomEvent, scala.Unit]
  ] = js.undefined
  var GetCellContext: js.UndefOr[js.Function0[IEditControlCellContext]] = js.undefined
  var GetInputElement: js.UndefOr[js.Function0[stdLib.HTMLElement]] = js.undefined
  var GetOriginalValue: js.UndefOr[js.Function0[IValue]] = js.undefined
  var IsCurrentlyUsingGridTextInputElement: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  var OnCellMove: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var OnValueChanged: js.UndefOr[js.Function1[/* newValue */ IValue, scala.Unit]] = js.undefined
  var SetSize: js.UndefOr[js.Function2[/* width */ scala.Double, /* height */ scala.Double, scala.Unit]] = js.undefined
  var SetValue: js.UndefOr[js.Function1[/* value */ IValue, scala.Unit]] = js.undefined
  var SupportedReadMode: js.UndefOr[EditActorReadType] = js.undefined
  var SupportedWriteMode: js.UndefOr[EditActorWriteType] = js.undefined
  def BindToCell(cellContext: IEditControlCellContext): scala.Unit
  def Dispose(): scala.Unit
  def OnBeginEdit(eventInfo: microsoftDashAjaxLib.SysNs.UINs.DomEvent): scala.Unit
  def OnEndEdit(): scala.Unit
  def Unbind(): scala.Unit
}


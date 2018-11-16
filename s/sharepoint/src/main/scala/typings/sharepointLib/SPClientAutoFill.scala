package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SPClientAutoFill")
@js.native
class SPClientAutoFill protected () extends js.Object {
  def this(elmTextId: java.lang.String, elmContainerId: java.lang.String, fnPopulateAutoFill: js.Function1[/* targetElement */ stdLib.HTMLInputElement, scala.Unit]) = this()
  var AllOptionData: ScalablyTyped.runtime.StringDictionary[ISPClientAutoFillData] = js.native
  var AutoFillCallbackTimeoutID: java.lang.String = js.native
  var AutoFillContainerId: java.lang.String = js.native
  var AutoFillMenuId: java.lang.String = js.native
  var AutoFillMinTextLength: scala.Double = js.native
  var AutoFillTimeout: scala.Double = js.native
  var CurrentFocusOption: scala.Double = js.native
  var TextElementId: java.lang.String = js.native
  var VisibleItemCount: scala.Double = js.native
  def BlurAutoFill(): scala.Unit = js.native
  def CloseAutoFill(ojData: ISPClientAutoFillData): scala.Unit = js.native
  def FocusAutoFill(): scala.Unit = js.native
  def FuncOnAutoFillClose(elmTextId: java.lang.String, ojData: ISPClientAutoFillData): scala.Unit = js.native
  def FuncPopulateAutoFill(targetElement: stdLib.HTMLElement): scala.Unit = js.native
  def IsAutoFillOpen(): scala.Boolean = js.native
  def PopulateAutoFill(
    jsonObjSuggestions: js.Array[ISPClientAutoFillData],
    fnOnAutoFillCloseFuncName: js.Function2[/* elmTextId */ java.lang.String, /* objData */ ISPClientAutoFillData, scala.Unit]
  ): scala.Unit = js.native
  def SelectAutoFillOption(elemOption: stdLib.HTMLElement): scala.Unit = js.native
  def SetAutoFillHeight(): scala.Unit = js.native
  def UpdateAutoFillMenuFocus(bMoveNextLink: scala.Boolean): scala.Unit = js.native
  def UpdateAutoFillPosition(): scala.Unit = js.native
}

@JSGlobal("SPClientAutoFill")
@js.native
object SPClientAutoFill extends js.Object {
   // = 'AutoFillKey';
  var DisplayTextProperty: java.lang.String = js.native
  var KeyProperty: java.lang.String = js.native
  var MenuOptionType: sharepointLib.Anon_Option = js.native
   // = 'AutoFillTitleText';
  var MenuOptionTypeProperty: java.lang.String = js.native
   // = 'AutoFillDisplayText';
  var SubDisplayTextProperty: java.lang.String = js.native
   // = 'AutoFillSubDisplayText';
  var TitleTextProperty: java.lang.String = js.native
  def GetAutoFillMenuItemFromOption(elmChild: stdLib.HTMLElement): stdLib.HTMLElement = js.native
  def GetAutoFillObjFromContainer(elmChild: stdLib.HTMLElement): sharepointLib.SPClientAutoFill = js.native
   // = 'AutoFillMenuOptionType';
  def GetAutoFillObjFromInput(elmText: stdLib.HTMLInputElement): sharepointLib.SPClientAutoFill = js.native
}


package typings.sharepoint

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SPClientAutoFill")
@js.native
class SPClientAutoFill protected () extends js.Object {
  def this(
    elmTextId: String,
    elmContainerId: String,
    fnPopulateAutoFill: js.Function1[/* targetElement */ HTMLInputElement, Unit]
  ) = this()
  var AllOptionData: StringDictionary[ISPClientAutoFillData] = js.native
  var AutoFillCallbackTimeoutID: String = js.native
  var AutoFillContainerId: String = js.native
  var AutoFillMenuId: String = js.native
  var AutoFillMinTextLength: Double = js.native
  var AutoFillTimeout: Double = js.native
  var CurrentFocusOption: Double = js.native
  var TextElementId: String = js.native
  var VisibleItemCount: Double = js.native
  def BlurAutoFill(): Unit = js.native
  def CloseAutoFill(ojData: ISPClientAutoFillData): Unit = js.native
  def FocusAutoFill(): Unit = js.native
  def FuncOnAutoFillClose(elmTextId: String, ojData: ISPClientAutoFillData): Unit = js.native
  def FuncPopulateAutoFill(targetElement: HTMLElement): Unit = js.native
  def IsAutoFillOpen(): Boolean = js.native
  def PopulateAutoFill(
    jsonObjSuggestions: js.Array[ISPClientAutoFillData],
    fnOnAutoFillCloseFuncName: js.Function2[/* elmTextId */ String, /* objData */ ISPClientAutoFillData, Unit]
  ): Unit = js.native
  def SelectAutoFillOption(elemOption: HTMLElement): Unit = js.native
  def SetAutoFillHeight(): Unit = js.native
  def UpdateAutoFillMenuFocus(bMoveNextLink: Boolean): Unit = js.native
  def UpdateAutoFillPosition(): Unit = js.native
}

/* static members */
@JSGlobal("SPClientAutoFill")
@js.native
object SPClientAutoFill extends js.Object {
   // = 'AutoFillKey';
  var DisplayTextProperty: String = js.native
  var KeyProperty: String = js.native
  var MenuOptionType: AnonFooter = js.native
   // = 'AutoFillTitleText';
  var MenuOptionTypeProperty: String = js.native
   // = 'AutoFillDisplayText';
  var SubDisplayTextProperty: String = js.native
   // = 'AutoFillSubDisplayText';
  var TitleTextProperty: String = js.native
  def GetAutoFillMenuItemFromOption(elmChild: HTMLElement): HTMLElement = js.native
  def GetAutoFillObjFromContainer(elmChild: HTMLElement): SPClientAutoFill = js.native
   // = 'AutoFillMenuOptionType';
  def GetAutoFillObjFromInput(elmText: HTMLInputElement): SPClientAutoFill = js.native
}


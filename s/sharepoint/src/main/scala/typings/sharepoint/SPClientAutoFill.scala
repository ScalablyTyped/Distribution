package typings.sharepoint

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SPClientAutoFill extends js.Object {
  var AllOptionData: StringDictionary[ISPClientAutoFillData]
  var AutoFillCallbackTimeoutID: String
  var AutoFillContainerId: String
  var AutoFillMenuId: String
  var AutoFillMinTextLength: Double
  var AutoFillTimeout: Double
  var CurrentFocusOption: Double
  var TextElementId: String
  var VisibleItemCount: Double
  def BlurAutoFill(): Unit
  def CloseAutoFill(ojData: ISPClientAutoFillData): Unit
  def FocusAutoFill(): Unit
  def FuncOnAutoFillClose(elmTextId: String, ojData: ISPClientAutoFillData): Unit
  def FuncPopulateAutoFill(targetElement: HTMLElement): Unit
  def IsAutoFillOpen(): Boolean
  def PopulateAutoFill(
    jsonObjSuggestions: js.Array[ISPClientAutoFillData],
    fnOnAutoFillCloseFuncName: js.Function2[/* elmTextId */ String, /* objData */ ISPClientAutoFillData, Unit]
  ): Unit
  def SelectAutoFillOption(elemOption: HTMLElement): Unit
  def SetAutoFillHeight(): Unit
  def UpdateAutoFillMenuFocus(bMoveNextLink: Boolean): Unit
  def UpdateAutoFillPosition(): Unit
}

object SPClientAutoFill {
  @scala.inline
  def apply(
    AllOptionData: StringDictionary[ISPClientAutoFillData],
    AutoFillCallbackTimeoutID: String,
    AutoFillContainerId: String,
    AutoFillMenuId: String,
    AutoFillMinTextLength: Double,
    AutoFillTimeout: Double,
    BlurAutoFill: () => Unit,
    CloseAutoFill: ISPClientAutoFillData => Unit,
    CurrentFocusOption: Double,
    FocusAutoFill: () => Unit,
    FuncOnAutoFillClose: (String, ISPClientAutoFillData) => Unit,
    FuncPopulateAutoFill: HTMLElement => Unit,
    IsAutoFillOpen: () => Boolean,
    PopulateAutoFill: (js.Array[ISPClientAutoFillData], js.Function2[/* elmTextId */ String, /* objData */ ISPClientAutoFillData, Unit]) => Unit,
    SelectAutoFillOption: HTMLElement => Unit,
    SetAutoFillHeight: () => Unit,
    TextElementId: String,
    UpdateAutoFillMenuFocus: Boolean => Unit,
    UpdateAutoFillPosition: () => Unit,
    VisibleItemCount: Double
  ): SPClientAutoFill = {
    val __obj = js.Dynamic.literal(AllOptionData = AllOptionData.asInstanceOf[js.Any], AutoFillCallbackTimeoutID = AutoFillCallbackTimeoutID.asInstanceOf[js.Any], AutoFillContainerId = AutoFillContainerId.asInstanceOf[js.Any], AutoFillMenuId = AutoFillMenuId.asInstanceOf[js.Any], AutoFillMinTextLength = AutoFillMinTextLength.asInstanceOf[js.Any], AutoFillTimeout = AutoFillTimeout.asInstanceOf[js.Any], BlurAutoFill = js.Any.fromFunction0(BlurAutoFill), CloseAutoFill = js.Any.fromFunction1(CloseAutoFill), CurrentFocusOption = CurrentFocusOption.asInstanceOf[js.Any], FocusAutoFill = js.Any.fromFunction0(FocusAutoFill), FuncOnAutoFillClose = js.Any.fromFunction2(FuncOnAutoFillClose), FuncPopulateAutoFill = js.Any.fromFunction1(FuncPopulateAutoFill), IsAutoFillOpen = js.Any.fromFunction0(IsAutoFillOpen), PopulateAutoFill = js.Any.fromFunction2(PopulateAutoFill), SelectAutoFillOption = js.Any.fromFunction1(SelectAutoFillOption), SetAutoFillHeight = js.Any.fromFunction0(SetAutoFillHeight), TextElementId = TextElementId.asInstanceOf[js.Any], UpdateAutoFillMenuFocus = js.Any.fromFunction1(UpdateAutoFillMenuFocus), UpdateAutoFillPosition = js.Any.fromFunction0(UpdateAutoFillPosition), VisibleItemCount = VisibleItemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SPClientAutoFill]
  }
}


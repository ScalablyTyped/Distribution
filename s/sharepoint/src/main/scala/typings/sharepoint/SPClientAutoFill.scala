package typings.sharepoint

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SPClientAutoFill extends StObject {
  
  var AllOptionData: StringDictionary[ISPClientAutoFillData]
  
  var AutoFillCallbackTimeoutID: String
  
  var AutoFillContainerId: String
  
  var AutoFillMenuId: String
  
  var AutoFillMinTextLength: Double
  
  var AutoFillTimeout: Double
  
  def BlurAutoFill(): Unit
  
  def CloseAutoFill(ojData: ISPClientAutoFillData): Unit
  
  var CurrentFocusOption: Double
  
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
  
  var TextElementId: String
  
  def UpdateAutoFillMenuFocus(bMoveNextLink: Boolean): Unit
  
  def UpdateAutoFillPosition(): Unit
  
  var VisibleItemCount: Double
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
  
  @scala.inline
  implicit class SPClientAutoFillMutableBuilder[Self <: SPClientAutoFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllOptionData(value: StringDictionary[ISPClientAutoFillData]): Self = StObject.set(x, "AllOptionData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFillCallbackTimeoutID(value: String): Self = StObject.set(x, "AutoFillCallbackTimeoutID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFillContainerId(value: String): Self = StObject.set(x, "AutoFillContainerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFillMenuId(value: String): Self = StObject.set(x, "AutoFillMenuId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFillMinTextLength(value: Double): Self = StObject.set(x, "AutoFillMinTextLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFillTimeout(value: Double): Self = StObject.set(x, "AutoFillTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlurAutoFill(value: () => Unit): Self = StObject.set(x, "BlurAutoFill", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloseAutoFill(value: ISPClientAutoFillData => Unit): Self = StObject.set(x, "CloseAutoFill", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCurrentFocusOption(value: Double): Self = StObject.set(x, "CurrentFocusOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusAutoFill(value: () => Unit): Self = StObject.set(x, "FocusAutoFill", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFuncOnAutoFillClose(value: (String, ISPClientAutoFillData) => Unit): Self = StObject.set(x, "FuncOnAutoFillClose", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFuncPopulateAutoFill(value: HTMLElement => Unit): Self = StObject.set(x, "FuncPopulateAutoFill", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsAutoFillOpen(value: () => Boolean): Self = StObject.set(x, "IsAutoFillOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPopulateAutoFill(
      value: (js.Array[ISPClientAutoFillData], js.Function2[/* elmTextId */ String, /* objData */ ISPClientAutoFillData, Unit]) => Unit
    ): Self = StObject.set(x, "PopulateAutoFill", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectAutoFillOption(value: HTMLElement => Unit): Self = StObject.set(x, "SelectAutoFillOption", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAutoFillHeight(value: () => Unit): Self = StObject.set(x, "SetAutoFillHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTextElementId(value: String): Self = StObject.set(x, "TextElementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateAutoFillMenuFocus(value: Boolean => Unit): Self = StObject.set(x, "UpdateAutoFillMenuFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateAutoFillPosition(value: () => Unit): Self = StObject.set(x, "UpdateAutoFillPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVisibleItemCount(value: Double): Self = StObject.set(x, "VisibleItemCount", value.asInstanceOf[js.Any])
  }
}

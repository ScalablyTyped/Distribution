package typings.sharepoint.global

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.ISPClientAutoFillData
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SPClientAutoFill")
@js.native
class SPClientAutoFill protected ()
  extends StObject
     with typings.sharepoint.SPClientAutoFill {
  def this(
    elmTextId: String,
    elmContainerId: String,
    fnPopulateAutoFill: js.Function1[/* targetElement */ HTMLInputElement, Unit]
  ) = this()
  
  /* CompleteClass */
  var AllOptionData: StringDictionary[ISPClientAutoFillData] = js.native
  
  /* CompleteClass */
  var AutoFillCallbackTimeoutID: String = js.native
  
  /* CompleteClass */
  var AutoFillContainerId: String = js.native
  
  /* CompleteClass */
  var AutoFillMenuId: String = js.native
  
  /* CompleteClass */
  var AutoFillMinTextLength: Double = js.native
  
  /* CompleteClass */
  var AutoFillTimeout: Double = js.native
  
  /* CompleteClass */
  override def BlurAutoFill(): Unit = js.native
  
  /* CompleteClass */
  override def CloseAutoFill(ojData: ISPClientAutoFillData): Unit = js.native
  
  /* CompleteClass */
  var CurrentFocusOption: Double = js.native
  
  /* CompleteClass */
  override def FocusAutoFill(): Unit = js.native
  
  /* CompleteClass */
  override def FuncOnAutoFillClose(elmTextId: String, ojData: ISPClientAutoFillData): Unit = js.native
  
  /* CompleteClass */
  override def FuncPopulateAutoFill(targetElement: HTMLElement): Unit = js.native
  
  /* CompleteClass */
  override def IsAutoFillOpen(): Boolean = js.native
  
  /* CompleteClass */
  override def PopulateAutoFill(
    jsonObjSuggestions: js.Array[ISPClientAutoFillData],
    fnOnAutoFillCloseFuncName: js.Function2[/* elmTextId */ String, /* objData */ ISPClientAutoFillData, Unit]
  ): Unit = js.native
  
  /* CompleteClass */
  override def SelectAutoFillOption(elemOption: HTMLElement): Unit = js.native
  
  /* CompleteClass */
  override def SetAutoFillHeight(): Unit = js.native
  
  /* CompleteClass */
  var TextElementId: String = js.native
  
  /* CompleteClass */
  override def UpdateAutoFillMenuFocus(bMoveNextLink: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def UpdateAutoFillPosition(): Unit = js.native
  
  /* CompleteClass */
  var VisibleItemCount: Double = js.native
}
object SPClientAutoFill {
  
  @JSGlobal("SPClientAutoFill")
  @js.native
  val ^ : js.Any = js.native
  
  // = 'AutoFillKey';
  /* static member */
  @JSGlobal("SPClientAutoFill.DisplayTextProperty")
  @js.native
  def DisplayTextProperty: String = js.native
  inline def DisplayTextProperty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DisplayTextProperty")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def GetAutoFillMenuItemFromOption(elmChild: HTMLElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("GetAutoFillMenuItemFromOption")(elmChild.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  
  /* static member */
  inline def GetAutoFillObjFromContainer(elmChild: HTMLElement): typings.sharepoint.SPClientAutoFill = ^.asInstanceOf[js.Dynamic].applyDynamic("GetAutoFillObjFromContainer")(elmChild.asInstanceOf[js.Any]).asInstanceOf[typings.sharepoint.SPClientAutoFill]
  
  // = 'AutoFillMenuOptionType';
  /* static member */
  inline def GetAutoFillObjFromInput(elmText: HTMLInputElement): typings.sharepoint.SPClientAutoFill = ^.asInstanceOf[js.Dynamic].applyDynamic("GetAutoFillObjFromInput")(elmText.asInstanceOf[js.Any]).asInstanceOf[typings.sharepoint.SPClientAutoFill]
  
  /* static member */
  @JSGlobal("SPClientAutoFill.KeyProperty")
  @js.native
  def KeyProperty: String = js.native
  inline def KeyProperty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KeyProperty")(x.asInstanceOf[js.Any])
  
  /* static member */
  object MenuOptionType {
    
    @JSGlobal("SPClientAutoFill.MenuOptionType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("SPClientAutoFill.MenuOptionType.Footer")
    @js.native
    def Footer: Double = js.native
    inline def Footer_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
    
    @JSGlobal("SPClientAutoFill.MenuOptionType.Loading")
    @js.native
    def Loading: Double = js.native
    inline def Loading_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Loading")(x.asInstanceOf[js.Any])
    
    @JSGlobal("SPClientAutoFill.MenuOptionType.Option")
    @js.native
    def Option: Double = js.native
    inline def Option_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Option")(x.asInstanceOf[js.Any])
    
    @JSGlobal("SPClientAutoFill.MenuOptionType.Separator")
    @js.native
    def Separator: Double = js.native
    inline def Separator_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Separator")(x.asInstanceOf[js.Any])
  }
  
  // = 'AutoFillTitleText';
  /* static member */
  @JSGlobal("SPClientAutoFill.MenuOptionTypeProperty")
  @js.native
  def MenuOptionTypeProperty: String = js.native
  inline def MenuOptionTypeProperty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MenuOptionTypeProperty")(x.asInstanceOf[js.Any])
  
  // = 'AutoFillDisplayText';
  /* static member */
  @JSGlobal("SPClientAutoFill.SubDisplayTextProperty")
  @js.native
  def SubDisplayTextProperty: String = js.native
  inline def SubDisplayTextProperty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SubDisplayTextProperty")(x.asInstanceOf[js.Any])
  
  // = 'AutoFillSubDisplayText';
  /* static member */
  @JSGlobal("SPClientAutoFill.TitleTextProperty")
  @js.native
  def TitleTextProperty: String = js.native
  inline def TitleTextProperty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TitleTextProperty")(x.asInstanceOf[js.Any])
}

package typings.sharepoint.global

import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SPClientAutoFill")
@js.native
class SPClientAutoFill protected ()
  extends typings.sharepoint.SPClientAutoFill {
  def this(
    elmTextId: String,
    elmContainerId: String,
    fnPopulateAutoFill: js.Function1[/* targetElement */ HTMLInputElement, Unit]
  ) = this()
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
  @scala.inline
  def DisplayTextProperty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DisplayTextProperty")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("SPClientAutoFill.GetAutoFillMenuItemFromOption")
  @js.native
  def GetAutoFillMenuItemFromOption(elmChild: HTMLElement): HTMLElement = js.native
  
  /* static member */
  @JSGlobal("SPClientAutoFill.GetAutoFillObjFromContainer")
  @js.native
  def GetAutoFillObjFromContainer(elmChild: HTMLElement): typings.sharepoint.SPClientAutoFill = js.native
  
  // = 'AutoFillMenuOptionType';
  /* static member */
  @JSGlobal("SPClientAutoFill.GetAutoFillObjFromInput")
  @js.native
  def GetAutoFillObjFromInput(elmText: HTMLInputElement): typings.sharepoint.SPClientAutoFill = js.native
  
  /* static member */
  @JSGlobal("SPClientAutoFill.KeyProperty")
  @js.native
  def KeyProperty: String = js.native
  @scala.inline
  def KeyProperty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KeyProperty")(x.asInstanceOf[js.Any])
  
  /* static member */
  object MenuOptionType {
    
    @JSGlobal("SPClientAutoFill.MenuOptionType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("SPClientAutoFill.MenuOptionType.Footer")
    @js.native
    def Footer: Double = js.native
    @scala.inline
    def Footer_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
    
    @JSGlobal("SPClientAutoFill.MenuOptionType.Loading")
    @js.native
    def Loading: Double = js.native
    @scala.inline
    def Loading_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Loading")(x.asInstanceOf[js.Any])
    
    @JSGlobal("SPClientAutoFill.MenuOptionType.Option")
    @js.native
    def Option: Double = js.native
    @scala.inline
    def Option_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Option")(x.asInstanceOf[js.Any])
    
    @JSGlobal("SPClientAutoFill.MenuOptionType.Separator")
    @js.native
    def Separator: Double = js.native
    @scala.inline
    def Separator_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Separator")(x.asInstanceOf[js.Any])
  }
  
  // = 'AutoFillTitleText';
  /* static member */
  @JSGlobal("SPClientAutoFill.MenuOptionTypeProperty")
  @js.native
  def MenuOptionTypeProperty: String = js.native
  @scala.inline
  def MenuOptionTypeProperty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MenuOptionTypeProperty")(x.asInstanceOf[js.Any])
  
  // = 'AutoFillDisplayText';
  /* static member */
  @JSGlobal("SPClientAutoFill.SubDisplayTextProperty")
  @js.native
  def SubDisplayTextProperty: String = js.native
  @scala.inline
  def SubDisplayTextProperty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SubDisplayTextProperty")(x.asInstanceOf[js.Any])
  
  // = 'AutoFillSubDisplayText';
  /* static member */
  @JSGlobal("SPClientAutoFill.TitleTextProperty")
  @js.native
  def TitleTextProperty: String = js.native
  @scala.inline
  def TitleTextProperty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TitleTextProperty")(x.asInstanceOf[js.Any])
}

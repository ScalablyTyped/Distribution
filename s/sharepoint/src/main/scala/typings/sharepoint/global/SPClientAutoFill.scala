package typings.sharepoint.global

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.ISPClientAutoFillData
import typings.sharepoint.anon.Footer
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SPClientAutoFill")
@js.native
class SPClientAutoFill protected ()
  extends typings.sharepoint.SPClientAutoFill {
  def this(
    elmTextId: String,
    elmContainerId: String,
    fnPopulateAutoFill: js.Function1[/* targetElement */ HTMLInputElement, Unit]
  ) = this()
  /* CompleteClass */
  override var AllOptionData: StringDictionary[ISPClientAutoFillData] = js.native
  /* CompleteClass */
  override var AutoFillCallbackTimeoutID: String = js.native
  /* CompleteClass */
  override var AutoFillContainerId: String = js.native
  /* CompleteClass */
  override var AutoFillMenuId: String = js.native
  /* CompleteClass */
  override var AutoFillMinTextLength: Double = js.native
  /* CompleteClass */
  override var AutoFillTimeout: Double = js.native
  /* CompleteClass */
  override var CurrentFocusOption: Double = js.native
  /* CompleteClass */
  override var TextElementId: String = js.native
  /* CompleteClass */
  override var VisibleItemCount: Double = js.native
  /* CompleteClass */
  override def BlurAutoFill(): Unit = js.native
  /* CompleteClass */
  override def CloseAutoFill(ojData: ISPClientAutoFillData): Unit = js.native
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
  override def UpdateAutoFillMenuFocus(bMoveNextLink: Boolean): Unit = js.native
  /* CompleteClass */
  override def UpdateAutoFillPosition(): Unit = js.native
}

/* static members */
@JSGlobal("SPClientAutoFill")
@js.native
object SPClientAutoFill extends js.Object {
   // = 'AutoFillKey';
  var DisplayTextProperty: String = js.native
  var KeyProperty: String = js.native
  var MenuOptionType: Footer = js.native
   // = 'AutoFillTitleText';
  var MenuOptionTypeProperty: String = js.native
   // = 'AutoFillDisplayText';
  var SubDisplayTextProperty: String = js.native
   // = 'AutoFillSubDisplayText';
  var TitleTextProperty: String = js.native
  def GetAutoFillMenuItemFromOption(elmChild: HTMLElement): HTMLElement = js.native
  def GetAutoFillObjFromContainer(elmChild: HTMLElement): typings.sharepoint.SPClientAutoFill = js.native
   // = 'AutoFillMenuOptionType';
  def GetAutoFillObjFromInput(elmText: HTMLInputElement): typings.sharepoint.SPClientAutoFill = js.native
}


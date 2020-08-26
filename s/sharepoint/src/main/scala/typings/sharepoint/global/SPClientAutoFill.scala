package typings.sharepoint.global

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


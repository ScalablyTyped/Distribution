package typings.sharepoint.global.SP

import typings.sharepoint.SP.Application.UI.DefaultFormsInformationRequestor
import typings.sharepoint.SP.Application.UI.ViewInformationRequestor
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Application")
@js.native
object Application extends js.Object {
  @js.native
  object UI extends js.Object {
    @js.native
    class DefaultFormsInformation ()
      extends typings.sharepoint.SP.Application.UI.DefaultFormsInformation
    
    @js.native
    class DefaultFormsMenuBuilder ()
      extends typings.sharepoint.SP.Application.UI.DefaultFormsMenuBuilder
    
    @js.native
    class FormsInfo ()
      extends typings.sharepoint.SP.Application.UI.FormsInfo
    
    @js.native
    class MoreColorsPage protected ()
      extends typings.sharepoint.SP.Application.UI.MoreColorsPage {
      def this(e: HTMLElement) = this()
    }
    
    @js.native
    class MoreColorsPicker protected ()
      extends typings.sharepoint.SP.Application.UI.MoreColorsPicker {
      def this(e: HTMLElement) = this()
    }
    
    @js.native
    class ThemeWebPage protected ()
      extends typings.sharepoint.SP.Application.UI.ThemeWebPage {
      def this(e: HTMLElement) = this()
    }
    
    @js.native
    class ViewSelectorGroups ()
      extends typings.sharepoint.SP.Application.UI.ViewSelectorGroups
    
    @js.native
    class ViewSelectorMenuBuilder ()
      extends typings.sharepoint.SP.Application.UI.ViewSelectorMenuBuilder
    
    @js.native
    class ViewSelectorMenuItem ()
      extends typings.sharepoint.SP.Application.UI.ViewSelectorMenuItem
    
    @js.native
    class ViewSelectorMenuOptions ()
      extends typings.sharepoint.SP.Application.UI.ViewSelectorMenuOptions
    
    @js.native
    class ViewSelectorSubMenu ()
      extends typings.sharepoint.SP.Application.UI.ViewSelectorSubMenu
    
    @js.native
    class WikiPageNameInPlaceEditor protected ()
      extends typings.sharepoint.SP.Application.UI.WikiPageNameInPlaceEditor {
      def this(ownerDoc: js.Any, displayElemId: String, editElemId: String, editTextBoxId: String) = this()
    }
    
    /* static members */
    @js.native
    object DefaultFormsMenuBuilder extends js.Object {
      def getDefaultFormsInformation(requestor: DefaultFormsInformationRequestor, listId: typings.sharepoint.SP.Guid): Unit = js.native
    }
    
    /* static members */
    @js.native
    object ViewSelectorMenuBuilder extends js.Object {
      def getViewInformation(
        requestor: ViewInformationRequestor,
        options: typings.sharepoint.SP.Application.UI.ViewSelectorMenuOptions
      ): Unit = js.native
      def get_filterMenuItemsCallback(): js.Function1[/* menuItems */ js.Any, _] = js.native
      def set_filterMenuItemsCallback(value: js.Function1[/* menuItems */ js.Any, _]): Unit = js.native
      def showMenu(elem: HTMLElement, options: typings.sharepoint.SP.Application.UI.ViewSelectorMenuOptions): Unit = js.native
    }
    
  }
  
}


package typings.sharepoint.global.SP

import typings.sharepoint.SP.Application.UI.DefaultFormsInformationRequestor
import typings.sharepoint.SP.Application.UI.ViewInformationRequestor
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Application {
  
  object UI {
    
    @JSGlobal("SP.Application.UI.DefaultFormsInformation")
    @js.native
    class DefaultFormsInformation ()
      extends typings.sharepoint.SP.Application.UI.DefaultFormsInformation
    
    @JSGlobal("SP.Application.UI.DefaultFormsMenuBuilder")
    @js.native
    class DefaultFormsMenuBuilder ()
      extends typings.sharepoint.SP.Application.UI.DefaultFormsMenuBuilder
    object DefaultFormsMenuBuilder {
      
      /* static member */
      @JSGlobal("SP.Application.UI.DefaultFormsMenuBuilder.getDefaultFormsInformation")
      @js.native
      def getDefaultFormsInformation(requestor: DefaultFormsInformationRequestor, listId: typings.sharepoint.SP.Guid): Unit = js.native
    }
    
    @JSGlobal("SP.Application.UI.FormsInfo")
    @js.native
    class FormsInfo ()
      extends typings.sharepoint.SP.Application.UI.FormsInfo
    
    @JSGlobal("SP.Application.UI.MoreColorsPage")
    @js.native
    class MoreColorsPage protected ()
      extends typings.sharepoint.SP.Application.UI.MoreColorsPage {
      def this(e: HTMLElement) = this()
    }
    
    @JSGlobal("SP.Application.UI.MoreColorsPicker")
    @js.native
    class MoreColorsPicker protected ()
      extends typings.sharepoint.SP.Application.UI.MoreColorsPicker {
      def this(e: HTMLElement) = this()
    }
    
    @JSGlobal("SP.Application.UI.ThemeWebPage")
    @js.native
    class ThemeWebPage protected ()
      extends typings.sharepoint.SP.Application.UI.ThemeWebPage {
      def this(e: HTMLElement) = this()
    }
    
    @JSGlobal("SP.Application.UI.ViewSelectorGroups")
    @js.native
    class ViewSelectorGroups ()
      extends typings.sharepoint.SP.Application.UI.ViewSelectorGroups
    
    @JSGlobal("SP.Application.UI.ViewSelectorMenuBuilder")
    @js.native
    class ViewSelectorMenuBuilder ()
      extends typings.sharepoint.SP.Application.UI.ViewSelectorMenuBuilder
    object ViewSelectorMenuBuilder {
      
      /* static member */
      @JSGlobal("SP.Application.UI.ViewSelectorMenuBuilder.get_filterMenuItemsCallback")
      @js.native
      def getFilterMenuItemsCallback(): js.Function1[/* menuItems */ js.Any, _] = js.native
      
      /* static member */
      @JSGlobal("SP.Application.UI.ViewSelectorMenuBuilder.getViewInformation")
      @js.native
      def getViewInformation(
        requestor: ViewInformationRequestor,
        options: typings.sharepoint.SP.Application.UI.ViewSelectorMenuOptions
      ): Unit = js.native
      
      /* static member */
      @JSGlobal("SP.Application.UI.ViewSelectorMenuBuilder.set_filterMenuItemsCallback")
      @js.native
      def setFilterMenuItemsCallback(value: js.Function1[/* menuItems */ js.Any, _]): Unit = js.native
      
      /* static member */
      @JSGlobal("SP.Application.UI.ViewSelectorMenuBuilder.showMenu")
      @js.native
      def showMenu(elem: HTMLElement, options: typings.sharepoint.SP.Application.UI.ViewSelectorMenuOptions): Unit = js.native
    }
    
    @JSGlobal("SP.Application.UI.ViewSelectorMenuItem")
    @js.native
    class ViewSelectorMenuItem ()
      extends typings.sharepoint.SP.Application.UI.ViewSelectorMenuItem
    
    @JSGlobal("SP.Application.UI.ViewSelectorMenuOptions")
    @js.native
    class ViewSelectorMenuOptions ()
      extends typings.sharepoint.SP.Application.UI.ViewSelectorMenuOptions
    
    @JSGlobal("SP.Application.UI.ViewSelectorSubMenu")
    @js.native
    class ViewSelectorSubMenu ()
      extends typings.sharepoint.SP.Application.UI.ViewSelectorSubMenu
    
    @JSGlobal("SP.Application.UI.WikiPageNameInPlaceEditor")
    @js.native
    class WikiPageNameInPlaceEditor protected ()
      extends typings.sharepoint.SP.Application.UI.WikiPageNameInPlaceEditor {
      def this(ownerDoc: js.Any, displayElemId: String, editElemId: String, editTextBoxId: String) = this()
    }
  }
}

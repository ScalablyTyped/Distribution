package typings.sharepoint.SP

import typings.microsoftAjax.Sys.EventArgs
import typings.microsoftAjax.Sys.UI.Control
import typings.microsoftAjax.Sys.UI.DomEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Application {
  
  object UI {
    
    trait DefaultFormsInformation extends StObject {
      
      var DefaultForms: FormsInfo
      
      var OtherForms: js.Any
    }
    object DefaultFormsInformation {
      
      @scala.inline
      def apply(DefaultForms: FormsInfo, OtherForms: js.Any): DefaultFormsInformation = {
        val __obj = js.Dynamic.literal(DefaultForms = DefaultForms.asInstanceOf[js.Any], OtherForms = OtherForms.asInstanceOf[js.Any])
        __obj.asInstanceOf[DefaultFormsInformation]
      }
      
      @scala.inline
      implicit class DefaultFormsInformationMutableBuilder[Self <: DefaultFormsInformation] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDefaultForms(value: FormsInfo): Self = StObject.set(x, "DefaultForms", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOtherForms(value: js.Any): Self = StObject.set(x, "OtherForms", value.asInstanceOf[js.Any])
      }
    }
    
    trait DefaultFormsInformationRequestor extends StObject {
      
      def onDefaultFormsInformationRetrieveFailure(): Unit
      
      def onDefaultFormsInformationRetrieveSuccess(defaultForms: DefaultFormsInformation): Unit
    }
    object DefaultFormsInformationRequestor {
      
      @scala.inline
      def apply(
        onDefaultFormsInformationRetrieveFailure: () => Unit,
        onDefaultFormsInformationRetrieveSuccess: DefaultFormsInformation => Unit
      ): DefaultFormsInformationRequestor = {
        val __obj = js.Dynamic.literal(onDefaultFormsInformationRetrieveFailure = js.Any.fromFunction0(onDefaultFormsInformationRetrieveFailure), onDefaultFormsInformationRetrieveSuccess = js.Any.fromFunction1(onDefaultFormsInformationRetrieveSuccess))
        __obj.asInstanceOf[DefaultFormsInformationRequestor]
      }
      
      @scala.inline
      implicit class DefaultFormsInformationRequestorMutableBuilder[Self <: DefaultFormsInformationRequestor] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOnDefaultFormsInformationRetrieveFailure(value: () => Unit): Self = StObject.set(x, "onDefaultFormsInformationRetrieveFailure", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnDefaultFormsInformationRetrieveSuccess(value: DefaultFormsInformation => Unit): Self = StObject.set(x, "onDefaultFormsInformationRetrieveSuccess", js.Any.fromFunction1(value))
      }
    }
    
    trait DefaultFormsMenuBuilder extends StObject
    
    trait FormsInfo extends StObject {
      
      var ContentTypeName: String
      
      var DisplayFormUrl: String
      
      var EditFormUrl: String
      
      var NewFormUrl: String
    }
    object FormsInfo {
      
      @scala.inline
      def apply(ContentTypeName: String, DisplayFormUrl: String, EditFormUrl: String, NewFormUrl: String): FormsInfo = {
        val __obj = js.Dynamic.literal(ContentTypeName = ContentTypeName.asInstanceOf[js.Any], DisplayFormUrl = DisplayFormUrl.asInstanceOf[js.Any], EditFormUrl = EditFormUrl.asInstanceOf[js.Any], NewFormUrl = NewFormUrl.asInstanceOf[js.Any])
        __obj.asInstanceOf[FormsInfo]
      }
      
      @scala.inline
      implicit class FormsInfoMutableBuilder[Self <: FormsInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContentTypeName(value: String): Self = StObject.set(x, "ContentTypeName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayFormUrl(value: String): Self = StObject.set(x, "DisplayFormUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEditFormUrl(value: String): Self = StObject.set(x, "EditFormUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNewFormUrl(value: String): Self = StObject.set(x, "NewFormUrl", value.asInstanceOf[js.Any])
      }
    }
    
    trait MoreColorsPage
      extends StObject
         with Control {
      
      def get_moreColorsPicker(): MoreColorsPicker
      
      def set_moreColorsPicker(value: MoreColorsPicker): Unit
    }
    object MoreColorsPage {
      
      @scala.inline
      def apply(
        addCssClass: String => Unit,
        add_disposing: js.Function => Unit,
        add_propertyChanged: js.Function => Unit,
        beginUpdate: () => Unit,
        dispose: () => Unit,
        endUpdate: () => Unit,
        get_element: () => HTMLElement,
        get_events: () => js.Any,
        get_id: () => String,
        get_isInitialized: () => Boolean,
        get_isUpdating: () => Boolean,
        get_moreColorsPicker: () => MoreColorsPicker,
        initialize: () => Unit,
        onBubbleEvent: (js.Any, js.Any) => Boolean,
        raiseBubbleEvent: (js.Any, js.Any) => Unit,
        raisePropertyChanged: String => Unit,
        removeCssClass: String => Unit,
        remove_disposing: js.Function => Unit,
        remove_propertyChanged: js.Function => Unit,
        set_id: String => Unit,
        set_moreColorsPicker: MoreColorsPicker => Unit,
        toggleCssClass: String => Unit,
        updated: () => Unit
      ): MoreColorsPage = {
        val __obj = js.Dynamic.literal(addCssClass = js.Any.fromFunction1(addCssClass), add_disposing = js.Any.fromFunction1(add_disposing), add_propertyChanged = js.Any.fromFunction1(add_propertyChanged), beginUpdate = js.Any.fromFunction0(beginUpdate), dispose = js.Any.fromFunction0(dispose), endUpdate = js.Any.fromFunction0(endUpdate), get_element = js.Any.fromFunction0(get_element), get_events = js.Any.fromFunction0(get_events), get_id = js.Any.fromFunction0(get_id), get_isInitialized = js.Any.fromFunction0(get_isInitialized), get_isUpdating = js.Any.fromFunction0(get_isUpdating), get_moreColorsPicker = js.Any.fromFunction0(get_moreColorsPicker), initialize = js.Any.fromFunction0(initialize), onBubbleEvent = js.Any.fromFunction2(onBubbleEvent), raiseBubbleEvent = js.Any.fromFunction2(raiseBubbleEvent), raisePropertyChanged = js.Any.fromFunction1(raisePropertyChanged), removeCssClass = js.Any.fromFunction1(removeCssClass), remove_disposing = js.Any.fromFunction1(remove_disposing), remove_propertyChanged = js.Any.fromFunction1(remove_propertyChanged), set_id = js.Any.fromFunction1(set_id), set_moreColorsPicker = js.Any.fromFunction1(set_moreColorsPicker), toggleCssClass = js.Any.fromFunction1(toggleCssClass), updated = js.Any.fromFunction0(updated))
        __obj.asInstanceOf[MoreColorsPage]
      }
      
      @scala.inline
      implicit class MoreColorsPageMutableBuilder[Self <: MoreColorsPage] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGet_moreColorsPicker(value: () => MoreColorsPicker): Self = StObject.set(x, "get_moreColorsPicker", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSet_moreColorsPicker(value: MoreColorsPicker => Unit): Self = StObject.set(x, "set_moreColorsPicker", js.Any.fromFunction1(value))
      }
    }
    
    trait MoreColorsPicker
      extends StObject
         with Control {
      
      def get_colorValue(): String
      
      def set_colorValue(value: String): Unit
    }
    object MoreColorsPicker {
      
      @scala.inline
      def apply(
        addCssClass: String => Unit,
        add_disposing: js.Function => Unit,
        add_propertyChanged: js.Function => Unit,
        beginUpdate: () => Unit,
        dispose: () => Unit,
        endUpdate: () => Unit,
        get_colorValue: () => String,
        get_element: () => HTMLElement,
        get_events: () => js.Any,
        get_id: () => String,
        get_isInitialized: () => Boolean,
        get_isUpdating: () => Boolean,
        initialize: () => Unit,
        onBubbleEvent: (js.Any, js.Any) => Boolean,
        raiseBubbleEvent: (js.Any, js.Any) => Unit,
        raisePropertyChanged: String => Unit,
        removeCssClass: String => Unit,
        remove_disposing: js.Function => Unit,
        remove_propertyChanged: js.Function => Unit,
        set_colorValue: String => Unit,
        set_id: String => Unit,
        toggleCssClass: String => Unit,
        updated: () => Unit
      ): MoreColorsPicker = {
        val __obj = js.Dynamic.literal(addCssClass = js.Any.fromFunction1(addCssClass), add_disposing = js.Any.fromFunction1(add_disposing), add_propertyChanged = js.Any.fromFunction1(add_propertyChanged), beginUpdate = js.Any.fromFunction0(beginUpdate), dispose = js.Any.fromFunction0(dispose), endUpdate = js.Any.fromFunction0(endUpdate), get_colorValue = js.Any.fromFunction0(get_colorValue), get_element = js.Any.fromFunction0(get_element), get_events = js.Any.fromFunction0(get_events), get_id = js.Any.fromFunction0(get_id), get_isInitialized = js.Any.fromFunction0(get_isInitialized), get_isUpdating = js.Any.fromFunction0(get_isUpdating), initialize = js.Any.fromFunction0(initialize), onBubbleEvent = js.Any.fromFunction2(onBubbleEvent), raiseBubbleEvent = js.Any.fromFunction2(raiseBubbleEvent), raisePropertyChanged = js.Any.fromFunction1(raisePropertyChanged), removeCssClass = js.Any.fromFunction1(removeCssClass), remove_disposing = js.Any.fromFunction1(remove_disposing), remove_propertyChanged = js.Any.fromFunction1(remove_propertyChanged), set_colorValue = js.Any.fromFunction1(set_colorValue), set_id = js.Any.fromFunction1(set_id), toggleCssClass = js.Any.fromFunction1(toggleCssClass), updated = js.Any.fromFunction0(updated))
        __obj.asInstanceOf[MoreColorsPicker]
      }
      
      @scala.inline
      implicit class MoreColorsPickerMutableBuilder[Self <: MoreColorsPicker] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGet_colorValue(value: () => String): Self = StObject.set(x, "get_colorValue", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSet_colorValue(value: String => Unit): Self = StObject.set(x, "set_colorValue", js.Any.fromFunction1(value))
      }
    }
    
    trait ThemeWebPage
      extends StObject
         with Control {
      
      def add_themeDisplayUpdated(value: js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit]): Unit
      
      def get_thmxThemes(): js.Any
      
      def onThemeSelectionChanged(evt: DomEvent): Unit
      
      def remove_themeDisplayUpdated(value: js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit]): Unit
      
      def set_thmxThemes(value: js.Any): Unit
      
      def updateThemeDisplay(): Unit
    }
    object ThemeWebPage {
      
      @scala.inline
      def apply(
        addCssClass: String => Unit,
        add_disposing: js.Function => Unit,
        add_propertyChanged: js.Function => Unit,
        add_themeDisplayUpdated: js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit] => Unit,
        beginUpdate: () => Unit,
        dispose: () => Unit,
        endUpdate: () => Unit,
        get_element: () => HTMLElement,
        get_events: () => js.Any,
        get_id: () => String,
        get_isInitialized: () => Boolean,
        get_isUpdating: () => Boolean,
        get_thmxThemes: () => js.Any,
        initialize: () => Unit,
        onBubbleEvent: (js.Any, js.Any) => Boolean,
        onThemeSelectionChanged: DomEvent => Unit,
        raiseBubbleEvent: (js.Any, js.Any) => Unit,
        raisePropertyChanged: String => Unit,
        removeCssClass: String => Unit,
        remove_disposing: js.Function => Unit,
        remove_propertyChanged: js.Function => Unit,
        remove_themeDisplayUpdated: js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit] => Unit,
        set_id: String => Unit,
        set_thmxThemes: js.Any => Unit,
        toggleCssClass: String => Unit,
        updateThemeDisplay: () => Unit,
        updated: () => Unit
      ): ThemeWebPage = {
        val __obj = js.Dynamic.literal(addCssClass = js.Any.fromFunction1(addCssClass), add_disposing = js.Any.fromFunction1(add_disposing), add_propertyChanged = js.Any.fromFunction1(add_propertyChanged), add_themeDisplayUpdated = js.Any.fromFunction1(add_themeDisplayUpdated), beginUpdate = js.Any.fromFunction0(beginUpdate), dispose = js.Any.fromFunction0(dispose), endUpdate = js.Any.fromFunction0(endUpdate), get_element = js.Any.fromFunction0(get_element), get_events = js.Any.fromFunction0(get_events), get_id = js.Any.fromFunction0(get_id), get_isInitialized = js.Any.fromFunction0(get_isInitialized), get_isUpdating = js.Any.fromFunction0(get_isUpdating), get_thmxThemes = js.Any.fromFunction0(get_thmxThemes), initialize = js.Any.fromFunction0(initialize), onBubbleEvent = js.Any.fromFunction2(onBubbleEvent), onThemeSelectionChanged = js.Any.fromFunction1(onThemeSelectionChanged), raiseBubbleEvent = js.Any.fromFunction2(raiseBubbleEvent), raisePropertyChanged = js.Any.fromFunction1(raisePropertyChanged), removeCssClass = js.Any.fromFunction1(removeCssClass), remove_disposing = js.Any.fromFunction1(remove_disposing), remove_propertyChanged = js.Any.fromFunction1(remove_propertyChanged), remove_themeDisplayUpdated = js.Any.fromFunction1(remove_themeDisplayUpdated), set_id = js.Any.fromFunction1(set_id), set_thmxThemes = js.Any.fromFunction1(set_thmxThemes), toggleCssClass = js.Any.fromFunction1(toggleCssClass), updateThemeDisplay = js.Any.fromFunction0(updateThemeDisplay), updated = js.Any.fromFunction0(updated))
        __obj.asInstanceOf[ThemeWebPage]
      }
      
      @scala.inline
      implicit class ThemeWebPageMutableBuilder[Self <: ThemeWebPage] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAdd_themeDisplayUpdated(value: js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit] => Unit): Self = StObject.set(x, "add_themeDisplayUpdated", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGet_thmxThemes(value: () => js.Any): Self = StObject.set(x, "get_thmxThemes", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnThemeSelectionChanged(value: DomEvent => Unit): Self = StObject.set(x, "onThemeSelectionChanged", js.Any.fromFunction1(value))
        
        @scala.inline
        def setRemove_themeDisplayUpdated(value: js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit] => Unit): Self = StObject.set(x, "remove_themeDisplayUpdated", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSet_thmxThemes(value: js.Any => Unit): Self = StObject.set(x, "set_thmxThemes", js.Any.fromFunction1(value))
        
        @scala.inline
        def setUpdateThemeDisplay(value: () => Unit): Self = StObject.set(x, "updateThemeDisplay", js.Any.fromFunction0(value))
      }
    }
    
    trait ViewInformationRequestor extends StObject {
      
      def onViewInformationReturned(viewGroups: ViewSelectorGroups): Unit
    }
    object ViewInformationRequestor {
      
      @scala.inline
      def apply(onViewInformationReturned: ViewSelectorGroups => Unit): ViewInformationRequestor = {
        val __obj = js.Dynamic.literal(onViewInformationReturned = js.Any.fromFunction1(onViewInformationReturned))
        __obj.asInstanceOf[ViewInformationRequestor]
      }
      
      @scala.inline
      implicit class ViewInformationRequestorMutableBuilder[Self <: ViewInformationRequestor] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOnViewInformationReturned(value: ViewSelectorGroups => Unit): Self = StObject.set(x, "onViewInformationReturned", js.Any.fromFunction1(value))
      }
    }
    
    trait ViewSelectorGroups extends StObject {
      
      var DefaultView: ViewSelectorMenuItem
      
      var ModeratedViews: js.Any
      
      var OtherViews: js.Any
      
      var PersonalViews: js.Any
      
      var PublicViews: js.Any
      
      var ViewCreation: js.Any
    }
    object ViewSelectorGroups {
      
      @scala.inline
      def apply(
        DefaultView: ViewSelectorMenuItem,
        ModeratedViews: js.Any,
        OtherViews: js.Any,
        PersonalViews: js.Any,
        PublicViews: js.Any,
        ViewCreation: js.Any
      ): ViewSelectorGroups = {
        val __obj = js.Dynamic.literal(DefaultView = DefaultView.asInstanceOf[js.Any], ModeratedViews = ModeratedViews.asInstanceOf[js.Any], OtherViews = OtherViews.asInstanceOf[js.Any], PersonalViews = PersonalViews.asInstanceOf[js.Any], PublicViews = PublicViews.asInstanceOf[js.Any], ViewCreation = ViewCreation.asInstanceOf[js.Any])
        __obj.asInstanceOf[ViewSelectorGroups]
      }
      
      @scala.inline
      implicit class ViewSelectorGroupsMutableBuilder[Self <: ViewSelectorGroups] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDefaultView(value: ViewSelectorMenuItem): Self = StObject.set(x, "DefaultView", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModeratedViews(value: js.Any): Self = StObject.set(x, "ModeratedViews", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOtherViews(value: js.Any): Self = StObject.set(x, "OtherViews", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPersonalViews(value: js.Any): Self = StObject.set(x, "PersonalViews", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPublicViews(value: js.Any): Self = StObject.set(x, "PublicViews", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setViewCreation(value: js.Any): Self = StObject.set(x, "ViewCreation", value.asInstanceOf[js.Any])
      }
    }
    
    trait ViewSelectorMenuBuilder extends StObject
    
    trait ViewSelectorMenuItem extends StObject {
      
      var ActionScriptText: String
      
      var Description: String
      
      var GroupId: Double
      
      var Id: String
      
      var ImageSourceUrl: String
      
      var ItemType: String
      
      var NavigateUrl: String
      
      var Sequence: Double
      
      var Text: String
    }
    object ViewSelectorMenuItem {
      
      @scala.inline
      def apply(
        ActionScriptText: String,
        Description: String,
        GroupId: Double,
        Id: String,
        ImageSourceUrl: String,
        ItemType: String,
        NavigateUrl: String,
        Sequence: Double,
        Text: String
      ): ViewSelectorMenuItem = {
        val __obj = js.Dynamic.literal(ActionScriptText = ActionScriptText.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], GroupId = GroupId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], ImageSourceUrl = ImageSourceUrl.asInstanceOf[js.Any], ItemType = ItemType.asInstanceOf[js.Any], NavigateUrl = NavigateUrl.asInstanceOf[js.Any], Sequence = Sequence.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
        __obj.asInstanceOf[ViewSelectorMenuItem]
      }
      
      @scala.inline
      implicit class ViewSelectorMenuItemMutableBuilder[Self <: ViewSelectorMenuItem] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActionScriptText(value: String): Self = StObject.set(x, "ActionScriptText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupId(value: Double): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImageSourceUrl(value: String): Self = StObject.set(x, "ImageSourceUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemType(value: String): Self = StObject.set(x, "ItemType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNavigateUrl(value: String): Self = StObject.set(x, "NavigateUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSequence(value: Double): Self = StObject.set(x, "Sequence", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
      }
    }
    
    trait ViewSelectorMenuOptions extends StObject {
      
      var listId: String
      
      var showApproverView: Boolean
      
      var showCreateView: Boolean
      
      var showEditView: Boolean
      
      var showMergeView: Boolean
      
      var showRepairView: Boolean
      
      var viewId: String
      
      var viewParameters: String
    }
    object ViewSelectorMenuOptions {
      
      @scala.inline
      def apply(
        listId: String,
        showApproverView: Boolean,
        showCreateView: Boolean,
        showEditView: Boolean,
        showMergeView: Boolean,
        showRepairView: Boolean,
        viewId: String,
        viewParameters: String
      ): ViewSelectorMenuOptions = {
        val __obj = js.Dynamic.literal(listId = listId.asInstanceOf[js.Any], showApproverView = showApproverView.asInstanceOf[js.Any], showCreateView = showCreateView.asInstanceOf[js.Any], showEditView = showEditView.asInstanceOf[js.Any], showMergeView = showMergeView.asInstanceOf[js.Any], showRepairView = showRepairView.asInstanceOf[js.Any], viewId = viewId.asInstanceOf[js.Any], viewParameters = viewParameters.asInstanceOf[js.Any])
        __obj.asInstanceOf[ViewSelectorMenuOptions]
      }
      
      @scala.inline
      implicit class ViewSelectorMenuOptionsMutableBuilder[Self <: ViewSelectorMenuOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setListId(value: String): Self = StObject.set(x, "listId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowApproverView(value: Boolean): Self = StObject.set(x, "showApproverView", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowCreateView(value: Boolean): Self = StObject.set(x, "showCreateView", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowEditView(value: Boolean): Self = StObject.set(x, "showEditView", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowMergeView(value: Boolean): Self = StObject.set(x, "showMergeView", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowRepairView(value: Boolean): Self = StObject.set(x, "showRepairView", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setViewId(value: String): Self = StObject.set(x, "viewId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setViewParameters(value: String): Self = StObject.set(x, "viewParameters", value.asInstanceOf[js.Any])
      }
    }
    
    trait ViewSelectorSubMenu extends StObject {
      
      var ImageSourceUrl: String
      
      var SubMenuItems: js.Any
      
      var Text: String
    }
    object ViewSelectorSubMenu {
      
      @scala.inline
      def apply(ImageSourceUrl: String, SubMenuItems: js.Any, Text: String): ViewSelectorSubMenu = {
        val __obj = js.Dynamic.literal(ImageSourceUrl = ImageSourceUrl.asInstanceOf[js.Any], SubMenuItems = SubMenuItems.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
        __obj.asInstanceOf[ViewSelectorSubMenu]
      }
      
      @scala.inline
      implicit class ViewSelectorSubMenuMutableBuilder[Self <: ViewSelectorSubMenu] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setImageSourceUrl(value: String): Self = StObject.set(x, "ImageSourceUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubMenuItems(value: js.Any): Self = StObject.set(x, "SubMenuItems", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
      }
    }
    
    trait WikiPageNameInPlaceEditor extends StObject {
      
      def editingPageCallback(): Unit
      
      def savingPageCallback(): Unit
    }
    object WikiPageNameInPlaceEditor {
      
      @scala.inline
      def apply(editingPageCallback: () => Unit, savingPageCallback: () => Unit): WikiPageNameInPlaceEditor = {
        val __obj = js.Dynamic.literal(editingPageCallback = js.Any.fromFunction0(editingPageCallback), savingPageCallback = js.Any.fromFunction0(savingPageCallback))
        __obj.asInstanceOf[WikiPageNameInPlaceEditor]
      }
      
      @scala.inline
      implicit class WikiPageNameInPlaceEditorMutableBuilder[Self <: WikiPageNameInPlaceEditor] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEditingPageCallback(value: () => Unit): Self = StObject.set(x, "editingPageCallback", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSavingPageCallback(value: () => Unit): Self = StObject.set(x, "savingPageCallback", js.Any.fromFunction0(value))
      }
    }
  }
}

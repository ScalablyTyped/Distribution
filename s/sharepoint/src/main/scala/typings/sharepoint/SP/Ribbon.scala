package typings.sharepoint.SP

import typings.sharepoint.CUI.CommandType
import typings.sharepoint.CUI.Component
import typings.sharepoint.CUI.Page.CommandDispatcher
import typings.sharepoint.CUI.Page.FocusManager
import typings.sharepoint.CUI.Page.PageComponent
import typings.sharepoint.CUI.Page.UndoManager
import typings.sharepoint.CUI.Root
import typings.sharepoint.SP.Application.UI.DefaultFormsInformation
import typings.sharepoint.SP.Application.UI.DefaultFormsInformationRequestor
import typings.sharepoint.SP.Application.UI.ViewInformationRequestor
import typings.sharepoint.SP.Application.UI.ViewSelectorGroups
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Ribbon {
  
  @js.native
  trait BlogPostWebPartPageComponent extends StObject
  
  @js.native
  trait CLVP extends StObject
  
  type CalendarListPageComponent = GenericListWebPartPageComponent
  
  type CalendarPageComponentData = GenericListWebPartPageComponentData
  
  type CommandUIExtensionPageComponent = PageComponent
  
  type DocLibAspxPageComponent = PageComponent
  
  type DocLibWebPartPageComponent = ListViewWebPartPageComponent
  
  type ECBMenuItem = js.Object
  
  @js.native
  trait EMailLink extends StObject
  
  @js.native
  trait FetchListViewWebPartPageComponentWorker extends StObject
  
  @js.native
  trait FetchedDocLibItemInfo extends StObject
  
  type GenericListWebPartPageComponent = ListViewWebPartPageComponent
  
  type GenericListWebPartPageComponentData = ListViewWebPartPageComponentData
  
  type GroupBoardWebPartPageComponent = GenericListWebPartPageComponent
  
  @js.native
  trait HelpCommandNames extends StObject
  
  type HelpPageComponent = PageComponent
  
  @js.native
  trait IRelatedFieldsInfoRequestor extends StObject
  
  type ListFormWebPartPageComponent = WebPartPageComponent
  
  type ListFormWebPartPageComponentData = WebPartPageComponentData
  
  type ListViewWebPartData = ToolbarRibbonAdapterData
  
  @js.native
  trait ListViewWebPartPageComponent
    extends PageComponent
       with ViewInformationRequestor
       with DefaultFormsInformationRequestor
  object ListViewWebPartPageComponent {
    
    @scala.inline
    def apply(
      canHandleCommand: String => Boolean,
      getFocusedCommands: () => js.Array[String],
      getGlobalCommands: () => js.Array[String],
      getId: () => String,
      handleCommand: (String, js.Any, Double) => Boolean,
      init: () => Unit,
      isFocusable: () => Boolean,
      onDefaultFormsInformationRetrieveFailure: () => Unit,
      onDefaultFormsInformationRetrieveSuccess: DefaultFormsInformation => Unit,
      onViewInformationReturned: ViewSelectorGroups => Unit,
      receiveFocus: () => Boolean,
      yieldFocus: () => Boolean
    ): ListViewWebPartPageComponent = {
      val __obj = js.Dynamic.literal(canHandleCommand = js.Any.fromFunction1(canHandleCommand), getFocusedCommands = js.Any.fromFunction0(getFocusedCommands), getGlobalCommands = js.Any.fromFunction0(getGlobalCommands), getId = js.Any.fromFunction0(getId), handleCommand = js.Any.fromFunction3(handleCommand), init = js.Any.fromFunction0(init), isFocusable = js.Any.fromFunction0(isFocusable), onDefaultFormsInformationRetrieveFailure = js.Any.fromFunction0(onDefaultFormsInformationRetrieveFailure), onDefaultFormsInformationRetrieveSuccess = js.Any.fromFunction1(onDefaultFormsInformationRetrieveSuccess), onViewInformationReturned = js.Any.fromFunction1(onViewInformationReturned), receiveFocus = js.Any.fromFunction0(receiveFocus), yieldFocus = js.Any.fromFunction0(yieldFocus))
      __obj.asInstanceOf[ListViewWebPartPageComponent]
    }
  }
  
  type ListViewWebPartPageComponentData = WebPartPageComponentData
  
  @js.native
  trait PageManager
    extends typings.sharepoint.CUI.Page.PageManager {
    
    def addPageComponent(component: Component): Unit = js.native
    
    def get_ribbon(): typings.sharepoint.SP.Ribbon.Ribbon = js.native
    
    def isRootCommandEnabled(commandId: String, root: Root): Boolean = js.native
    
    def onRootRefreshed(root: Root): Unit = js.native
    
    def removePageComponent(component: Component): Unit = js.native
  }
  object PageManager {
    
    @scala.inline
    def apply(
      addPageComponent: Component => Unit,
      add_ribbonInited: js.Function0[Unit] => js.Any,
      canHandleCommand: String => Boolean,
      get_commandDispatcher: () => CommandDispatcher,
      get_focusManager: () => FocusManager,
      get_ribbon: () => typings.sharepoint.SP.Ribbon.Ribbon,
      get_undoManager: () => UndoManager,
      handleCommand: (String, js.Any, Double) => Boolean,
      isRootCommandEnabled: (String, Root) => Boolean,
      onRootRefreshed: Root => Unit,
      removePageComponent: Component => Unit
    ): PageManager = {
      val __obj = js.Dynamic.literal(addPageComponent = js.Any.fromFunction1(addPageComponent), add_ribbonInited = js.Any.fromFunction1(add_ribbonInited), canHandleCommand = js.Any.fromFunction1(canHandleCommand), get_commandDispatcher = js.Any.fromFunction0(get_commandDispatcher), get_focusManager = js.Any.fromFunction0(get_focusManager), get_ribbon = js.Any.fromFunction0(get_ribbon), get_undoManager = js.Any.fromFunction0(get_undoManager), handleCommand = js.Any.fromFunction3(handleCommand), isRootCommandEnabled = js.Any.fromFunction2(isRootCommandEnabled), onRootRefreshed = js.Any.fromFunction1(onRootRefreshed), removePageComponent = js.Any.fromFunction1(removePageComponent))
      __obj.asInstanceOf[PageManager]
    }
    
    @scala.inline
    implicit class PageManagerMutableBuilder[Self <: PageManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddPageComponent(value: Component => Unit): Self = StObject.set(x, "addPageComponent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet_ribbon(value: () => typings.sharepoint.SP.Ribbon.Ribbon): Self = StObject.set(x, "get_ribbon", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsRootCommandEnabled(value: (String, Root) => Boolean): Self = StObject.set(x, "isRootCommandEnabled", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRootRefreshed(value: Root => Unit): Self = StObject.set(x, "onRootRefreshed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemovePageComponent(value: Component => Unit): Self = StObject.set(x, "removePageComponent", js.Any.fromFunction1(value))
    }
  }
  
  object PageState {
    
    @js.native
    trait Handlers extends StObject
    
    @js.native
    trait PageStateCommands extends StObject
    
    @js.native
    trait PageStateHandler extends PageComponent
    object PageStateHandler {
      
      @scala.inline
      def apply(
        canHandleCommand: String => Boolean,
        getFocusedCommands: () => js.Array[String],
        getGlobalCommands: () => js.Array[String],
        getId: () => String,
        handleCommand: (String, js.Any, Double) => Boolean,
        init: () => Unit,
        isFocusable: () => Boolean,
        receiveFocus: () => Boolean,
        yieldFocus: () => Boolean
      ): PageStateHandler = {
        val __obj = js.Dynamic.literal(canHandleCommand = js.Any.fromFunction1(canHandleCommand), getFocusedCommands = js.Any.fromFunction0(getFocusedCommands), getGlobalCommands = js.Any.fromFunction0(getGlobalCommands), getId = js.Any.fromFunction0(getId), handleCommand = js.Any.fromFunction3(handleCommand), init = js.Any.fromFunction0(init), isFocusable = js.Any.fromFunction0(isFocusable), receiveFocus = js.Any.fromFunction0(receiveFocus), yieldFocus = js.Any.fromFunction0(yieldFocus))
        __obj.asInstanceOf[PageStateHandler]
      }
    }
    
    @js.native
    trait PageStateStrings extends StObject
    
    @js.native
    trait StateChangeDialogHandler extends StObject
  }
  
  @js.native
  trait PageStateActionButton extends StObject
  
  @js.native
  trait PagingInformation extends StObject
  
  @js.native
  trait RelatedFieldsFetcher extends StObject
  
  type RelatedFieldsHelper = IRelatedFieldsInfoRequestor
  
  @js.native
  trait Ribbon
    extends typings.sharepoint.CUI.Ribbon
  object Ribbon {
    
    @scala.inline
    def apply(
      _lastHeightUpdate: Double,
      _lastLeftUpdate: Double,
      _lastTopUpdate: Double,
      _lastWidthUpdate: Double,
      addChild: Component => Unit,
      addChildAtIndex: (js.Any, Double) => Unit,
      addContextualGroup: (String, String, js.Any, String) => js.Any,
      appendChildrenToElement: Element => Unit,
      createChildArray: () => Unit,
      dispose: () => Unit,
      doDelayedInit: () => Unit,
      ensureCorrectChildType: () => Unit,
      ensureDOMElementAndEmpty: () => Unit,
      getChild: String => Component,
      getChildByTitle: String => Component,
      getTextValue: () => String,
      get_contextualGroupIds: () => js.Array[String],
      get_cssClass: () => String,
      get_description: () => String,
      get_domElementTagName: () => String,
      get_enabled: () => Boolean,
      get_id: () => String,
      get_needsDelayIniting: () => Boolean,
      get_parent: () => Component,
      get_root: () => Component,
      get_title: () => String,
      get_visible: () => Boolean,
      get_visibleInDOM: () => Boolean,
      hideContextualGroup: String => Unit,
      initRootMember: Component => js.Any,
      onEnabledChanged: Boolean => js.Any,
      onMenuClosed: () => Unit,
      raiseCommandEvent: (String, CommandType, js.Any) => js.Any,
      receiveFocus: () => Unit,
      refresh: () => Unit,
      removeChild: String => Unit,
      removeChildren: () => Unit,
      removeContextualGroup: String => Unit,
      setFocus: () => Unit,
      setFocusOnCurrentTab: () => Unit,
      setFocusOnRibbon: () => Unit,
      set_description: String => String,
      set_enabled: Boolean => Boolean,
      set_id: String => Unit,
      set_parent: Component => Component,
      set_title: String => String,
      set_visible: Boolean => Boolean,
      showContextualGroup: String => Unit,
      valueIsDirty: Double => Boolean
    ): typings.sharepoint.SP.Ribbon.Ribbon = {
      val __obj = js.Dynamic.literal(_lastHeightUpdate = _lastHeightUpdate.asInstanceOf[js.Any], _lastLeftUpdate = _lastLeftUpdate.asInstanceOf[js.Any], _lastTopUpdate = _lastTopUpdate.asInstanceOf[js.Any], _lastWidthUpdate = _lastWidthUpdate.asInstanceOf[js.Any], addChild = js.Any.fromFunction1(addChild), addChildAtIndex = js.Any.fromFunction2(addChildAtIndex), addContextualGroup = js.Any.fromFunction4(addContextualGroup), appendChildrenToElement = js.Any.fromFunction1(appendChildrenToElement), createChildArray = js.Any.fromFunction0(createChildArray), dispose = js.Any.fromFunction0(dispose), doDelayedInit = js.Any.fromFunction0(doDelayedInit), ensureCorrectChildType = js.Any.fromFunction0(ensureCorrectChildType), ensureDOMElementAndEmpty = js.Any.fromFunction0(ensureDOMElementAndEmpty), getChild = js.Any.fromFunction1(getChild), getChildByTitle = js.Any.fromFunction1(getChildByTitle), getTextValue = js.Any.fromFunction0(getTextValue), get_contextualGroupIds = js.Any.fromFunction0(get_contextualGroupIds), get_cssClass = js.Any.fromFunction0(get_cssClass), get_description = js.Any.fromFunction0(get_description), get_domElementTagName = js.Any.fromFunction0(get_domElementTagName), get_enabled = js.Any.fromFunction0(get_enabled), get_id = js.Any.fromFunction0(get_id), get_needsDelayIniting = js.Any.fromFunction0(get_needsDelayIniting), get_parent = js.Any.fromFunction0(get_parent), get_root = js.Any.fromFunction0(get_root), get_title = js.Any.fromFunction0(get_title), get_visible = js.Any.fromFunction0(get_visible), get_visibleInDOM = js.Any.fromFunction0(get_visibleInDOM), hideContextualGroup = js.Any.fromFunction1(hideContextualGroup), initRootMember = js.Any.fromFunction1(initRootMember), onEnabledChanged = js.Any.fromFunction1(onEnabledChanged), onMenuClosed = js.Any.fromFunction0(onMenuClosed), raiseCommandEvent = js.Any.fromFunction3(raiseCommandEvent), receiveFocus = js.Any.fromFunction0(receiveFocus), refresh = js.Any.fromFunction0(refresh), removeChild = js.Any.fromFunction1(removeChild), removeChildren = js.Any.fromFunction0(removeChildren), removeContextualGroup = js.Any.fromFunction1(removeContextualGroup), setFocus = js.Any.fromFunction0(setFocus), setFocusOnCurrentTab = js.Any.fromFunction0(setFocusOnCurrentTab), setFocusOnRibbon = js.Any.fromFunction0(setFocusOnRibbon), set_description = js.Any.fromFunction1(set_description), set_enabled = js.Any.fromFunction1(set_enabled), set_id = js.Any.fromFunction1(set_id), set_parent = js.Any.fromFunction1(set_parent), set_title = js.Any.fromFunction1(set_title), set_visible = js.Any.fromFunction1(set_visible), showContextualGroup = js.Any.fromFunction1(showContextualGroup), valueIsDirty = js.Any.fromFunction1(valueIsDirty))
      __obj.asInstanceOf[typings.sharepoint.SP.Ribbon.Ribbon]
    }
  }
  
  @js.native
  trait SQMUtility extends StObject
  
  @js.native
  trait SU extends StObject
  
  @js.native
  trait SaveConflictHandler extends StObject
  
  type SolutionsPageComponent = ListViewWebPartPageComponent
  
  object TenantAdmin {
    
    type TenantAdminPageComponent = PageComponent
  }
  
  type ToolbarRibbonAdapter = PageComponent
  
  @js.native
  trait ToolbarRibbonAdapterData extends StObject
  
  type TrackTabPageComponent = PageComponent
  
  type UsageReportPageComponent = PageComponent
  
  type UserInterfacePageComponent = PageComponent
  
  @js.native
  trait Utility extends StObject
  
  @js.native
  trait UtilityInternal extends StObject
  
  @js.native
  trait WebPartComponent extends PageComponent {
    
    def selectWebPart(zc: HTMLElement, setNextRibbonTab: Boolean): Unit = js.native
  }
  object WebPartComponent {
    
    @scala.inline
    def apply(
      canHandleCommand: String => Boolean,
      getFocusedCommands: () => js.Array[String],
      getGlobalCommands: () => js.Array[String],
      getId: () => String,
      handleCommand: (String, js.Any, Double) => Boolean,
      init: () => Unit,
      isFocusable: () => Boolean,
      receiveFocus: () => Boolean,
      selectWebPart: (HTMLElement, Boolean) => Unit,
      yieldFocus: () => Boolean
    ): WebPartComponent = {
      val __obj = js.Dynamic.literal(canHandleCommand = js.Any.fromFunction1(canHandleCommand), getFocusedCommands = js.Any.fromFunction0(getFocusedCommands), getGlobalCommands = js.Any.fromFunction0(getGlobalCommands), getId = js.Any.fromFunction0(getId), handleCommand = js.Any.fromFunction3(handleCommand), init = js.Any.fromFunction0(init), isFocusable = js.Any.fromFunction0(isFocusable), receiveFocus = js.Any.fromFunction0(receiveFocus), selectWebPart = js.Any.fromFunction2(selectWebPart), yieldFocus = js.Any.fromFunction0(yieldFocus))
      __obj.asInstanceOf[WebPartComponent]
    }
    
    @scala.inline
    implicit class WebPartComponentMutableBuilder[Self <: WebPartComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelectWebPart(value: (HTMLElement, Boolean) => Unit): Self = StObject.set(x, "selectWebPart", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait WebPartComponentInitInfo extends StObject {
    
    var allowWebPartAdder: Boolean = js.native
    
    var editable: Boolean = js.native
    
    var isEditMode: Boolean = js.native
  }
  object WebPartComponentInitInfo {
    
    @scala.inline
    def apply(allowWebPartAdder: Boolean, editable: Boolean, isEditMode: Boolean): WebPartComponentInitInfo = {
      val __obj = js.Dynamic.literal(allowWebPartAdder = allowWebPartAdder.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], isEditMode = isEditMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebPartComponentInitInfo]
    }
    
    @scala.inline
    implicit class WebPartComponentInitInfoMutableBuilder[Self <: WebPartComponentInitInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowWebPartAdder(value: Boolean): Self = StObject.set(x, "allowWebPartAdder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEditMode(value: Boolean): Self = StObject.set(x, "isEditMode", value.asInstanceOf[js.Any])
    }
  }
  
  type WebPartPageComponent = ToolbarRibbonAdapter
  
  type WebPartPageComponentData = ToolbarRibbonAdapterData
  
  type WikiPageComponent = PageComponent
}

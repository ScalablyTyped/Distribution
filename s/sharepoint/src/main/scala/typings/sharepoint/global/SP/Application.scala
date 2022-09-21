package typings.sharepoint.global.SP

import typings.microsoftAjax.Sys.EventArgs
import typings.microsoftAjax.Sys.UI.DomEvent
import typings.sharepoint.SP.Application.UI.DefaultFormsInformationRequestor
import typings.sharepoint.SP.Application.UI.ViewInformationRequestor
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Application {
  
  object UI {
    
    @JSGlobal("SP.Application.UI.DefaultFormsInformation")
    @js.native
    open class DefaultFormsInformation ()
      extends StObject
         with typings.sharepoint.SP.Application.UI.DefaultFormsInformation {
      
      /* CompleteClass */
      var DefaultForms: typings.sharepoint.SP.Application.UI.FormsInfo = js.native
      
      /* CompleteClass */
      var OtherForms: Any = js.native
    }
    
    @JSGlobal("SP.Application.UI.DefaultFormsMenuBuilder")
    @js.native
    open class DefaultFormsMenuBuilder ()
      extends StObject
         with typings.sharepoint.SP.Application.UI.DefaultFormsMenuBuilder
    object DefaultFormsMenuBuilder {
      
      @JSGlobal("SP.Application.UI.DefaultFormsMenuBuilder")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def getDefaultFormsInformation(requestor: DefaultFormsInformationRequestor, listId: typings.sharepoint.SP.Guid): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormsInformation")(requestor.asInstanceOf[js.Any], listId.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    @JSGlobal("SP.Application.UI.FormsInfo")
    @js.native
    open class FormsInfo ()
      extends StObject
         with typings.sharepoint.SP.Application.UI.FormsInfo {
      
      /* CompleteClass */
      var ContentTypeName: String = js.native
      
      /* CompleteClass */
      var DisplayFormUrl: String = js.native
      
      /* CompleteClass */
      var EditFormUrl: String = js.native
      
      /* CompleteClass */
      var NewFormUrl: String = js.native
    }
    
    @JSGlobal("SP.Application.UI.MoreColorsPage")
    @js.native
    open class MoreColorsPage protected ()
      extends StObject
         with typings.sharepoint.SP.Application.UI.MoreColorsPage {
      def this(e: HTMLElement) = this()
      
      //#endregion
      //#region Methods
      /**
        * Adds a CSS class to the HTML Document Object Model (DOM) element that the control is attached to.
        * Use the addCssClass method to add a CSS class to a control. If the CSS class has already been added to the control, addCssClass makes no changes to the control.
        * @param className
        *          A string that contains the name of the CSS class to add.
        */
      /* CompleteClass */
      override def addCssClass(className: String): Unit = js.native
      
      //#endregion
      //#region Events
      /**
        * Raised when the dispose method is called for a component.
        */
      /* CompleteClass */
      override def add_disposing(handler: js.Function): Unit = js.native
      
      /**
        * Raised when the raisePropertyChanged method of the current Component object is called.
        */
      /* CompleteClass */
      override def add_propertyChanged(handler: js.Function): Unit = js.native
      
      //#endregion
      //#region Methods
      /**
        * Called by the create method to indicate that the process of setting properties of a component instance has begun.
        */
      /* CompleteClass */
      override def beginUpdate(): Unit = js.native
      
      /**
        * Raises the disposing event of the current Component and removes the component from the application.
        */
      /* CompleteClass */
      override def dispose(): Unit = js.native
      
      /**
        * Called by the create method to indicate that the process of setting properties of a component instance has finished.
        * This method is called by the create method ($create).
        * Sets the isUpdating property of the current Component object to false, calls the initialize method if it has not already been called, and then calls the updated method.
        */
      /* CompleteClass */
      override def endUpdate(): Unit = js.native
      
      //#endregion
      //#region Properties
      /**
        * Gets the HTML Document Object Model (DOM) element that the current Sys.UI.Control object is associated with.
        * @return The DOM element that the current Control object is associated with.
        */
      /* CompleteClass */
      override def get_element(): HTMLElement = js.native
      
      //#endregion
      //#region Properties
      /**
        * Gets an EventHandlerList object that contains references to all the event handlers that are mapped to the current component's events.
        * This member supports the client-script infrastructure and is not intended to be used directly from your code.
        * @return
        *      An EventHandlerList object that contains references to all the events and handlers for this component.
        */
      /* CompleteClass */
      override def get_events(): Any = js.native
      
      /**
        * Gets the ID of the current Component object.
        * @return
        *       The id
        */
      /* CompleteClass */
      override def get_id(): String = js.native
      
      /**
        * Gets a value indicating whether the current Component object is initialized.
        * @return
        *      true if the current Component is initialized; otherwise, false.
        */
      /* CompleteClass */
      override def get_isInitialized(): Boolean = js.native
      
      /**
        * Gets a value indicating whether the current Component object is updating.
        * @return
        *      true if the current Component object is updating; otherwise, false.
        */
      /* CompleteClass */
      override def get_isUpdating(): Boolean = js.native
      
      /* CompleteClass */
      override def get_moreColorsPicker(): typings.sharepoint.SP.Application.UI.MoreColorsPicker = js.native
      
      /**
        * Initializes the current Component object.
        * The initialize method sets the isInitialized property of the current Component object to true. This function is called by the create method ($create) and overridden in derived classes to initialize the component.
        */
      /* CompleteClass */
      override def initialize(): Unit = js.native
      
      /**
        * Called when an event is raised by the raiseBubbleEvent method.
        *
        * The onBubbleEvent method returns false to make sure that unhandled events propagate (bubble) to the parent control.
        * In derived classes, you should override the onBubbleEvent method and return true when events are handled to prevent the events from bubbling further.
        * For an explanation of bubbling, see Sys.UI.Control raiseBubbleEvent Method.
        *
        * @param source
        *          The object that triggered the event.
        * @param args
        *          The event arguments.
        * @return
        *      false in all cases.
        */
      /* CompleteClass */
      override def onBubbleEvent(source: Any, args: Any): Boolean = js.native
      
      /**
        * Calls the onBubbleEvent method of the parent control.
        *
        * When the raiseBubbleEvent method is called, the source object and args values are sent to the onBubbleEvent handler of the current control.
        * If onBubbleEvent returns false, they are sent to the onBubbleEvent handler of the parent control.
        * This process continues until an onBubbleEvent event handler returns true, which indicates that the event has been handled.
        * Any event that bubbles to the Sys.Application instance without being handled is ignored.
        *
        * @param source
        *          The object that triggered the event.
        * @param args
        *          The event arguments.
        */
      /* CompleteClass */
      override def raiseBubbleEvent(source: Any, args: Any): Unit = js.native
      
      /**
        * Raises the propertyChanged event for the specified property.
        * @param propertyName
        *               The name of the property that changed.
        */
      /* CompleteClass */
      override def raisePropertyChanged(propertyName: String): Unit = js.native
      
      /**
        * Removes a CSS class from the HTML Document Object Model (DOM) element that the control is attached to.
        * Use the removeCssClass method to remove a CSS class from a control. If the CSS class has already been removed from the control, removeCssClass makes no changes to the control.
        *
        * @param className
        *          A string that contains the name of the CSS class to remove.
        */
      /* CompleteClass */
      override def removeCssClass(className: String): Unit = js.native
      
      /**
        * Raised when the dispose method is called for a component.
        */
      /* CompleteClass */
      override def remove_disposing(handler: js.Function): Unit = js.native
      
      /**
        * Raised when the raisePropertyChanged method of the current Component object is called.
        */
      /* CompleteClass */
      override def remove_propertyChanged(handler: js.Function): Unit = js.native
      
      /**
        * Sets the ID of the current Component object.
        * @param value A string that contains the ID of the component.
        */
      /* CompleteClass */
      override def set_id(value: String): Unit = js.native
      
      /* CompleteClass */
      override def set_moreColorsPicker(value: typings.sharepoint.SP.Application.UI.MoreColorsPicker): Unit = js.native
      
      /**
        * Toggles a CSS class of the HTML Document Object Model (DOM) element that the control is attached to.
        * @param className
        *          A string that contains the name of the CSS class to toggle.
        */
      /* CompleteClass */
      override def toggleCssClass(className: String): Unit = js.native
      
      /**
        * Called by the endUpdate method as a placeholder for additional logic in derived classes.
        * Override the updated method in a derived class to add custom post-update logic.
        */
      /* CompleteClass */
      override def updated(): Unit = js.native
    }
    
    @JSGlobal("SP.Application.UI.MoreColorsPicker")
    @js.native
    open class MoreColorsPicker protected ()
      extends StObject
         with typings.sharepoint.SP.Application.UI.MoreColorsPicker {
      def this(e: HTMLElement) = this()
      
      //#endregion
      //#region Methods
      /**
        * Adds a CSS class to the HTML Document Object Model (DOM) element that the control is attached to.
        * Use the addCssClass method to add a CSS class to a control. If the CSS class has already been added to the control, addCssClass makes no changes to the control.
        * @param className
        *          A string that contains the name of the CSS class to add.
        */
      /* CompleteClass */
      override def addCssClass(className: String): Unit = js.native
      
      //#endregion
      //#region Events
      /**
        * Raised when the dispose method is called for a component.
        */
      /* CompleteClass */
      override def add_disposing(handler: js.Function): Unit = js.native
      
      /**
        * Raised when the raisePropertyChanged method of the current Component object is called.
        */
      /* CompleteClass */
      override def add_propertyChanged(handler: js.Function): Unit = js.native
      
      //#endregion
      //#region Methods
      /**
        * Called by the create method to indicate that the process of setting properties of a component instance has begun.
        */
      /* CompleteClass */
      override def beginUpdate(): Unit = js.native
      
      /**
        * Raises the disposing event of the current Component and removes the component from the application.
        */
      /* CompleteClass */
      override def dispose(): Unit = js.native
      
      /**
        * Called by the create method to indicate that the process of setting properties of a component instance has finished.
        * This method is called by the create method ($create).
        * Sets the isUpdating property of the current Component object to false, calls the initialize method if it has not already been called, and then calls the updated method.
        */
      /* CompleteClass */
      override def endUpdate(): Unit = js.native
      
      /* CompleteClass */
      override def get_colorValue(): String = js.native
      
      //#endregion
      //#region Properties
      /**
        * Gets the HTML Document Object Model (DOM) element that the current Sys.UI.Control object is associated with.
        * @return The DOM element that the current Control object is associated with.
        */
      /* CompleteClass */
      override def get_element(): HTMLElement = js.native
      
      //#endregion
      //#region Properties
      /**
        * Gets an EventHandlerList object that contains references to all the event handlers that are mapped to the current component's events.
        * This member supports the client-script infrastructure and is not intended to be used directly from your code.
        * @return
        *      An EventHandlerList object that contains references to all the events and handlers for this component.
        */
      /* CompleteClass */
      override def get_events(): Any = js.native
      
      /**
        * Gets the ID of the current Component object.
        * @return
        *       The id
        */
      /* CompleteClass */
      override def get_id(): String = js.native
      
      /**
        * Gets a value indicating whether the current Component object is initialized.
        * @return
        *      true if the current Component is initialized; otherwise, false.
        */
      /* CompleteClass */
      override def get_isInitialized(): Boolean = js.native
      
      /**
        * Gets a value indicating whether the current Component object is updating.
        * @return
        *      true if the current Component object is updating; otherwise, false.
        */
      /* CompleteClass */
      override def get_isUpdating(): Boolean = js.native
      
      /**
        * Initializes the current Component object.
        * The initialize method sets the isInitialized property of the current Component object to true. This function is called by the create method ($create) and overridden in derived classes to initialize the component.
        */
      /* CompleteClass */
      override def initialize(): Unit = js.native
      
      /**
        * Called when an event is raised by the raiseBubbleEvent method.
        *
        * The onBubbleEvent method returns false to make sure that unhandled events propagate (bubble) to the parent control.
        * In derived classes, you should override the onBubbleEvent method and return true when events are handled to prevent the events from bubbling further.
        * For an explanation of bubbling, see Sys.UI.Control raiseBubbleEvent Method.
        *
        * @param source
        *          The object that triggered the event.
        * @param args
        *          The event arguments.
        * @return
        *      false in all cases.
        */
      /* CompleteClass */
      override def onBubbleEvent(source: Any, args: Any): Boolean = js.native
      
      /**
        * Calls the onBubbleEvent method of the parent control.
        *
        * When the raiseBubbleEvent method is called, the source object and args values are sent to the onBubbleEvent handler of the current control.
        * If onBubbleEvent returns false, they are sent to the onBubbleEvent handler of the parent control.
        * This process continues until an onBubbleEvent event handler returns true, which indicates that the event has been handled.
        * Any event that bubbles to the Sys.Application instance without being handled is ignored.
        *
        * @param source
        *          The object that triggered the event.
        * @param args
        *          The event arguments.
        */
      /* CompleteClass */
      override def raiseBubbleEvent(source: Any, args: Any): Unit = js.native
      
      /**
        * Raises the propertyChanged event for the specified property.
        * @param propertyName
        *               The name of the property that changed.
        */
      /* CompleteClass */
      override def raisePropertyChanged(propertyName: String): Unit = js.native
      
      /**
        * Removes a CSS class from the HTML Document Object Model (DOM) element that the control is attached to.
        * Use the removeCssClass method to remove a CSS class from a control. If the CSS class has already been removed from the control, removeCssClass makes no changes to the control.
        *
        * @param className
        *          A string that contains the name of the CSS class to remove.
        */
      /* CompleteClass */
      override def removeCssClass(className: String): Unit = js.native
      
      /**
        * Raised when the dispose method is called for a component.
        */
      /* CompleteClass */
      override def remove_disposing(handler: js.Function): Unit = js.native
      
      /**
        * Raised when the raisePropertyChanged method of the current Component object is called.
        */
      /* CompleteClass */
      override def remove_propertyChanged(handler: js.Function): Unit = js.native
      
      /* CompleteClass */
      override def set_colorValue(value: String): Unit = js.native
      
      /**
        * Sets the ID of the current Component object.
        * @param value A string that contains the ID of the component.
        */
      /* CompleteClass */
      override def set_id(value: String): Unit = js.native
      
      /**
        * Toggles a CSS class of the HTML Document Object Model (DOM) element that the control is attached to.
        * @param className
        *          A string that contains the name of the CSS class to toggle.
        */
      /* CompleteClass */
      override def toggleCssClass(className: String): Unit = js.native
      
      /**
        * Called by the endUpdate method as a placeholder for additional logic in derived classes.
        * Override the updated method in a derived class to add custom post-update logic.
        */
      /* CompleteClass */
      override def updated(): Unit = js.native
    }
    
    @JSGlobal("SP.Application.UI.ThemeWebPage")
    @js.native
    open class ThemeWebPage protected ()
      extends StObject
         with typings.sharepoint.SP.Application.UI.ThemeWebPage {
      def this(e: HTMLElement) = this()
      
      //#endregion
      //#region Methods
      /**
        * Adds a CSS class to the HTML Document Object Model (DOM) element that the control is attached to.
        * Use the addCssClass method to add a CSS class to a control. If the CSS class has already been added to the control, addCssClass makes no changes to the control.
        * @param className
        *          A string that contains the name of the CSS class to add.
        */
      /* CompleteClass */
      override def addCssClass(className: String): Unit = js.native
      
      //#endregion
      //#region Events
      /**
        * Raised when the dispose method is called for a component.
        */
      /* CompleteClass */
      override def add_disposing(handler: js.Function): Unit = js.native
      
      /**
        * Raised when the raisePropertyChanged method of the current Component object is called.
        */
      /* CompleteClass */
      override def add_propertyChanged(handler: js.Function): Unit = js.native
      
      /* CompleteClass */
      override def add_themeDisplayUpdated(value: js.Function2[/* sender */ Any, /* e */ EventArgs, Unit]): Unit = js.native
      
      //#endregion
      //#region Methods
      /**
        * Called by the create method to indicate that the process of setting properties of a component instance has begun.
        */
      /* CompleteClass */
      override def beginUpdate(): Unit = js.native
      
      /**
        * Raises the disposing event of the current Component and removes the component from the application.
        */
      /* CompleteClass */
      override def dispose(): Unit = js.native
      
      /**
        * Called by the create method to indicate that the process of setting properties of a component instance has finished.
        * This method is called by the create method ($create).
        * Sets the isUpdating property of the current Component object to false, calls the initialize method if it has not already been called, and then calls the updated method.
        */
      /* CompleteClass */
      override def endUpdate(): Unit = js.native
      
      //#endregion
      //#region Properties
      /**
        * Gets the HTML Document Object Model (DOM) element that the current Sys.UI.Control object is associated with.
        * @return The DOM element that the current Control object is associated with.
        */
      /* CompleteClass */
      override def get_element(): HTMLElement = js.native
      
      //#endregion
      //#region Properties
      /**
        * Gets an EventHandlerList object that contains references to all the event handlers that are mapped to the current component's events.
        * This member supports the client-script infrastructure and is not intended to be used directly from your code.
        * @return
        *      An EventHandlerList object that contains references to all the events and handlers for this component.
        */
      /* CompleteClass */
      override def get_events(): Any = js.native
      
      /**
        * Gets the ID of the current Component object.
        * @return
        *       The id
        */
      /* CompleteClass */
      override def get_id(): String = js.native
      
      /**
        * Gets a value indicating whether the current Component object is initialized.
        * @return
        *      true if the current Component is initialized; otherwise, false.
        */
      /* CompleteClass */
      override def get_isInitialized(): Boolean = js.native
      
      /**
        * Gets a value indicating whether the current Component object is updating.
        * @return
        *      true if the current Component object is updating; otherwise, false.
        */
      /* CompleteClass */
      override def get_isUpdating(): Boolean = js.native
      
      /* CompleteClass */
      override def get_thmxThemes(): Any = js.native
      
      /**
        * Initializes the current Component object.
        * The initialize method sets the isInitialized property of the current Component object to true. This function is called by the create method ($create) and overridden in derived classes to initialize the component.
        */
      /* CompleteClass */
      override def initialize(): Unit = js.native
      
      /**
        * Called when an event is raised by the raiseBubbleEvent method.
        *
        * The onBubbleEvent method returns false to make sure that unhandled events propagate (bubble) to the parent control.
        * In derived classes, you should override the onBubbleEvent method and return true when events are handled to prevent the events from bubbling further.
        * For an explanation of bubbling, see Sys.UI.Control raiseBubbleEvent Method.
        *
        * @param source
        *          The object that triggered the event.
        * @param args
        *          The event arguments.
        * @return
        *      false in all cases.
        */
      /* CompleteClass */
      override def onBubbleEvent(source: Any, args: Any): Boolean = js.native
      
      /* CompleteClass */
      override def onThemeSelectionChanged(evt: DomEvent): Unit = js.native
      
      /**
        * Calls the onBubbleEvent method of the parent control.
        *
        * When the raiseBubbleEvent method is called, the source object and args values are sent to the onBubbleEvent handler of the current control.
        * If onBubbleEvent returns false, they are sent to the onBubbleEvent handler of the parent control.
        * This process continues until an onBubbleEvent event handler returns true, which indicates that the event has been handled.
        * Any event that bubbles to the Sys.Application instance without being handled is ignored.
        *
        * @param source
        *          The object that triggered the event.
        * @param args
        *          The event arguments.
        */
      /* CompleteClass */
      override def raiseBubbleEvent(source: Any, args: Any): Unit = js.native
      
      /**
        * Raises the propertyChanged event for the specified property.
        * @param propertyName
        *               The name of the property that changed.
        */
      /* CompleteClass */
      override def raisePropertyChanged(propertyName: String): Unit = js.native
      
      /**
        * Removes a CSS class from the HTML Document Object Model (DOM) element that the control is attached to.
        * Use the removeCssClass method to remove a CSS class from a control. If the CSS class has already been removed from the control, removeCssClass makes no changes to the control.
        *
        * @param className
        *          A string that contains the name of the CSS class to remove.
        */
      /* CompleteClass */
      override def removeCssClass(className: String): Unit = js.native
      
      /**
        * Raised when the dispose method is called for a component.
        */
      /* CompleteClass */
      override def remove_disposing(handler: js.Function): Unit = js.native
      
      /**
        * Raised when the raisePropertyChanged method of the current Component object is called.
        */
      /* CompleteClass */
      override def remove_propertyChanged(handler: js.Function): Unit = js.native
      
      /* CompleteClass */
      override def remove_themeDisplayUpdated(value: js.Function2[/* sender */ Any, /* e */ EventArgs, Unit]): Unit = js.native
      
      /**
        * Sets the ID of the current Component object.
        * @param value A string that contains the ID of the component.
        */
      /* CompleteClass */
      override def set_id(value: String): Unit = js.native
      
      /* CompleteClass */
      override def set_thmxThemes(value: Any): Unit = js.native
      
      /**
        * Toggles a CSS class of the HTML Document Object Model (DOM) element that the control is attached to.
        * @param className
        *          A string that contains the name of the CSS class to toggle.
        */
      /* CompleteClass */
      override def toggleCssClass(className: String): Unit = js.native
      
      /* CompleteClass */
      override def updateThemeDisplay(): Unit = js.native
      
      /**
        * Called by the endUpdate method as a placeholder for additional logic in derived classes.
        * Override the updated method in a derived class to add custom post-update logic.
        */
      /* CompleteClass */
      override def updated(): Unit = js.native
    }
    
    @JSGlobal("SP.Application.UI.ViewSelectorGroups")
    @js.native
    open class ViewSelectorGroups ()
      extends StObject
         with typings.sharepoint.SP.Application.UI.ViewSelectorGroups {
      
      /* CompleteClass */
      var DefaultView: typings.sharepoint.SP.Application.UI.ViewSelectorMenuItem = js.native
      
      /* CompleteClass */
      var ModeratedViews: Any = js.native
      
      /* CompleteClass */
      var OtherViews: Any = js.native
      
      /* CompleteClass */
      var PersonalViews: Any = js.native
      
      /* CompleteClass */
      var PublicViews: Any = js.native
      
      /* CompleteClass */
      var ViewCreation: Any = js.native
    }
    
    @JSGlobal("SP.Application.UI.ViewSelectorMenuBuilder")
    @js.native
    open class ViewSelectorMenuBuilder ()
      extends StObject
         with typings.sharepoint.SP.Application.UI.ViewSelectorMenuBuilder
    object ViewSelectorMenuBuilder {
      
      @JSGlobal("SP.Application.UI.ViewSelectorMenuBuilder")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def getFilterMenuItemsCallback(): js.Function1[/* menuItems */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("get_filterMenuItemsCallback")().asInstanceOf[js.Function1[/* menuItems */ Any, Any]]
      
      /* static member */
      inline def getViewInformation(
        requestor: ViewInformationRequestor,
        options: typings.sharepoint.SP.Application.UI.ViewSelectorMenuOptions
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getViewInformation")(requestor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /* static member */
      inline def setFilterMenuItemsCallback(value: js.Function1[/* menuItems */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set_filterMenuItemsCallback")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /* static member */
      inline def showMenu(elem: HTMLElement, options: typings.sharepoint.SP.Application.UI.ViewSelectorMenuOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showMenu")(elem.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    @JSGlobal("SP.Application.UI.ViewSelectorMenuItem")
    @js.native
    open class ViewSelectorMenuItem ()
      extends StObject
         with typings.sharepoint.SP.Application.UI.ViewSelectorMenuItem {
      
      /* CompleteClass */
      var ActionScriptText: String = js.native
      
      /* CompleteClass */
      var Description: String = js.native
      
      /* CompleteClass */
      var GroupId: Double = js.native
      
      /* CompleteClass */
      var Id: String = js.native
      
      /* CompleteClass */
      var ImageSourceUrl: String = js.native
      
      /* CompleteClass */
      var ItemType: String = js.native
      
      /* CompleteClass */
      var NavigateUrl: String = js.native
      
      /* CompleteClass */
      var Sequence: Double = js.native
      
      /* CompleteClass */
      var Text: String = js.native
    }
    
    @JSGlobal("SP.Application.UI.ViewSelectorMenuOptions")
    @js.native
    open class ViewSelectorMenuOptions ()
      extends StObject
         with typings.sharepoint.SP.Application.UI.ViewSelectorMenuOptions {
      
      /* CompleteClass */
      var listId: String = js.native
      
      /* CompleteClass */
      var showApproverView: Boolean = js.native
      
      /* CompleteClass */
      var showCreateView: Boolean = js.native
      
      /* CompleteClass */
      var showEditView: Boolean = js.native
      
      /* CompleteClass */
      var showMergeView: Boolean = js.native
      
      /* CompleteClass */
      var showRepairView: Boolean = js.native
      
      /* CompleteClass */
      var viewId: String = js.native
      
      /* CompleteClass */
      var viewParameters: String = js.native
    }
    
    @JSGlobal("SP.Application.UI.ViewSelectorSubMenu")
    @js.native
    open class ViewSelectorSubMenu ()
      extends StObject
         with typings.sharepoint.SP.Application.UI.ViewSelectorSubMenu {
      
      /* CompleteClass */
      var ImageSourceUrl: String = js.native
      
      /* CompleteClass */
      var SubMenuItems: Any = js.native
      
      /* CompleteClass */
      var Text: String = js.native
    }
    
    @JSGlobal("SP.Application.UI.WikiPageNameInPlaceEditor")
    @js.native
    open class WikiPageNameInPlaceEditor protected ()
      extends StObject
         with typings.sharepoint.SP.Application.UI.WikiPageNameInPlaceEditor {
      def this(ownerDoc: Any, displayElemId: String, editElemId: String, editTextBoxId: String) = this()
      
      /* CompleteClass */
      override def editingPageCallback(): Unit = js.native
      
      /* CompleteClass */
      override def savingPageCallback(): Unit = js.native
    }
  }
}

package typings.sharepoint.global.SP

import typings.microsoftAjax.Sys.EventArgs
import typings.microsoftAjax.Sys.UI.DomEvent
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
      extends typings.sharepoint.SP.Application.UI.DefaultFormsInformation {
      /* CompleteClass */
      override var DefaultForms: typings.sharepoint.SP.Application.UI.FormsInfo = js.native
      /* CompleteClass */
      override var OtherForms: js.Any = js.native
    }
    
    @js.native
    class DefaultFormsMenuBuilder ()
      extends typings.sharepoint.SP.Application.UI.DefaultFormsMenuBuilder
    
    @js.native
    class FormsInfo ()
      extends typings.sharepoint.SP.Application.UI.FormsInfo {
      /* CompleteClass */
      override var ContentTypeName: String = js.native
      /* CompleteClass */
      override var DisplayFormUrl: String = js.native
      /* CompleteClass */
      override var EditFormUrl: String = js.native
      /* CompleteClass */
      override var NewFormUrl: String = js.native
    }
    
    @js.native
    class MoreColorsPage protected ()
      extends typings.sharepoint.SP.Application.UI.MoreColorsPage {
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
      override def get_events(): js.Any = js.native
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
      override def onBubbleEvent(source: js.Any, args: js.Any): Boolean = js.native
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
      override def raiseBubbleEvent(source: js.Any, args: js.Any): Unit = js.native
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
    
    @js.native
    class MoreColorsPicker protected ()
      extends typings.sharepoint.SP.Application.UI.MoreColorsPicker {
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
      override def get_events(): js.Any = js.native
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
      override def onBubbleEvent(source: js.Any, args: js.Any): Boolean = js.native
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
      override def raiseBubbleEvent(source: js.Any, args: js.Any): Unit = js.native
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
    
    @js.native
    class ThemeWebPage protected ()
      extends typings.sharepoint.SP.Application.UI.ThemeWebPage {
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
      override def add_themeDisplayUpdated(value: js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit]): Unit = js.native
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
      override def get_events(): js.Any = js.native
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
      override def get_thmxThemes(): js.Any = js.native
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
      override def onBubbleEvent(source: js.Any, args: js.Any): Boolean = js.native
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
      override def raiseBubbleEvent(source: js.Any, args: js.Any): Unit = js.native
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
      override def remove_themeDisplayUpdated(value: js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit]): Unit = js.native
      /**
        * Sets the ID of the current Component object.
        * @param value A string that contains the ID of the component.
        */
      /* CompleteClass */
      override def set_id(value: String): Unit = js.native
      /* CompleteClass */
      override def set_thmxThemes(value: js.Any): Unit = js.native
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
    
    @js.native
    class ViewSelectorGroups ()
      extends typings.sharepoint.SP.Application.UI.ViewSelectorGroups {
      /* CompleteClass */
      override var DefaultView: typings.sharepoint.SP.Application.UI.ViewSelectorMenuItem = js.native
      /* CompleteClass */
      override var ModeratedViews: js.Any = js.native
      /* CompleteClass */
      override var OtherViews: js.Any = js.native
      /* CompleteClass */
      override var PersonalViews: js.Any = js.native
      /* CompleteClass */
      override var PublicViews: js.Any = js.native
      /* CompleteClass */
      override var ViewCreation: js.Any = js.native
    }
    
    @js.native
    class ViewSelectorMenuBuilder ()
      extends typings.sharepoint.SP.Application.UI.ViewSelectorMenuBuilder
    
    @js.native
    class ViewSelectorMenuItem ()
      extends typings.sharepoint.SP.Application.UI.ViewSelectorMenuItem {
      /* CompleteClass */
      override var ActionScriptText: String = js.native
      /* CompleteClass */
      override var Description: String = js.native
      /* CompleteClass */
      override var GroupId: Double = js.native
      /* CompleteClass */
      override var Id: String = js.native
      /* CompleteClass */
      override var ImageSourceUrl: String = js.native
      /* CompleteClass */
      override var ItemType: String = js.native
      /* CompleteClass */
      override var NavigateUrl: String = js.native
      /* CompleteClass */
      override var Sequence: Double = js.native
      /* CompleteClass */
      override var Text: String = js.native
    }
    
    @js.native
    class ViewSelectorMenuOptions ()
      extends typings.sharepoint.SP.Application.UI.ViewSelectorMenuOptions {
      /* CompleteClass */
      override var listId: String = js.native
      /* CompleteClass */
      override var showApproverView: Boolean = js.native
      /* CompleteClass */
      override var showCreateView: Boolean = js.native
      /* CompleteClass */
      override var showEditView: Boolean = js.native
      /* CompleteClass */
      override var showMergeView: Boolean = js.native
      /* CompleteClass */
      override var showRepairView: Boolean = js.native
      /* CompleteClass */
      override var viewId: String = js.native
      /* CompleteClass */
      override var viewParameters: String = js.native
    }
    
    @js.native
    class ViewSelectorSubMenu ()
      extends typings.sharepoint.SP.Application.UI.ViewSelectorSubMenu {
      /* CompleteClass */
      override var ImageSourceUrl: String = js.native
      /* CompleteClass */
      override var SubMenuItems: js.Any = js.native
      /* CompleteClass */
      override var Text: String = js.native
    }
    
    @js.native
    class WikiPageNameInPlaceEditor protected ()
      extends typings.sharepoint.SP.Application.UI.WikiPageNameInPlaceEditor {
      def this(ownerDoc: js.Any, displayElemId: String, editElemId: String, editTextBoxId: String) = this()
      /* CompleteClass */
      override def editingPageCallback(): Unit = js.native
      /* CompleteClass */
      override def savingPageCallback(): Unit = js.native
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


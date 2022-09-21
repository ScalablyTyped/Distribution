package typings.sharepoint.global.CUI

import typings.std.Event
import typings.std.FocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Controls {
  
  @JSGlobal("CUI.Controls.Button")
  @js.native
  open class Button protected ()
    extends StObject
       with typings.sharepoint.CUI.Controls.Button {
    def this(
      root: typings.sharepoint.CUI.Root,
      id: String,
      properties: typings.sharepoint.CUI.ControlProperties
    ) = this()
    
    /* CompleteClass */
    override def createComponentForDisplayMode(displayMode: String): Any = js.native
    
    /* CompleteClass */
    override def createComponentForDisplayModeInternal(displayMode: String): Any = js.native
    
    /* CompleteClass */
    override def createDOMElementForDisplayMode(displayMode: String): Any = js.native
    
    /* CompleteClass */
    override def deselect(): scala.Unit = js.native
    
    //#region Methods
    /**
      * Releases resources held by an object that implements the Sys.IDisposable interface.
      * Implement the dispose method to close or release resources held by an object, or to prepare an object for reuse.
      */
    /* CompleteClass */
    override def dispose(): scala.Unit = js.native
    
    /* CompleteClass */
    override def focusOnDisplayedComponent(): scala.Unit = js.native
    
    /* CompleteClass */
    override def getCommandValueId(): String = js.native
    
    /* CompleteClass */
    override def getDropDownDOMElementForDisplayMode(displayMode: String): scala.Unit = js.native
    
    /* CompleteClass */
    override def getLabel(): String = js.native
    
    /* CompleteClass */
    override def getMenuItemId(): String = js.native
    
    /* CompleteClass */
    override def getTextValue(): String = js.native
    
    /* CompleteClass */
    override def get_enabled(): Boolean = js.native
    
    /* CompleteClass */
    override def get_id(): String = js.native
    
    /* CompleteClass */
    override def get_root(): typings.sharepoint.CUI.Root = js.native
    
    /* CompleteClass */
    override def handleMouseBlur(e: FocusEvent): Any = js.native
    
    /* CompleteClass */
    override def handleMouseFocus(e: FocusEvent): Any = js.native
    
    /* CompleteClass */
    override def handleTabBlur(e: FocusEvent): Any = js.native
    
    /* CompleteClass */
    override def handleTabFocus(e: FocusEvent): Any = js.native
    
    /* CompleteClass */
    override def onClick(e: Event): scala.Unit = js.native
    
    /* CompleteClass */
    override def onEnabledChanged(enabled: Boolean): Any = js.native
    
    /* CompleteClass */
    override def onMenuClosed(): scala.Unit = js.native
    
    /* CompleteClass */
    override def receiveFocus(): scala.Unit = js.native
    
    /* CompleteClass */
    override def set_enabled(enabled: Boolean): Boolean = js.native
  }
  
  @JSGlobal("CUI.Controls.CheckBox")
  @js.native
  open class CheckBox ()
    extends StObject
       with typings.sharepoint.CUI.Controls.ToggleButton {
    
    /* CompleteClass */
    override def createComponentForDisplayMode(displayMode: String): Any = js.native
    
    //#region Methods
    /**
      * Releases resources held by an object that implements the Sys.IDisposable interface.
      * Implement the dispose method to close or release resources held by an object, or to prepare an object for reuse.
      */
    /* CompleteClass */
    override def dispose(): scala.Unit = js.native
    
    /* CompleteClass */
    override def get_enabled(): Boolean = js.native
    
    /* CompleteClass */
    override def get_id(): String = js.native
    
    /* CompleteClass */
    override def get_root(): typings.sharepoint.CUI.Root = js.native
    
    /* CompleteClass */
    override def set_enabled(enabled: Boolean): Boolean = js.native
  }
  
  @JSGlobal("CUI.Controls.CheckBoxCommandProperties")
  @js.native
  open class CheckBoxCommandProperties ()
    extends StObject
       with typings.sharepoint.CUI.Controls.CheckBoxCommandProperties
  
  @JSGlobal("CUI.Controls.ColorPicker")
  @js.native
  open class ColorPicker ()
    extends StObject
       with typings.sharepoint.CUI.Controls.ColorPicker {
    
    /* CompleteClass */
    override def createComponentForDisplayMode(displayMode: String): Any = js.native
    
    //#region Methods
    /**
      * Releases resources held by an object that implements the Sys.IDisposable interface.
      * Implement the dispose method to close or release resources held by an object, or to prepare an object for reuse.
      */
    /* CompleteClass */
    override def dispose(): scala.Unit = js.native
    
    /* CompleteClass */
    override def get_enabled(): Boolean = js.native
    
    /* CompleteClass */
    override def get_id(): String = js.native
    
    /* CompleteClass */
    override def get_root(): typings.sharepoint.CUI.Root = js.native
    
    /* CompleteClass */
    override def set_enabled(enabled: Boolean): Boolean = js.native
  }
  
  @JSGlobal("CUI.Controls.ColorPickerCommandProperties")
  @js.native
  open class ColorPickerCommandProperties ()
    extends StObject
       with typings.sharepoint.CUI.Controls.ColorPickerCommandProperties
  
  @JSGlobal("CUI.Controls.ComboBox")
  @js.native
  open class ComboBox ()
    extends StObject
       with typings.sharepoint.CUI.MenuLauncher {
    
    /* CompleteClass */
    override def createComponentForDisplayMode(displayMode: String): Any = js.native
    
    //#region Methods
    /**
      * Releases resources held by an object that implements the Sys.IDisposable interface.
      * Implement the dispose method to close or release resources held by an object, or to prepare an object for reuse.
      */
    /* CompleteClass */
    override def dispose(): scala.Unit = js.native
    
    /* CompleteClass */
    override def get_enabled(): Boolean = js.native
    
    /* CompleteClass */
    override def get_id(): String = js.native
    
    /* CompleteClass */
    override def get_root(): typings.sharepoint.CUI.Root = js.native
    
    /* CompleteClass */
    override def set_enabled(enabled: Boolean): Boolean = js.native
  }
  
  @JSGlobal("CUI.Controls.ContextMenuControlProperties")
  @js.native
  open class ContextMenuControlProperties ()
    extends StObject
       with typings.sharepoint.CUI.ControlProperties {
    
    /* CompleteClass */
    var Command: String = js.native
    
    /* CompleteClass */
    var Id: String = js.native
    
    /* CompleteClass */
    var Image16by16: String = js.native
    
    /* CompleteClass */
    var Image16by16Class: String = js.native
    
    /* CompleteClass */
    var Image16by16Left: Double = js.native
    
    /* CompleteClass */
    var Image16by16Top: Double = js.native
    
    /* CompleteClass */
    var Image32by32: String = js.native
    
    /* CompleteClass */
    var Image32by32Class: String = js.native
    
    /* CompleteClass */
    var Image32by32Left: Double = js.native
    
    /* CompleteClass */
    var Image32by32Top: Double = js.native
    
    /* CompleteClass */
    var LabelCss: String = js.native
    
    /* CompleteClass */
    var LabelText: String = js.native
    
    /* CompleteClass */
    var PopulateDynamically: String = js.native
    
    /* CompleteClass */
    var PopulateOnlyOnce: String = js.native
    
    /* CompleteClass */
    var PopulateQueryCommand: String = js.native
    
    /* CompleteClass */
    var TemplateAlias: String = js.native
    
    /* CompleteClass */
    var ToolTipDescription: String = js.native
    
    /* CompleteClass */
    var ToolTipHelpKeyWord: String = js.native
    
    /* CompleteClass */
    var ToolTipImage32by32: String = js.native
    
    /* CompleteClass */
    var ToolTipImage32by32Class: String = js.native
    
    /* CompleteClass */
    var ToolTipImage32by32Left: Double = js.native
    
    /* CompleteClass */
    var ToolTipImage32by32Top: Double = js.native
    
    /* CompleteClass */
    var ToolTipSelectedItemTitle: String = js.native
    
    /* CompleteClass */
    var ToolTipShortcutKey: String = js.native
    
    /* CompleteClass */
    var ToolTipTitle: String = js.native
    
    /* CompleteClass */
    var Width: String = js.native
  }
  
  @JSGlobal("CUI.Controls.DropDown")
  @js.native
  open class DropDown protected ()
    extends StObject
       with typings.sharepoint.CUI.MenuLauncher {
    def this(
      root: typings.sharepoint.CUI.Root,
      id: String,
      properties: typings.sharepoint.CUI.ControlProperties,
      menu: Any
    ) = this()
    
    /* CompleteClass */
    override def createComponentForDisplayMode(displayMode: String): Any = js.native
    
    //#region Methods
    /**
      * Releases resources held by an object that implements the Sys.IDisposable interface.
      * Implement the dispose method to close or release resources held by an object, or to prepare an object for reuse.
      */
    /* CompleteClass */
    override def dispose(): scala.Unit = js.native
    
    /* CompleteClass */
    override def get_enabled(): Boolean = js.native
    
    /* CompleteClass */
    override def get_id(): String = js.native
    
    /* CompleteClass */
    override def get_root(): typings.sharepoint.CUI.Root = js.native
    
    /* CompleteClass */
    override def set_enabled(enabled: Boolean): Boolean = js.native
  }
  
  @JSGlobal("CUI.Controls.DropDownCommandProperties")
  @js.native
  open class DropDownCommandProperties ()
    extends StObject
       with typings.sharepoint.CUI.Controls.DropDownCommandProperties {
    
    /* CompleteClass */
    var SelectedItemId: String = js.native
    
    /* CompleteClass */
    var Value: String = js.native
  }
  
  @JSGlobal("CUI.Controls.FlyoutAnchor")
  @js.native
  open class FlyoutAnchor ()
    extends StObject
       with typings.sharepoint.CUI.MenuLauncher {
    
    /* CompleteClass */
    override def createComponentForDisplayMode(displayMode: String): Any = js.native
    
    //#region Methods
    /**
      * Releases resources held by an object that implements the Sys.IDisposable interface.
      * Implement the dispose method to close or release resources held by an object, or to prepare an object for reuse.
      */
    /* CompleteClass */
    override def dispose(): scala.Unit = js.native
    
    /* CompleteClass */
    override def get_enabled(): Boolean = js.native
    
    /* CompleteClass */
    override def get_id(): String = js.native
    
    /* CompleteClass */
    override def get_root(): typings.sharepoint.CUI.Root = js.native
    
    /* CompleteClass */
    override def set_enabled(enabled: Boolean): Boolean = js.native
  }
  
  @JSGlobal("CUI.Controls.GalleryButton")
  @js.native
  open class GalleryButton ()
    extends StObject
       with typings.sharepoint.CUI.Controls.GalleryButton {
    
    /* CompleteClass */
    override def createComponentForDisplayMode(displayMode: String): Any = js.native
    
    //#region Methods
    /**
      * Releases resources held by an object that implements the Sys.IDisposable interface.
      * Implement the dispose method to close or release resources held by an object, or to prepare an object for reuse.
      */
    /* CompleteClass */
    override def dispose(): scala.Unit = js.native
    
    /* CompleteClass */
    override def get_enabled(): Boolean = js.native
    
    /* CompleteClass */
    override def get_id(): String = js.native
    
    /* CompleteClass */
    override def get_root(): typings.sharepoint.CUI.Root = js.native
    
    /* CompleteClass */
    override def set_enabled(enabled: Boolean): Boolean = js.native
  }
  
  @JSGlobal("CUI.Controls.GalleryButtonCommandProperties")
  @js.native
  open class GalleryButtonCommandProperties ()
    extends StObject
       with typings.sharepoint.CUI.Controls.GalleryButtonCommandProperties
  
  @JSGlobal("CUI.Controls.InsertTable")
  @js.native
  open class InsertTable ()
    extends StObject
       with typings.sharepoint.CUI.Control {
    
    /* CompleteClass */
    override def createComponentForDisplayMode(displayMode: String): Any = js.native
    
    //#region Methods
    /**
      * Releases resources held by an object that implements the Sys.IDisposable interface.
      * Implement the dispose method to close or release resources held by an object, or to prepare an object for reuse.
      */
    /* CompleteClass */
    override def dispose(): scala.Unit = js.native
    
    /* CompleteClass */
    override def get_enabled(): Boolean = js.native
    
    /* CompleteClass */
    override def get_id(): String = js.native
    
    /* CompleteClass */
    override def get_root(): typings.sharepoint.CUI.Root = js.native
    
    /* CompleteClass */
    override def set_enabled(enabled: Boolean): Boolean = js.native
  }
  
  @JSGlobal("CUI.Controls.InsertTableCommandProperties")
  @js.native
  open class InsertTableCommandProperties ()
    extends StObject
       with typings.sharepoint.CUI.Controls.InsertTableCommandProperties
  
  @JSGlobal("CUI.Controls.JewelMenuLauncher")
  @js.native
  open class JewelMenuLauncher ()
    extends StObject
       with typings.sharepoint.CUI.MenuLauncher {
    
    /* CompleteClass */
    override def createComponentForDisplayMode(displayMode: String): Any = js.native
    
    //#region Methods
    /**
      * Releases resources held by an object that implements the Sys.IDisposable interface.
      * Implement the dispose method to close or release resources held by an object, or to prepare an object for reuse.
      */
    /* CompleteClass */
    override def dispose(): scala.Unit = js.native
    
    /* CompleteClass */
    override def get_enabled(): Boolean = js.native
    
    /* CompleteClass */
    override def get_id(): String = js.native
    
    /* CompleteClass */
    override def get_root(): typings.sharepoint.CUI.Root = js.native
    
    /* CompleteClass */
    override def set_enabled(enabled: Boolean): Boolean = js.native
  }
  
  @JSGlobal("CUI.Controls.Label")
  @js.native
  open class Label ()
    extends StObject
       with typings.sharepoint.CUI.Control {
    
    /* CompleteClass */
    override def createComponentForDisplayMode(displayMode: String): Any = js.native
    
    //#region Methods
    /**
      * Releases resources held by an object that implements the Sys.IDisposable interface.
      * Implement the dispose method to close or release resources held by an object, or to prepare an object for reuse.
      */
    /* CompleteClass */
    override def dispose(): scala.Unit = js.native
    
    /* CompleteClass */
    override def get_enabled(): Boolean = js.native
    
    /* CompleteClass */
    override def get_id(): String = js.native
    
    /* CompleteClass */
    override def get_root(): typings.sharepoint.CUI.Root = js.native
    
    /* CompleteClass */
    override def set_enabled(enabled: Boolean): Boolean = js.native
  }
  
  @JSGlobal("CUI.Controls.LabelCommandProperties")
  @js.native
  open class LabelCommandProperties ()
    extends StObject
       with typings.sharepoint.CUI.Controls.LabelCommandProperties
  
  @JSGlobal("CUI.Controls.MRUSplitButton")
  @js.native
  open class MRUSplitButton ()
    extends StObject
       with typings.sharepoint.CUI.MenuLauncher {
    
    /* CompleteClass */
    override def createComponentForDisplayMode(displayMode: String): Any = js.native
    
    //#region Methods
    /**
      * Releases resources held by an object that implements the Sys.IDisposable interface.
      * Implement the dispose method to close or release resources held by an object, or to prepare an object for reuse.
      */
    /* CompleteClass */
    override def dispose(): scala.Unit = js.native
    
    /* CompleteClass */
    override def get_enabled(): Boolean = js.native
    
    /* CompleteClass */
    override def get_id(): String = js.native
    
    /* CompleteClass */
    override def get_root(): typings.sharepoint.CUI.Root = js.native
    
    /* CompleteClass */
    override def set_enabled(enabled: Boolean): Boolean = js.native
  }
  
  @JSGlobal("CUI.Controls.Separator")
  @js.native
  open class Separator ()
    extends StObject
       with typings.sharepoint.CUI.Control {
    
    /* CompleteClass */
    override def createComponentForDisplayMode(displayMode: String): Any = js.native
    
    //#region Methods
    /**
      * Releases resources held by an object that implements the Sys.IDisposable interface.
      * Implement the dispose method to close or release resources held by an object, or to prepare an object for reuse.
      */
    /* CompleteClass */
    override def dispose(): scala.Unit = js.native
    
    /* CompleteClass */
    override def get_enabled(): Boolean = js.native
    
    /* CompleteClass */
    override def get_id(): String = js.native
    
    /* CompleteClass */
    override def get_root(): typings.sharepoint.CUI.Root = js.native
    
    /* CompleteClass */
    override def set_enabled(enabled: Boolean): Boolean = js.native
  }
  
  @JSGlobal("CUI.Controls.Spinner")
  @js.native
  open class Spinner ()
    extends StObject
       with typings.sharepoint.CUI.Control {
    
    /* CompleteClass */
    override def createComponentForDisplayMode(displayMode: String): Any = js.native
    
    //#region Methods
    /**
      * Releases resources held by an object that implements the Sys.IDisposable interface.
      * Implement the dispose method to close or release resources held by an object, or to prepare an object for reuse.
      */
    /* CompleteClass */
    override def dispose(): scala.Unit = js.native
    
    /* CompleteClass */
    override def get_enabled(): Boolean = js.native
    
    /* CompleteClass */
    override def get_id(): String = js.native
    
    /* CompleteClass */
    override def get_root(): typings.sharepoint.CUI.Root = js.native
    
    /* CompleteClass */
    override def set_enabled(enabled: Boolean): Boolean = js.native
  }
  
  @JSGlobal("CUI.Controls.SpinnerCommandProperties")
  @js.native
  open class SpinnerCommandProperties ()
    extends StObject
       with typings.sharepoint.CUI.Controls.SpinnerCommandProperties
  
  @JSGlobal("CUI.Controls.SplitButton")
  @js.native
  open class SplitButton ()
    extends StObject
       with typings.sharepoint.CUI.MenuLauncher {
    
    /* CompleteClass */
    override def createComponentForDisplayMode(displayMode: String): Any = js.native
    
    //#region Methods
    /**
      * Releases resources held by an object that implements the Sys.IDisposable interface.
      * Implement the dispose method to close or release resources held by an object, or to prepare an object for reuse.
      */
    /* CompleteClass */
    override def dispose(): scala.Unit = js.native
    
    /* CompleteClass */
    override def get_enabled(): Boolean = js.native
    
    /* CompleteClass */
    override def get_id(): String = js.native
    
    /* CompleteClass */
    override def get_root(): typings.sharepoint.CUI.Root = js.native
    
    /* CompleteClass */
    override def set_enabled(enabled: Boolean): Boolean = js.native
  }
  
  @JSGlobal("CUI.Controls.TextBox")
  @js.native
  open class TextBox ()
    extends StObject
       with typings.sharepoint.CUI.Control {
    
    /* CompleteClass */
    override def createComponentForDisplayMode(displayMode: String): Any = js.native
    
    //#region Methods
    /**
      * Releases resources held by an object that implements the Sys.IDisposable interface.
      * Implement the dispose method to close or release resources held by an object, or to prepare an object for reuse.
      */
    /* CompleteClass */
    override def dispose(): scala.Unit = js.native
    
    /* CompleteClass */
    override def get_enabled(): Boolean = js.native
    
    /* CompleteClass */
    override def get_id(): String = js.native
    
    /* CompleteClass */
    override def get_root(): typings.sharepoint.CUI.Root = js.native
    
    /* CompleteClass */
    override def set_enabled(enabled: Boolean): Boolean = js.native
  }
  
  @JSGlobal("CUI.Controls.TextBoxCommandProperties")
  @js.native
  open class TextBoxCommandProperties ()
    extends StObject
       with typings.sharepoint.CUI.Controls.TextBoxCommandProperties
  
  @JSGlobal("CUI.Controls.ToggleButton")
  @js.native
  open class ToggleButton ()
    extends StObject
       with typings.sharepoint.CUI.Controls.ToggleButton {
    
    /* CompleteClass */
    override def createComponentForDisplayMode(displayMode: String): Any = js.native
    
    //#region Methods
    /**
      * Releases resources held by an object that implements the Sys.IDisposable interface.
      * Implement the dispose method to close or release resources held by an object, or to prepare an object for reuse.
      */
    /* CompleteClass */
    override def dispose(): scala.Unit = js.native
    
    /* CompleteClass */
    override def get_enabled(): Boolean = js.native
    
    /* CompleteClass */
    override def get_id(): String = js.native
    
    /* CompleteClass */
    override def get_root(): typings.sharepoint.CUI.Root = js.native
    
    /* CompleteClass */
    override def set_enabled(enabled: Boolean): Boolean = js.native
  }
  
  @JSGlobal("CUI.Controls.ToggleButtonCommandProperties")
  @js.native
  open class ToggleButtonCommandProperties ()
    extends StObject
       with typings.sharepoint.CUI.Controls.ToggleButtonCommandProperties
}

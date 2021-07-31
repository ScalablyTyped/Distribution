package typings.sharepoint.global.CUI

import typings.std.Event
import typings.std.FocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Controls {
  
  @JSGlobal("CUI.Controls.Button")
  @js.native
  class Button protected ()
    extends StObject
       with typings.sharepoint.CUI.Controls.Button {
    def this(
      root: typings.sharepoint.CUI.Root,
      id: String,
      properties: typings.sharepoint.CUI.ControlProperties
    ) = this()
    
    /* CompleteClass */
    override def createComponentForDisplayMode(displayMode: String): js.Any = js.native
    
    /* CompleteClass */
    override def createComponentForDisplayModeInternal(displayMode: String): js.Any = js.native
    
    /* CompleteClass */
    override def createDOMElementForDisplayMode(displayMode: String): js.Any = js.native
    
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
    override def handleMouseBlur(e: FocusEvent): js.Any = js.native
    
    /* CompleteClass */
    override def handleMouseFocus(e: FocusEvent): js.Any = js.native
    
    /* CompleteClass */
    override def handleTabBlur(e: FocusEvent): js.Any = js.native
    
    /* CompleteClass */
    override def handleTabFocus(e: FocusEvent): js.Any = js.native
    
    /* CompleteClass */
    override def onClick(e: Event): scala.Unit = js.native
    
    /* CompleteClass */
    override def onEnabledChanged(enabled: Boolean): js.Any = js.native
    
    /* CompleteClass */
    override def onMenuClosed(): scala.Unit = js.native
    
    /* CompleteClass */
    override def receiveFocus(): scala.Unit = js.native
    
    /* CompleteClass */
    override def set_enabled(enabled: Boolean): Boolean = js.native
  }
  
  @JSGlobal("CUI.Controls.CheckBox")
  @js.native
  class CheckBox ()
    extends StObject
       with typings.sharepoint.CUI.Controls.ToggleButton {
    
    /* CompleteClass */
    override def createComponentForDisplayMode(displayMode: String): js.Any = js.native
    
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
  class CheckBoxCommandProperties ()
    extends StObject
       with typings.sharepoint.CUI.Controls.CheckBoxCommandProperties
  
  @JSGlobal("CUI.Controls.ColorPicker")
  @js.native
  class ColorPicker ()
    extends StObject
       with typings.sharepoint.CUI.Controls.ColorPicker {
    
    /* CompleteClass */
    override def createComponentForDisplayMode(displayMode: String): js.Any = js.native
    
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
  class ColorPickerCommandProperties ()
    extends StObject
       with typings.sharepoint.CUI.Controls.ColorPickerCommandProperties
  
  @JSGlobal("CUI.Controls.ComboBox")
  @js.native
  class ComboBox ()
    extends StObject
       with typings.sharepoint.CUI.MenuLauncher {
    
    /* CompleteClass */
    override def createComponentForDisplayMode(displayMode: String): js.Any = js.native
    
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
  class ContextMenuControlProperties ()
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
  class DropDown protected ()
    extends StObject
       with typings.sharepoint.CUI.MenuLauncher {
    def this(
      root: typings.sharepoint.CUI.Root,
      id: String,
      properties: typings.sharepoint.CUI.ControlProperties,
      menu: js.Any
    ) = this()
    
    /* CompleteClass */
    override def createComponentForDisplayMode(displayMode: String): js.Any = js.native
    
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
  class DropDownCommandProperties ()
    extends StObject
       with typings.sharepoint.CUI.Controls.DropDownCommandProperties {
    
    /* CompleteClass */
    var SelectedItemId: String = js.native
    
    /* CompleteClass */
    var Value: String = js.native
  }
  
  @JSGlobal("CUI.Controls.FlyoutAnchor")
  @js.native
  class FlyoutAnchor ()
    extends StObject
       with typings.sharepoint.CUI.MenuLauncher {
    
    /* CompleteClass */
    override def createComponentForDisplayMode(displayMode: String): js.Any = js.native
    
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
  class GalleryButton ()
    extends StObject
       with typings.sharepoint.CUI.Controls.GalleryButton {
    
    /* CompleteClass */
    override def createComponentForDisplayMode(displayMode: String): js.Any = js.native
    
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
  class GalleryButtonCommandProperties ()
    extends StObject
       with typings.sharepoint.CUI.Controls.GalleryButtonCommandProperties
  
  @JSGlobal("CUI.Controls.InsertTable")
  @js.native
  class InsertTable ()
    extends StObject
       with typings.sharepoint.CUI.Control {
    
    /* CompleteClass */
    override def createComponentForDisplayMode(displayMode: String): js.Any = js.native
    
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
  class InsertTableCommandProperties ()
    extends StObject
       with typings.sharepoint.CUI.Controls.InsertTableCommandProperties
  
  @JSGlobal("CUI.Controls.JewelMenuLauncher")
  @js.native
  class JewelMenuLauncher ()
    extends StObject
       with typings.sharepoint.CUI.MenuLauncher {
    
    /* CompleteClass */
    override def createComponentForDisplayMode(displayMode: String): js.Any = js.native
    
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
  class Label ()
    extends StObject
       with typings.sharepoint.CUI.Control {
    
    /* CompleteClass */
    override def createComponentForDisplayMode(displayMode: String): js.Any = js.native
    
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
  class LabelCommandProperties ()
    extends StObject
       with typings.sharepoint.CUI.Controls.LabelCommandProperties
  
  @JSGlobal("CUI.Controls.MRUSplitButton")
  @js.native
  class MRUSplitButton ()
    extends StObject
       with typings.sharepoint.CUI.MenuLauncher {
    
    /* CompleteClass */
    override def createComponentForDisplayMode(displayMode: String): js.Any = js.native
    
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
  class Separator ()
    extends StObject
       with typings.sharepoint.CUI.Control {
    
    /* CompleteClass */
    override def createComponentForDisplayMode(displayMode: String): js.Any = js.native
    
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
  class Spinner ()
    extends StObject
       with typings.sharepoint.CUI.Control {
    
    /* CompleteClass */
    override def createComponentForDisplayMode(displayMode: String): js.Any = js.native
    
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
  class SpinnerCommandProperties ()
    extends StObject
       with typings.sharepoint.CUI.Controls.SpinnerCommandProperties
  
  @JSGlobal("CUI.Controls.SplitButton")
  @js.native
  class SplitButton ()
    extends StObject
       with typings.sharepoint.CUI.MenuLauncher {
    
    /* CompleteClass */
    override def createComponentForDisplayMode(displayMode: String): js.Any = js.native
    
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
  class TextBox ()
    extends StObject
       with typings.sharepoint.CUI.Control {
    
    /* CompleteClass */
    override def createComponentForDisplayMode(displayMode: String): js.Any = js.native
    
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
  class TextBoxCommandProperties ()
    extends StObject
       with typings.sharepoint.CUI.Controls.TextBoxCommandProperties
  
  @JSGlobal("CUI.Controls.ToggleButton")
  @js.native
  class ToggleButton ()
    extends StObject
       with typings.sharepoint.CUI.Controls.ToggleButton {
    
    /* CompleteClass */
    override def createComponentForDisplayMode(displayMode: String): js.Any = js.native
    
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
  class ToggleButtonCommandProperties ()
    extends StObject
       with typings.sharepoint.CUI.Controls.ToggleButtonCommandProperties
}

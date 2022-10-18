package typings.reactMdIcon

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactMdIcon.reactMdIconStrings.back
import typings.reactMdIcon.reactMdIconStrings.checkbox
import typings.reactMdIcon.reactMdIconStrings.dropdown
import typings.reactMdIcon.reactMdIconStrings.error
import typings.reactMdIcon.reactMdIconStrings.expander
import typings.reactMdIcon.reactMdIconStrings.forward
import typings.reactMdIcon.reactMdIconStrings.menu
import typings.reactMdIcon.reactMdIconStrings.notification
import typings.reactMdIcon.reactMdIconStrings.password
import typings.reactMdIcon.reactMdIconStrings.radio
import typings.reactMdIcon.reactMdIconStrings.selected
import typings.reactMdIcon.reactMdIconStrings.sort
import typings.reactMdIcon.reactMdIconStrings.upload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIconProviderMod {
  
  @JSImport("@react-md/icon/types/IconProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def IconProvider(
    hasChildrenBackCheckboxDropdownExpanderErrorForwardMenuNotificationPasswordRadioSelectedSortUpload: IconProviderProps
  ): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("IconProvider")(hasChildrenBackCheckboxDropdownExpanderErrorForwardMenuNotificationPasswordRadioSelectedSortUpload.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def useIcon(
    name: back | checkbox | dropdown | error | expander | forward | menu | notification | password | radio | selected | sort | upload
  ): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("useIcon")(name.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
  inline def useIcon(
    name: back | checkbox | dropdown | error | expander | forward | menu | notification | password | radio | selected | sort | upload,
    `override`: ReactNode
  ): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("useIcon")(name.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  
  trait ConfigurableIcons extends StObject {
    
    /**
      * The general icon for navigating backwards or closing an item to the left.
      */
    var back: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * The general icon to use for checkboxes.
      */
    var checkbox: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * The general icon to use for dropdown menus or content that expands
      * vertically in a new material instead of inline like the `expander` icon.
      */
    var dropdown: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * The general icon to use when there are form errors.
      *
      * @remarks \@since 2.5.0
      */
    var error: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * The general icon to use for expanding content vertically.
      */
    var expander: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * The general icon for navigating forwards or closing an item to the right.
      * This is also used internally for nested dropdown menus.
      */
    var forward: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * The general icon to use for displaying a main navigation menu.
      */
    var menu: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * The general icon for displaying notifications. This is used internally in
      * the `BadgedButton` in the `@react-md/badge` package.
      */
    var notification: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * The general icon for temporarily displaying a password's field value as
      * plain text.
      */
    var password: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * The general icon to use for radio buttons.
      */
    var radio: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * The general icon to use for showing that something has been selected that
      * is not a radio or checkbox. This is used internally for the `Chip` in the
      * `@react-md/chip` package.
      */
    var selected: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * The general icon for sorting content. This defaults to the sort ascending
      * behavior.
      */
    var sort: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * The general icon to use for the `FileInput` component (normally file
      * uploads).
      *
      * @remarks \@since 5.0.0
      */
    var upload: js.UndefOr[ReactNode] = js.undefined
  }
  object ConfigurableIcons {
    
    inline def apply(): ConfigurableIcons = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurableIcons]
    }
    
    extension [Self <: ConfigurableIcons](x: Self) {
      
      inline def setBack(value: ReactNode): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
      
      inline def setBackUndefined: Self = StObject.set(x, "back", js.undefined)
      
      inline def setCheckbox(value: ReactNode): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
      
      inline def setCheckboxUndefined: Self = StObject.set(x, "checkbox", js.undefined)
      
      inline def setDropdown(value: ReactNode): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
      
      inline def setDropdownUndefined: Self = StObject.set(x, "dropdown", js.undefined)
      
      inline def setError(value: ReactNode): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setExpander(value: ReactNode): Self = StObject.set(x, "expander", value.asInstanceOf[js.Any])
      
      inline def setExpanderUndefined: Self = StObject.set(x, "expander", js.undefined)
      
      inline def setForward(value: ReactNode): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
      
      inline def setForwardUndefined: Self = StObject.set(x, "forward", js.undefined)
      
      inline def setMenu(value: ReactNode): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      inline def setNotification(value: ReactNode): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
      
      inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
      
      inline def setPassword(value: ReactNode): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setRadio(value: ReactNode): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
      
      inline def setRadioUndefined: Self = StObject.set(x, "radio", js.undefined)
      
      inline def setSelected(value: ReactNode): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSort(value: ReactNode): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setUpload(value: ReactNode): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
      
      inline def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
    }
  }
  
  /* Inlined std.Required<@react-md/icon.@react-md/icon/types/IconProvider.ConfigurableIcons> */
  trait ConfiguredIcons extends StObject {
    
    var back: ReactNode
    
    var checkbox: ReactNode
    
    var dropdown: ReactNode
    
    var error: ReactNode
    
    var expander: ReactNode
    
    var forward: ReactNode
    
    var menu: ReactNode
    
    var notification: ReactNode
    
    var password: ReactNode
    
    var radio: ReactNode
    
    var selected: ReactNode
    
    var sort: ReactNode
    
    var upload: ReactNode
  }
  object ConfiguredIcons {
    
    inline def apply(): ConfiguredIcons = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfiguredIcons]
    }
    
    extension [Self <: ConfiguredIcons](x: Self) {
      
      inline def setBack(value: ReactNode): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
      
      inline def setBackUndefined: Self = StObject.set(x, "back", js.undefined)
      
      inline def setCheckbox(value: ReactNode): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
      
      inline def setCheckboxUndefined: Self = StObject.set(x, "checkbox", js.undefined)
      
      inline def setDropdown(value: ReactNode): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
      
      inline def setDropdownUndefined: Self = StObject.set(x, "dropdown", js.undefined)
      
      inline def setError(value: ReactNode): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setExpander(value: ReactNode): Self = StObject.set(x, "expander", value.asInstanceOf[js.Any])
      
      inline def setExpanderUndefined: Self = StObject.set(x, "expander", js.undefined)
      
      inline def setForward(value: ReactNode): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
      
      inline def setForwardUndefined: Self = StObject.set(x, "forward", js.undefined)
      
      inline def setMenu(value: ReactNode): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      inline def setNotification(value: ReactNode): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
      
      inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
      
      inline def setPassword(value: ReactNode): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setRadio(value: ReactNode): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
      
      inline def setRadioUndefined: Self = StObject.set(x, "radio", js.undefined)
      
      inline def setSelected(value: ReactNode): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSort(value: ReactNode): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setUpload(value: ReactNode): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
      
      inline def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
    }
  }
  
  trait IconProviderProps
    extends StObject
       with ConfigurableIcons {
    
    /**
      * The children that should inherit the icon provider context. This is
      * required since this component is pretty much worthless to use if you don't
      * inherit the overridden icons.
      */
    var children: ReactNode
  }
  object IconProviderProps {
    
    inline def apply(): IconProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconProviderProps]
    }
    
    extension [Self <: IconProviderProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}

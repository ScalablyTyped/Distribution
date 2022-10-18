package typings.reactMdForm

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.reactMdForm.reactMdFormStrings.checkbox
import typings.reactMdForm.reactMdFormStrings.radio
import typings.reactMdForm.reactMdFormStrings.switch
import typings.reactMdList.typesGetListItemHeightMod.ListItemHeight
import typings.reactMdList.typesListItemAddonMod.ListItemAddonPosition
import typings.reactMdList.typesListItemAddonMod.ListItemAddonType
import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMenuMenuItemInputToggleMod {
  
  @JSImport("@react-md/form/types/menu/MenuItemInputToggle", "MenuItemInputToggle")
  @js.native
  val MenuItemInputToggle: ForwardRefExoticComponent[StrictMenuItemInputToggleProps & RefAttributes[HTMLLIElement]] = js.native
  
  /**
    * @remarks \@since 2.8.0
    * @internal
    */
  /* Inlined std.Pick<@react-md/list.@react-md/list.SimpleListItemProps, 'disabledOpacity' | 'threeLines' | 'height' | 'children' | 'textChildren' | 'textClassName' | 'primaryText' | 'secondaryText' | 'secondaryTextClassName' | 'forceAddonWrap'> */
  trait AllowedListItemProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var disabledOpacity: js.UndefOr[Boolean] = js.undefined
    
    var forceAddonWrap: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[ListItemHeight] = js.undefined
    
    var primaryText: js.UndefOr[ReactNode] = js.undefined
    
    var secondaryText: js.UndefOr[ReactNode] = js.undefined
    
    var secondaryTextClassName: js.UndefOr[String] = js.undefined
    
    var textChildren: js.UndefOr[Boolean] = js.undefined
    
    var textClassName: js.UndefOr[String] = js.undefined
    
    var threeLines: js.UndefOr[Boolean] = js.undefined
  }
  object AllowedListItemProps {
    
    inline def apply(): AllowedListItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllowedListItemProps]
    }
    
    extension [Self <: AllowedListItemProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabledOpacity(value: Boolean): Self = StObject.set(x, "disabledOpacity", value.asInstanceOf[js.Any])
      
      inline def setDisabledOpacityUndefined: Self = StObject.set(x, "disabledOpacity", js.undefined)
      
      inline def setForceAddonWrap(value: Boolean): Self = StObject.set(x, "forceAddonWrap", value.asInstanceOf[js.Any])
      
      inline def setForceAddonWrapUndefined: Self = StObject.set(x, "forceAddonWrap", js.undefined)
      
      inline def setHeight(value: ListItemHeight): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setPrimaryText(value: ReactNode): Self = StObject.set(x, "primaryText", value.asInstanceOf[js.Any])
      
      inline def setPrimaryTextUndefined: Self = StObject.set(x, "primaryText", js.undefined)
      
      inline def setSecondaryText(value: ReactNode): Self = StObject.set(x, "secondaryText", value.asInstanceOf[js.Any])
      
      inline def setSecondaryTextClassName(value: String): Self = StObject.set(x, "secondaryTextClassName", value.asInstanceOf[js.Any])
      
      inline def setSecondaryTextClassNameUndefined: Self = StObject.set(x, "secondaryTextClassName", js.undefined)
      
      inline def setSecondaryTextUndefined: Self = StObject.set(x, "secondaryText", js.undefined)
      
      inline def setTextChildren(value: Boolean): Self = StObject.set(x, "textChildren", value.asInstanceOf[js.Any])
      
      inline def setTextChildrenUndefined: Self = StObject.set(x, "textChildren", js.undefined)
      
      inline def setTextClassName(value: String): Self = StObject.set(x, "textClassName", value.asInstanceOf[js.Any])
      
      inline def setTextClassNameUndefined: Self = StObject.set(x, "textClassName", js.undefined)
      
      inline def setThreeLines(value: Boolean): Self = StObject.set(x, "threeLines", value.asInstanceOf[js.Any])
      
      inline def setThreeLinesUndefined: Self = StObject.set(x, "threeLines", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reactMdForm.typesMenuMenuItemInputToggleMod.AllowedListItemProps because var conflicts: children. Inlined threeLines, height, textChildren, textClassName, secondaryTextClassName, secondaryText, disabledOpacity, primaryText, forceAddonWrap */ trait BaseMenuItemInputToggleProps
    extends StObject
       with HTMLAttributes[HTMLLIElement] {
    
    /**
      * An optional {@link ListItem} addon to display on the opposite side of the
      * `icon`. So if the `iconAfter` prop is `false`, the `addon` will appear to
      * the `right` while setting `iconAfter` to `true` will render the `addon` to
      * the `left` instead.
      */
    var addon: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * The {@link ListItemAddonPosition} for the `addon`.
      */
    var addonPosition: js.UndefOr[ListItemAddonPosition] = js.undefined
    
    /**
      * The {@link ListItemAddonType} for the `addon`.
      */
    var addonType: js.UndefOr[ListItemAddonType] = js.undefined
    
    /**
      * Boolean if the element is currently checked.
      */
    var checked: Boolean
    
    /**
      * Boolean if the element should be disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var disabledOpacity: js.UndefOr[Boolean] = js.undefined
    
    var forceAddonWrap: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[ListItemHeight] = js.undefined
    
    /**
      * The icon will default to:
      * - {@link ConfigurableIcons.radio} when the `type` is set to `"radio"`
      * - {@link ConfigurableIcons.checkbox} when the `type` is set to `"checkbox"`
      * - {@link SwitchTrack} when the `type` is set to `"switch"`
      *
      * If this behavior isn't preferred, you can provide your own icon with this
      * prop.
      */
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Boolean if the `icon` prop should appear as the `rightAddon` instead of the
      * `leftAddon` for the `ListItem`
      */
    var iconAfter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An id required for a11y.
      */
    @JSName("id")
    var id_BaseMenuItemInputToggleProps: String
    
    /**
      * A function to call that should updated the `checked` state to the new
      * value.
      */
    def onCheckedChange(checked: Boolean, event: MouseEvent[HTMLLIElement, NativeMouseEvent]): Unit
    
    var primaryText: js.UndefOr[ReactNode] = js.undefined
    
    var secondaryText: js.UndefOr[ReactNode] = js.undefined
    
    var secondaryTextClassName: js.UndefOr[String] = js.undefined
    
    var textChildren: js.UndefOr[Boolean] = js.undefined
    
    var textClassName: js.UndefOr[String] = js.undefined
    
    var threeLines: js.UndefOr[Boolean] = js.undefined
  }
  object BaseMenuItemInputToggleProps {
    
    inline def apply(
      checked: Boolean,
      id: String,
      onCheckedChange: (Boolean, MouseEvent[HTMLLIElement, NativeMouseEvent]) => Unit
    ): BaseMenuItemInputToggleProps = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onCheckedChange = js.Any.fromFunction2(onCheckedChange))
      __obj.asInstanceOf[BaseMenuItemInputToggleProps]
    }
    
    extension [Self <: BaseMenuItemInputToggleProps](x: Self) {
      
      inline def setAddon(value: ReactNode): Self = StObject.set(x, "addon", value.asInstanceOf[js.Any])
      
      inline def setAddonPosition(value: ListItemAddonPosition): Self = StObject.set(x, "addonPosition", value.asInstanceOf[js.Any])
      
      inline def setAddonPositionUndefined: Self = StObject.set(x, "addonPosition", js.undefined)
      
      inline def setAddonType(value: ListItemAddonType): Self = StObject.set(x, "addonType", value.asInstanceOf[js.Any])
      
      inline def setAddonTypeUndefined: Self = StObject.set(x, "addonType", js.undefined)
      
      inline def setAddonUndefined: Self = StObject.set(x, "addon", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledOpacity(value: Boolean): Self = StObject.set(x, "disabledOpacity", value.asInstanceOf[js.Any])
      
      inline def setDisabledOpacityUndefined: Self = StObject.set(x, "disabledOpacity", js.undefined)
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setForceAddonWrap(value: Boolean): Self = StObject.set(x, "forceAddonWrap", value.asInstanceOf[js.Any])
      
      inline def setForceAddonWrapUndefined: Self = StObject.set(x, "forceAddonWrap", js.undefined)
      
      inline def setHeight(value: ListItemHeight): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconAfter(value: Boolean): Self = StObject.set(x, "iconAfter", value.asInstanceOf[js.Any])
      
      inline def setIconAfterUndefined: Self = StObject.set(x, "iconAfter", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOnCheckedChange(value: (Boolean, MouseEvent[HTMLLIElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onCheckedChange", js.Any.fromFunction2(value))
      
      inline def setPrimaryText(value: ReactNode): Self = StObject.set(x, "primaryText", value.asInstanceOf[js.Any])
      
      inline def setPrimaryTextUndefined: Self = StObject.set(x, "primaryText", js.undefined)
      
      inline def setSecondaryText(value: ReactNode): Self = StObject.set(x, "secondaryText", value.asInstanceOf[js.Any])
      
      inline def setSecondaryTextClassName(value: String): Self = StObject.set(x, "secondaryTextClassName", value.asInstanceOf[js.Any])
      
      inline def setSecondaryTextClassNameUndefined: Self = StObject.set(x, "secondaryTextClassName", js.undefined)
      
      inline def setSecondaryTextUndefined: Self = StObject.set(x, "secondaryText", js.undefined)
      
      inline def setTextChildren(value: Boolean): Self = StObject.set(x, "textChildren", value.asInstanceOf[js.Any])
      
      inline def setTextChildrenUndefined: Self = StObject.set(x, "textChildren", js.undefined)
      
      inline def setTextClassName(value: String): Self = StObject.set(x, "textClassName", value.asInstanceOf[js.Any])
      
      inline def setTextClassNameUndefined: Self = StObject.set(x, "textClassName", js.undefined)
      
      inline def setThreeLines(value: Boolean): Self = StObject.set(x, "threeLines", value.asInstanceOf[js.Any])
      
      inline def setThreeLinesUndefined: Self = StObject.set(x, "threeLines", js.undefined)
    }
  }
  
  trait MenuItemInputToggleProps
    extends StObject
       with BaseMenuItemInputToggleProps {
    
    /**
      * The input toggle type to render.
      *
      * Note for the `radio` type:
      * If a `menu` or `menubar` contains more than one group of `menuitemradio`
      * elements, or if the `menu` contains one group and other, unrelated menu
      * items, authors **SHOULD** nest each set of related `menuitemradio` elements
      * in an element using the `group` role, and authors **SHOULD** delimit the
      * group from other menu items with an element using the separator role.
      *
      * @see {@link https://www.w3.org/TR/wai-aria-1.1/#menuitemradio}
      */
    var `type`: checkbox | radio | switch
  }
  object MenuItemInputToggleProps {
    
    inline def apply(
      checked: Boolean,
      id: String,
      onCheckedChange: (Boolean, MouseEvent[HTMLLIElement, NativeMouseEvent]) => Unit,
      `type`: checkbox | radio | switch
    ): MenuItemInputToggleProps = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onCheckedChange = js.Any.fromFunction2(onCheckedChange))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuItemInputToggleProps]
    }
    
    extension [Self <: MenuItemInputToggleProps](x: Self) {
      
      inline def setType(value: checkbox | radio | switch): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdForm.anon.typecheckboxIndeterminate_
    - typings.reactMdForm.anon.typeradioswitchindetermin
  */
  trait StrictMenuItemInputToggleProps extends StObject
  object StrictMenuItemInputToggleProps {
    
    inline def typecheckboxIndeterminate_(
      checked: Boolean,
      id: String,
      onCheckedChange: (Boolean, MouseEvent[HTMLLIElement, NativeMouseEvent]) => Unit
    ): typings.reactMdForm.anon.typecheckboxIndeterminate_ = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onCheckedChange = js.Any.fromFunction2(onCheckedChange))
      __obj.updateDynamic("type")("checkbox")
      __obj.asInstanceOf[typings.reactMdForm.anon.typecheckboxIndeterminate_]
    }
    
    inline def typeradioswitchindetermin(
      checked: Boolean,
      id: String,
      onCheckedChange: (Boolean, MouseEvent[HTMLLIElement, NativeMouseEvent]) => Unit,
      `type`: radio | switch
    ): typings.reactMdForm.anon.typeradioswitchindetermin = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onCheckedChange = js.Any.fromFunction2(onCheckedChange))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactMdForm.anon.typeradioswitchindetermin]
    }
  }
}

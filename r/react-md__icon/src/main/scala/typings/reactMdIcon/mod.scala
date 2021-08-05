package typings.reactMdIcon

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.reactMdIcon.fontIconMod.FontIconProps
import typings.reactMdIcon.iconProviderMod.IconProviderProps
import typings.reactMdIcon.iconRotatorMod.IconRotatorProps
import typings.reactMdIcon.reactMdIconStrings.back
import typings.reactMdIcon.reactMdIconStrings.checkbox
import typings.reactMdIcon.reactMdIconStrings.download
import typings.reactMdIcon.reactMdIconStrings.dropdown
import typings.reactMdIcon.reactMdIconStrings.expander
import typings.reactMdIcon.reactMdIconStrings.forward
import typings.reactMdIcon.reactMdIconStrings.menu
import typings.reactMdIcon.reactMdIconStrings.notification
import typings.reactMdIcon.reactMdIconStrings.password
import typings.reactMdIcon.reactMdIconStrings.radio
import typings.reactMdIcon.reactMdIconStrings.selected
import typings.reactMdIcon.reactMdIconStrings.sort
import typings.reactMdIcon.svgiconMod.SVGIconProps
import typings.reactMdIcon.textIconSpacingMod.TextIconSpacingProps
import typings.std.HTMLElement
import typings.std.HTMLSpanElement
import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/icon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/icon", "FontIcon")
  @js.native
  val FontIcon: ForwardRefExoticComponent[FontIconProps & RefAttributes[HTMLElement]] = js.native
  
  object IconProvider {
    
    inline def apply(
      hasChildrenBackCheckboxDownloadDropdownExpanderForwardMenuNotificationPasswordRadioSelectedSort: IconProviderProps
    ): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasChildrenBackCheckboxDownloadDropdownExpanderForwardMenuNotificationPasswordRadioSelectedSort.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("@react-md/icon", "IconProvider")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/icon", "IconProvider.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/icon", "IconProvider.propTypes.back")
      @js.native
      def back: js.Any = js.native
      inline def back_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("back")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "IconProvider.propTypes.checkbox")
      @js.native
      def checkbox: js.Any = js.native
      inline def checkbox_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("checkbox")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "IconProvider.propTypes.children")
      @js.native
      def children: js.Any = js.native
      inline def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "IconProvider.propTypes.download")
      @js.native
      def download: js.Any = js.native
      inline def download_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("download")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "IconProvider.propTypes.dropdown")
      @js.native
      def dropdown: js.Any = js.native
      inline def dropdown_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dropdown")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "IconProvider.propTypes.expander")
      @js.native
      def expander: js.Any = js.native
      inline def expander_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expander")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "IconProvider.propTypes.forward")
      @js.native
      def forward: js.Any = js.native
      inline def forward_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forward")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "IconProvider.propTypes.menu")
      @js.native
      def menu: js.Any = js.native
      inline def menu_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("menu")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "IconProvider.propTypes.notification")
      @js.native
      def notification: js.Any = js.native
      inline def notification_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notification")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "IconProvider.propTypes.password")
      @js.native
      def password: js.Any = js.native
      inline def password_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("password")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "IconProvider.propTypes.radio")
      @js.native
      def radio: js.Any = js.native
      inline def radio_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("radio")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "IconProvider.propTypes.selected")
      @js.native
      def selected: js.Any = js.native
      inline def selected_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selected")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "IconProvider.propTypes.sort")
      @js.native
      def sort: js.Any = js.native
      inline def sort_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sort")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@react-md/icon", "IconRotator")
  @js.native
  val IconRotator: ForwardRefExoticComponent[IconRotatorProps & RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/icon", "SVGIcon")
  @js.native
  val SVGIcon: ForwardRefExoticComponent[SVGIconProps & RefAttributes[SVGSVGElement]] = js.native
  
  object TextIconSpacing {
    
    inline def apply(
      hasClassNamePropIconChildrenStackedIconAfterForceIconWrapBeforeClassNameAfterClassNameAboveClassNameBelowClassName: TextIconSpacingProps
    ): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasClassNamePropIconChildrenStackedIconAfterForceIconWrapBeforeClassNameAfterClassNameAboveClassNameBelowClassName.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("@react-md/icon", "TextIconSpacing")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/icon", "TextIconSpacing.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/icon", "TextIconSpacing.propTypes.aboveClassName")
      @js.native
      def aboveClassName: js.Any = js.native
      inline def aboveClassName_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aboveClassName")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "TextIconSpacing.propTypes.afterClassName")
      @js.native
      def afterClassName: js.Any = js.native
      inline def afterClassName_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("afterClassName")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "TextIconSpacing.propTypes.beforeClassName")
      @js.native
      def beforeClassName: js.Any = js.native
      inline def beforeClassName_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beforeClassName")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "TextIconSpacing.propTypes.belowClassName")
      @js.native
      def belowClassName: js.Any = js.native
      inline def belowClassName_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("belowClassName")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "TextIconSpacing.propTypes.children")
      @js.native
      def children: js.Any = js.native
      inline def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "TextIconSpacing.propTypes.className")
      @js.native
      def className: js.Any = js.native
      inline def className_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "TextIconSpacing.propTypes.forceIconWrap")
      @js.native
      def forceIconWrap: js.Any = js.native
      inline def forceIconWrap_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceIconWrap")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "TextIconSpacing.propTypes.icon")
      @js.native
      def icon: js.Any = js.native
      
      @JSImport("@react-md/icon", "TextIconSpacing.propTypes.iconAfter")
      @js.native
      def iconAfter: js.Any = js.native
      inline def iconAfter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iconAfter")(x.asInstanceOf[js.Any])
      
      inline def icon_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("icon")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/icon", "TextIconSpacing.propTypes.stacked")
      @js.native
      def stacked: js.Any = js.native
      inline def stacked_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stacked")(x.asInstanceOf[js.Any])
    }
  }
  
  inline def useIcon_back(name: back): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("useIcon")(name.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
  inline def useIcon_back(name: back, `override`: ReactNode): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("useIcon")(name.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  
  inline def useIcon_checkbox(name: checkbox): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("useIcon")(name.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
  inline def useIcon_checkbox(name: checkbox, `override`: ReactNode): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("useIcon")(name.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  
  inline def useIcon_download(name: download): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("useIcon")(name.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
  inline def useIcon_download(name: download, `override`: ReactNode): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("useIcon")(name.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  
  inline def useIcon_dropdown(name: dropdown): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("useIcon")(name.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
  inline def useIcon_dropdown(name: dropdown, `override`: ReactNode): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("useIcon")(name.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  
  inline def useIcon_expander(name: expander): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("useIcon")(name.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
  inline def useIcon_expander(name: expander, `override`: ReactNode): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("useIcon")(name.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  
  inline def useIcon_forward(name: forward): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("useIcon")(name.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
  inline def useIcon_forward(name: forward, `override`: ReactNode): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("useIcon")(name.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  
  inline def useIcon_menu(name: menu): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("useIcon")(name.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
  inline def useIcon_menu(name: menu, `override`: ReactNode): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("useIcon")(name.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  
  inline def useIcon_notification(name: notification): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("useIcon")(name.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
  inline def useIcon_notification(name: notification, `override`: ReactNode): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("useIcon")(name.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  
  inline def useIcon_password(name: password): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("useIcon")(name.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
  inline def useIcon_password(name: password, `override`: ReactNode): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("useIcon")(name.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  
  inline def useIcon_radio(name: radio): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("useIcon")(name.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
  inline def useIcon_radio(name: radio, `override`: ReactNode): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("useIcon")(name.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  
  inline def useIcon_selected(name: selected): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("useIcon")(name.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
  inline def useIcon_selected(name: selected, `override`: ReactNode): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("useIcon")(name.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  
  inline def useIcon_sort(name: sort): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("useIcon")(name.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
  inline def useIcon_sort(name: sort, `override`: ReactNode): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("useIcon")(name.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
}

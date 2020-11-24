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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/icon", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val FontIcon: ForwardRefExoticComponent[FontIconProps with RefAttributes[HTMLElement]] = js.native
  
  val IconRotator: ForwardRefExoticComponent[IconRotatorProps with RefAttributes[HTMLSpanElement]] = js.native
  
  val SVGIcon: ForwardRefExoticComponent[SVGIconProps with RefAttributes[SVGSVGElement]] = js.native
  
  @JSName("useIcon")
  def useIcon_back(name: back): ReactNode = js.native
  @JSName("useIcon")
  def useIcon_back(name: back, `override`: ReactNode): ReactNode = js.native
  @JSName("useIcon")
  def useIcon_checkbox(name: checkbox): ReactNode = js.native
  @JSName("useIcon")
  def useIcon_checkbox(name: checkbox, `override`: ReactNode): ReactNode = js.native
  @JSName("useIcon")
  def useIcon_download(name: download): ReactNode = js.native
  @JSName("useIcon")
  def useIcon_download(name: download, `override`: ReactNode): ReactNode = js.native
  @JSName("useIcon")
  def useIcon_dropdown(name: dropdown): ReactNode = js.native
  @JSName("useIcon")
  def useIcon_dropdown(name: dropdown, `override`: ReactNode): ReactNode = js.native
  @JSName("useIcon")
  def useIcon_expander(name: expander): ReactNode = js.native
  @JSName("useIcon")
  def useIcon_expander(name: expander, `override`: ReactNode): ReactNode = js.native
  @JSName("useIcon")
  def useIcon_forward(name: forward): ReactNode = js.native
  @JSName("useIcon")
  def useIcon_forward(name: forward, `override`: ReactNode): ReactNode = js.native
  @JSName("useIcon")
  def useIcon_menu(name: menu): ReactNode = js.native
  @JSName("useIcon")
  def useIcon_menu(name: menu, `override`: ReactNode): ReactNode = js.native
  @JSName("useIcon")
  def useIcon_notification(name: notification): ReactNode = js.native
  @JSName("useIcon")
  def useIcon_notification(name: notification, `override`: ReactNode): ReactNode = js.native
  @JSName("useIcon")
  def useIcon_password(name: password): ReactNode = js.native
  @JSName("useIcon")
  def useIcon_password(name: password, `override`: ReactNode): ReactNode = js.native
  @JSName("useIcon")
  def useIcon_radio(name: radio): ReactNode = js.native
  @JSName("useIcon")
  def useIcon_radio(name: radio, `override`: ReactNode): ReactNode = js.native
  @JSName("useIcon")
  def useIcon_selected(name: selected): ReactNode = js.native
  @JSName("useIcon")
  def useIcon_selected(name: selected, `override`: ReactNode): ReactNode = js.native
  @JSName("useIcon")
  def useIcon_sort(name: sort): ReactNode = js.native
  @JSName("useIcon")
  def useIcon_sort(name: sort, `override`: ReactNode): ReactNode = js.native
  
  @js.native
  object IconProvider extends js.Object {
    
    def apply(
      hasChildrenBackCheckboxDownloadDropdownExpanderForwardMenuNotificationPasswordRadioSelectedSort: IconProviderProps
    ): ReactElement = js.native
    
    @js.native
    object propTypes extends js.Object {
      
      var back: js.Any = js.native
      
      var checkbox: js.Any = js.native
      
      var children: js.Any = js.native
      
      var download: js.Any = js.native
      
      var dropdown: js.Any = js.native
      
      var expander: js.Any = js.native
      
      var forward: js.Any = js.native
      
      var menu: js.Any = js.native
      
      var notification: js.Any = js.native
      
      var password: js.Any = js.native
      
      var radio: js.Any = js.native
      
      var selected: js.Any = js.native
      
      var sort: js.Any = js.native
    }
  }
  
  @js.native
  object TextIconSpacing extends js.Object {
    
    def apply(
      hasClassNameIconChildrenStackedIconAfterForceIconWrapBeforeClassNameAfterClassNameAboveClassNameBelowClassName: TextIconSpacingProps
    ): ReactElement = js.native
    
    @js.native
    object propTypes extends js.Object {
      
      var aboveClassName: js.Any = js.native
      
      var afterClassName: js.Any = js.native
      
      var beforeClassName: js.Any = js.native
      
      var belowClassName: js.Any = js.native
      
      var children: js.Any = js.native
      
      var className: js.Any = js.native
      
      var forceIconWrap: js.Any = js.native
      
      var icon: js.Any = js.native
      
      var iconAfter: js.Any = js.native
      
      var stacked: js.Any = js.native
    }
  }
}

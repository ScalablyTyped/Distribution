package typings.reactMdIcon

import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
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
import scala.scalajs.js.annotation._

@JSImport("@react-md/icon", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * The `FontIcon` component is used for rendering a font-icon library's icon.
    * The default is to use the `material-icons` library, but others can be used as
    * well.
    *
    * If you are using another font icon library that does not always create icons
    * with a perfect 1:1 scale (such as font awesome), it is recommended to use the
    * `forceSize` and `forceFontSize` props to fix the sizing issues.
    */
  val FontIcon: ForwardRefExoticComponent[FontIconProps with RefAttributes[HTMLElement]] = js.native
  /**
    * The `IconProvider` component is used to override all the default icons within
    * `react-md` with a newly defined set of icons. This is super nice since you
    * won't need to create new component wrappers for all the components within
    * `react-md` if you want to switch to SVG icons instead of the default font
    * icons.
    */
  val IconProvider: FC[IconProviderProps] = js.native
  /**
    * The `IconRotator` is a simple component that is used to rotate an icon from a
    * one degrees to another.
    */
  val IconRotator: ForwardRefExoticComponent[IconRotatorProps with RefAttributes[HTMLSpanElement]] = js.native
  /**
    * The `SVGIcon` component is used to render inline SVG icons or SVG icons in a
    * sprite map as an icon.
    */
  val SVGIcon: ForwardRefExoticComponent[SVGIconProps with RefAttributes[SVGSVGElement]] = js.native
  val TextIconSpacing: FC[TextIconSpacingProps] = js.native
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
}


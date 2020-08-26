package typings.reactMdAppBar

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdAppBar.appBarActionMod.AppBarActionProps
import typings.reactMdAppBar.appBarMod.AppBarProps
import typings.reactMdAppBar.appBarNavMod.AppBarNavProps
import typings.reactMdAppBar.appBarTitleMod.AppBarTitleProps
import typings.reactMdAppBar.useActionClassNameMod.AppBarActionClassNameProps
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLHeadingElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/app-bar", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val APP_BAR_OFFSET_CLASSNAME: /* "rmd-app-bar-offset" */ String = js.native
  val APP_BAR_OFFSET_DENSE_CLASSNAME: /* "rmd-app-bar-offset--dense" */ String = js.native
  val APP_BAR_OFFSET_PROMINENT_CLASSNAME: /* "rmd-app-bar-offset--prominent" */ String = js.native
  val APP_BAR_OFFSET_PROMINENT_DENSE_CLASSNAME: /* "rmd-app-bar-offset--prominent-dense" */ String = js.native
  /**
    * This component is used to create a top-level app bar in your application that
    * can be used to contain a navigation menu toggle button, the app's logo and/or
    * title, as well as any top-level actions that will be reused throughout your
    * app. When using this component with the `fixed` prop, it is recommended to
    * also use one of the "offset class names" so that your content will not be
    * converted by the app bar. You can also use any of the exposed mixins to add
    * these offsets as well.
    */
  val AppBar: ForwardRefExoticComponent[AppBarProps with RefAttributes[HTMLDivElement]] = js.native
  /**
    * This component is really just a simple wrapper for the `Button` component
    * that adds a few additional styles to prevent the button from shrinking when
    * an `AppBar` has a lot of content.  It also will automatically add spacing
    * either before or after this button when the `first` or `last` props are
    * provided.
    */
  val AppBarAction: ForwardRefExoticComponent[AppBarActionProps with RefAttributes[HTMLButtonElement]] = js.native
  /**
    * This component is really just a simple wrapper for the `Button` component
    * that adds some additional styles for adding spacing before and after this
    * button so that it aligns to the main "keyline" of your application's
    * navigation. In simpler terms, it will make the left side of the icon in this
    * button aligns with all the other icons that appear in `ListItem`s in your
    * main navigation.
    *
    * This component is generally really only used when you want to have a
    * temporary navigation element like a hamburger menu.
    */
  val AppBarNav: ForwardRefExoticComponent[AppBarNavProps with RefAttributes[HTMLButtonElement]] = js.native
  /**
    * This component is used to create a title for your application. If your app is
    * not using the `AppBarNav` component, you can enable the `keyline` prop to
    * ensure that your title aligns with the keyline of your navigation element.
    */
  val AppBarTitle: ForwardRefExoticComponent[AppBarTitleProps with RefAttributes[HTMLHeadingElement]] = js.native
  def useActionClassName(): String = js.native
  def useActionClassName(hasFirstLastInheritColorClassName: AppBarActionClassNameProps): String = js.native
}


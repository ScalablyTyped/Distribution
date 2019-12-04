package typings.reactDashBootstrap.libNavbarMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * the classes below aren't present in lib/
  */
trait NavbarLinkProps
  extends AllHTMLAttributes[NavbarLink]
     with ClassAttributes[NavbarLink] {
  @JSName("href")
  var href_NavbarLinkProps: String
  @JSName("onClick")
  var onClick_NavbarLinkProps: js.UndefOr[MouseEventHandler[_]] = js.undefined
}

object NavbarLinkProps {
  @scala.inline
  def apply(
    href: String,
    AllHTMLAttributes: AllHTMLAttributes[NavbarLink] = null,
    ClassAttributes: ClassAttributes[NavbarLink] = null,
    onClick: MouseEvent[_, NativeMouseEvent] => Unit = null
  ): NavbarLinkProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[NavbarLinkProps]
  }
}


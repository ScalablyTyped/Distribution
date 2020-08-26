package typings.reactMdLink

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdLink.linkMod.LinkProps
import typings.reactMdLink.linkMod.LinkWithComponentProps
import typings.reactMdLink.skipToMainContentMod.SkipToMainContentProps
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/link", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * The `Link` component is used to render links within your app with a basic
    * styles applied and some additional "security" built-in if using the
    * `rel="_blank"`. This can be used with a browser routing library like
    * `react-router` or `reach-router` by providing the `Link` as the
    * `linkComponent` prop.
    */
  val Link: ForwardRefExoticComponent[
    (LinkProps with (RefAttributes[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178 */ js.Any
    ])) | (LinkWithComponentProps with (RefAttributes[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178 */ js.Any
    ]))
  ] = js.native
  /**
    * This component allows you to create a screen-reader only/keyboard focusable
    * only link that allows a user to skip to the main content of the page. This is
    * extremely useful when you have a lot of navigation items that must be tabbed
    * through before the main content can be focused and this component should
    * normally be the first focusable element on your page.
    */
  val SkipToMainContent: ForwardRefExoticComponent[SkipToMainContentProps with RefAttributes[HTMLAnchorElement]] = js.native
}

